package org.example;

import com.github.lalyos.jfiglet.FigletFont;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String asciiArt1 = FigletFont.convertOneLine("Hello world!");
        System.out.println(asciiArt1);
    }
}