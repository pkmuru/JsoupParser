package com.company;

import com.google.common.base.Splitter;
import com.google.common.base.Stopwatch;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws Exception {

        String urls = "https://mvnrepository.com/artifact/org.apache.maven/maven-core/3.3.1\n" +
                "https://mvnrepository.com/artifact/org.apache.commons/commons-collections4/4.0\n" +
                "https://mvnrepository.com/artifact/net.sf.ehcache/ehcache-core/2.6.10\n" +
                "https://mvnrepository.com/artifact/commons-io/commons-io/2.4\n" +
                "\n" +
                "https://mvnrepository.com/artifact/org.aspectj/aspectjweaver/1.8.7\n" +
                "https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.11/2.4.8\nhttps://mvnrepository.com/artifact/org.apache.maven/maven-core/3.3.1\n" +
                "https://mvnrepository.com/artifact/org.apache.commons/commons-collections4/4.0\n" +
                "https://mvnrepository.com/artifact/net.sf.ehcache/ehcache-core/2.6.10\n" +
                "https://mvnrepository.com/artifact/commons-io/commons-io/2.4\n" +
                "\n" +
                "https://mvnrepository.com/artifact/org.aspectj/aspectjweaver/1.8.7\n" +
                "https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.11/2.4.8\nhttps://mvnrepository.com/artifact/org.apache.maven/maven-core/3.3.1\n" +
                "https://mvnrepository.com/artifact/org.apache.commons/commons-collections4/4.0\n" +
                "https://mvnrepository.com/artifact/net.sf.ehcache/ehcache-core/2.6.10\n" +
                "https://mvnrepository.com/artifact/commons-io/commons-io/2.4\n" +
                "\n" +
                "https://mvnrepository.com/artifact/org.aspectj/aspectjweaver/1.8.7\n" +
                "https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.11/2.4.8\nhttps://mvnrepository.com/artifact/org.apache.maven/maven-core/3.3.1\n" +
                "https://mvnrepository.com/artifact/org.apache.commons/commons-collections4/4.0\n" +
                "https://mvnrepository.com/artifact/net.sf.ehcache/ehcache-core/2.6.10\n" +
                "https://mvnrepository.com/artifact/commons-io/commons-io/2.4\n" +
                "\n" +
                "https://mvnrepository.com/artifact/org.aspectj/aspectjweaver/1.8.7\n" +
                "https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.11/2.4.8";


        Stopwatch all=Stopwatch.createStarted();

        Splitter.on("\n").trimResults().omitEmptyStrings().splitToList(urls).forEach(s -> {

            try {
                Stopwatch stopwatch = Stopwatch.createStarted();
                Compo c = ComponentParser.Parse(s);
                stopwatch.stop();
                System.out.println("Time taken:" + stopwatch.elapsed(TimeUnit.MILLISECONDS) + "--" + s);
            } catch (Exception e) {

            }
        });

        System.out.println("All time " + all.elapsed(TimeUnit.MILLISECONDS));

    }
}
