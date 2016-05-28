package demkin.sports.api;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/**
 * Description of ru.demkin.sports.api
 *
 * @author evgen1000end
 * @since 28.05.2016
 */
public class ClubPage extends SportsHttp {


    public void findAllNews(String tagName) throws Exception{

        Document doc = Jsoup.connect(Constants.DEFAULT_HOST+"/"+tagName).get();


        System.out.println(doc.title());


        Elements elements = doc.getElementsByClass("newsline");

        elements.forEach(element -> {

            element.getElementsByClass("titleH2").forEach(element1 -> {

                System.out.println(element1);
            });


        });


        elements.forEach(element -> {

            element.getElementsByClass("short-text").forEach(element1 -> {

                System.out.println(element1);
            });




        });


    }

}
