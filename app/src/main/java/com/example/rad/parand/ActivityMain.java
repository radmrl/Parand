package com.example.rad.parand;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

public class ActivityMain extends AppCompatActivity {

  public static final String LOG_TAG = "MainActivity";
  protected String courseDesc;
  protected String courseTitle;
  int courseNumber = 5;
  String title = "title";
  String description = "description";
  double credits = 5.0;

  protected List<Course> data;
  /**
   * ATTENTION: This was auto-generated to implement the App Indexing API.
   * See https://g.co/AppIndexing/AndroidStudio for more information.
   */
  private GoogleApiClient client;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    float pixels = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 100, getResources().getDisplayMetrics());
    Button mybutton = (Button) findViewById(R.id.mybutton);
    mybutton.getLayoutParams().height = (int) pixels;

    LinearLayout layout = (LinearLayout) findViewById(R.id.linear);

    ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(
      ActionBar.LayoutParams.WRAP_CONTENT,
      ActionBar.LayoutParams.WRAP_CONTENT);

    for (int i = 0; i < 3; i++) {
      Button button = new Button(this);
      button.setText(R.string.Click_Me);
      button.setLayoutParams(params);
      layout.addView(button);
    }

    TextView tv = (TextView) findViewById(R.id.longTest);
    StringBuffer sb = new StringBuffer();
    sb.append(getString(R.string.parandtext));
    sb.append(getString(R.string.parandtext));
    sb.append(getString(R.string.parandtext));
    sb.append(getString(R.string.parandtext));

    tv.setText(sb.toString());

    Log.d(LOG_TAG, "onCreate");

    Button button3 = (Button) findViewById(R.id.button3);
    button3.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Log.d(LOG_TAG, "onClick");

      }
    });
    // ATTENTION: This was auto-generated to implement the App Indexing API.
    // See https://g.co/AppIndexing/AndroidStudio for more information.
    client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();

    getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

    courseTitle = getIntent().getStringExtra(DetailActivity.COURSE_TITLE);
    TextView tvtitle = (TextView) findViewById(R.id.tvTitle);
    tvtitle.setText(courseTitle);

    courseDesc = getIntent().getStringExtra(DetailActivity.COURSE_DESC);
    TextView tvDesc = (TextView) findViewById(R.id.tvTitle);
    tvtitle.setText(courseDesc);


    data = DataProvider.getData();

  //  ArrayAdapter<Course> courseArrayAdapter = new ArrayAdapter<Course>(this, android.R.layout.simple_list_item_1, data);
    ArrayAdapter<Course> courseArrayAdapter = new CourseArrayeAdapter(this, 0, data);

    ListView listView = (ListView) findViewById(R.id.List);
    listView.setAdapter(courseArrayAdapter);

    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
      @Override
      public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Course course = data.get(position);
        displayDetail(course);
      }
    });
    /*Iterator<Course> iterator = data.iterator();
    StringBuilder builder = new StringBuilder();
    while (iterator.hasNext()) {
      Course course = iterator.next();
      builder.append(course.getTitle()).append("\n");
    }
    TextView tv2 = (TextView) findViewById(R.id.tvCourseList);
    tv2.setText(builder.toString());*/


  }
  class CourseArrayeAdapter extends ArrayAdapter<Course>{

    Context context;
    List<Course> objects;
    public CourseArrayeAdapter(Context context, int resource, List<Course> objects) {
      super(context, resource, objects);

      this.context=context;
      this.objects=objects;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
      Course course= objects.get(position);
      LayoutInflater inflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);

      View view= inflater.inflate(R.layout.course_item,null);
      TextView tv= (TextView) view.findViewById(R.id.tvTitle);
      tv.setText(course.getTitle());

      ImageView iv= (ImageView) view.findViewById(R.id.imageCourse);
      int res=context.getResources().getIdentifier("image_"+course.getCourseNumber(),"drawable",context.getPackageName());
      iv.setImageResource(res);

     // return super.getView(position, convertView, parent);
      return view;
    }
  }

  private void displayDetail(Course course) {

    Log.d(LOG_TAG, "Desplay Course : " + course.getTitle());

    Intent intent = new Intent(this,DetailActivity.class);
    intent.putExtra(DetailActivity.COURSE_TITLE,course.getTitle());
    intent.putExtra(DetailActivity.COURSE_DESC,course.getDescription());
    startActivityForResult(intent,DetailActivity.DETAIL_REQUEST_CODE);


  }

  @Override
  public void onConfigurationChanged(Configuration newConfig) {
    super.onConfigurationChanged(newConfig);

    if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
      Log.d(LOG_TAG, "Changed To PORTRAIT");
    } else {
      Log.d(LOG_TAG, "Changed To LANDSCAPE");
    }
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {

    Log.d(LOG_TAG, "onCreateOptionsMenu");

    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.menu_main, menu);

    MenuItem item = menu.add(Menu.NONE, Menu.NONE, 103, "New Item");
    item.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);

    item.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
      @Override
      public boolean onMenuItemClick(MenuItem item) {
        Toast.makeText(ActivityMain.this, "You Choose An Item", Toast.LENGTH_SHORT).show();
        return false;
      }
    });
    return true;
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item) {

    Log.d(LOG_TAG, "onOptionsItemSelected");

    // Handle action bar item clicks here. The action bar will
    // automatically handle clicks on the Home/Up button, so long
    // as you specify a parent activity in AndroidManifest.xml.
    int id = item.getItemId();

    //noinspection SimplifiableIfStatement
    if (id == R.id.action_settings) {
      return true;
    } else if (id == android.R.id.home) {
      finish();
    }

    return super.onOptionsItemSelected(item);
  }

  public void registerClickHandler(View view) {

    Button button = (Button) view;


    Log.d(LOG_TAG, "registerClickHandler : " + button.getText());
  }

  @Override
  public void onStart() {
    super.onStart();

    Log.d(LOG_TAG, "onStart");

    // ATTENTION: This was auto-generated to implement the App Indexing API.
    // See https://g.co/AppIndexing/AndroidStudio for more information.
    client.connect();
    Action viewAction = Action.newAction(
      Action.TYPE_VIEW, // TODO: choose an action type.
      "ActivityMain Page", // TODO: Define a title for the content shown.
      // TODO: If you have web page content that matches this app activity's content,
      // make sure this auto-generated web page URL is correct.
      // Otherwise, set the URL to null.
      Uri.parse("http://host/path"),
      // TODO: Make sure this auto-generated app URL is correct.
      Uri.parse("android-app://com.example.rad.parand/http/host/path")
    );
    AppIndex.AppIndexApi.start(client, viewAction);
  }

  @Override
  protected void onResume() {
    super.onResume();
    Log.d(LOG_TAG, "onResume");
  }

  @Override
  protected void onPause() {
    super.onPause();
    Log.d(LOG_TAG, "onPause");
  }

  @Override
  public void onStop() {
    super.onStop();
    Log.d(LOG_TAG, "onStop");

    // ATTENTION: This was auto-generated to implement the App Indexing API.
    // See https://g.co/AppIndexing/AndroidStudio for more information.
    Action viewAction = Action.newAction(
      Action.TYPE_VIEW, // TODO: choose an action type.
      "ActivityMain Page", // TODO: Define a title for the content shown.
      // TODO: If you have web page content that matches this app activity's content,
      // make sure this auto-generated web page URL is correct.
      // Otherwise, set the URL to null.
      Uri.parse("http://host/path"),
      // TODO: Make sure this auto-generated app URL is correct.
      Uri.parse("android-app://com.example.rad.parand/http/host/path")
    );
    AppIndex.AppIndexApi.end(client, viewAction);
    client.disconnect();
  }


  public void imageClickHandler(View view) {

    String imageName = "parand2";
    int res = getResources().getIdentifier(imageName, "drawable", getPackageName());
    ImageView imageView = (ImageView) findViewById(R.id.imageCourse);
    imageView.setImageResource(res);
  }

  public void imageassetsClickHandler(View view) {
    String imageName = "parand3.jpg";
    ImageView imageView = (ImageView) findViewById(R.id.imageCourse);
    try {
      InputStream inputStream = getAssets().open(imageName);
      Drawable drawable = Drawable.createFromStream(inputStream, null);
      imageView.setImageDrawable(drawable);
    } catch (Exception e) {
      Log.e(LOG_TAG, e.getMessage());
    }

  }

  public void actionResourceclickHndler(MenuItem item) {
    String imageName = "parand2";
    int res = getResources().getIdentifier(imageName, "drawable", getPackageName());
    ImageView imageView = (ImageView) findViewById(R.id.imageCourse);
    imageView.setImageResource(res);

  }

  public void actionAssetsclickHndler(MenuItem item) {
    String imageName = "parand3.jpg";
    ImageView imageView = (ImageView) findViewById(R.id.imageCourse);
    try {
      InputStream inputStream = getAssets().open(imageName);
      Drawable drawable = Drawable.createFromStream(inputStream, null);
      imageView.setImageDrawable(drawable);
    } catch (Exception e) {
      Log.e(LOG_TAG, e.getMessage());
    }
  }

  public void actionResourceClickHandler(MenuItem item) {
    String imageName = "parand2";
    int res = getResources().getIdentifier(imageName, "drawable", getPackageName());
    ImageView iv = (ImageView) findViewById(R.id.imageCourse);
    iv.setImageResource(res);
  }

  public void actionAssetClickHandler(MenuItem item) {
    String imageName = "parand3.jpg";
    ImageView iv = (ImageView) findViewById(R.id.imageCourse);

    try {
      InputStream stream = getAssets().open(imageName);
      Drawable drawable = Drawable.createFromStream(stream, null);
      iv.setImageDrawable(drawable);
    } catch (Exception e) {
      Log.e(LOG_TAG, e.getMessage());
    }
  }

  public void btnClickHandler(View view) {

    Intent detailIntent = new Intent(this, DetailActivity.class);

    Course course = new Course(courseNumber, title, description, credits);

    detailIntent.putExtra(DetailActivity.COURSE_TITLE, course.getTitle());

    startActivity(detailIntent);
  }

  public void registerClickHandler1(View view) {
    getIntent().putExtra("resultMessage", "You Are Regestered For" + DetailActivity.COURSE_TITLE);
    setResult(RESULT_OK, getIntent());
    finish();
  }

  public void websiteClickHandler(View view) {
    Uri webPage = Uri.parse("http://www.parandco.com/");
    Intent webintent = new Intent(Intent.ACTION_VIEW, webPage);
    startActivity(webintent);


  }


}
