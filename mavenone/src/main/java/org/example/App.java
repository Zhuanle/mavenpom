package org.example;

import cn.hutool.core.date.DateUtil;

import java.util.Date;

import static cn.hutool.core.date.DateUtil.*;

/**
 * Hello world!
 *
 */
public class App 
{


    public static void main(String[] args )
    {

        String dateStr = "2019-12-12 12:12:12";
        Date date = parse(dateStr);
        System.out.println(date);
    }
}
