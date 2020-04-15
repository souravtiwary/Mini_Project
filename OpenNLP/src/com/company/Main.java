package com.company;

import opennlp.tools.sentdetect.SentenceDetectorME;
import opennlp.tools.sentdetect.SentenceModel;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {

    public static void main(String[] args)throws IOException
    {
	// write your code here

        InputStream inputStream=new FileInputStream("C:\\Users\\AAYUSH\\Desktop\\openNLPBin\\en-sent.bin");
        //C://Users//AAYUSH//Desktop//openNLPBin
        String str="This years’ panels were mostly about the rise of an artist, just like Malta as a top clubbing destination is on the rise.\n" +
                "\n" +
                "‘Learn by day, party by night’ was. the mantra of this two-day summer school, dedicated with carefully selected educational program for new artists and music lovers who are the future of the scene.\n" +
                "\n" +
                "In case you’ve missed IMS College Malta, here are our highlights.";
        SentenceModel sentenceModel=new SentenceModel(inputStream);
        SentenceDetectorME detector=new SentenceDetectorME(sentenceModel);
        String [] sentences=detector.sentDetect(str);


        for(String sent:sentences)
        {
            System.out.println(sent);
        }

    }
}
