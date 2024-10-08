package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;

public final class PHY implements C66491MTu {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C270194gL A01;
    public final /* synthetic */ Reel A02;
    public final /* synthetic */ User A03;
    public final /* synthetic */ C239413Gj A04;

    public final void D1x(Context context) {
        Context context2 = context;
        0qQ.A0B(context2, 0);
        UserSession userSession = this.A00;
        if (ORX.A01(userSession)) {
            C239413Gj r10 = this.A04;
            ORX.A00(context2, userSession, new C72990PRz(1, this.A01, this.A03, r10, this.A02));
            return;
        }
        Integer num = AnonymousClass05K.A0C;
        if (!C70349O3b.A00(userSession, num)) {
            C239413Gj r5 = this.A04;
            String str = this.A01.A0e;
            str.getClass();
            Reel reel = this.A02;
            C239413Gj.A06(r5, str, JTP.A0r(reel), this.A03.getId());
            C239413Gj.A01(reel, AnonymousClass3BQ.IN_APP_NOTIFICATION, r5, (String) null, (String) null);
            return;
        }
        1Av A002 = 1Au.A00(userSession);
        int i = A002.A01.getInt("zero_rating_live_nux_count", 0);
        1R7 C82 = AnonymousClass1Qz.A00(userSession).C82();
        C239413Gj r9 = this.A04;
        C270194gL r12 = this.A01;
        Reel reel2 = this.A02;
        C49256Erz.A00(context2, new C50107FOx(i, 5, (Object) reel2, (Object) r9, (Object) A002, (Object) this.A03, (Object) r12), C82, C239413Gj.A08, reel2.A07(), false, num);
    }

    public PHY(UserSession userSession, C270194gL r2, Reel reel, User user, C239413Gj r5) {
        this.A00 = userSession;
        this.A04 = r5;
        this.A01 = r2;
        this.A02 = reel;
        this.A03 = user;
    }

    public final void onDismiss() {
        C239403Gi.A02(this.A00, this.A03.getId());
    }
}
