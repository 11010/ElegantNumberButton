package bodor.com.elegantnumberbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.cepheuen.elegantnumberbutton.view.ElegantNumberButton;

public class MainActivity extends AppCompatActivity {

    ElegantNumberButton elegantNumberButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        elegantNumberButton = (ElegantNumberButton) findViewById(R.id.button);

        elegantNumberButton.setOnValueChangeListener(new ElegantNumberButton.OnValueChangeListener() {
            @Override
            public void onValueChange(ElegantNumberButton view, int oldValue, int newValue) {
                Toast.makeText(getApplicationContext(),newValue+"",Toast.LENGTH_SHORT).show();
            }
        });

        elegantNumberButton.setOnClickListener(new ElegantNumberButton.OnClickListener() {
            @Override
            public void onClick(View view) {
              String num =   elegantNumberButton.getNumber();
                Toast.makeText(getApplicationContext(),num,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
