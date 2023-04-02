import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText etLocation, etNumRooms, etRent;
    Button btnAdd, btnView;
    ArrayList<House> houses = new ArrayList<>();
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etLocation = findViewById(R.id.etLocation);
        etNumRooms = findViewById(R.id.etNumRooms);
        etRent = findViewById(R.id.etRent);
        btnAdd = findViewById(R.id.btnAdd);
        btnView = findViewById(R.id.btnView);
        
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String location = etLocation.getText().toString();
                int numRooms = Integer.parseInt(etNumRooms.getText().toString());
                double rent = Double.parseDouble(etRent.getText().toString());

                House house = new House(location, numRooms, rent);
                houses.add(house);
            }
        });
