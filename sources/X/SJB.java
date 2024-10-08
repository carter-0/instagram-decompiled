package X;

public final class SJB {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SJB) {
                SJB sjb = (SJB) obj;
                if (!0qQ.A0K(this.A04, sjb.A04) || !0qQ.A0K(this.A00, sjb.A00) || !0qQ.A0K(this.A01, sjb.A01) || !0qQ.A0K(this.A03, sjb.A03) || !0qQ.A0K(this.A02, sjb.A02) || !0qQ.A0K(this.A05, sjb.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((AnonymousClass7TG.A0E(this.A04) * 31) + AnonymousClass7TG.A0E(this.A00)) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + C41845B3m.A00(this.A05);
    }

    public SJB(String str, String str2, String str3, String str4, String str5, String str6) {
        this.A04 = str;
        this.A00 = str2;
        this.A01 = str3;
        this.A03 = str4;
        this.A02 = str5;
        this.A05 = str6;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ServerKeyQuery(targetAccountId=");
        A1A.append(this.A04);
        A1A.append(", otcSessionId=");
        A1A.append(this.A00);
        A1A.append(", otcType=");
        A1A.append(this.A01);
        A1A.append(", receiverId=");
        A1A.append(this.A03);
        A1A.append(", paymentType=");
        A1A.append(this.A02);
        A1A.append(", id=");
        return C51975G9x.A0i(this.A05, A1A);
    }

    public SJB() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null);
    }
}
