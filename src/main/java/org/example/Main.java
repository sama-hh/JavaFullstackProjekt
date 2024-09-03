package org.example;

import com.github.lalyos.jfiglet.FigletFont;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(asciiArt());
    }

    public static String asciiArt() throws IOException {
        return FigletFont.convertOneLine("Hello world!");
    }

    public static int sum(int a, int b)  {
        return a + b;
    }

}