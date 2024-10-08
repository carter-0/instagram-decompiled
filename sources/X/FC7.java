package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;

public abstract class FC7 {
    public static final void A00(Activity activity, Context context, UserSession userSession) {
        0qQ.A0B(userSession, 2);
        DbW.A0W(activity, C343547qO.A00((RectF) null, EWD.DOGFOOD_ASSISTANT, true), userSession, TransparentModalActivity.class, "nametag").A0C(context);
    }

    public static final void A02(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, boolean z) {
        if (182.A06(DbS.A0J(userSession, 1), userSession, 36318101721061241L)) {
            Context applicationContext = fragmentActivity.getApplicationContext();
            1RH A00 = 1RH.A00();
            PyC pyC = new PyC(1US.A0O);
            pyC.A03 = AnonymousClass05K.A00;
            pyC.A02 = new C40565AeC(applicationContext, fragmentActivity, str, str2, z);
            A00.A03(userSession, new PyB(pyC));
        }
    }

    public static final void A01(FragmentActivity fragmentActivity, UserSession userSession) {
        if (182.A06(0Tu.A05, userSession, 36318101721061241L)) {
            Context applicationContext = fragmentActivity.getApplicationContext();
            1RH A00 = 1RH.A00();
            PyC pyC = new PyC(1US.A0O);
            pyC.A03 = AnonymousClass05K.A00;
            pyC.A02 = new AnonymousClass9PV(2, applicationContext, fragmentActivity);
            A00.A03(userSession, new PyB(pyC));
        }
    }
}
