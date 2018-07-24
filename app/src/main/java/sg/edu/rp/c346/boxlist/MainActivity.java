package sg.edu.rp.c346.boxlist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ListView lvToDo;
    ArrayList<ToDoItem> alToDoList;
    CustomAdapter caToDo;

    Integer[] imgid={
            R.drawable.blue_box,
            R.drawable.orange_box,
            R.drawable.brown_box,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvToDo = findViewById(R.id.listViewToDo);


        ToDoItem image1 = new ToDoItem(R.drawable.blue_box);
        ToDoItem image2 = new ToDoItem(R.drawable.orange_box);
        ToDoItem image3 = new ToDoItem(R.drawable.brown_box);


        caToDo = new CustomAdapter(this, R.layout.todo_item, alToDoList);


        lvToDo.setAdapter(caToDo);
    }
}
