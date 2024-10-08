package X;

public final class GS2 extends GRC {
    public final int A00;
    public final int A01;
    public final Integer A02;
    public final String A03;
    public final String A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GS2) {
                GS2 gs2 = (GS2) obj;
                if (!(0qQ.A0K(this.A04, gs2.A04) && 0qQ.A0K(this.A03, gs2.A03) && this.A02 == gs2.A02 && this.A00 == gs2.A00 && this.A01 == gs2.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public GS2(String str, String str2, int i, int i2, Integer num) {
        super("content_type_newsfeed_truncation_control", "content_type_newsfeed_truncation_control");
        this.A04 = str;
        this.A03 = str2;
        this.A02 = num;
        this.A00 = i;
        this.A01 = i2;
    }

    public final int hashCode() {
        String str;
        int A08 = AnonymousClass7TF.A08(this.A03, AnonymousClass7TE.A0O(this.A04));
        int intValue = this.A02.intValue();
        switch (intValue) {
            case 2:
                str = "TODAY";
                break;
            case 3:
                str = "YESTERDAY";
                break;
            case 4:
                str = "SEVEN_DAYS";
                break;
            case 5:
                str = "THIRTY_DAYS";
                break;
            case 6:
                str = "OLDER";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        return ((C51971G9r.A0F(str, intValue, A08) + this.A00) * 31) + this.A01;
    }
}
