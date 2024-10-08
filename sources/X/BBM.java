package X;

public final class BBM extends AnonymousClass0T0 {
    public final AnonymousClass9J1 A00;
    public final C67241sS A01;
    public final Boolean A02;
    public final Boolean A03;
    public final Integer A04;
    public final Integer A05;
    public final String A06;
    public final String A07;
    public final Integer A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BBM) {
                BBM bbm = (BBM) obj;
                if (!0qQ.A0K(this.A02, bbm.A02) || !0qQ.A0K(this.A03, bbm.A03) || !0qQ.A0K(this.A04, bbm.A04) || !0qQ.A0K(this.A06, bbm.A06) || !0qQ.A0K(this.A01, bbm.A01) || !0qQ.A0K(this.A00, bbm.A00) || !0qQ.A0K(this.A07, bbm.A07) || !0qQ.A0K(this.A08, bbm.A08) || !0qQ.A0K(this.A05, bbm.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((((AnonymousClass7TG.A0C(this.A02) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0C(this.A08)) * 31) + AnonymousClass7TE.A0L(this.A05);
    }

    public BBM(AnonymousClass9J1 r1, C67241sS r2, Boolean bool, Boolean bool2, Integer num, Integer num2, Integer num3, String str, String str2) {
        this.A02 = bool;
        this.A03 = bool2;
        this.A04 = num;
        this.A06 = str;
        this.A01 = r2;
        this.A00 = r1;
        this.A07 = str2;
        this.A08 = num2;
        this.A05 = num3;
    }
}
