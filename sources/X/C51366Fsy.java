package X;

import android.os.Bundle;

/* renamed from: X.Fsy  reason: case insensitive filesystem */
public final class C51366Fsy implements Runnable {
    public final /* synthetic */ C47699EDi A00;
    public final /* synthetic */ DwW A01;

    public C51366Fsy(C47699EDi eDi, DwW dwW) {
        this.A00 = eDi;
        this.A01 = dwW;
    }

    public final void run() {
        Bundle A002 = FBN.A00(this.A01.A00);
        A002.putBoolean("push_to_next", true);
        ESN esn = (ESN) this.A00.A01;
        Dbc.A0L(A002, esn.A03, esn.A04, esn.A05, true);
        C48975EnD.A00(A002, EVZ.ARGUMENT_TWOFAC_FLOW);
        C309516Yo A0P = DbU.A0P(A002, DbW.A0X().A01(esn.A01), esn.requireActivity(), esn.A01);
        A0P.A0F(esn, 0);
        A0P.A04();
    }
}
