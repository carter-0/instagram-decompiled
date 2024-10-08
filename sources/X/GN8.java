package X;

public final class GN8 extends AnonymousClass0T0 implements C46224DRf {
    public final int A00;
    public final String A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GN8) {
                GN8 gn8 = (GN8) obj;
                if (!(0qQ.A0K(this.A01, gn8.A01) && this.A03 == gn8.A03 && this.A05 == gn8.A05 && this.A06 == gn8.A06 && this.A00 == gn8.A00 && this.A04 == gn8.A04 && 0qQ.A0K(this.A02, gn8.A02))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A09 = AnonymousClass7TF.A09(this.A05, AnonymousClass7TF.A09(this.A03, AnonymousClass7TE.A0O(this.A01)));
        return AnonymousClass7TF.A09(this.A04, (AnonymousClass7TF.A09(this.A06, A09) + this.A00) * 31) + AnonymousClass7TG.A0E(this.A02);
    }

    public GN8(String str, String str2, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A01 = str;
        this.A03 = z;
        this.A05 = z2;
        this.A06 = z3;
        this.A00 = i;
        this.A04 = z4;
        this.A02 = str2;
    }
}
