package X;

/* renamed from: X.4aY  reason: invalid class name and case insensitive filesystem */
public abstract class C266914aY {
    public static Integer A00(String str) {
        if (str.equals("UNDEFINED")) {
            return AnonymousClass05K.A00;
        }
        if (str.equals("ORGANIC")) {
            return AnonymousClass05K.A01;
        }
        if (str.equals("AD")) {
            return AnonymousClass05K.A0C;
        }
        if (str.equals("NETEGO")) {
            return AnonymousClass05K.A0N;
        }
        throw new IllegalArgumentException(str);
    }

    public static final boolean A02(Integer num) {
        if (num == AnonymousClass05K.A0C || num == AnonymousClass05K.A0N) {
            return true;
        }
        return false;
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "ORGANIC";
            case 2:
                return "AD";
            case 3:
                return "NETEGO";
            default:
                return "UNDEFINED";
        }
    }
}
