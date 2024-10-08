package X;

/* renamed from: X.BEb  reason: case insensitive filesystem */
public final class C42026BEb extends AnonymousClass0T0 implements DR7 {
    public final DRN A00;
    public final DR2 A01;
    public final DRQ A02;
    public final Long A03;
    public final Long A04;
    public final String A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42026BEb) {
                C42026BEb bEb = (C42026BEb) obj;
                if (!0qQ.A0K(this.A05, bEb.A05) || !0qQ.A0K(this.A01, bEb.A01) || !0qQ.A0K(this.A03, bEb.A03) || !0qQ.A0K(this.A00, bEb.A00) || !0qQ.A0K(this.A02, bEb.A02) || !0qQ.A0K(this.A04, bEb.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((AnonymousClass7TG.A0E(this.A05) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TE.A0L(this.A04);
    }

    public C42026BEb(DR2 dr2, DRN drn, DRQ drq, Long l, Long l2, String str) {
        this.A05 = str;
        this.A01 = dr2;
        this.A03 = l;
        this.A00 = drn;
        this.A02 = drq;
        this.A04 = l2;
    }
}
