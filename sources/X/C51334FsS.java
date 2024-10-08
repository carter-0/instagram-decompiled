package X;

import android.os.Bundle;

/* renamed from: X.FsS  reason: case insensitive filesystem */
public final class C51334FsS implements Runnable {
    public final /* synthetic */ C47487E4r A00;
    public final /* synthetic */ C47356Dvq A01;

    public C51334FsS(C47487E4r e4r, C47356Dvq dvq) {
        this.A00 = e4r;
        this.A01 = dvq;
    }

    public final void run() {
        C47487E4r e4r = this.A00;
        AnonymousClass0eM r5 = e4r.A0B;
        1E8 A0d = DbX.A0d(r5);
        C47356Dvq dvq = this.A01;
        1Xj r3 = dvq.A00;
        if (r3 != null) {
            String str = null;
            A0d.A01(r3, true, false).AE7(DbT.A0X(r5));
            C309516Yo A0P = DbZ.A0P(e4r, r5);
            E40 e40 = new E40();
            Bundle A0a = AnonymousClass7TE.A0a();
            A0a.putString("ConfirmationFragment.ARGUMENT_KEY_EXTRA_MESSAGE", dvq.A01);
            A0a.putString("ConfirmationFragment.ARGUMENT_KEY_EXTRA_TITLE", dvq.A02);
            Dw6 dw6 = e4r.A01;
            if (dw6 != null) {
                str = dw6.A04;
            }
            A0a.putString("ConfirmationFragment.ARGUMENT_KEY_MEDIA_ID", str);
            String str2 = e4r.A05;
            if (str2 == null) {
                0qQ.A0F("notifSource");
                throw AnonymousClass00P.createAndThrow();
            }
            A0a.putString("ConfirmationFragment.ARGUMENT_KEY_NOTIF_SOURCE", str2);
            A0a.putString("ConfirmationFragment.ARGUMENT_KEY_MEDIA_TYPE", e4r.A04);
            DbW.A0y(A0a, e40, A0P);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
