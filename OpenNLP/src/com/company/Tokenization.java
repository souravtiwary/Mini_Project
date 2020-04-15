package com.company;

import opennlp.tools.tokenize.WhitespaceTokenizer;

public class Tokenization {
    public static void main(String [] args)
    {
        String str="Hi. How are you? Welcome to Tutorialspoint. "
                + "We provide free tutorials on various technologies";
        WhitespaceTokenizer whitespaceTokenizer=WhitespaceTokenizer.INSTANCE;
        String [] tokens=whitespaceTokenizer.tokenize(str);

        //printing token
        for(String token:tokens)
        {
            System.out.println(token);

        }
    }

}
