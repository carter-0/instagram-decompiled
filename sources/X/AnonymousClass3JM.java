package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.3JM  reason: invalid class name */
public final class AnonymousClass3JM implements View.OnLongClickListener {
    public final /* synthetic */ AnonymousClass354 A00;

    public AnonymousClass3JM(AnonymousClass354 r1) {
        this.A00 = r1;
    }

    public final boolean onLongClick(View view) {
        FragmentActivity activity;
        AnonymousClass354 r0 = this.A00;
        C227802jw A002 = AnonymousClass354.A00(r0);
        if (A002 == null || (activity = A002.getActivity()) == null) {
            return true;
        }
        UserSession userSession = r0.A01;
        if (AnonymousClass3EM.A03()) {
            new Handler(Looper.getMainLooper()).post(new C51372Ft4(A002, userSession));
            return true;
        }
        C46400DeN.A04(userSession, "long_press_tab_bar", AnonymousClass000.A00(1610));
        AnonymousClass2S0.A01.A03();
        String str = userSession.A05;
        0qQ.A0B(str, 0);
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", str);
        bundle.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "long_press_tab_bar");
        bundle.putBoolean(C273654mx.A00(93), true);
        C331157Pu A003 = new C331127Pr(userSession).A00();
        E6S e6s = new E6S();
        e6s.setArguments(bundle);
        A003.A02(activity, e6s);
        C46400DeN.A06(userSession);
        return true;
    }
}
