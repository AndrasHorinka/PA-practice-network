package hu.horinka.andras.network.device;


public abstract class Device {
    protected int age;
    protected int batteryLife;
    protected boolean isConnected;
    protected DeviceType type;

    public abstract int calculateRemainingPower();

    public Device(int age, boolean isConnected, DeviceType type) {
        this.age = age;
        this.isConnected = isConnected;
        this.type = type;
    }

    public Device(boolean isConnected, DeviceType type) {
        this.age = 0;
        this.isConnected = isConnected;
        this.type = type;
    }

    public DeviceType getType() {
        return type;
    }

    public boolean isConnected() {
        return isConnected;
    }

    public void setConnected(boolean connected) {
        isConnected = connected;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }

    public int getAge() {
        return age;
    }
}
