package X;

/* renamed from: X.9hM  reason: invalid class name and case insensitive filesystem */
public final class C384459hM extends AnonymousClass972 implements AnonymousClass974 {
    public static final C384459hM DEFAULT_INSTANCE;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 3;
    public static volatile C3738297c PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    public int outputPrefixType_;
    public String typeUrl_ = "";
    public AnonymousClass97R value_ = AnonymousClass97R.A01;

    static {
        C384459hM r1 = new C384459hM();
        DEFAULT_INSTANCE = r1;
        AnonymousClass972.A06(r1, C384459hM.class);
    }

    public final AnonymousClass98D A0F() {
        AnonymousClass98D A00 = AnonymousClass98D.A00(this.outputPrefixType_);
        if (A00 == null) {
            return AnonymousClass98D.UNRECOGNIZED;
        }
        return A00;
    }
}
