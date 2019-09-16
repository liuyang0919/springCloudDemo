package com.example.eurekaserver;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class EurekaserverApplicationTests {

    @Test
    public void contextLoads() {
        String a = "takeaway_eleme";
        String s = (a.equals("takeaway_eleme") || a.equals("takeaway_meituan")) ? "takeaway" : "e_business";
        System.out.println(s);
    }

    @Test
    public void js() {
        double count = 48;
        double year = 5;
        double m = 365 * year;

        for (int i = 1; i < m + 1; i++) {
            count = count * (0.04 / 365 + 1);
            if (i % 30 == 0)
                count += 1.3;
        }

        count += 0.1 * 10 * year + 8 + 10;
        System.out.println(count * 10000);
    }

}
