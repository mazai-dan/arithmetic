package io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileSearch {
    private static  int tabNum = 0;//用于判断目录或文件所处的层次

    public static void main(String[] args) throws IOException {
        File file = new File("D:\\360Downloads");
        deepFile(file);
    }

    public static void  deepFile(File file){
        if (file.isFile() ||0 ==  file.listFiles().length){
            return;
        } else {
           File[] fileList =  file.listFiles();
           fileList = sortFile(fileList);

            for (File f : fileList) {
                StringBuffer buffer = new StringBuffer();
                if (f.isFile()){
                    buffer.append(getTabs(tabNum));
                    buffer.append(f.getName());
                }else {
                    buffer.append(getTabs(tabNum));
                    buffer.append(f.getName());
                    buffer.append("\\"); //同级目录下文件名后跟 \
                }
                System.out.println(buffer.toString());
                if (f.isDirectory()){
                    tabNum ++;  //是目录缩进 +1
                    deepFile(f);
                    tabNum --;
                }
            }

        }
    }

    public static File[] sortFile(File[] f){
        List<File> fileList = new ArrayList<>();
        for (File file : f) {
            if (file.isDirectory()){
                fileList.add(file);
            }
            if (file.isFile()){
                fileList.add(file);
            }
        }
        return  fileList.toArray(new File[f.length]);
    }

    public static String getTabs(int tabNum){
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < tabNum; i++) {
            stringBuffer.append("\t");
        }
        return stringBuffer.toString();
    }
}
