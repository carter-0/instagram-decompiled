package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.friendmap.view.fragment.FriendMapPresenceReplyFragment$PresenceReplyLaunchConfig;

/* renamed from: X.O0s  reason: case insensitive filesystem */
public abstract class C70288O0s {
    public static final void A00(Activity activity, UserSession userSession, Integer num, String str, String str2, C62320sa r14, 0sP r15) {
        0qQ.A0B(userSession, 1);
        FriendMapPresenceReplyFragment$PresenceReplyLaunchConfig friendMapPresenceReplyFragment$PresenceReplyLaunchConfig = new FriendMapPresenceReplyFragment$PresenceReplyLaunchConfig();
        friendMapPresenceReplyFragment$PresenceReplyLaunchConfig.A03 = str;
        friendMapPresenceReplyFragment$PresenceReplyLaunchConfig.A02 = str2;
        friendMapPresenceReplyFragment$PresenceReplyLaunchConfig.A04 = r14;
        friendMapPresenceReplyFragment$PresenceReplyLaunchConfig.A01 = num;
        friendMapPresenceReplyFragment$PresenceReplyLaunchConfig.A00 = new PGS(r15);
        NKO nko = new NKO();
        Bundle A0B = DbY.A0B("presence_launch_config", friendMapPresenceReplyFragment$PresenceReplyLaunchConfig);
        C227642jf.A03(A0B, userSession);
        nko.setArguments(A0B);
        Activity activity2 = activity;
        C71054OaW.A00(activity, new C58699Iw8(8, activity2, num, userSession, nko), true);
    }
}
