package com.company;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Song s = new Song();
        s.setId(8675);
        s.setName("1999");
        s.setAlbum("1999");
        s.setArtist("Prince");
        s.setRating(10);

        Song t = new Song();
        t.setId(3099);
        t.setName("Test Song");
        t.setAlbum("Test Album");
        t.setArtist("Test Artist");
        t.setRating(1);

        ArrayList <Song> mySongs = new ArrayList<>();
        mySongs.add(s);
        mySongs.add(t);

//        System.out.println(s.getName() + " and " + t.getName());

//        for (int i = 0; i < mySongs.size(); i++) {
//            System.out.println(mySongs.get(i));
//        }


        //To print out the songs and albums in arraylist mySongs using printf - "oneSong" is whatever string you name it
        for (Song oneSong:mySongs){
            System.out.printf("The artist is %s and the album %s\n", oneSong.getArtist(), oneSong.getAlbum());
        }






    }

}
