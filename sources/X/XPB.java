package X;

@Deprecated
public final class XPB extends AnonymousClass972 implements AnonymousClass974 {
    public static final int CATALOGUE_NAME_FIELD_NUMBER = 5;
    public static final XPB DEFAULT_INSTANCE;
    public static final int KEY_MANAGER_VERSION_FIELD_NUMBER = 3;
    public static final int NEW_KEY_ALLOWED_FIELD_NUMBER = 4;
    public static volatile C3738297c PARSER = null;
    public static final int PRIMITIVE_NAME_FIELD_NUMBER = 1;
    public static final int TYPE_URL_FIELD_NUMBER = 2;
    public String catalogueName_ = "";
    public int keyManagerVersion_;
    public boolean newKeyAllowed_;
    public String primitiveName_ = "";
    public String typeUrl_ = "";

    static {
        XPB xpb = new XPB();
        DEFAULT_INSTANCE = xpb;
        AnonymousClass972.A06(xpb, XPB.class);
    }

    public final Object A0E(Integer num, Object obj, Object obj2) {
        C3738297c r2;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AnonymousClass972.A03(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"primitiveName_", "typeUrl_", "keyManagerVersion_", "newKeyAllowed_", "catalogueName_"});
            case 3:
                return new XPB();
            case 4:
                return new C21209XOw();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C3738297c r22 = PARSER;
                if (r22 != null) {
                    return r22;
                }
                synchronized (XPB.class) {
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
