package com.hey.lec07;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Lec07Main {

  public static void main(String[] args) throws IOException {
    JavaFilePrinter printer = new JavaFilePrinter();
    printer.readFile("/a.txt");
  }

}
