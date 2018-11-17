package MyProjects_Early.MultiSortingRecords;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public  class RecordComparator implements Comparator<Record> {

    private List <Comparator <Record>> listComparators;

    @SafeVarargs
    public RecordComparator(Comparator<Record>... comparators) {
        this.listComparators = Arrays.asList(comparators);
    }


    @Override
    public int compare(Record record1, Record record2) {
        for (Comparator<Record> comparator : listComparators) {
            int result = comparator.compare(record1, record2);
            if (result != 0) {
                return result;
            }
        }
        return 0;
    }
}
