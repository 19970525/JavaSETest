package com.hw.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest {

    public static void main(String[] args) {
        /*
        正则表达式特殊字符：
        ^   匹配一行的开头
        $   匹配一行的结尾
        ()  标记子表达式
        []  括号内匹配的任意符合字符----->枚举[abc]   范围[a-c] 否[^abc] 并[a-c[A-f]]
        {}  字符出现频度
        *   前面子表达式出现零次或多次
        +   前面子表达式出现一次或多次
        ?   前面子表达式出现零次或一次
        .   单个字符
        \   转义
        |   或 ---------->(x)|(y)|(z表达式)

        预定义字符：
        \d  0~9的数字
        \D  非数字
        \s  空白符（空格，制表符，回车符，换页符，换行符等）
        \S  非空白符
        \w  单词
        \W  非单词
         */


        /*
        Matcher匹配类的几个常用方法：
        matchers(String str)
        find()
        group()
        start()         end()          返回上一次匹配子串在目标字符串的开始或结束位置
         */

        String str = "hello，大家好！我是pengjun，我的学号是158A3E3，我的电话1是15833978226,电话2是15871979220，电话3是18855667788有事常联系哈！";
        Matcher m = Pattern.compile("((158)|(188))\\d{8}").matcher(str);
        System.out.println(m.matches());    //false 目标字符串是否与整个正则表达式匹配（强调是整个匹配）
        while (m.find()){       //true  目标字符串中是否含有与正则表达式匹配的子串（强调含有）
            System.out.print(m.group() + "\t"); //15833978226	15871979220	18855667788
            System.out.println("\n开始位置：" + m.start() + "\t结束位置：" + m.end());
        }

        /*
        原理：1.Pattern对象多次使用情况：
        Pattern模式类的compile方法返回Pattern对象；
        Pattern对象通过matcher方法创建一个Matcher匹配对象；
        通过Matcher类的方法对匹配的字符串进行操作

        2.Pattern对象一次性使用情况：
        boolean b = Pattern.Matches(expressStr,str);
         */
    }
}
