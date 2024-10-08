package X;

import android.content.Context;
import android.content.Intent;
import com.instagram.common.session.UserSession;
import com.instagram.model.rtc.RtcEnterCallArgs;
import com.instagram.rtc.activity.RtcCallIntentHandlerActivity;

/* renamed from: X.O1x  reason: case insensitive filesystem */
public abstract class C70319O1x {
    public static final Intent A00(Context context, UserSession userSession, RtcEnterCallArgs rtcEnterCallArgs) {
        0qQ.A0B(context, 0);
        Intent A0A = C66580MXl.A0A(context, RtcCallIntentHandlerActivity.class);
        A0A.setAction("rtc_call_activity_intent_action_create_or_join_call");
        A0A.setData(O1O.A00("video_call_incoming", rtcEnterCallArgs.Bxh().A02.A02));
        A0A.putExtra("IgSessionManager.SESSION_TOKEN_KEY", userSession.A05);
        A0A.putExtra("rtc_call_activity_arguments_key_enter_call_args", rtcEnterCallArgs);
        return A0A;
    }
}
