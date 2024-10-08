package X;

public final class XP2 extends AnonymousClass972 implements AnonymousClass974 {
    public static final int AEAD_DEM_FIELD_NUMBER = 2;
    public static final XP2 DEFAULT_INSTANCE;
    public static volatile C3738297c PARSER;
    public C384459hM aeadDem_;
    public int bitField0_;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.972, X.XP2] */
    static {
        ? r1 = new AnonymousClass972();
        DEFAULT_INSTANCE = r1;
        AnonymousClass972.A06(r1, XP2.class);
    }

    public final Object A0E(Integer num, Object obj, Object obj2) {
        C3738297c r2;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AnonymousClass972.A03(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"bitField0_", "aeadDem_"});
            case 3:
                return new AnonymousClass972();
            case 4:
                return new C21205XOm();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C3738297c r22 = PARSER;
                if (r22 != null) {
                    return r22;
                }
                synchronized (XP2.class) {
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
