package X;

/* renamed from: X.Vi5  reason: case insensitive filesystem */
public final class C17914Vi5 {
    public int A00 = AnonymousClass972.MUTABLE_FLAG_MASK;
    public int A01 = 0;
    public int A02 = 0;
    public int A03 = 0;
    public int A04 = 0;
    public int A05 = AnonymousClass972.MUTABLE_FLAG_MASK;
    public boolean A06 = false;
    public boolean A07 = false;

    public final void A00(int i, int i2) {
        this.A05 = i;
        this.A00 = i2;
        this.A06 = true;
        if (this.A07) {
            if (i2 != Integer.MIN_VALUE) {
                this.A03 = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.A04 = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.A03 = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.A04 = i2;
        }
    }
}
