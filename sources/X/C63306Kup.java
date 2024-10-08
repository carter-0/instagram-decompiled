package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Kup  reason: case insensitive filesystem */
public abstract class C63306Kup {
    public static final void A00(Activity activity, C59725JVj jVj, UserSession userSession, C66493MTw mTw) {
        boolean A1U = AnonymousClass7TF.A1U(0, activity, userSession);
        K7T k7t = new K7T();
        k7t.A00 = mTw;
        Bundle A0F = JTP.A0F(userSession);
        A0F.putSerializable("TRENDING_PROMPTS_CAMERA_SURFACE_ARG", jVj);
        C331127Pr A0V = DbV.A0V(A0F, k7t, userSession);
        A0V.A0T = k7t;
        A0V.A03 = 0.85f;
        A0V.A1E = A1U;
        A0V.A06 = activity.getColor(R.color.background);
        A0V.A1O = false;
        DbS.A1S(A0V, A1U);
        A0V.A0x = A1U;
        DbU.A0y(activity, k7t, A0V);
    }
}
