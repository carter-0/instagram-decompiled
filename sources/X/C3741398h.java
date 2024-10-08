package X;

/* renamed from: X.98h  reason: invalid class name and case insensitive filesystem */
public final class C3741398h extends AnonymousClass972 implements AnonymousClass974 {
    public static final C3741398h DEFAULT_INSTANCE;
    public static final int KEY_DATA_FIELD_NUMBER = 1;
    public static final int KEY_ID_FIELD_NUMBER = 3;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
    public static volatile C3738297c PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    public int bitField0_;
    public C3741498i keyData_;
    public int keyId_;
    public int outputPrefixType_;
    public int status_;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.972, X.98h] */
    static {
        ? r1 = new AnonymousClass972();
        DEFAULT_INSTANCE = r1;
        AnonymousClass972.A06(r1, C3741398h.class);
    }

    public final C375139Ck A0F() {
        int i = this.status_;
        if (i == 0) {
            return C375139Ck.UNKNOWN_STATUS;
        }
        if (i == 1) {
            return C375139Ck.ENABLED;
        }
        if (i == 2) {
            return C375139Ck.DISABLED;
        }
        if (i != 3) {
            return C375139Ck.UNRECOGNIZED;
        }
        return C375139Ck.DESTROYED;
    }
}
