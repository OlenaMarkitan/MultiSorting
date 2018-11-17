package MyProjects_Early.MultiSortingRecords;


import java.util.Comparator;


public  class RecordSourceComparator implements Comparator<Record> {
    @Override
    public int compare(Record record1, Record record2) {
        return record1.getSource().compareTo(record2.getSource());
    }
}
