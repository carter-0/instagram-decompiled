package X;

/* renamed from: X.UKm  reason: case insensitive filesystem */
public final class C15033UKm extends AnonymousClass0T0 {
    public final float A00;
    public final float A01;
    public final C70645OEr A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final float A08;
    public final float A09;

    public C15033UKm(C70645OEr oEr, String str, String str2, String str3, String str4, float f, float f2, float f3, float f4, boolean z) {
        C51969G9p.A1N(oEr, 2, str4);
        this.A07 = z;
        this.A02 = oEr;
        this.A08 = f;
        this.A03 = str;
        this.A00 = f2;
        this.A04 = str2;
        this.A05 = str3;
        this.A09 = f3;
        this.A01 = f4;
        this.A06 = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C15033UKm) {
                C15033UKm uKm = (C15033UKm) obj;
                if (this.A07 != uKm.A07 || !0qQ.A0K(this.A02, uKm.A02) || Float.compare(this.A08, uKm.A08) != 0 || !0qQ.A0K(this.A03, uKm.A03) || Float.compare(this.A00, uKm.A00) != 0 || !0qQ.A0K(this.A04, uKm.A04) || !0qQ.A0K(this.A05, uKm.A05) || Float.compare(this.A09, uKm.A09) != 0 || Float.compare(this.A01, uKm.A01) != 0 || !0qQ.A0K(this.A06, uKm.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A06, AnonymousClass7TF.A00(AnonymousClass7TF.A00((((AnonymousClass7TF.A00((AnonymousClass7TF.A00(AnonymousClass7TF.A07(this.A02, C51965G9l.A05(this.A07)), this.A08) + AnonymousClass7TG.A0E(this.A03)) * 31, this.A00) + AnonymousClass7TG.A0E(this.A04)) * 31) + C41845B3m.A00(this.A05)) * 31, this.A09), this.A01));
    }
}
