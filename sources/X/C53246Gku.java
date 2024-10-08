package X;

/* renamed from: X.Gku  reason: case insensitive filesystem */
public final class C53246Gku extends AnonymousClass0T0 {
    public int A00;
    public String A01;
    public String A02;
    public String A03;
    public boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53246Gku) {
                C53246Gku gku = (C53246Gku) obj;
                if (this.A00 != gku.A00 || !0qQ.A0K(this.A01, gku.A01) || !0qQ.A0K(this.A03, gku.A03) || !0qQ.A0K(this.A02, gku.A02) || this.A04 != gku.A04) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A08 = AnonymousClass7TF.A08(this.A01, this.A00 * 31);
        return DbS.A06(this.A04, (AnonymousClass7TF.A08(this.A03, A08) + AnonymousClass7TG.A0E(this.A02)) * 31);
    }
}
