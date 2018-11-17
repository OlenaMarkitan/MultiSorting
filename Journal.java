package MyProjects_Early.MultiSortingRecords;

import java.util.*;


public class Journal extends ArrayList {

    private ArrayList<Record> journal;
    private Journal j;

    //***********************************************
    public Journal(ArrayList<Record> journal) {

        this.journal = journal;
    }
    //***********************************************
    public ArrayList<Record> getJournal() {

        return journal;
    }
    //***********************************************
    public void setJournal(ArrayList<Record> jor) {

        this.journal = jor;
    }
    // *******************************************************************************************
    // 1 - добавления записи:
    public void add(Record r) {
        journal.add(r);
    }

    // *******************************************************************************************
    // 2 - добавления всех записей из другого журнала:

    public void add(Journal j) {
        for (int i = 0; i < j.getJournalSize(); i++) {
            journal.add(j.getJournalRecord(i));
        }
    }
    // *******************************************************************************************
    // 3 - удаления одной записи:
    //  удаляет ВСЕ записи с содержимым - Record r:

    public void remove(Record r) {
        for (int i = 0; i < journal.size(); i++) {
            journal.remove(r);
        }
    }
    //********************************************************************************************
    // 4 - удаления записи по ее порядковому номеру (index):

    public void remove_index(int index) {

        journal.remove(index);
    }
    //********************************************************************************************
    // 5 - удаление записей у которых (index) находится в диапазоне:    fromIndex - toIndex

    public void remove(int fromIndex, int toIndex) {
        // int hg = fromIndex;
        for (int i = toIndex; i >= fromIndex; i--) {
            journal.remove(fromIndex);
        }
    }
    //********************************************************************************************
    // 6 - удаления всех записей:

    public void removeAll() {

        journal.clear();
    }
    //********************************************************************************************
    // 7 - фильтрации (возвращает объект Journal, в котором хранятся ссылки только на те записи,
    // текстовое представление которых (toString()) содержит заданную строку:

    public Journal filter(String s) {

        ArrayList<Record> filString = new ArrayList<Record>();
        Journal sun = new Journal(filString);
        j=sun;

        for (int i = 0; i < journal.size(); i++) {
            String o = journal.get(i).toString(journal.get(i).getDate(), journal.get(i).getImportance(), journal.get(i).getSource(), journal.get(i).getMessage());
            if (o.equals(s)) {
                filString.add(journal.get(i));
            }
        }
        return j;
    }
    //********************************************************************************************
    // 8 - фильтрации (возвращает объект Journal, в котором хранятся ссылки только на записи о
    // событиях, произошедших в указанный интервал времени:

    public Journal filter (Date fromDate, Date toDate) {

        ArrayList<Record> filter_date = new ArrayList<Record>();
        Journal sun = new Journal(filter_date);
        j = sun;

        for (int i = 0; i < journal.size(); i++) {
            if ((journal.get(i).getDate()).compareTo(fromDate) > -1) {
                if ((journal.get(i).getDate()).compareTo(toDate) < 1) {
                    filter_date.add(journal.get(i));
                }
            }
        }
        return j;
    }
    //********************************************************************************************
    // 9 - сортировкa по (Date):

    public void sortByDate() {

        System.out.println("*** Before sorting:");
        for (Record state : journal) {
            state.printRecordInfo();
        }

        Collections.sort(journal, new RecordComparator(
                new RecordDateComparator())
        );

        System.out.println("\n*** After sorting:");

        for (Record state : journal) {
            state.printRecordInfo();
        }
        System.out.println();

    }
    // *******************************************************************************************
    // 10 - сортировкa по (Importance, Date):

    public void sortByImportanceDate() {

        System.out.println("*** Before sorting:");
        for (Record state : journal) {
            state.printRecordInfo();
        }

        Collections.sort(journal, new RecordComparator(
                new RecordImportanceComparator(),
                new RecordDateComparator())
        );

        System.out.println("\n*** After sorting:");

        for (Record state : journal) {
            state.printRecordInfo();
        }
        System.out.println();
    }

    // *******************************************************************************************
    // 11 - сортировкa по (Importance, Source, Date):

    public void sortByImportanceSourceDate() {
        System.out.println("*** Before sorting:");
        for (Record state : journal) {
            state.printRecordInfo();
        }

        Collections.sort(journal, new RecordComparator(
                new RecordImportanceComparator(),
                new RecordSourceComparator(),
                new RecordDateComparator())
        );

        System.out.println("\n*** After sorting:");

        for (Record state : journal) {
            state.printRecordInfo();
        }
        System.out.println();
    }
    //********************************************************************************************
    // 12 - сортировка по (Source, Date):

    public void sortBySourceDate() {
        System.out.println("*** Before sorting:");
        for (Record state : journal) {
            state.printRecordInfo();
        }

        Collections.sort(journal, new RecordComparator(
                new RecordSourceComparator(),
                new RecordDateComparator())
        );

        System.out.println("\n*** After sorting:");

        for (Record state : journal) {
            state.printRecordInfo();
        }
        System.out.println();
    }

    // *******************************************************************************************
    // *******************************************************************************************

    // 14 - метод getJournalRecord - ВОЗВРАЩАЕТ Record,
    // которая записана в строке под номером(index), в журнале journal:

    public Record getJournalRecord(int index) {

        return journal.get(index);
    }
    // *******************************************************************************************
    // 15- метод getJournalSize- ВОЗВРАЩАЕТ размер Journal

    public int getJournalSize() {
        int p = 0;
        for (Record state : journal) {
            p++;
        }
        return p;
    }
    // *******************************************************************************************
    // 16 - печатает весь журнал, если обращаться именно к ArrayList
    public void printJournal() {

        for (Record state : journal) {
            state.printRecordInfo();
        }
    }
    // *******************************************************************************************





}