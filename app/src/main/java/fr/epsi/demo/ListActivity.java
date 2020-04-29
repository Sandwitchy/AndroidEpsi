package fr.epsi.demo;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.ListView;

import androidx.annotation.Nullable;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

import fr.epsi.demo.model.Student;

public class ListActivity extends DemoActivity {

    private String data = " {\"items\": [{\"picture_url\": \"https://www.numerama.com/content/uploads/2019/05/trou-noir-espace-univers-astronomie.jpg\",\"name\": \"Allan Arraud\",\"email\": \"allan.arraud@epsi.fr\"},{\"picture_url\": \"https://helpx.adobe.com/content/dam/help/en/stock/how-to/visual-reverse-image-search/jcr_content/main-pars/image/visual-reverse-image-search-v2_intro.jpg\",\"name\": \"Moussa Ba2\",\"email\": \"moussa.ba2@epsi.fr\"},{\"picture_url\": \"https://media.gettyimages.com/photos/colorful-powder-explosion-in-all-directions-in-a-nice-composition-picture-id890147976?s=2048x2048\",\"name\": \"Hajar Benaissa\",\"email\": \"hajar.benaissa@epsi.fr\"},{\"picture_url\": \"https://interactive-examples.mdn.mozilla.net/media/examples/grapefruit-slice-332-332.jpg\",\"name\": \"Lilian Berna\",\"email\": \"lilian.berna@epsi.fr\"},{\"picture_url\": \"https://cdn.futura-sciences.com/buildsv6/images/largeoriginal/2/3/1/2310c9171a_50157784_pia23441.jpg\",\"name\": \"Maxime Holec\",\"email\": \"maxime.holec@epsi.fr\"}]}";
    private ArrayList<Student> students;

    public static void display(DemoActivity activity){
        Intent intent = new Intent(activity,ListActivity.class);
        activity.startActivity(intent);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_list_name);
        System.out.println("########################################################################################");
        initData();

        ListView listView = findViewById(R.id.ListItem);

        StudentAdapter studentAdapter = new StudentAdapter(this,R.layout.l_student_card,students);
    }

    private void initData() {
        try{
            JSONObject jsonObject = new JSONObject(data);
            JSONArray jsonArray = jsonObject.getJSONArray("items");
            for (int i=0;i < jsonArray.length();i++) {
                Student student = new Student(jsonArray.getJSONObject(i));
                students.add(student);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        demoApp.displayToast(String.valueOf(students.size()));
    }
}
