package X;

/* renamed from: X.JuE  reason: case insensitive filesystem */
public final class C60956JuE extends AnonymousClass0T0 {
    public final int A00;
    public final C63879LAi A01;
    public final C63879LAi A02;
    public final C39723A6o A03;
    public final Integer A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60956JuE) {
                C60956JuE juE = (C60956JuE) obj;
                if (!0qQ.A0K(this.A05, juE.A05) || !0qQ.A0K(this.A07, juE.A07) || !0qQ.A0K(this.A06, juE.A06) || this.A00 != juE.A00 || !0qQ.A0K(this.A01, juE.A01) || !0qQ.A0K(this.A02, juE.A02) || !0qQ.A0K(this.A03, juE.A03) || this.A04 != juE.A04) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A08 = AnonymousClass7TF.A08(this.A07, AnonymousClass7TE.A0O(this.A05));
        int A072 = AnonymousClass7TF.A07(this.A03, AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A07(this.A01, (AnonymousClass7TF.A08(this.A06, A08) + this.A00) * 31)));
        int intValue = this.A04.intValue();
        switch (intValue) {
            case 1:
                str = "LOADING";
                break;
            case 2:
                str = "SELECTED";
                break;
            default:
                str = "LOADED";
                break;
        }
        return A072 + C51966G9m.A04(str, intValue);
    }

    public C60956JuE(C63879LAi lAi, C63879LAi lAi2, C39723A6o a6o, Integer num, String str, String str2, String str3, int i) {
        this.A05 = str;
        this.A07 = str2;
        this.A06 = str3;
        this.A00 = i;
        this.A01 = lAi;
        this.A02 = lAi2;
        this.A03 = a6o;
        this.A04 = num;
    }
}
