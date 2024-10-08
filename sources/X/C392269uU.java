package X;

/* renamed from: X.9uU  reason: invalid class name and case insensitive filesystem */
public final class C392269uU {
    public Integer A00;
    public boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C392269uU r5 = (C392269uU) obj;
            if (!(this.A00 == r5.A00 && this.A01 == r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int i = (this.A01 ? 1 : 0) * true;
        int intValue = this.A00.intValue();
        switch (intValue) {
            case 1:
                str = "ECHO";
                break;
            case 2:
                str = "DUO";
                break;
            default:
                str = "DEFAULT";
                break;
        }
        return i + str.hashCode() + intValue;
    }
}
