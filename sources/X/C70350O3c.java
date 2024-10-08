package X;

/* renamed from: X.O3c  reason: case insensitive filesystem */
public abstract class C70350O3c {
    public static final Integer A00(String str) {
        if (str != null) {
            try {
                if (str.equals("OFF")) {
                    return AnonymousClass05K.A00;
                }
                if (str.equals("PAID_BALANCE")) {
                    return AnonymousClass05K.A01;
                }
                if (str.equals("ZERO_BALANCE")) {
                    return AnonymousClass05K.A0C;
                }
                throw AnonymousClass7TE.A0w(str);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }
}
