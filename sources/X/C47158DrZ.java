package X;

/* renamed from: X.DrZ  reason: case insensitive filesystem */
public final class C47158DrZ extends AnonymousClass0T0 {
    public String A00 = "not_eligible";
    public String A01 = "$0.00";
    public boolean A02 = false;
    public boolean A03 = false;
    public boolean A04 = false;
    public boolean A05 = false;
    public boolean A06 = false;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47158DrZ) {
                C47158DrZ drZ = (C47158DrZ) obj;
                if (!(0qQ.A0K(this.A00, drZ.A00) && this.A05 == drZ.A05 && 0qQ.A0K(this.A01, drZ.A01) && this.A04 == drZ.A04 && this.A06 == drZ.A06 && this.A03 == drZ.A03 && this.A02 == drZ.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A02, AnonymousClass7TF.A09(this.A03, AnonymousClass7TF.A09(this.A06, AnonymousClass7TF.A09(this.A04, AnonymousClass7TF.A08(this.A01, AnonymousClass7TF.A09(this.A05, AnonymousClass7TE.A0O(this.A00)))))));
    }
}
