package MyProjects_Early.MultiSortingRecords;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;


public class Record {
    private Date date;
    private int importance;
    private String source;
    private String message;
    private String s;
    private String imp;
    private String nnn;
    private Record record;

    // **************************************************************************************
    // Конструктор :

    public Record() {
    }
    // **************************************************************************************
    // Конструктор - принимающий в качестве параметров значения всех указанных выше полей:

    public Record(Date date, int importance, String source, String message) {
        this.date = date;
        this.importance = importance;
        this.source = source;
        this.message = message;
    }
    // **************************************************************************************
    // Конструктор - принимающий единственный параметр - строку в формате, аналогичном возвращаемому методом toString();
    // разделитель - один или несколько пробелов. В данном случае - 2 пробела:

    public Record(String s) {
        //  разбиваем String по пробелам - вне зависимости сколько пробелов - один или больше:

        ArrayList<String> wow = new ArrayList<String>();
        int pink = 0;
        boolean f = false;

        for (int bon = 0; bon < s.length(); bon++) {
            if (s.charAt(bon) == ' ') {
                if (bon > pink) {
                    wow.add(s.substring(pink, bon));
                }
                pink = bon + 1;
            }
        }
        if (pink < s.length()) {
            wow.add(s.substring(pink));
        }
        String[] r = wow.toArray(new String[wow.size()]);

        String win = r[0]+" "+r[1];                      // String date

        //****************
        // String date - to Date
        try {
            String sd = win;
            //  System.out.println("String-date  =  " + sd);
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            date = format.parse(sd);
            //  System.out.println("Date after SimpleDateFormat = " + date);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //****************
        this.date = date;

        nnn = r[2];
        if (nnn.equals(".")) {
            importance = 1;
        }
        if (nnn.equals("!")) {
            importance = 2;
        }
        if (nnn.equals("!!!")) {
            importance = 3;
        }
        if (nnn.equals("!!!!!")) {
            importance = 4;
        }
        this.importance = importance;

        this.source = r[3];
        this.message = r[4];
    }

    // **************************************************************************************
    // Метод - toString() - возвращает текстовое представление записи об ошибке в формате:
    // «yyyy-MM-dd HH:mm:ss важность источник сообщение_об_ошибке».

    public String toString(Date date, int importance, String source, String message) {
        if (importance == 1) {
            imp = ".    ";
        }
        if (importance == 2) {
            imp = "!    ";
        }
        if (importance == 3) {
            imp = "!!!  ";
        }
        if (importance == 4) {
            imp = "!!!!!";
        }

        SimpleDateFormat mow = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String reportDate=(mow.format(date));

        String[] a = new String[4];
        a[0] = reportDate;
        a[1] = imp;
        a[2] = source;
        a[3] = message;
        s = a[0] + "  " + a[1] + "  " + a[2] + "  " + a[3];
        return s;
    }

    // **************************************************************************************
    // Метод - printRecordInfo():

    void printRecordInfo() {
        System.out.println("Date=" + date + " " + "Importance=" + importance + " " + "Source=" + source + " " + "Message=" + message);
    }

    // **************************************************************************************
    // Setters:

    void setDate(Date date) {
        this.date = date;
    }

    void setImportance(int importance) {
        this.importance = importance;
    }

    void setSourse(String source) {

        this.source = source;
    }

    void setMessage(String message) {
        this.message = message;
    }

    // **************************************************************************************
    // Getters:

    public Date getDate() {
        return date;
    }

    public Integer getImportance() {
        return importance;
    }

    public String getSource() {
        return source;
    }

    public String getMessage() {
        return message;
    }

    // **************************************************************************************

    public Record getRecord() {

        return record;
    }
    // **************************************************************************************

}

