package X;

/* renamed from: X.Dfd  reason: case insensitive filesystem */
public enum C46475Dfd {
    UNSHARED,
    ALREADY_SHARED_CCP,
    ALREADY_SHARED_XAR;

    /* access modifiers changed from: public */
    static {
        C46475Dfd[] dfdArr;
        A00 = 0oU.A00(dfdArr);
    }

    public final boolean A00() {
        if (this == ALREADY_SHARED_CCP || this == ALREADY_SHARED_XAR) {
            return true;
        }
        return false;
    }
}
