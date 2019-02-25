package hu.horinka.andras.network;

import hu.horinka.andras.network.device.Device;
import hu.horinka.andras.network.device.DeviceType;
import hu.horinka.andras.network.device.Normal;

import java.util.ArrayList;
import java.util.List;

public class Network {
    List<Device> devices = new ArrayList<>();
    private boolean isActive;


    public List<Normal> getNormalDevicesWhichPowerDiffersByLess(int amountToDifferBy) {
        List<Normal> normals = new ArrayList<>();
        for (Device device: devices) {
            if (device.getType() == DeviceType.NORMAL) {
                Normal n = (Normal) device;
                if (n.calculateRemainingPower() <= amountToDifferBy) {
                    normals.add(n);
                }
            }
        }
        return normals;
    }


    public int countHowManyDevicesAreTurnedOn() {
        Integer numberOfDevicesTurnedOn = 0;
        for (Device device: devices) {
            if (device.isConnected()) {
                numberOfDevicesTurnedOn += 1;
            }
        }
        return numberOfDevicesTurnedOn;
    }
}
