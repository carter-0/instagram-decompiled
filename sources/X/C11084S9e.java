package X;

/* renamed from: X.S9e  reason: case insensitive filesystem */
public abstract class C11084S9e {
    public static Integer A00(String str) {
        if (str.equals("SHIPPING")) {
            return AnonymousClass05K.A00;
        }
        if (str.equals("PICKUP")) {
            return AnonymousClass05K.A01;
        }
        throw AnonymousClass7TE.A0w(str);
    }

    public static String A01(Integer num) {
        if (1 - num.intValue() != 0) {
            return "SHIPPING";
        }
        return "PICKUP";
    }
}
