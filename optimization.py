import datetime

'''
players = [
            {"playerName":"J. Potts", "ballControl":"7" , "mileTime":"9:05" , "height":"71"},
            {"playerName":"A. Meza", "ballControl":"6" , "mileTime":"8:15" , "height":"67"},
            {"playerName":"D. Trahan", "ballControl":"2" , "mileTime":"5:29" , "height":"74"},
            {"playerName":"D. Muckelbauer", "ballControl":"10" , "mileTime":"7:15" , "height":"63"},
            {"playerName":"S. Giles", "ballControl":"9" , "mileTime":"8:20" , "height":"79"},
            {"playerName":"C. Norman", "ballControl":"1" , "mileTime":"6:55" , "height":"65"},
            {"playerName":"E. Seall", "ballControl":"3" , "mileTime":"6:10" , "height":"66"},
            {"playerName":"C. Loth", "ballControl":"4" , "mileTime":"9:46" , "height":"73"},
            {"playerName":"A. Oakes", "ballControl":"5" , "mileTime":"8:05" , "height":"72"},
            {"playerName":"B. Gomez", "ballControl":"9" , "mileTime":"6:59" , "height":"64"},
'''
players = []
]
playersInGame = {}
playersByBallControl = []
playersByMileTime = []
playersByHeight = []

def grabPlayerStats():
    count = 0
    while count < 10:
        playerInfo = {}

        playerName = raw_input("Player name: ")
        ballControl = raw_input("Ball control out of 10: ")
        mileTime = raw_input("Mile time: ")
        height = raw_input("Height: ")

        splitTime = mileTime.split(":")

        mileTimeMinutes = int(splitTime[0])
        mileTimeSeconds = int(splitTime[1])

        playerInfo["playerName"] = playerName
        playerInfo["ballControl"] = int(ballControl)
        playerInfo["mileTime"] = datetime.time(0, mileTimeMinutes, mileTimeMinutes)
        playerInfo["height"] = height

        players.append(playerInfo)
        count += 1

    sortByBallControl()
    print 'Sorted by ball control: ' + str(playersByBallControl)

    sortByMileTime()
    print 'Sorted by speed: ' + str(playersByMileTime)

    sortByHeight()
    print 'Sorted by height: ' + str(playersByHeight)

    assignFormations()

def sortByBallControl():
    topControl = 0
    topControlName = ""
    for player in players:
        if player['playerName'] not in playersByBallControl:
            if player['ballControl'] > topControl:
                topControl = player['ballControl']
                topControlName = player['playerName']
    playersByBallControl.append(topControlName)
    if len(playersByBallControl) < len(players):
        sortByBallControl()

def sortByMileTime():
    topTime = datetime.time(23, 59, 59)
    topTimeName = ''
    for player in players:
        if player['playerName'] not in playersByMileTime:
            if player['mileTime'] < topTime:
                topTimeName = player['playerName']
                topTime = player['mileTime']
    playersByMileTime.append(topTimeName)
    if len(playersByMileTime) < len(players):
        sortByMileTime()

def sortByHeight():
    topHeight = 0
    topHeightName = ''
    for player in players:
        if player['playerName'] not in playersByHeight:
            if player['height'] > topHeight:
                topHeightName = player['playerName']
                topHeight = player['height']
    playersByHeight.append(topHeightName)
    if len(playersByHeight) < len(players):
        sortByHeight()

def assignFormations():
    positions = {"left wing":"mile time", "right wing":"mile time",
                 "striker":"mile time",
                 "left mid":"ball control", "center mid":"ball control", "right mid":"ball control",
                 "left full":"height", "center full":"height", "center full":"height", "right full":"height"}
    for p in positions:
        if(positions.get(p) == "ball control"):
            playersInGame[playersByBallControl[0][0]] = p
            playersInGame[playersByBallControl[0]].remove()
        if(positions.get(p) == "mile time"):
            playersInGame[playersByMileTime[0][0]] = p
            playersInGame[playersByMileTime[0]].remove()
        if(positions.get(p) == "height"):
            playersInGame[playerName[0][0]] = p
            playersInGame[playerName[0]].remove()
    print playersInGame

grabPlayerStats()
