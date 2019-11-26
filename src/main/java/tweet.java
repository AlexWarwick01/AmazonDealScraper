import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;
//This takes the data and will tweet it from my Twitter.
public class tweet {
    //Basic method - takes data from JSOUP and tweets it with a prefix
    public static void tweetData(String data) {
        try {
            Twitter twitter = new TwitterFactory().getInstance();

            twitter.setOAuthConsumer(contsants.CONSUMER_KEY, contsants.CONSUMER_SECRET);
            AccessToken accessToken = new AccessToken(contsants.ACCESS_KEY,
                    contsants.ACCESS_SECRET);
            twitter.setOAuthAccessToken(accessToken);
            twitter.updateStatus("This is an Automated Tweet - " + data);
            System.out.println("Successfully updated the status in Twitter.");
        } catch (TwitterException te) {
            te.printStackTrace();
        }
    }
}