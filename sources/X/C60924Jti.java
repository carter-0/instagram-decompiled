package X;

/* renamed from: X.Jti  reason: case insensitive filesystem */
public final class C60924Jti extends AnonymousClass0T0 {
    public final String A00;
    public final boolean A01;
    public final String A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60924Jti) {
                C60924Jti jti = (C60924Jti) obj;
                if (!0qQ.A0K(this.A00, jti.A00) || this.A01 != jti.A01 || this.A03 != jti.A03 || !0qQ.A0K(this.A02, jti.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A09(this.A03, AnonymousClass7TF.A09(this.A01, AnonymousClass7TG.A0E(this.A00) * 31)) + C41845B3m.A00(this.A02);
    }

    public C60924Jti(String str, String str2, boolean z, boolean z2) {
        this.A00 = str;
        this.A01 = z;
        this.A03 = z2;
        this.A02 = str2;
    }
}
