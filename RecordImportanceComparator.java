package MyProjects_Early.MultiSortingRecords;

import java.util.Comparator;


public  class RecordImportanceComparator implements Comparator<Record> {
    @Override
    public int compare(Record record1, Record record2) {
        return record1.getImportance()-record2.getImportance();
    }
}
