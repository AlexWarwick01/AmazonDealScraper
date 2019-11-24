import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class jsoup {
    public static void main(String[] args) throws IOException {
        String url = "https://www.amazon.co.uk/dp/B07BPFW2QD/?cstrackid=16d9d55e-b2e7-4025-893e-75c461e979d7&tag=audiotcsuk-21";
        Document document = Jsoup.connect(url).userAgent("Mozilla/49.0").get();
        Elements question = document.select("#priceblock_ourprice");
        System.out.println("Price is " + question.html());
    }


}
