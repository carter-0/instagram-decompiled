package X;

public final class UVB extends V2E {
    public final String A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UVB) {
                UVB uvb = (UVB) obj;
                if (!0qQ.A0K(this.A02, uvb.A02) || !0qQ.A0K(this.A00, uvb.A00) || !0qQ.A0K(this.A01, uvb.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((AnonymousClass7TG.A0E(this.A02) * 31) + AnonymousClass7TG.A0E(this.A00)) * 31) + C41845B3m.A00(this.A01);
    }

    public UVB(String str, String str2, String str3) {
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
    }

    public UVB() {
        this((String) null, (String) null, (String) null);
    }
}
