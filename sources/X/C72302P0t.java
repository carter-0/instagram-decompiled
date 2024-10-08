package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* renamed from: X.P0t  reason: case insensitive filesystem */
public final class C72302P0t implements C74444Puz {
    public final Activity A00;
    public final UserSession A01;
    public final AnonymousClass0eM A02;
    public final C69293Nit A03 = C69293Nit.V3_SELL_BANNER;
    public final Integer A04;
    public final AnonymousClass0eM A05;

    public final N4O BTX() {
        return (N4O) this.A05.getValue();
    }

    public final void D9Q() {
        UserSession userSession = this.A01;
        C69899Nu1.A00(userSession).A0I(this.A03);
        Integer num = this.A04;
        if (num != null) {
            C67458MoD.A03(new C67458MoD(userSession), AnonymousClass05K.A0N, num);
        }
    }

    public final void DZK() {
        C69358Njy njy;
        UserSession userSession = this.A01;
        C69899Nu1.A00(userSession).A0H(this.A03);
        Integer num = this.A04;
        if (num != null) {
            C67458MoD.A03(new C67458MoD(userSession), AnonymousClass05K.A0N, num);
        }
        AnonymousClass0eM r1 = this.A02;
        if (!C66582MXn.A1X(r1) || !((AnonymousClass65E) r1.getValue()).A02(this.A00)) {
            njy = C69358Njy.CREATE_PIN_SELL_WARN_NUX_V3;
        } else {
            njy = C69358Njy.GDRIVE_OPTIN_SOFT_BLOCK;
        }
        OW5 A002 = C69900Nu2.A00(userSession);
        Activity activity = this.A00;
        Integer num2 = AnonymousClass05K.A03;
        A002.A01(activity, AnonymousClass7TE.A0a(), njy, C69271NiX.BOTTOM_SHEET, num2, AnonymousClass05K.A0N, num);
    }

    public C72302P0t(Activity activity, UserSession userSession, Integer num) {
        this.A04 = num;
        this.A00 = activity;
        this.A01 = userSession;
        0eO r1 = 0eO.A02;
        this.A02 = C73904Plf.A00(this, r1, 1);
        this.A05 = C73904Plf.A00(this, r1, 2);
    }
}
