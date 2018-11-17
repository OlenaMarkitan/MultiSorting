package MyProjects_Early.MultiSortingRecords;

import java.util.*;
import java.util.ArrayList;
import java.util.Date;


public class Test {
    public static void main(String[] args) {

        // Dates:

        Calendar calendar1 = new GregorianCalendar();
        calendar1.set(1980, Calendar.DECEMBER, 12, 12, 35, 58);
        Date d1 = calendar1.getTime();

        Calendar calendar2 = new GregorianCalendar();
        calendar2.set(1991, Calendar.SEPTEMBER, 12, 12, 35, 58);
        Date d2 = calendar2.getTime();

        Calendar calendar3 = new GregorianCalendar();
        calendar3.set(1999, Calendar.OCTOBER, 12, 12, 35, 58);
        Date d3 = calendar3.getTime();

        Calendar calendar4 = new GregorianCalendar();
        calendar4.set(2003, Calendar.AUGUST, 12, 10, 35, 58);
        Date d4 = calendar4.getTime();

        Calendar calendar5 = new GregorianCalendar();
        calendar5.set(2005, Calendar.AUGUST, 12, 12, 35, 58);
        Date d5 = calendar5.getTime();

        Calendar calendar6 = new GregorianCalendar();
        calendar6.set(2012, Calendar.SEPTEMBER, 12, 10, 35, 52);
        Date d6 = calendar6.getTime();

        Calendar calendar7 = new GregorianCalendar();
        calendar7.set(2013, Calendar.OCTOBER, 12, 23, 35, 58);
        Date d7 = calendar7.getTime();

        Calendar calendar8 = new GregorianCalendar();
        calendar8.set(2015, Calendar.MARCH, 12, 12, 35, 58);
        Date d8 = calendar8.getTime();


        // Records:

        Record p1 = new Record(d7, 4, "home", "swim");
        Record p2 = new Record(d5, 3, "mail", "run");
        Record p3 = new Record(d3, 1, "book", "swim");
        Record p4 = new Record(d4, 2, "joke", "run");
        Record p5 = new Record(d2, 4, "joke", "drink");
        Record p6 = new Record(d7, 3, "smile", "sun");
        Record p7 = new Record(d1, 4, "book", "swim");
        Record p8 = new Record(d8, 3, "smile", "run");
        Record p9 = new Record(d6, 1, "smile", "sun");
        Record p10 = new Record(d1, 1, "note", "sun");
        Record p11 = new Record(d5, 1, "smile", "swim");
        Record p12 = new Record(d1, 2, "smile", "play");
        Record p13 = new Record(d2, 1, "mall", "play");
        Record p14 = new Record(d3, 1, "smile", "run");
        Record p15 = new Record(d1, 4, "smile", "play");

        Record p85 = new Record(d4, 2, "smile", "snow");
        Record p86 = new Record(d5, 4, "note", "snow");
        Record p87 = new Record(d1, 3, "smile", "snow");

        // ***************************************************************************

        ArrayList<Record> array = new ArrayList<Record>();
        Journal mag = new Journal(array);


        ArrayList<Record> snowboard = new ArrayList<Record>();
        Journal j = new Journal(snowboard);

        // ***************************************************************************
        //  Journal - mag:

        Record[] cima = {p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14};
        for (int i = 0; i < cima.length; i++) {
            mag.add(cima[i]);
        }

        System.out.println("\nJournal mag");
        mag.printJournal();

        // ***************************************************************************
        //  Journal - j:

        j.add(p85);
        j.add(p86);
        j.add(p87);

        /*System.out.println("\nj");
        j.printJournal();*/

        // ***************************************************************************
        // 1 - добавления записи в журнал:

        /*mag.add(p15);


        System.out.println("\nRecord p15");
        p15.printRecordInfo();

        System.out.println("\n1 - добавления записи в Journal mag");
        mag.printJournal();*/

        // ***************************************************************************
        // 2 - добавлениe ВСЕХ записей из другого журнала:

        /*System.out.println("\n2 - 2 - добавлениe ВСЕХ записей из другого журнала:\nдобавляем записи из журнала j к журналу mag\n\nJournal j");
        j.printJournal();
        System.out.println("\nResult:  Journal mag = Journal mag(previous) + Journal j:");


        mag.add(j);
        mag.printJournal();*/

        // ***************************************************************************
        // 3 - удаления одной записи:
        //  удаляет ВСЕ записи с содержимым - Record r:

       /* System.out.println("\n3 - удаления одной записи:  Record r:");
        p1.printRecordInfo();
        System.out.println("\nResult:  Journal mag without Record r:");


        mag.remove(p1);
        mag.printJournal();*/

        // ***************************************************************************
        // 4 - удаления записи по ее порядковому номеру:

        /*System.out.println("\n4 - удаления записи по ее порядковому номеру:");

        mag.remove_index(1);
        mag.printJournal();*/

        // ***************************************************************************
        // 5 - удаление записей по их порядковому номеру:

        /*System.out.println("\n5 - удаление записей по их порядковому номеру: - remove(int fromIndex, int toIndex)");

        mag.remove(1,9);
        mag.printJournal();*/

        // ***************************************************************************
        // 6 - удаления всех записей:

        /*System.out.println("\n6 - удаления всех записей:   removeAll()");

        mag.removeAll();
        mag.printJournal();*/

        // ***************************************************************************
        // 7 - фильтрации (возвращает объект Journal, в котором хранятся ссылки
        // только на те записи, текстовое представление которых toString()
        // содержит заданную строку:

        /*String b = p9.toString(d6, 1, "smile", "sun");   // Record to String b
        System.out.println("\nJournal mag - filtered by String");

        ( mag.filter(b)).printJournal();*/

        // ***************************************************************************
        // 8 - фильтрации (возвращает объект Journal, в котором хранятся ссылки только
        // на записи о событиях, произошедших в указанный интервал времени:

        /*System.out.println("\nJournal mag - filtered - fromDate-toDate");

        (mag.filter(d4,d7)).printJournal();*/

        // ***************************************************************************
        // 9 - сортировкa по (Date):

        /*System.out.println("\n9 - сортировкa по (Date):\n");
        mag.sortByDate();*/

        // ***************************************************************************
        // 10 - сортировкa по (Importance, Date):

        /*System.out.println("\n10 - сортировкa по (Importance, Date):\n");
        mag.sortByImportanceDate();*/

        // ***************************************************************************
        // 11 - сортировкa по (Importance, Source, Date):

        /*System.out.println("\n11 - сортировкa по (Importance, Source, Date):\n");
        mag.sortByImportanceSourceDate();*/

        // ***************************************************************************
        //  12 - сортировка по (Source, Date):

       /* System.out.println("\n12 - сортировка по (Source, Date):\n");
        mag.sortBySourceDate();*/

        // ***************************************************************************
        // проверка того, как работае конструктор Record (String s) и метод toString:

        String q=p5.toString(d2, 4, "joke", "drink");
        Record ppp = new Record(q);
        Record nnn = new Record("1991-09-12 12:35:58  !!!!!  joke  drink");
        Record vvv = new Record("1991-09-12 12:35:58  !!!                  joke     drink");
        Record ddd = new Record("1991-09-12        12:35:58  .        joke      drink");



        System.out.println("\n***************");
        System.out.println(q);
        nnn.printRecordInfo();
        p5.printRecordInfo();
        ppp.printRecordInfo();

        System.out.println("vvv");
        vvv.printRecordInfo();

        System.out.println("ddd");
        ddd.printRecordInfo();
        // ***************************************************************************

    }
}
