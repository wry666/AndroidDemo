package come.wry.dragger.MVP;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

import javax.inject.Inject;

import come.wry.dragger.DaggerMainComponent;
import come.wry.dragger.MainComponent;
import come.wry.dragger.MainModule;
import come.wry.dragger.R;

public class MainActivity extends AppCompatActivity implements MainView {
    @Inject
    MainPresenter mMainPresenter;

    private Button mLogint;
    private EditText mInput;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 构造桥梁对象
        MainComponent component = DaggerMainComponent.builder().mainModule(new MainModule()).build();
        //注入
        component.inject(this);

        setContentView(R.layout.activity_main);

        initView();
        initData();
        initEvent();
    }

    private void initView() {
        mLogint = (Button) findViewById(R.id.bt1);
        mInput = (EditText) findViewById(R.id.et);
    }

    private void initData() {

    }

    private void initEvent() {

    }


}
