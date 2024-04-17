package ntu.dpl63132227.recyclerview_examlist;

public class examData {
    String name;
    String date;
    String message;

    examData(String name,
             String date,
             String message)
    {
        this.name = name;
        this.date = date;
        this.message = message;
    }
    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getMassage() {
        return message;
    }
}

