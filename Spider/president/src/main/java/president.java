import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class president {
    public static void main(String[] args) {
        try{
            Document doc = Jsoup.connect("https://zh.wikipedia.org/wiki/%E8%94%A1%E8%8B%B1%E6%96%87").get();
            Elements items = doc.select("#mw-content-text div.mw-parser-output p:nth-child(14) a:nth-child(14)");
            for(Element item : items){
                Document doc2 = Jsoup.connect(item.absUrl("href")).get();
                Elements items2 = doc2.getElementsByClass("mw-parser-output");
                for (Element item2 : items2){
                    String name = doc2.select("#mw-content-text div.mw-parser-output p:nth-child(2) b").get(0).text();
                    System.out.println("蔡英文總統父親名稱: " + name + "\n");
                    String old = doc2.select("#mw-content-text div.mw-parser-output table.infobox.biography.vcard tbody tr:nth-child(2) td").get(0).text();
                    System.out.println(name + "出生於" + old);
                    break;
                }
                break;
            }
        }catch (Exception e){
            System.out.println("error: " + e);
        }
    }
}
