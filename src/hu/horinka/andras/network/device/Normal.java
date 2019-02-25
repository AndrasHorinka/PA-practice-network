package hu.horinka.andras.network.device;

public class Normal extends DeviceWithScreenSize {
    private final int demurageRateByAge = -3;
    private int productionYear;

    public Normal(int age, boolean isConnected, DeviceType type, ScreenSize screenSize, int productionYear) {
        super(age, isConnected, type, screenSize);
        this.productionYear = productionYear;
        if (productionYear >= 2000) {
            this.setBatteryLife(this.getBatteryLife()*2);
        } else {
            this.setBatteryLife(Math.round(this.getBatteryLife()/2));
        }
    }

    public Normal(boolean isConnected, DeviceType type, ScreenSize screenSize, int productionYear) {
        super(isConnected, type, screenSize);
        this.productionYear = productionYear;
        if (productionYear >= 2000) {
            this.setBatteryLife(this.getBatteryLife()*2);
        } else {
            this.setBatteryLife(Math.round(this.getBatteryLife()/2));
        }
    }

    @Override
    public int calculateRemainingPower() {
        return this.getBatteryLife() - this.getAge()*getDemurageRateByAge();
    }

    public int getDemurageRateByAge() {
        return demurageRateByAge;
    }
}
