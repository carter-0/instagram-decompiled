package X;

/* renamed from: X.DtA  reason: case insensitive filesystem */
public final class C47223DtA extends AnonymousClass0T0 implements AnonymousClass1qK {
    public final Integer A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47223DtA) {
                C47223DtA dtA = (C47223DtA) obj;
                if (this.A00 != dtA.A00 || !0qQ.A0K(this.A02, dtA.A02) || !0qQ.A0K(this.A01, dtA.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int hashCode;
        Integer num = this.A00;
        if (num == null) {
            hashCode = 0;
        } else {
            int intValue = num.intValue();
            if (1 != intValue) {
                str = "DISMISS";
            } else {
                str = "VIEW";
            }
            hashCode = str.hashCode() + intValue;
        }
        return (((hashCode * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + C41845B3m.A00(this.A01);
    }

    public final String toString() {
        String str;
        Integer num = this.A00;
        if (num == null) {
            str = "null";
        } else if (1 - num.intValue() != 0) {
            str = "DISMISS";
        } else {
            str = "VIEW";
        }
        return 002.A14("CXPNoticeEvent(eventType=", str, ", noticeVariant=", this.A02, ", entrypoint=", this.A01, ')');
    }

    public C47223DtA(String str, Integer num, String str2) {
        this.A00 = num;
        this.A02 = str;
        this.A01 = str2;
    }
}
