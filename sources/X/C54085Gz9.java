package X;

/* renamed from: X.Gz9  reason: case insensitive filesystem */
public final class C54085Gz9 extends ILG {
    public final int A00;
    public final C60991Jun A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C54085Gz9) {
                C54085Gz9 gz9 = (C54085Gz9) obj;
                if (this.A00 != gz9.A00 || !0qQ.A0K(this.A03, gz9.A03) || !0qQ.A0K(this.A02, gz9.A02) || !0qQ.A0K(this.A01, gz9.A01) || this.A04 != gz9.A04 || this.A05 != gz9.A05) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A08 = AnonymousClass7TF.A08(this.A03, this.A00 * 31);
        return DbS.A06(this.A05, AnonymousClass7TF.A09(this.A04, (AnonymousClass7TF.A08(this.A02, A08) + AnonymousClass7TG.A0C(this.A01)) * 31));
    }

    public C54085Gz9(C60991Jun jun, String str, String str2, int i, boolean z, boolean z2) {
        AnonymousClass7TG.A1Q(str, str2);
        this.A00 = i;
        this.A03 = str;
        this.A02 = str2;
        this.A01 = jun;
        this.A04 = z;
        this.A05 = z2;
    }
}
