package X;

/* renamed from: X.JuH  reason: case insensitive filesystem */
public final class C60959JuH extends AnonymousClass0T0 {
    public final String A00;
    public final String A01;
    public final boolean A02;
    public final int A03;
    public final int A04;
    public final C62617Kio A05;
    public final boolean A06;
    public final boolean A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60959JuH) {
                C60959JuH juH = (C60959JuH) obj;
                if (!(this.A05 == juH.A05 && 0qQ.A0K(this.A01, juH.A01) && this.A07 == juH.A07 && this.A04 == juH.A04 && 0qQ.A0K(this.A00, juH.A00) && this.A06 == juH.A06 && this.A03 == juH.A03 && this.A02 == juH.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.A07;
        int A08 = AnonymousClass7TF.A08(this.A00, (AnonymousClass7TF.A09(z, (AnonymousClass7TE.A0K(this.A05) + AnonymousClass7TG.A0E(this.A01)) * 31) + this.A04) * 31);
        return DbS.A06(this.A02, (AnonymousClass7TF.A09(this.A06, A08) + this.A03) * 31);
    }

    public C60959JuH(C62617Kio kio, String str, String str2, int i, int i2, boolean z, boolean z2, boolean z3) {
        this.A05 = kio;
        this.A01 = str;
        this.A07 = z;
        this.A04 = i;
        this.A00 = str2;
        this.A06 = z2;
        this.A03 = i2;
        this.A02 = z3;
    }
}
