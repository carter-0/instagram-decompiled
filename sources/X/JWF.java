package X;

public final class JWF extends AnonymousClass0T0 {
    public int A00;
    public Object A01;
    public Object A02;
    public String A03;
    public String A04;
    public final int A05;

    public JWF(Integer num, Integer num2, String str, String str2, int i) {
        this.A05 = 0;
        this.A01 = num;
        this.A04 = str;
        this.A03 = str2;
        this.A02 = num2;
        this.A00 = i;
    }

    public final boolean equals(Object obj) {
        if (this.A05 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof JWF)) {
                return false;
            }
            JWF jwf = (JWF) obj;
            if (jwf.A05 != 1 || !0qQ.A0K(this.A02, jwf.A02) || this.A01 != jwf.A01 || !0qQ.A0K(this.A03, jwf.A03) || this.A00 != jwf.A00 || !0qQ.A0K(this.A04, jwf.A04)) {
                return false;
            }
            return true;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof JWF)) {
                return false;
            }
            JWF jwf2 = (JWF) obj;
            if (jwf2.A05 == 0 && this.A01 == jwf2.A01 && 0qQ.A0K(this.A04, jwf2.A04) && 0qQ.A0K(this.A03, jwf2.A03) && this.A02 == jwf2.A02 && this.A00 == jwf2.A00) {
                return true;
            }
            return false;
        }
    }

    public final int hashCode() {
        String str;
        String str2;
        int A0F;
        int i;
        if (this.A05 != 0) {
            A0F = (AnonymousClass7TF.A08(this.A03, ((AnonymousClass7TG.A0C(this.A02) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + this.A00) * 31;
            i = C41845B3m.A00(this.A04);
        } else {
            int A0M = AnonymousClass7TE.A0M(this.A01);
            switch (A0M) {
                case 1:
                    str = "PREVIEW";
                    break;
                case 2:
                    str = "CUSTOM";
                    break;
                default:
                    str = "DRAFT";
                    break;
            }
            int A08 = AnonymousClass7TF.A08(this.A03, AnonymousClass7TF.A08(this.A04, C51968G9o.A0F(str, A0M)));
            int A0M2 = AnonymousClass7TE.A0M(this.A02);
            switch (A0M2) {
                case 1:
                    str2 = "MANAGE";
                    break;
                case 2:
                    str2 = "SEE_ALL";
                    break;
                case 3:
                    str2 = "SEE_FEWER";
                    break;
                default:
                    str2 = "HIDE";
                    break;
            }
            A0F = C51971G9r.A0F(str2, A0M2, A08);
            i = this.A00;
        }
        return A0F + i;
    }

    public final String toString() {
        if (1 - this.A05 != 0) {
            return super.toString();
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("UserPaySupporter(user=");
        A1A.append(this.A02);
        A1A.append(", supporterTier=");
        A1A.append(this.A01);
        A1A.append(", timeSeries=");
        A1A.append(this.A03);
        A1A.append(", badgesCount=");
        A1A.append(this.A00);
        A1A.append(", totalAmount=");
        return C51975G9x.A0i(this.A04, A1A);
    }

    public JWF() {
        this.A05 = 1;
        this.A05 = 1;
        this.A05 = 1;
        this.A02 = null;
        this.A01 = null;
        this.A03 = "";
        this.A00 = 0;
        this.A04 = null;
    }
}
