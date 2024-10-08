package X;

/* renamed from: X.JyJ  reason: case insensitive filesystem */
public final class C61167JyJ extends AnonymousClass0T0 implements C232262tL {
    public final int A00 = 7;
    public final int A01 = 8;
    public final int A02 = 5;
    public final int A03 = 6;
    public final int A04 = 9;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61167JyJ) {
                C61167JyJ jyJ = (C61167JyJ) obj;
                if (!(this.A02 == jyJ.A02 && this.A03 == jyJ.A03 && this.A00 == jyJ.A00 && this.A01 == jyJ.A01 && this.A04 == jyJ.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((this.A02 * 31) + this.A03) * 31) + this.A00) * 31) + this.A01) * 31) + this.A04;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return AnonymousClass7TF.A0h(this);
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
