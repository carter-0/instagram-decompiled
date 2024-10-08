package X;

/* renamed from: X.GmD  reason: case insensitive filesystem */
public final class C53327GmD extends AnonymousClass0T0 {
    public final int A00;
    public final JV7 A01;
    public final JV7 A02;
    public final C53375Gn5 A03;
    public final Integer A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final AnonymousClass62P A0C;
    public final XRJ A0D;
    public final C21266XRl A0E;
    public final Integer A0F;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53327GmD) {
                C53327GmD gmD = (C53327GmD) obj;
                if (!0qQ.A0K(this.A05, gmD.A05) || this.A0E != gmD.A0E || !0qQ.A0K(this.A0B, gmD.A0B) || this.A0D != gmD.A0D || this.A00 != gmD.A00 || !0qQ.A0K(this.A09, gmD.A09) || !0qQ.A0K(this.A08, gmD.A08) || !0qQ.A0K(this.A04, gmD.A04) || !0qQ.A0K(this.A0A, gmD.A0A) || !0qQ.A0K(this.A01, gmD.A01) || !0qQ.A0K(this.A02, gmD.A02) || !0qQ.A0K(this.A07, gmD.A07) || !0qQ.A0K(this.A0F, gmD.A0F) || !0qQ.A0K(this.A0C, gmD.A0C) || !0qQ.A0K(this.A03, gmD.A03) || !0qQ.A0K(this.A06, gmD.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A082 = AnonymousClass7TF.A08(this.A0B, AnonymousClass7TF.A07(this.A0E, AnonymousClass7TE.A0O(this.A05)));
        return ((((((((((((((((((AnonymousClass7TF.A08(this.A09, (AnonymousClass7TF.A07(this.A0D, A082) + this.A00) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A0A)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0C(this.A0F)) * 31) + AnonymousClass7TG.A0C(this.A0C)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + C41845B3m.A00(this.A06);
    }

    public C53327GmD(JV7 jv7, JV7 jv72, C53375Gn5 gn5, XRJ xrj, C21266XRl xRl, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, AnonymousClass62P r16, int i) {
        this.A05 = str;
        this.A0E = xRl;
        this.A0B = str2;
        this.A0D = xrj;
        this.A00 = i;
        this.A09 = str3;
        this.A08 = str4;
        this.A04 = num;
        this.A0A = str5;
        this.A01 = jv7;
        this.A02 = jv72;
        this.A07 = str6;
        this.A0F = num2;
        this.A0C = r16;
        this.A03 = gn5;
        this.A06 = str7;
    }
}
