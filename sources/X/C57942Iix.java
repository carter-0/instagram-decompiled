package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Iix  reason: case insensitive filesystem */
public final class C57942Iix implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C53335GmL A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ String A03;

    public C57942Iix(Activity activity, C53335GmL gmL, UserSession userSession, String str) {
        this.A01 = gmL;
        this.A03 = str;
        this.A00 = activity;
        this.A02 = userSession;
    }

    public final void run() {
        C53335GmL gmL = this.A01;
        C47519E6d A002 = C49186Eqr.A00(gmL.A0F, gmL.A0E, this.A03, false);
        AnonymousClass37E r0 = AnonymousClass37D.A00;
        Activity activity = this.A00;
        C331157Pu A003 = C48943Emh.A00(r0.A01(activity));
        if (A003 != null) {
            C331127Pr A0W = DbS.A0W(this.A02);
            A0W.A11 = true;
            DbZ.A0z(activity, A0W, 2131969561);
            DbS.A1S(A0W, true);
            A0W.A03 = 0.7f;
            A003.A0F(A002, A0W);
        }
    }
}
