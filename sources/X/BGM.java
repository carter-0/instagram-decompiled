package X;

public final class BGM extends AnonymousClass0T0 implements DRS {
    public final C67241sS A00;
    public final Integer A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final DRK A06;
    public final String A07;
    public final String A08;

    public BGM(DRK drk, C67241sS r3, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5) {
        AnonymousClass7TF.A1F(str3, 4, str5);
        this.A07 = str;
        this.A08 = str2;
        this.A01 = num;
        this.A03 = str3;
        this.A00 = r3;
        this.A06 = drk;
        this.A04 = str4;
        this.A05 = str5;
        this.A02 = num2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BGM) {
                BGM bgm = (BGM) obj;
                if (!0qQ.A0K(this.A07, bgm.A07) || !0qQ.A0K(this.A08, bgm.A08) || !0qQ.A0K(this.A01, bgm.A01) || !0qQ.A0K(this.A03, bgm.A03) || !0qQ.A0K(this.A00, bgm.A00) || !0qQ.A0K(this.A06, bgm.A06) || !0qQ.A0K(this.A04, bgm.A04) || !0qQ.A0K(this.A05, bgm.A05) || !0qQ.A0K(this.A02, bgm.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A03;
        return AnonymousClass7TF.A08(this.A05, (((((AnonymousClass7TF.A08(str, ((((AnonymousClass7TG.A0E(this.A07) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TE.A0L(this.A02);
    }
}
