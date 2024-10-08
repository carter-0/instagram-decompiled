package X;

/* renamed from: X.Dru  reason: case insensitive filesystem */
public final class C47179Dru extends AnonymousClass0T0 {
    public final int A00;
    public final JV7 A01;
    public final C48087EVf A02;
    public final Integer A03;

    public C47179Dru(JV7 jv7, C48087EVf eVf, Integer num, int i) {
        this.A02 = eVf;
        this.A03 = num;
        this.A00 = i;
        this.A01 = jv7;
    }

    public static C47179Dru A00(JV7 jv7, C48087EVf eVf, int i) {
        return new C47179Dru(jv7, eVf, (Integer) null, i);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47179Dru) {
                C47179Dru dru = (C47179Dru) obj;
                if (!(this.A02 == dru.A02 && this.A03 == dru.A03 && this.A00 == dru.A00 && 0qQ.A0K(this.A01, dru.A01))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C47179Dru(C49556Exr exr) {
        int i = exr.A02;
        C48087EVf eVf = exr.A01;
        JV7 jv7 = exr.A00;
        this.A02 = eVf;
        this.A03 = null;
        this.A00 = i;
        this.A01 = jv7;
    }

    public final int hashCode() {
        String str;
        int hashCode;
        int A0C = AnonymousClass7TG.A0C(this.A02) * 31;
        Integer num = this.A03;
        if (num == null) {
            hashCode = 0;
        } else {
            int intValue = num.intValue();
            switch (intValue) {
                case 1:
                    str = "UNFOLLOW";
                    break;
                case 2:
                    str = "CONFIRM";
                    break;
                case 3:
                    str = AnonymousClass000.A00(2420);
                    break;
                case 4:
                    str = "UNBLOCK";
                    break;
                case 5:
                    str = "DELETE";
                    break;
                default:
                    str = "FOLLOW";
                    break;
            }
            hashCode = str.hashCode() + intValue;
        }
        return ((((A0C + hashCode) * 31) + this.A00) * 31) + AnonymousClass7TE.A0L(this.A01);
    }
}
