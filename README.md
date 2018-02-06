# PUBG4J
A Java wrapper for [pubgtracker.com](https://pubgtracker.com/)


### Prerequisites

What things you need to run the software

```
Java
```

### Usage

```
PUBG pubg = new PUBG("YOUR-API-KEY");
PubgData data = pubg.getPlayerInfo("DodoDodovic");
if (data.getResult().isOk()) {
	System.out.println(data.getId());
    System.out.println(data.getPlayer());
    System.out.println(data.getLeagues());
}
else {
    System.out.println(data.getResult());
}
```
### Jar file

`.jar` file is located in `/out` folder.
