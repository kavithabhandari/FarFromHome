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
