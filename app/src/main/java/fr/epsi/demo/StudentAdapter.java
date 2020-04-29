package fr.epsi.demo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.squareup.picasso.Picasso;

import java.util.List;

import fr.epsi.demo.model.Student;

public class StudentAdapter extends ArrayAdapter<Student> {

    public StudentAdapter(@NonNull Context context, int resource, @NonNull List<Student> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater = (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = layoutInflater.inflate(R.layout.l_student_card,null);

        TextView textView = convertView.findViewById(R.id.TextViewName);
        TextView textView2 = convertView.findViewById(R.id.TextViewEmail);
        ImageView imageView = convertView.findViewById(R.id.ImageViewPicture_url);

        Student student = getItem(position);

        textView.setText(student.getName());
        textView2.setText(student.getEmail());
        Picasso.get().load(student.getPicture_url()).into(imageView);
        return convertView;
    }
}
