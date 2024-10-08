package X;

/* renamed from: X.GpT  reason: case insensitive filesystem */
public final class C53497GpT extends AnonymousClass0T0 implements C334067ac {
    public final boolean A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53497GpT) {
                C53497GpT gpT = (C53497GpT) obj;
                if (!(this.A00 == gpT.A00 && this.A01 == gpT.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A01, C51965G9l.A05(this.A00));
    }

    public C53497GpT(boolean z, boolean z2) {
        this.A00 = z;
        this.A01 = z2;
    }
}
