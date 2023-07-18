package sg.edu.rp.c346.id22015131.p10_demotodolist;

import androidx.annotation.NonNull;

import java.text.DateFormatSymbols;
import java.util.Calendar;

public class ToDoItem {
    private String title;
    private Calendar date;

    public ToDoItem(String title, Calendar date) {
        this.title = title;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    @NonNull
    @Override
    public String toString() {
        return date.get(Calendar.DAY_OF_MONTH)+"/"+date.get(Calendar.MONTH)
        +"/"+date.get(Calendar.YEAR) + " (" + getDay(date.get(Calendar.DAY_OF_WEEK)) + ")";
    }

    public String getDay(int day) {
        String[] dayName = {"Mon", "Tue", "Wed", "Thu", "Friday", "Saturday", "Sunday"};
        return dayName[day-1];
    }
}
