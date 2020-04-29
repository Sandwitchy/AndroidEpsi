package fr.epsi.demo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class StudentActivity extends DemoActivity {

    public static final int K_I_RESULT_CODE_CLOSE=222;

    public static void display(DemoActivity activity){
        Intent intent = new Intent(activity,HomeActivity.class);
        activity.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
        final TextView title = findViewById(R.id.title_header);
        title.setText("Infos");
        Button btn = findViewById(R.id.buttonFratani);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Redirection vers autre fenetre
                Intent intent = new Intent(StudentActivity.this, NameActivity.class);
                startActivity(intent);
            }
        });
    }
}
