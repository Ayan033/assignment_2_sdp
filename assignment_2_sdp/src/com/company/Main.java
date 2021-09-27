package com.company;

public class Main {
    public static void main(String[] args) {
        Subscriber s1 = new Subscriber("Ayan");
        Subscriber s2 = new Subscriber("user123");
        Subscriber s3 = new Subscriber("user4613");

        Channel c1 = new Channel("marmok");

        s1.subscribe(c1);
        s2.subscribe(c1);
        s3.subscribe(c1);
        s3.subscribe(c1);//there is already a subscriber so that the user cannot subscribe for the second time

        c1.uploadVideo("Good games #25, bugs, jokes, fails");

        s2.unsubscribe(c1);
        s2.unsubscribe(c1);//there is no longer a subscriber here

        c1.uploadVideo("Summer of '58");//no more messages for user123

    }

}