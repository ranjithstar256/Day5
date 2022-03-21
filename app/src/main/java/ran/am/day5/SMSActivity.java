package ran.am.day5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.EditText;

public class SMSActivity extends AppCompatActivity {
    EditText ednum,edmsg;
    String s1,s2,s3,s4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smsactivity);
        ednum=findViewById(R.id.editTextTextPersonName);
        edmsg=findViewById(R.id.editTextTextPersonName2);
    }
    //  2 switches

    public void sendsms(View view) {

        ActivityCompat.requestPermissions(SMSActivity.this,
                new String[]{Manifest.permission.SEND_SMS},
                1);

        s1=ednum.getText().toString();
        s2=edmsg.getText().toString();

        SmsManager smsManager = SmsManager.getDefault();
        smsManager.sendTextMessage(s1,null,s2,null,null);
    }
}