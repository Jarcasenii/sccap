package com.sccv2;

import java.io.File;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
public class ReadImages {
public static void main(String[] args) {

ITesseract image = new Tesseract();

image.setDatapath("D:/Documents/GitHub/SCCv2/demo/tessdata");


try {
String str = image.doOCR(new File("D:/Pictures/Untitled.png"));

System.out.println(str);

} catch (TesseractException e) {
    e.printStackTrace();
}
}
}