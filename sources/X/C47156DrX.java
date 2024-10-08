package X;

/* renamed from: X.DrX  reason: case insensitive filesystem */
public final class C47156DrX extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47156DrX) {
                C47156DrX drX = (C47156DrX) obj;
                if (!0qQ.A0K(this.A03, drX.A03) || !0qQ.A0K(this.A02, drX.A02) || this.A01 != drX.A01 || this.A00 != drX.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass7TF.A08(this.A02, AnonymousClass7TE.A0O(this.A03)) + this.A01) * 31) + this.A00;
    }

    public C47156DrX(String str, String str2, int i, int i2) {
        AnonymousClass7TG.A1O(str, str2);
        this.A03 = str;
        this.A02 = str2;
        this.A01 = i;
        this.A00 = i2;
        0eO r2 = 0eO.A02;
        this.A05 = AnonymousClass0eN.A00(r2, new C51793G2c(this, 25));
        this.A06 = AnonymousClass0eN.A00(r2, new C51793G2c(this, 26));
        this.A04 = AnonymousClass0eN.A00(r2, new C51793G2c(this, 24));
    }
}
