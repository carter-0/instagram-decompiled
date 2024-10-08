package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* renamed from: X.FmP  reason: case insensitive filesystem */
public final class C50976FmP implements C332277Ui {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C50975Fm2 A02;
    public final /* synthetic */ AnonymousClass2qU A03;
    public final /* synthetic */ E5X A04;

    public final void D9a() {
    }

    public C50976FmP(Activity activity, UserSession userSession, C50975Fm2 fm2, AnonymousClass2qU r4, E5X e5x) {
        this.A03 = r4;
        this.A01 = userSession;
        this.A02 = fm2;
        this.A00 = activity;
        this.A04 = e5x;
    }

    public final void D9V() {
        UserSession userSession = this.A01;
        C50975Fm2 fm2 = this.A02;
        Activity activity = this.A00;
        E5X e5x = this.A04;
        C331127Pr A0W = DbS.A0W(userSession);
        A0W.A0U = fm2;
        DbU.A0y(activity, e5x, A0W);
        AnonymousClass37D A0i = DbT.A0i(activity);
        if (A0i != null) {
            A0i.A0P((C332277Ui) null);
        }
    }
}
