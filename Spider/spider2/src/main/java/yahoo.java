import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.SplittableRandom;

public class yahoo {
    public static void main(String[] args) {
            try {
                for(int k = 1; k < 6; k++){//變換到不同頁數
                    int i = 0;
                    Document doc = Jsoup.connect("https://movies.yahoo.com.tw/movie_intheaters.html?page=" + k).get();//進入上映中 - Yahoo奇摩電影
                    System.out.println(doc.title() + "Page" + k + "---------------------------------------------------------------------------------\n");
                    for(int j = 1; j <= 10; j++){//這個for_loop是負責讓下面的select改變選取的位置
                        Elements choose = doc.select("#content_l > div.release_box ul li:nth-child(" + j + ") a");//從doc選擇要抓取的目標位置
                        Elements items = doc.getElementsByClass("release_movie_name");//這行加下面兩行用來取得綜合評分分數
                        Element item = items.get(j - 1);
                        Element num = item.getElementsByTag("span").get(1);
                        Element choose2 = choose.get(0);//從第16行select的位置選取物件
                        String name = doc.getElementsByClass("release_movie_name").get(i).text();//選出release_movie_name這個class的文字部分
                        Document doc2 = Jsoup.connect(choose2.absUrl("href")).get();//進入href裡面的網址
                        Elements items1 = doc2.getElementsByClass("movie_intro_info_r");
                        i = i + 1;
                        Element item2 = items1.get(0);//從movie_intro_info_r這個class選取物件
                        String name2 = item2.getElementsByClass("movie_intro_list").get(0).text();//抓導演名稱
                        String name3 = item2.getElementsByClass("movie_intro_list").get(1).text();//抓演員名稱
                        Elements introduction = doc2.select("#content_l > div:nth-child(1) > div.l_box_inner > div > div > div.movie_intro_info_r > div:nth-child(10) > a");//抓取進入導演簡介位置網址

                        if (doc2.select("#content_l > div:nth-child(1) > div.l_box_inner > div > div > div.movie_intro_info_r > div:nth-child(10) > a").size() == 0){//沒有導演簡介的話
                            Elements pic = doc2.select("#content_l > div:nth-child(1) > div.l_box_inner > div > div > div.movie_intro_info_l > div.movie_intro_foto > img");//抓電影封面照
                            System.out.println(pic);
                            System.out.print("電影名稱: " + name);
                            System.out.println(num.attr("data-num"));
                            System.out.println("導演名稱: " + name2);
                            System.out.println("無導演簡介");
                            System.out.println("演員名稱: " + name3 + "\n");
                        }else{//有導演簡介的話
                            Element introduction2 = introduction.get(0);
                            Document doc3 = Jsoup.connect(introduction2.absUrl("href")).get();//進入導演簡介網址
                            String introduction3 = doc3.select("#content_l > div.personal_lb > div > div.lbcontennt > div.personal_lb_l._c > p").text();//抓出導演簡介
                            Elements pic = doc2.select("#content_l > div:nth-child(1) > div.l_box_inner > div > div > div.movie_intro_info_l > div.movie_intro_foto > img");//抓電影封面照
                            System.out.println("宣傳海報: " + pic);
                            System.out.print("電影名稱: " + name);
                            System.out.println(num.attr("data-num"));
                            System.out.println("導演名稱: " + name2);
                            System.out.println("導演簡介: " + introduction3);
                            System.out.println("演員名稱: " + name3 + "\n");
                        }
                    }
                }
            }
            catch (Exception e) {
                System.out.println("error: " + e);
            }
    }
}
