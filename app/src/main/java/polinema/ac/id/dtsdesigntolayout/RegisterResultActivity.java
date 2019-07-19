package polinema.ac.id.dtsdesigntolayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import polinema.ac.id.dtsdesigntolayout.models.Register;

public class RegisterResultActivity extends AppCompatActivity {

    //inisialisasi variabel
    TextView tvResultNama, tvResultTanggalLahir, tvResultJenisKelamin, tvResultUsername;

    // Intent key
    public static final String Key_RegisterActivity = "Key_RegisterActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_result);
        // assign view
        tvResultNama = findViewById(R.id.tvResultNama);
        tvResultTanggalLahir = findViewById(R.id.tvResultTanggalLahir);
        tvResultJenisKelamin = findViewById(R.id.tvResultJenisKelamin);
        tvResultUsername = findViewById(R.id.tvResultUsername);

        //get string array berdasarkan key
        //String[] stringArray = getIntent().getStringArrayExtra(RegisterActivity.Key_RegisterActivity);

        Register register = getIntent().getParcelableExtra(Key_RegisterActivity);

        //set value to textview
//        tvResultNama.setText(stringArray[0]);
//        tvResultTanggalLahir.setText(stringArray[1]);
//        tvResultJenisKelamin.setText(stringArray[2]);
//        tvResultUsername.setText(stringArray[3]);

        // Set value to TextView based on Parcel Object
        tvResultNama.setText(register.getNama());
        tvResultTanggalLahir.setText(register.getTanggalLahir());
        tvResultJenisKelamin.setText(register.getJenisKelamin());
        tvResultUsername.setText(register.getUsername());

    }
}
