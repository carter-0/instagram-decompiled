package X;

/* renamed from: X.Xcb  reason: case insensitive filesystem */
public final class C21484Xcb {
    public final int A00 = -1;
    public final int A01 = -1;
    public final int A02 = -1;
    public final long A03 = -1;
    public final Object A04;

    public C21484Xcb(Object obj) {
        this.A04 = obj;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C21484Xcb) && this.A04.equals(((C21484Xcb) obj).A04);
        }
        return true;
    }

    public final int hashCode() {
        return ((((((C21056XCh.A01(this.A04) - 1) * 31) - 1) * 31) - 1) * 31) - 1;
    }
}
