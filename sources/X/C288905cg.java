package X;

/* renamed from: X.5cg  reason: invalid class name and case insensitive filesystem */
public enum C288905cg implements C288915ch {
    Active,
    ActiveParent,
    Captured,
    Inactive;

    public final boolean BBB() {
        int ordinal = ordinal();
        if (ordinal == 2 || ordinal == 0 || ordinal == 1) {
            return true;
        }
        if (ordinal == 3) {
            return false;
        }
        throw new RuntimeException();
    }

    public final boolean CTr() {
        int ordinal = ordinal();
        if (ordinal == 2 || ordinal == 0) {
            return true;
        }
        if (ordinal == 1 || ordinal == 3) {
            return false;
        }
        throw new RuntimeException();
    }
}
