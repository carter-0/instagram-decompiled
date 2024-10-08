package X;

/* renamed from: X.N2j  reason: case insensitive filesystem */
public final class C68143N2j extends AnonymousClass0T0 {
    public final double A00;
    public final int A01;
    public final Integer A02;
    public final String A03;
    public final String A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68143N2j) {
                C68143N2j n2j = (C68143N2j) obj;
                if (!(this.A02 == n2j.A02 && 0qQ.A0K(this.A03, n2j.A03) && 0qQ.A0K(this.A04, n2j.A04) && this.A01 == n2j.A01 && Double.compare(this.A00, n2j.A00) == 0)) {
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
                str = "PAGE_INFORMATION";
                break;
            case 2:
                str = "PREVIOUS_REPLIES";
                break;
            case 3:
                str = "SAVED_REPLY";
                break;
            case 4:
                str = "SMART_COMPOSE";
                break;
            case 5:
                str = "SMART_REPLY";
                break;
            default:
                str = "UNSET_OR_UNRECOGNIZED_ENUM_VALUE";
                break;
        }
        return ((((AnonymousClass7TF.A08(this.A03, C51968G9o.A0F(str, intValue)) + AnonymousClass7TG.A0E(this.A04)) * 31) + this.A01) * 31) + C51968G9o.A03(Double.doubleToLongBits(this.A00));
    }

    public C68143N2j(Integer num, String str, String str2, double d, int i) {
        AnonymousClass7TG.A1O(num, str);
        this.A02 = num;
        this.A03 = str;
        this.A04 = str2;
        this.A01 = i;
        this.A00 = d;
    }
}
