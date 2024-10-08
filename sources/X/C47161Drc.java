package X;

/* renamed from: X.Drc  reason: case insensitive filesystem */
public final class C47161Drc extends AnonymousClass0T0 {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public C47161Drc(String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, String str4, boolean z5) {
        AnonymousClass7TF.A1E(str, 1, str3);
        0qQ.A0B(str4, 8);
        this.A01 = str;
        this.A04 = z;
        this.A05 = z2;
        this.A02 = str2;
        this.A06 = z3;
        this.A07 = z4;
        this.A00 = str3;
        this.A03 = str4;
        this.A08 = z5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47161Drc) {
                C47161Drc drc = (C47161Drc) obj;
                if (!(0qQ.A0K(this.A01, drc.A01) && this.A04 == drc.A04 && this.A05 == drc.A05 && 0qQ.A0K(this.A02, drc.A02) && this.A06 == drc.A06 && this.A07 == drc.A07 && 0qQ.A0K(this.A00, drc.A00) && 0qQ.A0K(this.A03, drc.A03) && this.A08 == drc.A08)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A09 = AnonymousClass7TF.A09(this.A04, AnonymousClass7TE.A0O(this.A01));
        return DbS.A06(this.A08, AnonymousClass7TF.A08(this.A03, AnonymousClass7TF.A08(this.A00, AnonymousClass7TF.A09(this.A07, AnonymousClass7TF.A09(this.A06, (AnonymousClass7TF.A09(this.A05, A09) + AnonymousClass7TG.A0E(this.A02)) * 31)))));
    }
}
