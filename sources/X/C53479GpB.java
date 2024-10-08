package X;

/* renamed from: X.GpB  reason: case insensitive filesystem */
public final class C53479GpB extends AnonymousClass0T0 implements C299575vQ {
    public final AnonymousClass9IC A00;
    public final C299505vJ A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public final /* synthetic */ C61082JwK CFL() {
        return C299615vU.A00();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53479GpB) {
                C53479GpB gpB = (C53479GpB) obj;
                if (!0qQ.A0K(this.A01, gpB.A01) || !0qQ.A0K(this.A00, gpB.A00) || !0qQ.A0K(this.A07, gpB.A07) || !0qQ.A0K(this.A02, gpB.A02) || !0qQ.A0K(this.A05, gpB.A05) || !0qQ.A0K(this.A06, gpB.A06) || !0qQ.A0K(this.A04, gpB.A04) || !0qQ.A0K(this.A03, gpB.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String BK1() {
        return C299615vU.A01(this, "timelyTopicLabel", this.A01.A03);
    }

    public final C299505vJ Be5() {
        return this.A01;
    }

    public final int hashCode() {
        return ((((((AnonymousClass7TF.A08(this.A02, AnonymousClass7TF.A08(this.A07, AnonymousClass7TF.A07(this.A00, AnonymousClass7TE.A0K(this.A01)))) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + C41845B3m.A00(this.A03);
    }

    public C53479GpB(AnonymousClass9IC r1, C299505vJ r2, String str, String str2, String str3, String str4, String str5, String str6) {
        this.A01 = r2;
        this.A00 = r1;
        this.A07 = str;
        this.A02 = str2;
        this.A05 = str3;
        this.A06 = str4;
        this.A04 = str5;
        this.A03 = str6;
    }
}
