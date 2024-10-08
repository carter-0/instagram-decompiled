package X;

/* renamed from: X.N3l  reason: case insensitive filesystem */
public final class C68170N3l extends AnonymousClass0T0 {
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public C68170N3l() {
        this(0, "", "", "", "");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68170N3l) {
                C68170N3l n3l = (C68170N3l) obj;
                if (this.A00 != n3l.A00 || !0qQ.A0K(this.A04, n3l.A04) || !0qQ.A0K(this.A03, n3l.A03) || !0qQ.A0K(this.A02, n3l.A02) || !0qQ.A0K(this.A01, n3l.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A08(this.A02, AnonymousClass7TF.A08(this.A03, AnonymousClass7TF.A08(this.A04, this.A00 * 31))) + AnonymousClass7TG.A0E(this.A01);
    }

    public C68170N3l(int i, String str, String str2, String str3, String str4) {
        C51974G9v.A1M(str, str2, str3);
        this.A00 = i;
        this.A04 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A01 = str4;
    }
}
