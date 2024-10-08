package X;

public final class BIM extends AnonymousClass0T0 implements C74253Prh {
    public int A00;
    public String A01;
    public String A02;
    public String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BIM) {
                BIM bim = (BIM) obj;
                if (!0qQ.A0K(this.A03, bim.A03) || !0qQ.A0K(this.A01, bim.A01) || !0qQ.A0K(this.A02, bim.A02) || this.A00 != bim.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A08(this.A02, AnonymousClass7TF.A08(this.A01, AnonymousClass7TE.A0O(this.A03))) + this.A00;
    }
}
