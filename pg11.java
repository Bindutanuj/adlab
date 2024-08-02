MainActivity.java
package com.example.gallery;
import android.os.Bundle;
import android.widget.GridView;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
private int[] imageIds = {
R.drawable.image1, R.drawable.image2, R.drawable.image3,
R.drawable.image1,
R.drawable.image2, R.drawable.image3, R.drawable.image3,
R.drawable.image2,
R.drawable.image2, R.drawable.image1, R.drawable.image2,
R.drawable.image3, R.drawable.image3, R.drawable.image2,
R.drawable.image2
};
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
GridView gridView = findViewById(R.id.gridView);
gridView.setAdapter(new ImageAdapter(this, imageIds));
}
}
ImageAdapter.java
package com.example.gallery;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
public class ImageAdapter extends BaseAdapter {
private Context mContext;
private int[] mImageIds;
public ImageAdapter(Context c, int[] imageIds) {
mContext = c;
mImageIds = imageIds;
}
public int getCount() {
return mImageIds.length;
}
public Object getItem(int position) {
return mImageIds[position];
}
public long getItemId(int position) {
return position;
}
public View getView(int position, View convertView, ViewGroup parent) {
ImageView imageView;
if (convertView == null) {
imageView = new ImageView(mContext);
imageView.setLayoutParams(new GridView.LayoutParams(300, 300));
imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
imageView.setPadding(8, 8, 8, 8);
} else {
imageView = (ImageView) convertView;
}
imageView.setImageResource(mImageIds[position]);
return imageView;
}
}
