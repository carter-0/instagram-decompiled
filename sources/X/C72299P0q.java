package X;

import android.app.Activity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.P0q  reason: case insensitive filesystem */
public final class C72299P0q implements C74444Puz {
    public final Activity A00;
    public final N4O A01;
    public final UserSession A02;
    public final C69293Nit A03 = C69293Nit.MEX_EB_UPSELL_BANNER;
    public final Integer A04;

    public final N4O BTX() {
        return this.A01;
    }

    public final void D9Q() {
        UserSession userSession = this.A02;
        C69899Nu1.A00(userSession).A0I(this.A03);
        Integer num = this.A04;
        if (num != null) {
            C67458MoD.A03(new C67458MoD(userSession), AnonymousClass05K.A0u, num);
        }
    }

    public final void DZK() {
        UserSession userSession = this.A02;
        C69899Nu1.A00(userSession).A0H(this.A03);
        Integer num = this.A04;
        if (num != null) {
            C67458MoD.A03(new C67458MoD(userSession), AnonymousClass05K.A0u, num);
        }
        OW5 A002 = C69900Nu2.A00(userSession);
        Activity activity = this.A00;
        C69358Njy njy = C69358Njy.MEX_EB_UPSELL_NUX;
        Integer num2 = AnonymousClass05K.A03;
        A002.A01(activity, AnonymousClass7TE.A0a(), njy, C69271NiX.FULLSCREEN_MODAL, num2, AnonymousClass05K.A0u, num);
    }

    public C72299P0q(Activity activity, UserSession userSession, Integer num) {
        this.A04 = num;
        this.A00 = activity;
        this.A02 = userSession;
        this.A01 = new N4O((CharSequence) AnonymousClass7TE.A16(activity, 2131966491), (CharSequence) activity.getString(2131966492), (CharSequence) activity.getString(2131966493), AnonymousClass05K.A01, (int) R.drawable.ig_illustrations_qp_warning2_refresh);
    }
}
