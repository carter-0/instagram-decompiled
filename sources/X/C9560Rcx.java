package X;

/* renamed from: X.Rcx  reason: case insensitive filesystem */
public abstract class C9560Rcx {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "FBNS";
            case 2:
                return "PreloadedFBNS";
            case 3:
                return "MqttDirect";
            default:
                return "MqttSimpleClient";
        }
    }
}
