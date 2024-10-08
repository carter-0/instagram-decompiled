package X;

public final class UNB extends AnonymousClass0T0 implements C21018X9v {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UNB) {
                UNB unb = (UNB) obj;
                if (!0qQ.A0K(this.A00, unb.A00) || !0qQ.A0K(this.A01, unb.A01) || !0qQ.A0K(this.A03, unb.A03) || !0qQ.A0K(this.A02, unb.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((AnonymousClass7TG.A0E(this.A00) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + C41845B3m.A00(this.A02);
    }

    public UNB(String str, String str2, String str3, String str4) {
        this.A00 = str;
        this.A01 = str2;
        this.A03 = str3;
        this.A02 = str4;
    }
}
