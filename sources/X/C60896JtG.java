package X;

/* renamed from: X.JtG  reason: case insensitive filesystem */
public final class C60896JtG extends AnonymousClass0T0 {
    public final long A00 = 86400000;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C60896JtG) || this.A00 != ((C60896JtG) obj).A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C51968G9o.A03(this.A00);
    }
}
