package X;

/* renamed from: X.JuL  reason: case insensitive filesystem */
public final class C60963JuL extends AnonymousClass0T0 {
    public final int A00;
    public final String A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60963JuL) {
                C60963JuL juL = (C60963JuL) obj;
                if (!(this.A00 == juL.A00 && 0qQ.A0K(this.A02, juL.A02) && 0qQ.A0K(this.A01, juL.A01) && this.A04 == juL.A04 && this.A08 == juL.A08 && this.A05 == juL.A05 && this.A07 == juL.A07 && this.A06 == juL.A06 && this.A03 == juL.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A03, AnonymousClass7TF.A09(this.A06, AnonymousClass7TF.A09(this.A07, AnonymousClass7TF.A09(this.A05, AnonymousClass7TF.A09(this.A08, AnonymousClass7TF.A09(this.A04, AnonymousClass7TF.A08(this.A01, AnonymousClass7TF.A08(this.A02, this.A00 * 31))))))));
    }

    public C60963JuL(String str, String str2, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A00 = i;
        this.A02 = str;
        this.A01 = str2;
        this.A04 = z;
        this.A08 = z2;
        this.A05 = z3;
        this.A07 = z4;
        this.A06 = z5;
        this.A03 = z6;
    }
}
