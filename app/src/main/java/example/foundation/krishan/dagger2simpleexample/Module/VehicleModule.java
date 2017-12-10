package example.foundation.krishan.dagger2simpleexample.Module;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import example.foundation.krishan.dagger2simpleexample.Model.Motor;
import example.foundation.krishan.dagger2simpleexample.Model.Vehicle;

/**
 * Created by krishan on 12/4/2017.
 */
@Module
public class VehicleModule {
    @Provides
    @Singleton
    Motor provideMotor() {
        return new Motor();
    }

    @Provides
    @Singleton
    Vehicle provideVehicle() {
        return new Vehicle(new Motor());
    }
}
