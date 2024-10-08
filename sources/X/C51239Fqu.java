package X;

import android.os.Bundle;
import com.facebook.common.callercontext.CallerContext;

/* renamed from: X.Fqu  reason: case insensitive filesystem */
public final class C51239Fqu implements Runnable {
    public final /* synthetic */ EEM A00;

    public C51239Fqu(EEM eem) {
        this.A00 = eem;
    }

    public final void run() {
        EEM eem = this.A00;
        CallerContext callerContext = EEM.A0B;
        C309516Yo A0M = DbS.A0M(eem.A06.getActivity(), eem.A08);
        DbW.A0X();
        Bundle A0a = AnonymousClass7TE.A0a();
        DbS.A1A(A0a, "IgSessionManager.LOGGED_OUT_TOKEN");
        E3Y e3y = new E3Y();
        e3y.setArguments(A0a);
        A0M.A0E(e3y);
        A0M.A04();
    }
}
