package X;

public final class UKP extends AnonymousClass0T0 {
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = 0;
    public C16592Uxm A03;
    public String A04 = "";

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UKP) {
                UKP ukp = (UKP) obj;
                if (!(this.A02 == ukp.A02 && this.A00 == ukp.A00 && this.A01 == ukp.A01 && 0qQ.A0K(this.A04, ukp.A04) && this.A03 == ukp.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public UKP() {
        C16592Uxm uxm = C16592Uxm.UNKNOWN;
        this.A03 = uxm;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A03, AnonymousClass7TF.A08(this.A04, ((((this.A02 * 31) + this.A00) * 31) + this.A01) * 31));
    }
}
