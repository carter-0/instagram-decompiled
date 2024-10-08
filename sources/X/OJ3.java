package X;

import android.app.Activity;
import android.app.KeyguardManager;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;
import com.instagram.common.session.UserSession;
import com.instagram.rtc.activity.RtcCallActivity;

public final class OJ3 {
    public final void A00(Context context, UserSession userSession, Long l) {
        Intent A01;
        Class<RtcCallActivity> cls = RtcCallActivity.class;
        Intent A0A = C66580MXl.A0A(context, cls);
        A0A.putExtra("IgSessionManager.SESSION_TOKEN_KEY", userSession.A05);
        A0A.setExtrasClassLoader(cls.getClassLoader());
        A0A.addFlags(75563008);
        if (0mE.A00(context, Activity.class) == null) {
            A0A.addFlags(268435456);
        }
        A0A.putExtra("rtc_call_activity_arguments_key_notification_trace_id", l);
        if (!((KeyguardManager) C66582MXn.A0o(context)).isKeyguardLocked() && 14i.A08()) {
            0Tu r2 = 0Tu.A05;
            if (182.A06(r2, userSession, 36328693110488601L)) {
                if (182.A06(r2, userSession, 36328693110423064L)) {
                    A01 = F5W.A00(context, "all", "direct-inbox", (String) null, 335544320);
                } else {
                    A01 = AnonymousClass14B.A03.A00().A01(context);
                }
                0qQ.A0A(A01);
                TaskStackBuilder.create(context).addNextIntentWithParentStack(A01).addNextIntent(A0A).startActivities();
                return;
            }
        }
        0kR.A0B(context, A0A);
    }
}
