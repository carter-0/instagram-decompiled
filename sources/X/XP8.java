package X;

public final class XP8 extends AnonymousClass972 implements AnonymousClass974 {
    public static final XP8 DEFAULT_INSTANCE;
    public static volatile C3738297c PARSER = null;
    public static final int PRIVATE_KEY_FIELD_NUMBER = 3;
    public static final int PUBLIC_KEY_FIELD_NUMBER = 2;
    public static final int VERSION_FIELD_NUMBER = 1;
    public int bitField0_;
    public AnonymousClass97R privateKey_ = AnonymousClass97R.A01;
    public XP9 publicKey_;
    public int version_;

    static {
        XP8 xp8 = new XP8();
        DEFAULT_INSTANCE = xp8;
        AnonymousClass972.A06(xp8, XP8.class);
    }

    public final Object A0E(Integer num, Object obj, Object obj2) {
        C3738297c r2;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AnonymousClass972.A03(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"bitField0_", "version_", "publicKey_", "privateKey_"});
            case 3:
                return new XP8();
            case 4:
                return new XOu();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C3738297c r22 = PARSER;
                if (r22 != null) {
                    return r22;
                }
                synchronized (XP8.class) {
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
