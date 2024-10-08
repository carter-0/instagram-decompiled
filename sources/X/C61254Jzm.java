package X;

/* renamed from: X.Jzm  reason: case insensitive filesystem */
public final class C61254Jzm extends AnonymousClass0T0 implements MR9 {
    public final C243363Yl A00;
    public final Integer A01;
    public final String A02;

    public C61254Jzm(C243363Yl r2, Integer num, String str) {
        0qQ.A0B(str, 2);
        this.A00 = r2;
        this.A02 = str;
        this.A01 = num;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61254Jzm) {
                C61254Jzm jzm = (C61254Jzm) obj;
                if (!(this.A00 == jzm.A00 && 0qQ.A0K(this.A02, jzm.A02) && this.A01 == jzm.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A08 = AnonymousClass7TF.A08(this.A02, AnonymousClass7TE.A0K(this.A00));
        int intValue = this.A01.intValue();
        if (1 != intValue) {
            str = "USER";
        } else {
            str = "API_FAILURE";
        }
        return A08 + C51966G9m.A04(str, intValue);
    }
}
