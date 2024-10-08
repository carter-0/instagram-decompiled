package X;

/* renamed from: X.Rcy  reason: case insensitive filesystem */
public abstract class C9561Rcy {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "CONNECT_SENT";
            case 2:
                return "CONNECTED";
            case 3:
                return "DISCONNECTED";
            default:
                return "CONNECTING";
        }
    }
}
