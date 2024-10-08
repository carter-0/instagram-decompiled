package X;

import android.os.Bundle;

/* renamed from: X.Suj  reason: case insensitive filesystem */
public final class C12451Suj implements C13783Tgy {
    public final QD2 A00;

    public final C11330SNj BLL() {
        throw AnonymousClass7TE.A0z("Should not be called");
    }

    public final void DG8(Bundle bundle, C11330SNj sNj) {
        SR4.A02(this.A00.A02, new AnonymousClass34S(sNj, bundle));
    }

    public final void DG9(Throwable th) {
        SR4.A02(this.A00.A01, th);
    }

    public C12451Suj(Bundle bundle, QD2 qd2) {
        this.A00 = qd2;
        SR4.A02(qd2.A00, new AnonymousClass34S("AUTH_USUP", Pxe.A0J(bundle)));
    }
}
