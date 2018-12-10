package at.ac.fh_kufstein;

import java.util.Date;

public class Aufruf {
    public static void main(String[] args) {

        Date date = new Date(118, 10, 2, 14, 9, 54);
        Book a = new Book (200, date, "My Book","125215-12521-73473");

        System.out.println("Das Buch hat "+ a.getPages()+" Seiten, wurde am "+a.getReleased()+ " veröffentlicht und hat den Titel "+a.getTitle());

    }
}
