package X;

/* renamed from: X.98i  reason: invalid class name and case insensitive filesystem */
public final class C3741498i extends AnonymousClass972 implements AnonymousClass974 {
    public static final C3741498i DEFAULT_INSTANCE;
    public static final int KEY_MATERIAL_TYPE_FIELD_NUMBER = 3;
    public static volatile C3738297c PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    public int keyMaterialType_;
    public String typeUrl_ = "";
    public AnonymousClass97R value_ = AnonymousClass97R.A01;

    static {
        C3741498i r1 = new C3741498i();
        DEFAULT_INSTANCE = r1;
        AnonymousClass972.A06(r1, C3741498i.class);
    }

    public final AnonymousClass97O A0F() {
        int i = this.keyMaterialType_;
        if (i == 0) {
            return AnonymousClass97O.UNKNOWN_KEYMATERIAL;
        }
        if (i == 1) {
            return AnonymousClass97O.SYMMETRIC;
        }
        if (i == 2) {
            return AnonymousClass97O.ASYMMETRIC_PRIVATE;
        }
        if (i == 3) {
            return AnonymousClass97O.ASYMMETRIC_PUBLIC;
        }
        if (i != 4) {
            return AnonymousClass97O.UNRECOGNIZED;
        }
        return AnonymousClass97O.REMOTE;
    }
}
