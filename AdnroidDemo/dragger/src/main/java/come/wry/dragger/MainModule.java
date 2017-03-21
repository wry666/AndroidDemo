package come.wry.dragger;

import come.wry.dragger.MVP.MainPresenter;
import dagger.Module;
import dagger.Provides;

/**
 * 作者：wry
 * 时间：2017/3/20:11:38
 * 说明：
 */
@Module
public class MainModule {
    @Provides // 关键字，标明该方法提供依赖对象
    MainPresenter providerPresenter(){
        //提供Person对象 (被注入的对象)
        return new MainPresenter();
    }
}
