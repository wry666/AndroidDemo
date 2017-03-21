package come.wry.dragger;

import come.wry.dragger.MVP.MainActivity;
import dagger.Component;

/**
 * 作者：wry
 * 时间：2017/3/20:11:43
 * 说明：
 */
@Component(modules = MainModule.class) // 作为桥梁，沟通调用者 和 依赖对象库
public interface MainComponent {
    //定义注入的方法 (指定注入到哪个类中)
    void inject(MainActivity activity);
}
