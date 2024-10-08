package X;

/* renamed from: X.NZx  reason: case insensitive filesystem */
public final class C68865NZx extends C69608Noq {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public C68865NZx(String str, String str2, String str3, String str4) {
        0qQ.A0B(str2, 2);
        this.A03 = str;
        this.A02 = str2;
        this.A01 = str3;
        this.A00 = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68865NZx) {
                C68865NZx nZx = (C68865NZx) obj;
                if (!0qQ.A0K(this.A03, nZx.A03) || !0qQ.A0K(this.A02, nZx.A02) || !0qQ.A0K(this.A01, nZx.A01) || !0qQ.A0K(this.A00, nZx.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A08(this.A01, AnonymousClass7TF.A08(this.A02, AnonymousClass7TE.A0O(this.A03))) + AnonymousClass7TG.A0E(this.A00);
    }
}
