package X;

/* renamed from: X.UKc  reason: case insensitive filesystem */
public final class C15023UKc extends AnonymousClass0T0 {
    public int A00 = -1;
    public String A01 = "";
    public String A02 = "";
    public String A03 = "";
    public String A04 = "";
    public String A05 = "";
    public String A06 = "";
    public String A07 = "";

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C15023UKc) {
                C15023UKc uKc = (C15023UKc) obj;
                if (!0qQ.A0K(this.A01, uKc.A01) || !0qQ.A0K(this.A02, uKc.A02) || !0qQ.A0K(this.A04, uKc.A04) || !0qQ.A0K(this.A05, uKc.A05) || !0qQ.A0K(this.A06, uKc.A06) || !0qQ.A0K(this.A03, uKc.A03) || !0qQ.A0K(this.A07, uKc.A07) || this.A00 != uKc.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A08(this.A07, AnonymousClass7TF.A08(this.A03, AnonymousClass7TF.A08(this.A06, AnonymousClass7TF.A08(this.A05, AnonymousClass7TF.A08(this.A04, AnonymousClass7TF.A08(this.A02, AnonymousClass7TE.A0O(this.A01))))))) + this.A00;
    }
}
