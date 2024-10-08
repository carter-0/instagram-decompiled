package X;

/* renamed from: X.BEc  reason: case insensitive filesystem */
public final class C42027BEc extends AnonymousClass0T0 implements DR8 {
    public final int A00;
    public final int A01;
    public final int A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42027BEc) {
                C42027BEc bEc = (C42027BEc) obj;
                if (!(this.A00 == bEc.A00 && this.A01 == bEc.A01 && this.A02 == bEc.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A00 * 31) + this.A01) * 31) + this.A02;
    }

    public C42027BEc(int i, int i2, int i3) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
    }
}
