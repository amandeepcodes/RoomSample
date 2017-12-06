package ammyaman.roomsample;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AddContactActivity extends AppCompatActivity {

    private ContactViewModel mContactViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_contact);

        mContactViewModel = ViewModelProviders.of(this).get(ContactViewModel.class);
        final EditText name = (EditText) findViewById(R.id.et_name);
        final EditText number = (EditText) findViewById(R.id.et_number);

        findViewById(R.id.btn_add).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!name.getText().toString().trim().isEmpty() && !number.getText().toString().trim().isEmpty()) {

                    String nameString = name.getText().toString().trim();
                    String numberString = number.getText().toString().trim();

                    Contact contact = new Contact(nameString,numberString);
                    mContactViewModel.insert(contact);

                    finish();
                } else {
                    Toast.makeText(getApplicationContext(), "Field is Empty", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
