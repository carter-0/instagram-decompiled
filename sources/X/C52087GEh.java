package X;

/* renamed from: X.GEh  reason: case insensitive filesystem */
public final class C52087GEh extends AnonymousClass0T0 {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C52087GEh(GJB gjb, Long l, Long l2, int i, long j) {
        this.A00 = i;
        this.A01 = j;
        this.A02 = l;
        this.A04 = l2;
        this.A03 = gjb;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            i = 1;
        } else if (this == obj) {
            return true;
        } else {
            i = 0;
        }
        if (!(obj instanceof C52087GEh)) {
            return false;
        }
        C52087GEh gEh = (C52087GEh) obj;
        if (gEh.A00 == i && this.A01 == gEh.A01 && 0qQ.A0K(this.A02, gEh.A02) && 0qQ.A0K(this.A04, gEh.A04) && this.A03 == gEh.A03) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((C51975G9x.A03(this.A01) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TE.A0L(this.A03);
    }
}
