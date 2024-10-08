package X;

public enum RJ3 implements C13718Tfj {
    ServiceName(0),
    ClientCoreName(1),
    NotificationStoreName(2),
    Country(3),
    NetworkType(4),
    NetworkSubtype(5),
    ConnectionQuality(6),
    AppState(7),
    ScreenState(8),
    YearClass(9),
    MqttGKs(10),
    MqttQEs(11),
    MqttFlags(12),
    IsEmployee(13),
    ValidCompatibleApps(14),
    EnabledCompatibleApps(15),
    RegisteredApps(16);
    
    public final Class A00;
    public final String A01;

    /* access modifiers changed from: public */
    RJ3(int i) {
        this.A01 = r3;
        this.A00 = String.class;
    }

    public final String BK1() {
        return this.A01;
    }

    public final Class CDV() {
        return this.A00;
    }
}
