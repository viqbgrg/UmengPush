package cordova.plugin.umengpush;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import android.content.Context;
import android.util.Log;
import com.umeng.commonsdk.UMConfigure;

public class PGCommonSDK {
    public static void init(Context context, String appkey, String channel, int type, String secret){
        initCocos("phonegap","1.0");
        UMConfigure.init(context,appkey,channel,type,secret);
    }
    public static void initCocos(String v,String t){

        Method method = null;
        try {

            Class<?> config = Class.forName("com.umeng.commonsdk.UMConfigure");
            method = config.getDeclaredMethod("setWraperType", String.class, String.class);
            method.setAccessible(true);
            method.invoke(null, v,t);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void setLogEnabled(boolean able){

        UMConfigure.setLogEnabled(able);
    }
}
