///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package studentrg;
//
///**
// *
// * @author Omar
// */
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.io.PrintWriter; 
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.util.HashMap;
//import java.util.Map;
//import com.google.zxing.BarcodeFormat;
//import com.google.zxing.EncodeHintType;
//import com.google.zxing.WriterException;
//import com.google.zxing.client.j2se.MatrixToImageWriter;
//import com.google.zxing.common.BitMatrix;
//import com.google.zxing.qrcode.QRCodeWriter;
//public class QRGen {
//    public static void main(String[] args) {
//        String path = "C:\\Users\\Mega Store\\Desktop\\QRCode.png";
//        int width = 350;
//        int height = 350;
//
//        Map<EncodeHintType, Object> hints = new HashMap<>();
//        hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
//
//        try {
//            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Mega Store\\Desktop\\data.txt"));
//            String data = reader.readLine();
//            BitMatrix matrix = new QRCodeWriter().encode(data, BarcodeFormat.QR_CODE, width, height, hints);
//            MatrixToImageWriter.writeToFile(matrix, "PNG", new File(path));
//            System.out.println("QR Code Generated!!!");
//
//        } catch (WriterException | IOException e) {
//            e.printStackTrace();
//        }
//    }
//}