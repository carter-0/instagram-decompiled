package X;

import android.os.Bundle;

/* renamed from: X.FtQ  reason: case insensitive filesystem */
public final class C51394FtQ implements Runnable {
    public final /* synthetic */ DwW A00;
    public final /* synthetic */ C47679ECo A01;

    public C51394FtQ(DwW dwW, C47679ECo eCo) {
        this.A01 = eCo;
        this.A00 = dwW;
    }

    public final void run() {
        C46656Dib dib = this.A01.A00;
        F1D f1d = dib.A0e;
        f1d.getClass();
        String str = f1d.A0M;
        F1D f1d2 = dib.A0e;
        String str2 = f1d2.A0B;
        String str3 = f1d2.A0H;
        Bundle A002 = FBN.A00(this.A00.A00);
        Dbc.A0L(A002, str2, str3, str, false);
        C48975EnD.A00(A002, EVZ.ARGUMENT_EDIT_PROFILE_FLOW);
        A002.putBoolean("HAS_SMS_CONSENT", false);
        C309516Yo A0J = DbY.A0J(dib.requireActivity(), dib.A0V);
        A0J.A0B(A002, new C47448E2u());
        A0J.A0F(dib, 0);
        A0J.A04();
    }
}
