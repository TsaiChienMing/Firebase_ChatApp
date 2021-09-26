package tw.tcnr02.firebase_chatapp.network;


import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class ApiClient {

    private static Retrofit retrofit = null;

    public static Retrofit getClient(){
        if (retrofit ==null){
            retrofit = new Retrofit.Builder()
                    //https://fcm.googleapis.com/fcm/
                    .baseUrl("https://fcm.googleapis.com/fcm/") //網址要對
                    .addConverterFactory(ScalarsConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
    //Notification error檢查
    //檢查Retrofit網址是否正確
    //檢查sender 和 receiver 的token 是否正確
    //檢查Constants的資料是否正確
}
