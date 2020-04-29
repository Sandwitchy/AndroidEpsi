package fr.epsi.demo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends DemoActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
//        Button btn = findViewById(R.id.toMain);
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //Redirection vers autre fenetre
//                Intent intent = new Intent(HomeActivity.this,MainActivity.class);
//                startActivity(intent);
//            }
//        });
//        findViewById(R.id.toIDK).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //Redirection vers autre fenetre
//                Intent intent = new Intent(HomeActivity.this,ListActivity.class);
//                startActivity(intent);
//            }
//        });
        findViewById(R.id.toMain).setOnClickListener(this);
        findViewById(R.id.toIDK).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.toMain:
                MainActivity.display(HomeActivity.this);
                break;
            case R.id.toIDK:
                ListActivity.display(HomeActivity.this);
                break;
        }
    }
}
