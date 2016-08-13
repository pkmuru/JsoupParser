package com.company;

import org.apache.commons.io.IOUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.InputStream;
import java.net.URL;

/**
 * Created by muru on 8/13/2016.
 */
public class ComponentParser {

    public static Compo Parse(String url) throws Exception {
        InputStream inputStream = new URL(url).openStream();
        String content = IOUtils.toString(inputStream);


        Document document = Jsoup.parse(content);
        Element body = document.body();
        Elements elements = body.select(".grid");
        Compo compo = new Compo();

        Elements tds = elements.get(1).select("th");     //System.out.println(content);

        tds.forEach(element -> {

          //  System.out.println(element.text());
            switch (element.text()) {
                case "License":
                    compo.setLicense(element.nextElementSibling().text());
                    break;
                case "Categories":
                    compo.setCategories(element.nextElementSibling().text());
                    break;
                case "HomePage":
                    compo.setHomePage(element.nextElementSibling().select("a").text());
                    break;
                case "Date":
                    compo.setDate(element.nextElementSibling().text());
                    break;
                case "Repository":
                    compo.setRepository(element.nextElementSibling().text());
                    break;
                case "Usages":
                    compo.setUsage(element.nextElementSibling().text());
                    break;
            }
        });


        return compo;
    }

}
