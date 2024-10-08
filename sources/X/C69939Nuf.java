package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.Nuf  reason: case insensitive filesystem */
public abstract class C69939Nuf {
    public static final C68473NJl A00(UserSession userSession, C254793t3 r4, String str) {
        0qQ.A0B(userSession, 0);
        C68473NJl nJl = new C68473NJl();
        Bundle A09 = DbY.A09(userSession);
        OXL.A02(A09, r4, "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_ID");
        A09.putString("channel_control_entrypoint", str);
        nJl.setArguments(A09);
        return nJl;
    }
}
