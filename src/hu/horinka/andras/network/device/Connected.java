package hu.horinka.andras.network.device;

import java.util.ArrayList;
import java.util.List;

public class Connected extends Device {
    private final int demurageRatePerAge = -7;
    private final int increaseByNumberOfDevices = 20;
    protected List<Device> connectedDevices = new ArrayList<>();

    public Connected(int age, boolean isConnected, DeviceType type) {
        super(age, isConnected, type);
    }

    public Connected(boolean isConnected, DeviceType type) {
        super(isConnected, type);
    }


    @Override
    public int calculateRemainingPower() {
        return this.getBatteryLife() - this.getAge()*demurageRatePerAge + connectedDevices.size()*increaseByNumberOfDevices;
    }
}
