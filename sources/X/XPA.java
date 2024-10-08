package X;

public final class XPA extends AnonymousClass972 implements AnonymousClass974 {
    public static final XPA DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    public static volatile C3738297c PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    public static final int X_FIELD_NUMBER = 3;
    public static final int Y_FIELD_NUMBER = 4;
    public int bitField0_;
    public XP6 params_;
    public int version_;
    public AnonymousClass97R x_;
    public AnonymousClass97R y_;

    static {
        XPA xpa = new XPA();
        DEFAULT_INSTANCE = xpa;
        AnonymousClass972.A06(xpa, XPA.class);
    }

    public XPA() {
        AnonymousClass97R r0 = AnonymousClass97R.A01;
        this.x_ = r0;
        this.y_ = r0;
    }

    public final Object A0E(Integer num, Object obj, Object obj2) {
        C3738297c r2;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AnonymousClass972.A03(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new Object[]{"bitField0_", "version_", "params_", "x_", "y_"});
            case 3:
                return new XPA();
            case 4:
                return new XOq();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C3738297c r22 = PARSER;
                if (r22 != null) {
                    return r22;
                }
                synchronized (XPA.class) {
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
