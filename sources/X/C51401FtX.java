package X;

import android.os.Bundle;

/* renamed from: X.FtX  reason: case insensitive filesystem */
public final class C51401FtX implements Runnable {
    public final /* synthetic */ DwW A00;
    public final /* synthetic */ E3E A01;

    public C51401FtX(DwW dwW, E3E e3e) {
        this.A01 = e3e;
        this.A00 = dwW;
    }

    public final void run() {
        E3E e3e = this.A01;
        F1D f1d = e3e.A0E;
        if (f1d == null) {
            0qQ.A0F("userForEditing");
            throw AnonymousClass00P.createAndThrow();
        }
        String str = f1d.A0M;
        String str2 = f1d.A0B;
        String str3 = f1d.A0H;
        Bundle A002 = FBN.A00(this.A00.A00);
        Dbc.A0L(A002, str2, str3, str, false);
        C48975EnD.A00(A002, EVZ.ARGUMENT_EDIT_PROFILE_FLOW);
        A002.putBoolean("HAS_SMS_CONSENT", false);
        C309516Yo A0J = DbY.A0J(e3e.requireActivity(), DbT.A0X(e3e.A0L));
        A0J.A0B(A002, new C47448E2u());
        A0J.A0F(e3e, 0);
        A0J.A04();
    }
}
