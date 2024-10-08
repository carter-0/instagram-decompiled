package X;

/* renamed from: X.4wM  reason: invalid class name and case insensitive filesystem */
public abstract class C278154wM {
    public static final AnonymousClass3NV A00(int i) {
        for (AnonymousClass3NV r1 : AnonymousClass3NV.values()) {
            Integer num = r1.A00;
            if (num != null && num.intValue() == i) {
                return r1;
            }
        }
        return null;
    }

    public static final AnonymousClass3NV A01(String str) {
        for (AnonymousClass3NV r1 : AnonymousClass3NV.values()) {
            if (0qQ.A0K(r1.A01, str)) {
                return r1;
            }
        }
        throw new UnsupportedOperationException(002.A0R("cannot find find audience mode for string: ", str));
    }
}
