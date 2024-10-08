package X;

public final class SRP {
    public C13883Tj6 A00;
    public C13883Tj6 A01;
    public Integer A02;
    public Integer A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;

    public SRP(C13883Tj6 tj6, C13883Tj6 tj62, Integer num, boolean z, boolean z2, boolean z3) {
        this.A02 = num;
        this.A04 = z;
        this.A01 = tj6;
        this.A00 = tj62;
        this.A06 = z2;
        this.A05 = z3;
        this.A03 = null;
    }

    public static SRP A00() {
        return new SRP((C13883Tj6) null, (C13883Tj6) null, AnonymousClass05K.A00, false, false, false);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SRP) {
                SRP srp = (SRP) obj;
                if (!(this.A02 == srp.A02 && this.A04 == srp.A04 && 0qQ.A0K(this.A01, srp.A01) && 0qQ.A0K(this.A00, srp.A00) && this.A06 == srp.A06 && this.A05 == srp.A05 && 0qQ.A0K(this.A03, srp.A03))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static void A01(SRP srp, Object[] objArr, int i) {
        srp.A01 = new C12400StQ(objArr, i);
    }

    public final int hashCode() {
        Integer num = this.A02;
        int A0D = C51971G9r.A0D(num, C226302gX.A02(num)) * 31;
        return AnonymousClass7TF.A09(this.A05, AnonymousClass7TF.A09(this.A06, (((AnonymousClass7TF.A09(this.A04, A0D) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31)) + AnonymousClass7TE.A0L(this.A03);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Builder(role=");
        A1A.append(C226302gX.A02(this.A02));
        A1A.append(", isClickable=");
        A1A.append(this.A04);
        A1A.append(C66579MXk.A00(45));
        A1A.append(this.A01);
        A1A.append(", clickDescription=");
        A1A.append(this.A00);
        A1A.append(C66579MXk.A00(47));
        A1A.append(this.A06);
        A1A.append(", isHeading=");
        A1A.append(this.A05);
        A1A.append(", traversalAfterId=");
        return AnonymousClass7TG.A0n(this.A03, A1A);
    }

    public SRP() {
        this((C13883Tj6) null, (C13883Tj6) null, AnonymousClass05K.A00, false, false, false);
    }
}
