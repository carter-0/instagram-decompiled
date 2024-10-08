package X;

/* renamed from: X.Gq9  reason: case insensitive filesystem */
public final class C53538Gq9 extends AnonymousClass0T0 implements JM3 {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53538Gq9) {
                C53538Gq9 gq9 = (C53538Gq9) obj;
                if (!0qQ.A0K(this.A02, gq9.A02) || !0qQ.A0K(this.A00, gq9.A00) || !0qQ.A0K(this.A01, gq9.A01) || !0qQ.A0K(this.A03, gq9.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass7TF.A08(this.A00, AnonymousClass7TE.A0O(this.A02)) + AnonymousClass7TG.A0E(this.A01)) * 31) + C41845B3m.A00(this.A03);
    }

    public C53538Gq9(String str, String str2, String str3, String str4) {
        AnonymousClass7TG.A1O(str, str2);
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
        this.A03 = str4;
    }
}
