package example.foundation.krishan.dagger2simpleexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import example.foundation.krishan.dagger2simpleexample.Component.DaggerVehicleComponent;
import example.foundation.krishan.dagger2simpleexample.Component.VehicleComponent;
import example.foundation.krishan.dagger2simpleexample.Model.Vehicle;
import example.foundation.krishan.dagger2simpleexample.Module.VehicleModule;

public class MainActivity extends AppCompatActivity {

    Vehicle vehicle;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        VehicleComponent component = DaggerVehicleComponent.builder().vehicleModule(new VehicleModule()).build();

        vehicle = component.provideVehicle();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String txt = String.valueOf(vehicle.getSpeed());
                Toast.makeText(MainActivity.this, txt, Toast.LENGTH_SHORT).show();

            }
        });
    }

    private void init() {
        btn = (Button) findViewById(R.id.button);
    }

}
