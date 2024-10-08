package X;

public final class B45 extends AnonymousClass0T0 {
    public final String A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof B45) {
                B45 b45 = (B45) obj;
                if (!0qQ.A0K(this.A01, b45.A01) || !0qQ.A0K(this.A00, b45.A00) || this.A03 != b45.A03 || !0qQ.A0K(this.A02, b45.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A09(this.A03, (AnonymousClass7TE.A0O(this.A01) + AnonymousClass7TG.A0E(this.A00)) * 31) + C41845B3m.A00(this.A02);
    }

    public B45(String str, String str2, boolean z, String str3) {
        this.A01 = str;
        this.A00 = str2;
        this.A03 = z;
        this.A02 = str3;
    }
}
