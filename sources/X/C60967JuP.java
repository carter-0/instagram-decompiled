package X;

/* renamed from: X.JuP  reason: case insensitive filesystem */
public final class C60967JuP extends AnonymousClass0T0 {
    public final int A00;
    public final N49 A01;
    public final N49 A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60967JuP) {
                C60967JuP juP = (C60967JuP) obj;
                if (!(this.A00 == juP.A00 && 0qQ.A0K(this.A02, juP.A02) && 0qQ.A0K(this.A01, juP.A01) && this.A04 == juP.A04 && this.A08 == juP.A08 && this.A05 == juP.A05 && this.A07 == juP.A07 && this.A06 == juP.A06 && this.A03 == juP.A03 && this.A09 == juP.A09)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A09, AnonymousClass7TF.A09(this.A03, AnonymousClass7TF.A09(this.A06, AnonymousClass7TF.A09(this.A07, AnonymousClass7TF.A09(this.A05, AnonymousClass7TF.A09(this.A08, AnonymousClass7TF.A09(this.A04, AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A07(this.A02, this.A00 * 31)))))))));
    }

    public C60967JuP(N49 n49, N49 n492, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.A00 = i;
        this.A02 = n49;
        this.A01 = n492;
        this.A04 = z;
        this.A08 = z2;
        this.A05 = z3;
        this.A07 = z4;
        this.A06 = z5;
        this.A03 = z6;
        this.A09 = z7;
    }
}
