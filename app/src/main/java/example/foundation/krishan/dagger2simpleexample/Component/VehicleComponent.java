package example.foundation.krishan.dagger2simpleexample.Component;

import javax.inject.Singleton;

import dagger.Component;
import example.foundation.krishan.dagger2simpleexample.Model.Vehicle;
import example.foundation.krishan.dagger2simpleexample.Module.VehicleModule;

/**
 * Created by krishan on 12/4/2017.
 */

@Singleton
@Component(modules = {VehicleModule.class})
public interface VehicleComponent {
    Vehicle provideVehicle();
}
