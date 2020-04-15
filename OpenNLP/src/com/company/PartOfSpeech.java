package com.company;

import opennlp.tools.postag.POSModel;
import opennlp.tools.postag.POSSample;
import opennlp.tools.postag.POSTagger;
import opennlp.tools.postag.POSTaggerME;
import opennlp.tools.tokenize.WhitespaceTokenizer;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

//In this POSModel class in used
public class PartOfSpeech {
    public static void main(String[] args)throws IOException
    {
        InputStream inputStream=new FileInputStream("C:\\Users\\AAYUSH\\Desktop\\openNLPBin\\en-pos-maxent.bin");
        POSModel posModel=new POSModel(inputStream);

        //instantiating POSTagger class
        POSTagger tagger=new POSTaggerME(posModel);
        String str="This years’ panels were mostly about the rise of an artist, just like Malta as a top clubbing destination is on the rise.";

        //Tokenizing sentence using whitespaceTokenizer class
        WhitespaceTokenizer whitespaceTokenizer=WhitespaceTokenizer.INSTANCE;

        String[] token=whitespaceTokenizer.tokenize(str);

        //Generating tags
        String []tags=tagger.tag(token);


        //Instantiating POSSample class
        POSSample sample=new POSSample(token,tags);

        System.out.println(sample.toString());

    }

}
