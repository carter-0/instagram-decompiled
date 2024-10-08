package X;

/* renamed from: X.Jz8  reason: case insensitive filesystem */
public final class C61215Jz8 extends AnonymousClass0T0 implements C66549MWd {
    public final C60903JtN A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61215Jz8) {
                C61215Jz8 jz8 = (C61215Jz8) obj;
                if (!0qQ.A0K(this.A00, jz8.A00) || !0qQ.A0K(this.A01, jz8.A01) || !0qQ.A0K(this.A02, jz8.A02) || !0qQ.A0K(this.A03, jz8.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + C41845B3m.A00(this.A03);
    }

    public C61215Jz8(C60903JtN jtN, String str, String str2, String str3) {
        this.A00 = jtN;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
    }
}
