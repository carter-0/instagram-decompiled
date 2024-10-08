package X;

/* renamed from: X.GRh  reason: case insensitive filesystem */
public final class C52406GRh extends AnonymousClass0T0 {
    public final Integer A00;
    public final Integer A01;
    public final Integer A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52406GRh) {
                C52406GRh gRh = (C52406GRh) obj;
                if (!0qQ.A0K(this.A01, gRh.A01) || !0qQ.A0K(this.A00, gRh.A00) || !0qQ.A0K(this.A02, gRh.A02) || this.A04 != gRh.A04 || this.A03 != gRh.A03 || this.A05 != gRh.A05) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A05, AnonymousClass7TF.A09(this.A03, AnonymousClass7TF.A09(this.A04, ((((AnonymousClass7TG.A0C(this.A01) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TE.A0L(this.A02)) * 31)));
    }

    public C52406GRh(Integer num, Integer num2, Integer num3, boolean z, boolean z2, boolean z3) {
        this.A01 = num;
        this.A00 = num2;
        this.A02 = num3;
        this.A04 = z;
        this.A03 = z2;
        this.A05 = z3;
    }

    public C52406GRh() {
        this((Integer) null, (Integer) null, (Integer) null, false, true, true);
    }
}
