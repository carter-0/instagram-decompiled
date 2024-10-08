package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.2xC  reason: invalid class name and case insensitive filesystem */
public final class C234162xC implements 27S {
    public final /* synthetic */ C234042wt A00;

    public C234162xC(C234042wt r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ boolean A72(Object obj) {
        C234042wt r1 = this.A00;
        if (C234042wt.A02(r1) || C234042wt.A03(r1)) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = AnonymousClass0fD.A03(1883805922);
        C240353Ko r4 = (C240353Ko) obj;
        int A032 = AnonymousClass0fD.A03(-1314669917);
        0qQ.A0B(r4, 0);
        C234042wt r0 = this.A00;
        UserSession userSession = r0.A0B;
        Fragment fragment = r0.A07;
        FragmentActivity requireActivity = fragment.requireActivity();
        AnonymousClass4DU r11 = r0.A0S;
        String moduleName = r11.getModuleName();
        1Xj r13 = r4.A00;
        String str = null;
        String Ad2 = r13.A0C.Ad2();
        String A002 = AnonymousClass000.A00(3125);
        C49965FGy.A05(requireActivity, userSession, moduleName, Ad2, A002, false);
        User A2A = r13.A2A(userSession);
        if (A2A != null) {
            str = A2A.getId();
        }
        C321406u6.A01(r11, userSession, r13, A002, str, 0oI.A0A(fragment.requireActivity()));
        AnonymousClass0fD.A0A(786252344, A032);
        AnonymousClass0fD.A0A(-669557004, A03);
    }
}
