package X;

import android.app.Activity;
import android.app.Dialog;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class LDA {
    public final UserSession A00;
    public final Activity A01;
    public final C323586xk A02;

    public LDA(Activity activity, UserSession userSession, C323586xk r4) {
        0qQ.A0B(userSession, 3);
        this.A01 = activity;
        this.A02 = r4;
        this.A00 = userSession;
    }

    public final void A00(C66520MUy mUy) {
        C323586xk r0 = this.A02;
        C66543MVx upsellContent = r0.getUpsellContent();
        String str = r0.entryPoint;
        Activity activity = this.A01;
        C358248ab A0X = DbS.A0X(activity);
        DbU.A16(activity, A0X, R.drawable.ig_illustrations_illo_account_linking_refresh);
        A0X.A05 = upsellContent.BCj(DbT.A05(activity));
        A0X.A0q(upsellContent.AqX(DbT.A05(activity)));
        A0X.A0r(true);
        A0X.A0s(true);
        A0X.A0c(new LUW(mUy, this, str, 3), upsellContent.BfX(DbT.A05(activity)));
        A0X.A0a(new LUW(mUy, this, str, 4), upsellContent.Bqe(DbT.A05(activity)));
        A0X.A0B(new LU0(this, mUy, str, 2));
        Dialog A022 = A0X.A02();
        if (!activity.isFinishing()) {
            AnonymousClass0fN.A00(A022);
            UserSession userSession = this.A00;
            0qQ.A0B(str, 1);
            FG9.A00(userSession, "upsell_screen_shown", str);
            new C46402DeP(userSession).A01(str);
        }
    }
}
