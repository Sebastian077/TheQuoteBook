package com.fishindustries.bass.thequotebook;

/**
 * Created by Bass on 2/9/2017.
 */

public class Quote {
    public String quote;
    public String person;


    public Quote(String mQuote, String mPerson){
        super();

        quote = mQuote;
        person = mPerson;

    }

    public String getPerson() {
        return person;
    }

    public String getQuote() {
        return quote;
    }

}
