package X;

/* renamed from: X.98D  reason: invalid class name */
public enum AnonymousClass98D implements AnonymousClass97P {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);
    
    public final int A00;

    public static AnonymousClass98D A00(int i) {
        if (i == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i == 1) {
            return TINK;
        }
        if (i == 2) {
            return LEGACY;
        }
        if (i == 3) {
            return RAW;
        }
        if (i != 4) {
            return null;
        }
        return CRUNCHY;
    }

    public final int A01() {
        if (this != UNRECOGNIZED) {
            return this.A00;
        }
        throw new IllegalArgumentException(Pxd.A00(1));
    }

    /* access modifiers changed from: public */
    AnonymousClass98D(int i) {
        this.A00 = i;
    }
}
