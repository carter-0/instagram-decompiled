package X;

public final class UL8 extends AnonymousClass0T0 {
    public final int A00 = 1;
    public final Object A01;

    public UL8(Integer num) {
        0qQ.A0B(num, 1);
        this.A01 = num;
    }

    public final boolean equals(Object obj) {
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UL8)) {
                return false;
            }
            UL8 ul8 = (UL8) obj;
            if (ul8.A00 != 1 || !0qQ.A0K(this.A01, ul8.A01)) {
                return false;
            }
            return true;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof UL8)) {
                return false;
            }
            UL8 ul82 = (UL8) obj;
            if (ul82.A00 == 0 && this.A01 == ul82.A01) {
                return true;
            }
            return false;
        }
    }

    public final int hashCode() {
        String str;
        if (this.A00 != 0) {
            return this.A01.hashCode();
        }
        int A0M = AnonymousClass7TE.A0M(this.A01);
        switch (A0M) {
            case 1:
                str = "RICH_CREATIVES";
                break;
            case 2:
                str = "CONTEXT_CARD";
                break;
            case 3:
                str = "THANK_YOU_SCREEN";
                break;
            case 4:
                str = "MULTI_SUBMIT_THANK_YOU_SCREEN";
                break;
            default:
                str = "MULTI_STEP";
                break;
        }
        return str.hashCode() + A0M;
    }

    public UL8(1Xj r2) {
        this.A01 = r2;
    }
}
