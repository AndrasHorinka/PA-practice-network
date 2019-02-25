package hu.horinka.andras.network.device;

public abstract class DeviceWithScreenSize extends Device {
    protected ScreenSize screenSize;

    public DeviceWithScreenSize(int age, boolean isConnected, DeviceType type, ScreenSize screenSize) {
        super(age, isConnected, type);
        this.screenSize = screenSize;
    }

    public DeviceWithScreenSize(boolean isConnected, DeviceType type, ScreenSize screenSize) {
        super(isConnected, type);
        this.screenSize = screenSize;
    }

    public ScreenSize getScreenSize() {
        return screenSize;
    }

    public abstract int calculateRemainingPower();
}
