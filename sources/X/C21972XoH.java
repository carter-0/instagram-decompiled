package X;

/* renamed from: X.XoH  reason: case insensitive filesystem */
public final class C21972XoH {
    public static final C21972XoH A01 = new C21972XoH(new C21479XcS().A00());
    public final C21495Xct A00;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21972XoH)) {
            return false;
        }
        return this.A00.equals(((C21972XoH) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C21972XoH(C21495Xct xct) {
        this.A00 = xct;
    }
}
