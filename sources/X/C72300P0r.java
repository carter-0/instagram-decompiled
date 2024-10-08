package X;

import android.app.Activity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.P0r  reason: case insensitive filesystem */
public final class C72300P0r implements C74444Puz {
    public final Activity A00;
    public final N4O A01;
    public final UserSession A02;
    public final C69293Nit A03 = C69293Nit.V3_INTRODUCE_BANNER;
    public final Integer A04;

    public final N4O BTX() {
        return this.A01;
    }

    public final void D9Q() {
        UserSession userSession = this.A02;
        C69899Nu1.A00(userSession).A0I(this.A03);
        Integer num = this.A04;
        if (num != null) {
            C67458MoD.A03(new C67458MoD(userSession), AnonymousClass05K.A01, num);
        }
    }

    public final void DZK() {
        UserSession userSession = this.A02;
        C69899Nu1.A00(userSession).A0H(this.A03);
        Integer num = this.A04;
        if (num != null) {
            C67458MoD.A03(new C67458MoD(userSession), AnonymousClass05K.A01, num);
        }
        OW5 A002 = C69900Nu2.A00(userSession);
        Activity activity = this.A00;
        C69358Njy njy = C69358Njy.E2EE_NUX_V3;
        Integer num2 = AnonymousClass05K.A03;
        A002.A01(activity, AnonymousClass7TE.A0a(), njy, C69271NiX.BOTTOM_SHEET, num2, AnonymousClass05K.A01, num);
    }

    public C72300P0r(Activity activity, UserSession userSession, Integer num) {
        this.A04 = num;
        this.A00 = activity;
        this.A02 = userSession;
        this.A01 = new N4O((CharSequence) AnonymousClass7TE.A16(activity, 2131961153), (CharSequence) activity.getString(2131961636), (CharSequence) activity.getString(2131961154), AnonymousClass05K.A01, (int) R.drawable.ig_illustrations_illo_lock_confirmation_refresh);
    }
}
