package xyz.dodo.entity;


public class Player {
    String accId;
    String nickname;
    String avatarURL;

    public String getAccId() {
        return accId;
    }

    public String getNickname() {
        return nickname;
    }

    public String getAvatarURL() {
        return avatarURL;
    }

    public Player(String accId, String nickname, String avatarURL) {
        this.accId = accId;
        this.nickname = nickname;
        this.avatarURL = avatarURL;
    }

    @Override
    public String toString() {
        return "Player{" +
                "accId='" + accId + '\'' +
                ", nickname='" + nickname + '\'' +
                ", avatarURL='" + avatarURL + '\'' +
                '}';
    }
}
