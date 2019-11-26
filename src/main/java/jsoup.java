import java.io.IOException;
import java.sql.SQLOutput;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class jsoup {
    public static void main(String[] args) throws IOException {
        String url = "https://www.amazon.co.uk/s?k=hardrive&crid=113QH4ZX2NRWB&sprefix=harder%2Caps%2C145&ref=nb_sb_ss_sc_1_6";
        Document document = Jsoup.connect(url).userAgent("Mozilla/49.0").timeout(12000).get();
        Elements price = document.select(".rush-component");
        System.out.println(price.outerHtml());
//        String testData = ("You save " + price.html());
//        System.out.println(testData);
//        Commented out so i dont absolutely bombard twitter - i have 5k monthly = 166.67 per day or ~7 per hour
//        tweet.tweetData(testData);

    }
}
