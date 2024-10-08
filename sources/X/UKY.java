package X;

public final class UKY extends AnonymousClass0T0 {
    public final C16679UzF A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UKY) {
                UKY uky = (UKY) obj;
                if (!(this.A00 == uky.A00 && 0qQ.A0K(this.A02, uky.A02) && this.A04 == uky.A04 && 0qQ.A0K(this.A03, uky.A03) && this.A05 == uky.A05 && this.A06 == uky.A06 && 0qQ.A0K(this.A01, uky.A01))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A09(this.A06, AnonymousClass7TF.A09(this.A05, AnonymousClass7TF.A08(this.A03, AnonymousClass7TF.A09(this.A04, (AnonymousClass7TE.A0K(this.A00) + AnonymousClass7TG.A0E(this.A02)) * 31)))) + AnonymousClass7TE.A0L(this.A01);
    }

    public UKY(C16679UzF uzF, Integer num, String str, String str2, boolean z, boolean z2, boolean z3) {
        this.A00 = uzF;
        this.A02 = str;
        this.A04 = z;
        this.A03 = str2;
        this.A05 = z2;
        this.A06 = z3;
        this.A01 = num;
    }
}
