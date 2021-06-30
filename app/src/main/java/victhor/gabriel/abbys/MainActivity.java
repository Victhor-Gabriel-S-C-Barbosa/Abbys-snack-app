package victhor.gabriel.abbys;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int quantity = 1;
    TextView totalMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        incrementQuantity();
        decrementQuantity();
        orderButton();

        totalMessage = findViewById(R.id.totalMessage);
        totalMessage.setVisibility(View.GONE);
    }
    private void incrementQuantity(){
        Button incrementButton = findViewById(R.id.increment);

        incrementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (quantity <10){
                quantity ++;
                }

                TextView quantityText = findViewById(R.id.quantity);

                quantityText.setText(String.valueOf(quantity));
            }
        });

    }
    private  void decrementQuantity(){
        Button decrementButton = findViewById(R.id.decrement);

        decrementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(quantity >1) {
                    quantity--;
                }

                TextView quantityText = findViewById(R.id.quantity);

                quantityText.setText(String.valueOf((quantity)));
            }
        });
    }
    private void orderButton(){
        Button order = findViewById(R.id.order);

        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int totalNumber = quantity * 15;
                
                TextView totalMessage = findViewById(R.id.totalMessage);

                EditText etName = findViewById(R.id.name);

                String message = "Your total is " + String.valueOf(totalNumber) + "!" + "\n" +
                        " Thanks for buy with us, " + etName.getText().toString();

                totalMessage.setText(message);

                totalMessage.setVisibility(View.VISIBLE);


            }
        });
    }
}