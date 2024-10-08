package X;

public final class XPC extends AnonymousClass972 implements AnonymousClass974 {
    public static final int CURVE_TYPE_FIELD_NUMBER = 1;
    public static final XPC DEFAULT_INSTANCE;
    public static final int HKDF_HASH_TYPE_FIELD_NUMBER = 2;
    public static final int HKDF_SALT_FIELD_NUMBER = 11;
    public static volatile C3738297c PARSER;
    public int curveType_;
    public int hkdfHashType_;
    public AnonymousClass97R hkdfSalt_ = AnonymousClass97R.A01;

    static {
        XPC xpc = new XPC();
        DEFAULT_INSTANCE = xpc;
        AnonymousClass972.A06(xpc, XPC.class);
    }

    public final C21274XSe A0F() {
        int i = this.curveType_;
        if (i == 0) {
            return C21274XSe.UNKNOWN_CURVE;
        }
        if (i == 2) {
            return C21274XSe.NIST_P256;
        }
        if (i == 3) {
            return C21274XSe.NIST_P384;
        }
        if (i == 4) {
            return C21274XSe.NIST_P521;
        }
        if (i != 5) {
            return C21274XSe.UNRECOGNIZED;
        }
        return C21274XSe.CURVE25519;
    }

    public final Object A0E(Integer num, Object obj, Object obj2) {
        C3738297c r2;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AnonymousClass972.A03(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"curveType_", "hkdfHashType_", "hkdfSalt_"});
            case 3:
                return new XPC();
            case 4:
                return new XOr();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C3738297c r22 = PARSER;
                if (r22 != null) {
                    return r22;
                }
                synchronized (XPC.class) {
                    r2 = PARSER;
                    if (r2 == null) {
                        C3738397d r0 = C3738197b.A01;
                        r2 = new C3738197b(DEFAULT_INSTANCE);
                        PARSER = r2;
                    }
                }
                return r2;
            default:
                throw C66580MXl.A11();
        }
    }
}
