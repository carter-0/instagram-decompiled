package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.nux.impl.dynamicflow.onboarding.OnboardingActivity;

/* renamed from: X.EoO  reason: case insensitive filesystem */
public abstract class C49044EoO {
    public static final void A00(UserSession userSession, Context context, boolean z) {
        0qQ.A0B(userSession, 1);
        Intent intent = DbS.A09().setClass(context, OnboardingActivity.class);
        0qQ.A07(intent);
        intent.putExtra("IS_SIGN_UP_FLOW", true);
        intent.putExtra("IgSessionManager.SESSION_TOKEN_KEY", userSession.A05);
        0kR.A0B(context, intent);
        if (z && (context instanceof Activity)) {
            ((Activity) context).overridePendingTransition(R.anim.cds_slide_in_right, R.anim.cds_slide_out_left);
        }
    }
}
