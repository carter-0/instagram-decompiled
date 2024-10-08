package X;

/* renamed from: X.2sh  reason: invalid class name and case insensitive filesystem */
public final class C231962sh extends Exception {
    public Integer A00;
    public String A01;

    public final String toString() {
        String str;
        Integer num = this.A00;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str = "NOT_A_NUMBER";
                    break;
                case 2:
                    str = "TOO_SHORT_AFTER_IDD";
                    break;
                case 3:
                    str = "TOO_SHORT_NSN";
                    break;
                case 4:
                    str = "TOO_LONG";
                    break;
                default:
                    str = "INVALID_COUNTRY_CODE";
                    break;
            }
        } else {
            str = "null";
        }
        return 002.A0u("Error type: ", str, ". ", this.A01);
    }

    public C231962sh(Integer num, String str) {
        super(str);
        this.A01 = str;
        this.A00 = num;
    }
}
