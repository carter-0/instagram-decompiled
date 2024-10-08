package X;

/* renamed from: X.Jv6  reason: case insensitive filesystem */
public final class C61007Jv6 extends AnonymousClass0T0 {
    public Object A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final int A05;

    public C61007Jv6(M0V m0v, String str, boolean z, boolean z2, boolean z3) {
        this.A05 = 1;
        0qQ.A0B(str, 5);
        this.A03 = z;
        this.A02 = z2;
        this.A04 = z3;
        this.A00 = m0v;
        this.A01 = str;
    }

    public final boolean equals(Object obj) {
        if (this.A05 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C61007Jv6)) {
                return false;
            }
            C61007Jv6 jv6 = (C61007Jv6) obj;
            if (jv6.A05 == 1 && this.A03 == jv6.A03 && this.A02 == jv6.A02 && this.A04 == jv6.A04 && 0qQ.A0K(this.A00, jv6.A00) && 0qQ.A0K(this.A01, jv6.A01)) {
                return true;
            }
            return false;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof C61007Jv6)) {
                return false;
            }
            C61007Jv6 jv62 = (C61007Jv6) obj;
            if (jv62.A05 == 0 && this.A02 == jv62.A02 && this.A03 == jv62.A03 && this.A00 == jv62.A00 && 0qQ.A0K(this.A01, jv62.A01) && this.A04 == jv62.A04) {
                return true;
            }
            return false;
        }
    }

    public final int hashCode() {
        int A08;
        int i;
        if (this.A05 != 0) {
            A08 = (AnonymousClass7TF.A09(this.A04, AnonymousClass7TF.A09(this.A02, C51965G9l.A05(this.A03))) + AnonymousClass7TG.A0C(this.A00)) * 31;
            i = this.A01.hashCode();
        } else {
            int A052 = C51965G9l.A05(this.A02);
            A08 = AnonymousClass7TF.A08(this.A01, (AnonymousClass7TF.A09(this.A03, A052) + AnonymousClass7TG.A0C(this.A00)) * 31);
            i = 1237;
            if (this.A04) {
                i = 1231;
            }
        }
        return A08 + i;
    }

    public C61007Jv6() {
        this.A05 = 0;
        this.A05 = 0;
        this.A02 = false;
        this.A03 = false;
        this.A00 = null;
        this.A01 = "";
        this.A04 = false;
    }
}
