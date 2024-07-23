public class Tweet {

    private int TweetId;
    private String HandLabel;
    private String AnnotatorID;

    public Tweet(int tweetId, String handLabel, String annotatorID) {
        TweetId = tweetId;
        HandLabel = handLabel;
        AnnotatorID = annotatorID;
    }

    public int getTweetId() {
        return TweetId;
    }

    public String getHandLabel() {
        return HandLabel;
    }

    public String getAnnotatorID() {
        return AnnotatorID;
    }
}
