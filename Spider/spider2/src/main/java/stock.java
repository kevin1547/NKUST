import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class stock {
    public static void main(String[] args) {
        try{
            Document doc = Jsoup.connect("https://tw.stock.yahoo.com/").get();
            Elements day = doc.select("#ybar-navigation > div > ul > li:nth-child(3) > a");
            Element a = day.get(0);
            Document doc2 = Jsoup.connect(a.absUrl("href")).get();
            Elements stock = doc2.select("#LISTED_STOCK > div > ul > li:nth-child(3) > div:nth-child(4) > a");
            Element stock2 = stock.get(0);
            Document doc3 = Jsoup.connect(stock2.absUrl("href")).get();
            int j = 0, k = 0;
            for(int i = 0; i <= 10; i++){
                String name = doc3.getElementsByClass("Lh(20px) Fw(600) Fz(16px) Ell").get(i+0).text();
                String stockprice = doc3.getElementsByClass("Fxg(1) Fxs(1) Fxb(0%) Ta(end) Mend($m-table-cell-space) Mend(0):lc Miw(68px)").get(j+5).text();
                String highlow = doc3.getElementsByClass("Fxg(1) Fxs(1) Fxb(0%) Ta(end) Mend($m-table-cell-space) Mend(0):lc Miw(74px)").get(k+2).text();
                String percentage = doc3.getElementsByClass("Fxg(1) Fxs(1) Fxb(0%) Ta(end) Mend($m-table-cell-space) Mend(0):lc Miw(74px)").get(k+3).text();
                String open = doc3.getElementsByClass("Fxg(1) Fxs(1) Fxb(0%) Ta(end) Mend($m-table-cell-space) Mend(0):lc Miw(68px)").get(j+6).text();
                String yesterday = doc3.getElementsByClass("Fxg(1) Fxs(1) Fxb(0%) Ta(end) Mend($m-table-cell-space) Mend(0):lc Miw(68px)").get(j+7).text();
                String highest= doc3.getElementsByClass("Fxg(1) Fxs(1) Fxb(0%) Ta(end) Mend($m-table-cell-space) Mend(0):lc Miw(68px)").get(j+8).text();
                String lowest = doc3.getElementsByClass("Fxg(1) Fxs(1) Fxb(0%) Ta(end) Mend($m-table-cell-space) Mend(0):lc Miw(68px)").get(j+9).text();
                j = j + 5;
                k = k + 2;
                System.out.println("股票名: " + name + "\n" + "股價: " + stockprice + " 漲跌: " + highlow + " 漲跌幅: " + percentage + " 開盤: " + open + " 昨收: " + yesterday + " 最高: " + highest + " 最低: " + lowest + "\n");
            }
        }catch (Exception e) {
            System.out.println("error: " + e);
        }
    }
}
