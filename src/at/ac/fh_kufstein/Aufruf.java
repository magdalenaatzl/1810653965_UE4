package at.ac.fh_kufstein;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Aufruf {
    public static void main(String[] args) {

        //Aufgabe 3

        Date date = new Date(118, 10, 2, 14, 9, 54);
        Book a = new Book (200, date, "My Book","125215-12521-73473");

        System.out.println("Das Buch hat "+ a.getPages()+" Seiten, wurde am "+a.getReleased()+ " veröffentlicht und hat den Titel "+a.getTitle());

        //Aufgabe 4

        List<Book>lieblingsbuecher = new ArrayList<>();

        lieblingsbuecher.add(new Book(200, date, "My Book 1", "125215-12521-73473"));
        lieblingsbuecher.add(new Book(200, date, "My Book 2", "6437-623623-24254"));
        lieblingsbuecher.add(new Book(200, date, "My Book 3", "26326-734737-732473"));
        lieblingsbuecher.add(new Book(200, date, "My Book 4", "745854-124412-348743848"));
        lieblingsbuecher.add(new Book(200, date, "My Book 5", "672-5236236-123483475125"));

        for(Book item : lieblingsbuecher){
            System.out.println(item.getTitle()+ " hat "+ item.getPages()+ " Seiten und folgende ISBN: "+item.getIsbn());
        }




    }
}
