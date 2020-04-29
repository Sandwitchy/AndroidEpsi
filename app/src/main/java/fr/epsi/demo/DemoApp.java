package fr.epsi.demo;

import android.app.Application;
import android.widget.Toast;

public class DemoApp extends Application {

    private String title = "";

    @Override
    public void onCreate() {
        super.onCreate();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    protected void displayToast(String msg){

        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
    }
}
