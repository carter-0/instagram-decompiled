package X;

/* renamed from: X.Jz7  reason: case insensitive filesystem */
public final class C61214Jz7 extends AnonymousClass0T0 implements C66548MWc {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61214Jz7) {
                C61214Jz7 jz7 = (C61214Jz7) obj;
                if (!0qQ.A0K(this.A00, jz7.A00) || !0qQ.A0K(this.A01, jz7.A01) || !0qQ.A0K(this.A02, jz7.A02) || !0qQ.A0K(this.A03, jz7.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((AnonymousClass7TG.A0E(this.A00) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + C41845B3m.A00(this.A03);
    }

    public C61214Jz7(String str, String str2, String str3, String str4) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
    }
}
