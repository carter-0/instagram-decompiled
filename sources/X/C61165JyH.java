package X;

/* renamed from: X.JyH  reason: case insensitive filesystem */
public final class C61165JyH extends AnonymousClass0T0 implements C232262tL {
    public boolean A00;
    public boolean A01;
    public final int A02;
    public final int A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61165JyH) {
                C61165JyH jyH = (C61165JyH) obj;
                if (!(this.A03 == jyH.A03 && this.A02 == jyH.A02 && this.A01 == jyH.A01 && this.A00 == jyH.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return Integer.valueOf(this.A03);
    }

    public final int hashCode() {
        return DbS.A06(this.A00, AnonymousClass7TF.A09(this.A01, ((this.A03 * 31) + this.A02) * 31));
    }

    public C61165JyH(int i, int i2, boolean z, boolean z2) {
        this.A03 = i;
        this.A02 = i2;
        this.A01 = z;
        this.A00 = z2;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
