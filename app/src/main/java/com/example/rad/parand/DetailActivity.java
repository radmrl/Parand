package com.example.rad.parand;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {

  public static final String COURSE_TITLE = "Course Title";
  public static final String COURSE_DESC = "Course Desc";
  public static final int DETAIL_REQUEST_CODE = 1001;

  int courseNumber =5;
  String title="title";
  String description="description";
  double credits=5.0;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_detail);




  }

  public void btnClickHndler(View view) {
    Intent detailIntent = new Intent(this,ActivityMain.class);
    Course course = new Course(courseNumber,  title,  description,credits);
    detailIntent.putExtra(COURSE_TITLE,course.getTitle());
    startActivity(detailIntent);
    startActivityForResult(detailIntent, DETAIL_REQUEST_CODE);
  }

  @Override
  protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    if (requestCode==DETAIL_REQUEST_CODE){
      if (requestCode==RESULT_OK){
        String msg=data.getStringExtra("resultMessage");
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show();
      }
    }

  }
}
