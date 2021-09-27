package tw.tcnr02.firebase_chatapp.activities;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import tw.tcnr02.firebase_chatapp.utilities.Constants;
import tw.tcnr02.firebase_chatapp.utilities.PreferenceManager;

public class BaseActivity extends AppCompatActivity {

    //Console.firebase.google.com/u/0/project/chatapp-ca287/notification
    //A DocumentReference refers to a document location in a Cloud Firestore database
    // and can be used to write, read, or listen to the location.
    private DocumentReference documentReference;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        PreferenceManager preferenceManager = new PreferenceManager(getApplicationContext());
        FirebaseFirestore database = FirebaseFirestore.getInstance();

        documentReference = database.collection(Constants.KEY_COLLECTION_USERS)
                .document(preferenceManager.getString(Constants.KEY_USER_ID));
    }


    //APP狀態(開啟或停止)
    @Override
    protected void onResume() {
        super.onResume();
        documentReference.update(Constants.KEY_AVAILABILITY,1);
    }

    @Override
    protected void onPause() {
        super.onPause();
        documentReference.update(Constants.KEY_AVAILABILITY,0);
    }
}
