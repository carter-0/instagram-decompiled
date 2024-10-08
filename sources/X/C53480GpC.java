package X;

/* renamed from: X.GpC  reason: case insensitive filesystem */
public final class C53480GpC extends AnonymousClass0T0 implements C299575vQ {
    public final C299505vJ A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final AnonymousClass9IC A05;
    public final C61082JwK A06 = new C61082JwK((N49) null, 2, true);
    public final String A07;

    public C53480GpC(AnonymousClass9IC r6, C299505vJ r7, Integer num, String str, String str2, boolean z) {
        this.A00 = r7;
        this.A05 = r6;
        this.A03 = str;
        this.A02 = str2;
        this.A01 = num;
        this.A04 = z;
        this.A07 = C299615vU.A01(this, "uploadfailure", r7.A03);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53480GpC) {
                C53480GpC gpC = (C53480GpC) obj;
                if (!0qQ.A0K(this.A00, gpC.A00) || !0qQ.A0K(this.A05, gpC.A05) || !0qQ.A0K(this.A03, gpC.A03) || !0qQ.A0K(this.A02, gpC.A02) || this.A01 != gpC.A01 || this.A04 != gpC.A04) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String BK1() {
        return this.A07;
    }

    public final C299505vJ Be5() {
        return this.A00;
    }

    public final C61082JwK CFL() {
        return this.A06;
    }

    public final int hashCode() {
        String str;
        int A072 = (((AnonymousClass7TF.A07(this.A05, AnonymousClass7TE.A0K(this.A00)) + AnonymousClass7TG.A0E(this.A03)) * 31) + C41845B3m.A00(this.A02)) * 31;
        int intValue = this.A01.intValue();
        switch (intValue) {
            case 1:
                str = "WaitingForAutoRetry";
                break;
            case 2:
                str = "CannotRetry";
                break;
            default:
                str = "CanManualRetry";
                break;
        }
        return DbS.A06(this.A04, C51971G9r.A0F(str, intValue, A072));
    }
}
