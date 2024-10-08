package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;

public final class HK5 extends C52050GCw {
    public final Activity A00;
    public final UserSession A01;
    public final C52016GBn A02;

    public final void A0C(C267324bN r6, JOG jog, GBE gbe, GD6 gd6) {
        0qQ.A0B(gd6, 2);
        IUT iut = new IUT(r6, jog, gbe, gd6, this);
        C54115Gzk gzk = new C54115Gzk();
        gzk.A00 = iut;
        C56042Hrp hrp = this.A01;
        if (hrp != null) {
            hrp.A00((View) null, gzk, this.A00.getResources().getString(2131963353), true);
        }
    }

    public HK5(Activity activity, UserSession userSession, C52016GBn gBn) {
        this.A01 = userSession;
        this.A00 = activity;
        this.A02 = gBn;
    }
}
