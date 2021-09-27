package tw.tcnr02.firebase_chatapp.utilities;

import android.content.Context;
import android.content.SharedPreferences;

public class PreferenceManager {
    //在手機內部新增資料。
//https://developer.android.com/reference/android/content/SharedPreferences
//https://spicyboyd.blogspot.com/2018/04/appandroid-sharedpreferences.html
    private final SharedPreferences sharedPreferences;

    public PreferenceManager(Context context){
        //透過getSharedPreferences來創建和取得這個檔案的內容
        //MODE_PRIVATE，這個存取權限代表，新丟入的值會取代舊的值。
        //取出使用get，記得丟入預設的值。
        //key = Constants.KEY_PREFERENCE_NAME = chatAppPreference
        sharedPreferences = context.getSharedPreferences(Constants.KEY_PREFERENCE_NAME,Context.MODE_PRIVATE);
    }

    public void putBoolean(String key,Boolean value){
        //使用SharedPreferences.Editor編輯資料。
        //存入使用put，然後apply，將值存入檔案之中。
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(key,value);
        editor.apply();
    }
    public Boolean getBoolean(String key){
        return sharedPreferences.getBoolean(key,false);
    }
    public void putString(String key,String value){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(key,value);
        editor.apply();
    }
    public String getString(String key){
        return sharedPreferences.getString(key,null);
    }
    public void clear(){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.clear();
        editor.apply();
    }
}
