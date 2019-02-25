package hu.horinka.andras.network.device;

public enum ScreenSize {
    EDTV,
    HD,
    FULL_HD,
    UHD;

    public static int getDemurageRate(ScreenSize screenSize) {
        switch (screenSize) {
            case EDTV:
                return 5;
            case HD:
                return 10;
            case FULL_HD:
                return 15;
            case UHD:
                return 20;
            default:
                return 0;
        }
    }
}
