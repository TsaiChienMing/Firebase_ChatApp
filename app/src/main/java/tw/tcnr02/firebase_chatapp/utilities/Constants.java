package tw.tcnr02.firebase_chatapp.utilities;

import java.util.HashMap;

public class Constants {
    public static final String KEY_COLLECTION_USERS = "users";
    public static final String KEY_NAME = "name";
    public static final String KEY_EMAIL = "email";
    public static final String KEY_PASSWORD = "password";
    public static final String KEY_PREFERENCE_NAME = "chatAppPreference";
    public static final String KEY_IS_SIGNED_IN = "isSignedIn";
    public static final String KEY_USER_ID = "userId";
    public static final String KEY_IMAGE = "image";
    public static final String KEY_FCM_TOKEN = "fcmToken";
    public static final String KEY_USER = "user";
    public static final String KEY_COLLECTION_CHAT = "chat";
    public static final String KEY_SENDER_ID = "senderId";
    public static final String KEY_RECEIVER_ID = "receiverId";
    public static final String KEY_MESSAGE = "message";
    public static final String KEY_TIMESTAMP = "timestamp";
    public static final String KEY_COLLECTION_CONVERSATIONS = "conversations";
    public static final String KEY_SENDER_NAME = "senderName";
    public static final String KEY_RECEIVER_NAME = "receiverName";
    public static final String KEY_SENDER_IMAGE = "senderImage";
    public static final String KEY_RECEIVER_IMAGE = "receiverImage";
    public static final String KEY_LAST_MESSAGE = "lastMessage";
    public static final String KEY_AVAILABILITY = "availability";
    //FCM 授權 HTTP 請求
    //消息請求由兩部分組成：HTTP 標頭和 HTTP 正文。 HTTP 標頭必須包含以下標頭：
    //
    //Authorization ：鍵= YOUR_SERVER_KEY
    //確保這是服務器密鑰，其值是可用的雲計算消息的火力地堡控制台設置面板的選項卡。 FCM 拒絕 Android、iOS 和瀏覽器密鑰。
    //Content-Type ： application/json的JSON; application/x-www-form-urlencoded;charset=UTF-8為純文本。
    //如果Content-Type被省略，格式被認為是純文本。
    //資料來源:https://firebase.google.com/docs/cloud-messaging/auth-server
    //Content-Type:application/json
    //Authorization:key=AIzaSyZ-1u...0GBYzPu7Udno5aA
    //{
    //  "to" : "bk3RNwTe3H0:CI2k_HHwgIpoDKCIZvvDMExUdFQ3P1...",
    //  "data" : {
    //    ...
    //  },

    //api_key=YOUR_SERVER_KEY
    //
    //curl --header "Authorization: key=$api_key" \
    //     --header Content-Type:"application/json" \
    //     https://fcm.googleapis.com/fcm/send \
    //     -d "{\"registration_ids\":[\"ABC\"]}"
    public static final String REMOTE_MSG_AUTHORIZATION = "Authorization";
    public static final String REMOTE_MSG_CONTENT_TYPE = "Content-Type";
    public static final String REMOTE_MSG_DATA = "data";
    public static final String REMOTE_MSG_REGISTRATION_IDS = "registration_ids";


    public static HashMap<String,String>remoteMsgHeaders = null;
    public static HashMap<String,String>getRemoteMsgHeaders(){
        if (remoteMsgHeaders ==null){
            remoteMsgHeaders = new HashMap<>();
            remoteMsgHeaders.put(
                    REMOTE_MSG_AUTHORIZATION,
                    "key=AAAA7eholOA:APA91bGIzODNKapioUMldiqKKnp8cJF13QA9tu_zLf9pcpgUd7x9-9Xo-XhkKs5a1_Tx10G0XnVqAhusvGREbdSW9YI8_gA68FawTEWI72_zAsY8AkoLSKZ7_fGvZw_dJ71AQ38D3MaC"
            );
            remoteMsgHeaders.put(
                    REMOTE_MSG_CONTENT_TYPE,
                    "application/json"
            );
        }
        return remoteMsgHeaders;
    }
}
