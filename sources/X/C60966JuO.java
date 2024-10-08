package X;

/* renamed from: X.JuO  reason: case insensitive filesystem */
public final class C60966JuO extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public C60966JuO(Integer num, String str, String str2, String str3, String str4, String str5, String str6, int i, int i2) {
        0qQ.A0B(num, 1);
        C51974G9v.A1N(str2, str3, str4);
        this.A02 = num;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = str;
        this.A06 = str2;
        this.A07 = str3;
        this.A08 = str4;
        this.A04 = str5;
        this.A05 = str6;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60966JuO) {
                C60966JuO juO = (C60966JuO) obj;
                if (this.A02 != juO.A02 || this.A01 != juO.A01 || this.A00 != juO.A00 || !0qQ.A0K(this.A03, juO.A03) || !0qQ.A0K(this.A06, juO.A06) || !0qQ.A0K(this.A07, juO.A07) || !0qQ.A0K(this.A08, juO.A08) || !0qQ.A0K(this.A04, juO.A04) || !0qQ.A0K(this.A05, juO.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int intValue = this.A02.intValue();
        switch (intValue) {
            case 1:
                str = "EXPANDER";
                break;
            case 2:
                str = "RESTYLE";
                break;
            case 3:
                str = "SEGMENTATION_MASK";
                break;
            case 4:
                str = "SEMANTIC_SEGMENTATION";
                break;
            case 5:
                str = "IMAGINE";
                break;
            case 6:
                str = "CONTEXTUAL_BACKGROUNDS";
                break;
            case 7:
                str = "IMAGINE_ME";
                break;
            default:
                str = "BACKDROP";
                break;
        }
        return ((AnonymousClass7TF.A08(this.A08, AnonymousClass7TF.A08(this.A07, AnonymousClass7TF.A08(this.A06, (((((C51968G9o.A0F(str, intValue) + this.A01) * 31) + this.A00) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31))) + AnonymousClass7TG.A0E(this.A04)) * 31) + C41845B3m.A00(this.A05);
    }
}
