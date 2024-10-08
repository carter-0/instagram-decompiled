package X;

/* renamed from: X.JuK  reason: case insensitive filesystem */
public final class C60962JuK extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public C60962JuK(String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, long j) {
        this.A00 = i4;
        C51974G9v.A1P(str, str2, str3, str4);
        this.A07 = str;
        this.A06 = str2;
        this.A08 = str3;
        this.A05 = str4;
        this.A04 = j;
        this.A01 = i;
        this.A02 = i2;
        this.A03 = i3;
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
        if (!(obj instanceof C60962JuK)) {
            return false;
        }
        C60962JuK juK = (C60962JuK) obj;
        if (juK.A00 == i && 0qQ.A0K(this.A07, juK.A07) && 0qQ.A0K(this.A06, juK.A06) && 0qQ.A0K(this.A08, juK.A08) && 0qQ.A0K(this.A05, juK.A05) && this.A04 == juK.A04 && this.A01 == juK.A01 && this.A02 == juK.A02 && this.A03 == juK.A03) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((C51972G9s.A07(this.A04, AnonymousClass7TF.A08(this.A05, AnonymousClass7TF.A08(this.A08, AnonymousClass7TF.A08(this.A06, AnonymousClass7TE.A0O(this.A07))))) + this.A01) * 31) + this.A02) * 31) + this.A03;
    }
}
