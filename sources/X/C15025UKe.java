package X;

/* renamed from: X.UKe  reason: case insensitive filesystem */
public final class C15025UKe extends AnonymousClass0T0 {
    public float A00 = 0.0f;
    public float A01 = 1.0f;
    public int A02 = 0;
    public int A03 = 0;
    public int A04 = 0;
    public String A05;
    public String A06 = "";
    public boolean A07 = false;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C15025UKe) {
                C15025UKe uKe = (C15025UKe) obj;
                if (!(0qQ.A0K(this.A06, uKe.A06) && Float.compare(this.A00, uKe.A00) == 0 && this.A04 == uKe.A04 && this.A02 == uKe.A02 && this.A07 == uKe.A07 && this.A03 == uKe.A03 && Float.compare(this.A01, uKe.A01) == 0 && 0qQ.A0K(this.A05, uKe.A05))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C15025UKe() {
        String A0j = AnonymousClass7TG.A0j();
        this.A05 = A0j;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A05, AnonymousClass7TF.A00((AnonymousClass7TF.A09(this.A07, (((AnonymousClass7TF.A00(AnonymousClass7TE.A0O(this.A06), this.A00) + this.A04) * 31) + this.A02) * 31) + this.A03) * 31, this.A01));
    }
}
