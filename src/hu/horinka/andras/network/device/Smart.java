package hu.horinka.andras.network.device;

import java.util.ArrayList;
import java.util.List;

public class Smart extends DeviceWithScreenSize {
    private final int demurageRateByAge = -15;
    private static List<String> usedNames = new ArrayList<>();
    private String name;

    public Smart(int age, boolean isConnected, DeviceType type, ScreenSize screenSize) {
        super(age, isConnected, type, screenSize);
    }

    public Smart(boolean isConnected, DeviceType type, ScreenSize screenSize) {
        super(isConnected, type, screenSize);
    }

    @Override
    public int calculateRemainingPower() {
        return getBatteryLife() - (getAge() * demurageRateByAge) - ScreenSize.getDemurageRate(this.getScreenSize());
    }
}
