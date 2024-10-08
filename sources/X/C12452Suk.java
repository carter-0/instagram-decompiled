package X;

import android.os.Bundle;

/* renamed from: X.Suk  reason: case insensitive filesystem */
public final class C12452Suk implements C13783Tgy {
    public final Bundle A00;
    public final QD2 A01;

    public final C11330SNj BLL() {
        return null;
    }

    public final void DG8(Bundle bundle, C11330SNj sNj) {
        if (sNj != null) {
            SR4.A02(this.A01.A02, new AnonymousClass34S(sNj, bundle));
        }
    }

    public final void DG9(Throwable th) {
        SR4.A02(this.A01.A01, th);
    }

    public C12452Suk(Bundle bundle, QD2 qd2) {
        String str;
        this.A01 = qd2;
        this.A00 = bundle;
        if ("PAYPAL_ACCESS_TOKEN".equalsIgnoreCase(DbU.A0l(bundle, "AUTH_METHOD_TYPE"))) {
            str = "VERIFY_PAYPAL";
        } else {
            str = "CSC".equalsIgnoreCase(DbU.A0l(bundle, "AUTH_METHOD_TYPE")) ? "VERIFY_CVV" : str;
            SR4.A02(this.A01.A00, new AnonymousClass34S("PIN_RESET_BY_CVV_PAYPAL", Pxe.A0J(this.A00)));
        }
        SQ8.A03(str, bundle);
        SR4.A02(this.A01.A00, new AnonymousClass34S("PIN_RESET_BY_CVV_PAYPAL", Pxe.A0J(this.A00)));
    }
}
