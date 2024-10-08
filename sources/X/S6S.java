package X;

import java.util.Map;

public final class S6S {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final Map A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof S6S) {
                S6S s6s = (S6S) obj;
                if (!0qQ.A0K(this.A00, s6s.A00) || !0qQ.A0K(this.A01, s6s.A01) || !0qQ.A0K(this.A02, s6s.A02) || !0qQ.A0K(this.A04, s6s.A04) || !0qQ.A0K(this.A03, s6s.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A04, AnonymousClass7TF.A08(this.A02, AnonymousClass7TF.A08(this.A01, AnonymousClass7TG.A0E(this.A00) * 31))) + C41845B3m.A00(this.A03);
    }

    public S6S(String str, String str2, String str3, String str4, Map map) {
        AnonymousClass7TG.A1Q(str2, str3);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A04 = map;
        this.A03 = str4;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("VerifyAuthFactor(authType=");
        A1A.append(this.A00);
        A1A.append(", paymentType=");
        A1A.append(this.A01);
        A1A.append(", sessionId=");
        A1A.append(this.A02);
        A1A.append(", authParam=");
        A1A.append(this.A04);
        A1A.append(", targetAccountId=");
        return C51975G9x.A0i(this.A03, A1A);
    }
}
