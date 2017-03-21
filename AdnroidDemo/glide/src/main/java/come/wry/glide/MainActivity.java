package come.wry.glide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

public class MainActivity extends AppCompatActivity {

    private ImageView mIv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mIv = (ImageView) findViewById(R.id.iv);
    }

    public void loadImage(View view) {
        String url = "http://cn.bing.com/az/hprichbg/rb/Dongdaemun_ZH-CN10736487148_1920x1080.jpg";
        String url2 = "http://p1.pstatp.com/large/166200019850062839d3";

        Glide.with(this)
                .load(url2)
                //.asBitmap()  //指定显示静态图
                //.asGif() //指定显示动态图
                .placeholder(R.mipmap.ic_launcher) // 还未加载成功显示的占位图
                .error(R.mipmap.ic_launcher)  //显示异常占位图
                .diskCacheStrategy(DiskCacheStrategy.NONE) //禁用缓存
                //.override(300,300) //指定大小
                .into(mIv);
    }
}
