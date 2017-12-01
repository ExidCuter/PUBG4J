# JDodoBot
A Java wrapper for [pubgtracker.com](https://pubgtracker.com/)


### Prerequisites

What things you need to run the software

```
Java
```

### Usage

```
PUBG pubg = new PUBG("Your-Api-Key");
try {
	PubgData data = pubg.getPlayerInfo("Nickname");
    System.out.println(data.getId());
    System.out.println(data.getPlayer());
    System.out.println(data.getLeagues().get(0));
}
catch (Exception e){
	e.printStackTrace();
}
```