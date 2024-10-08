package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* renamed from: X.6vs  reason: invalid class name and case insensitive filesystem */
public final class C322466vs implements Runnable {
    public final /* synthetic */ C322456vr A00;

    public C322466vs(C322456vr r1) {
        this.A00 = r1;
    }

    public final void run() {
        2aV A01;
        2aD r1;
        C322456vr r7 = this.A00;
        AnonymousClass4DH r4 = r7.A04;
        if (r4.isAdded()) {
            UserSession userSession = r7.A05;
            if (!AnonymousClass3EM.A03()) {
                C322456vr.A00(userSession, r7, 1);
                C46400DeN.A04(userSession, "profile", AnonymousClass000.A00(1610));
                FragmentActivity requireActivity = r4.requireActivity();
                String str = userSession.A05;
                0qQ.A0B(str, 0);
                Bundle bundle = new Bundle();
                bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", str);
                bundle.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "profile");
                bundle.putBoolean("show_add_account_button", true);
                C331127Pr r12 = new C331127Pr(userSession);
                r12.A0V = new C40652AgS(r7);
                C331157Pu A002 = r12.A00();
                E6S e6s = new E6S();
                e6s.setArguments(bundle);
                A002.A02(requireActivity, e6s);
                C46400DeN.A06(userSession);
                A01 = 2aN.A00(userSession).A01();
                r1 = 2aD.A0p;
            } else if (!C46399DeM.A06()) {
                C322456vr.A00(userSession, r7, 1);
                C46399DeM.A02(r4.requireContext(), r4, C46398DeL.A09, userSession, AnonymousClass05K.A01);
                A01 = 2aN.A00(userSession).A01();
                r1 = 2aD.A0R;
            }
            2aX r42 = new 2aX(r1, r7.A00);
            AnonymousClass2g1 r2 = AnonymousClass2g1.BOTTOM_SHEET;
            0qQ.A0B(r2, 0);
            A01.A03(new C239993Jd(C226252fx.NUMBERED, r2, (C71062aE) null, (Set) null), r42, false);
        }
        UserSession userSession2 = r7.A05;
        List<User> BO1 = AnonymousClass0BO.A00(userSession2).BO1(AnonymousClass0t1.A01.A01(userSession2));
        HashMap hashMap = new HashMap();
        int i = 0;
        for (User user : BO1) {
            int A02 = user.A02();
            i += A02;
            hashMap.put(user.getId(), Integer.toString(A02));
        }
        2aT A003 = 2aN.A00(userSession2).A00();
        2aX r22 = new 2aX(2aD.A07, i);
        A003.A06(C226252fx.NUMBERED, AnonymousClass2g1.ACCOUNT_SWITCHER, r22, hashMap);
    }
}
