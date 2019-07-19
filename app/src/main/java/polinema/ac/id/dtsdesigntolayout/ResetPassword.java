package polinema.ac.id.dtsdesigntolayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ResetPassword extends AppCompatActivity {

    EditText editTextCode, editTextNewPass, editTextConfirmNewPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);

        editTextCode = findViewById(R.id.edt_txt_code);
        editTextNewPass = findViewById(R.id.edt_new_password);
        editTextConfirmNewPass = findViewById(R.id.edt_confirm_password);

    }

    public void postChangePassword(View view) {
        // Validasi kosong
        if(TextUtils.isEmpty(editTextCode.getText().toString().trim()) ||
            TextUtils.isEmpty(editTextNewPass.getText().toString()) ||
            TextUtils.isEmpty(editTextConfirmNewPass.getText().toString())) {
            Toast.makeText(view.getContext(), "Tidak boleh ada isian yang kosong",
                    Toast.LENGTH_LONG).show();
        }
        // Cek inputan new dan confirm
        else if (editTextNewPass.getText().toString() != editTextConfirmNewPass.getText().toString()) {
            Toast.makeText(view.getContext(), "Password tidak sama!", Toast.LENGTH_SHORT).show();
        }
        else {
            Intent i = new Intent(ResetPassword.this, SuccessActivity.class);
            startActivity(i);
        }
    }
}
