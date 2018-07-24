package sg.edu.rp.c346.boxlist;

import android.media.Image;
import android.widget.ImageView;

import java.util.Calendar;

public class ToDoItem {

    private Integer image;

    public ToDoItem(int image) {
        this.image = image;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "ToDoItem{" +
                "image=" + image +
                '}';
    }
}
