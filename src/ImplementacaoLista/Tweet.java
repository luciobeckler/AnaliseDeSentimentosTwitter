package ImplementacaoLista;

public class Tweet {

    private Long TweetId;
    private String HandLabel;
    private String AnnotatorID;
    private String Lingua;

    public Tweet(Long tweetId, String handLabel, String annotatorID, String lingua) {
        TweetId = tweetId;
        HandLabel = handLabel;
        AnnotatorID = annotatorID;
        Lingua = lingua;
    }

    public Long getTweetId() {
        return TweetId;
    }

    public String getHandLabel() {
        return HandLabel;
    }

    public String getAnnotatorID() {
        return AnnotatorID;
    }

    public String getLingua() {
        return Lingua;
    }
}
