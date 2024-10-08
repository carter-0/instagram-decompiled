package X;

/* renamed from: X.Jy0  reason: case insensitive filesystem */
public final class C61149Jy0 extends AnonymousClass0T0 implements AnonymousClass1qK {
    public final Integer A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C61149Jy0) && this.A00 == ((C61149Jy0) obj).A00);
    }

    public final int hashCode() {
        String str;
        Integer num = this.A00;
        if (num == null) {
            return 0;
        }
        int intValue = num.intValue();
        switch (intValue) {
            case 1:
                str = "SHARE_ONCE";
                break;
            case 2:
                str = "DISMISS";
                break;
            default:
                str = "AUTO_XPOST";
                break;
        }
        return C51966G9m.A04(str, intValue);
    }

    public final String toString() {
        String str;
        Integer num = this.A00;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str = "SHARE_ONCE";
                    break;
                case 2:
                    str = "DISMISS";
                    break;
                default:
                    str = "AUTO_XPOST";
                    break;
            }
        } else {
            str = "null";
        }
        return G9w.A0k("UserActionAfterLinkingBloksUpsellEvent(eventType=", str);
    }

    public C61149Jy0(Integer num) {
        this.A00 = num;
    }
}
