package X;

/* renamed from: X.N9p  reason: case insensitive filesystem */
public final class C68302N9p extends AnonymousClass0T0 implements C74276Ps4 {
    public final int A00;
    public final long A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68302N9p) {
                C68302N9p n9p = (C68302N9p) obj;
                if (!(this.A01 == n9p.A01 && this.A02 == n9p.A02 && this.A00 == n9p.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A09(this.A02, C51975G9x.A03(this.A01)) + this.A00;
    }

    public C68302N9p(long j, int i, boolean z) {
        this.A01 = j;
        this.A02 = z;
        this.A00 = i;
    }
}
