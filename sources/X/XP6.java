package X;

public final class XP6 extends AnonymousClass972 implements AnonymousClass974 {
    public static final XP6 DEFAULT_INSTANCE;
    public static final int DEM_PARAMS_FIELD_NUMBER = 2;
    public static final int EC_POINT_FORMAT_FIELD_NUMBER = 3;
    public static final int KEM_PARAMS_FIELD_NUMBER = 1;
    public static volatile C3738297c PARSER;
    public int bitField0_;
    public XP2 demParams_;
    public int ecPointFormat_;
    public XPC kemParams_;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.972, X.XP6] */
    static {
        ? r1 = new AnonymousClass972();
        DEFAULT_INSTANCE = r1;
        AnonymousClass972.A06(r1, XP6.class);
    }

    public final Object A0E(Integer num, Object obj, Object obj2) {
        C3738297c r2;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AnonymousClass972.A03(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\f", new Object[]{"bitField0_", "kemParams_", "demParams_", "ecPointFormat_"});
            case 3:
                return new AnonymousClass972();
            case 4:
                return new C21207XOo();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C3738297c r22 = PARSER;
                if (r22 != null) {
                    return r22;
                }
                synchronized (XP6.class) {
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
