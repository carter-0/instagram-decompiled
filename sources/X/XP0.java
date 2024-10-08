package X;

public final class XP0 extends AnonymousClass972 implements AnonymousClass974 {
    public static final XP0 DEFAULT_INSTANCE;
    public static final int IV_SIZE_FIELD_NUMBER = 1;
    public static volatile C3738297c PARSER;
    public int ivSize_;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.972, X.XP0] */
    static {
        ? r1 = new AnonymousClass972();
        DEFAULT_INSTANCE = r1;
        AnonymousClass972.A06(r1, XP0.class);
    }

    public final Object A0E(Integer num, Object obj, Object obj2) {
        C3738297c r2;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                String A00 = Pxd.A00(25);
                return AnonymousClass972.A03(DEFAULT_INSTANCE, A00, new Object[]{"ivSize_"});
            case 3:
                return new AnonymousClass972();
            case 4:
                return new C21203XOk();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C3738297c r22 = PARSER;
                if (r22 != null) {
                    return r22;
                }
                synchronized (XP0.class) {
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
