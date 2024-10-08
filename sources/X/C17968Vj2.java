package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Vj2  reason: case insensitive filesystem */
public final class C17968Vj2 {
    public final 0xI A00;
    public final UserSession A01;

    public final void A00() {
        C60510iO.A00(this.A01).EFq(this.A00);
    }

    public final void A01(String str, Number number) {
        Double d;
        0xI r2 = this.A00;
        if (number != null) {
            d = Double.valueOf(number.doubleValue());
        } else {
            d = null;
        }
        r2.A0A(str, d);
    }

    public C17968Vj2(0xI r1, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = r1;
    }
}
