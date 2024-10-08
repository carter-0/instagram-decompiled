package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.3KM  reason: invalid class name */
public final class AnonymousClass3KM extends AnonymousClass3KN {
    public final AnonymousClass4DH A00;
    public final UserSession A01;
    public final AnonymousClass4DU A02;
    public final AnonymousClass364 A03;

    public AnonymousClass3KM(AnonymousClass4DH r2, UserSession userSession, AnonymousClass4DU r4, AnonymousClass364 r5) {
        super(userSession, r5, r4, (String) null);
        this.A00 = r2;
        this.A01 = userSession;
        this.A02 = r4;
        this.A03 = r5;
    }

    public final void DhB(long j) {
        1Xj A06;
        User A2A;
        String str;
        super.DhB(j);
        UserSession userSession = this.A01;
        1Av A002 = 1Au.A00(userSession);
        0Tu r4 = 0Tu.A05;
        A002.A0u(182.A04(r4, userSession, 36877808976593038L));
        if (182.A06(r4, userSession, 36314859021929296L)) {
            1Xj A062 = this.A03.A03.A06();
            if (A062 != null && (A2A = A062.A2A(userSession)) != null) {
                ImageUrl A1Q = A062.A1Q();
                if (A1Q != null) {
                    AnonymousClass4DH r5 = this.A00;
                    Context requireContext = r5.requireContext();
                    if (C55172HdO.A00(userSession, A062, true)) {
                        0hq supportFragmentManager = r5.requireActivity().getSupportFragmentManager();
                        0qQ.A07(supportFragmentManager);
                        List A04 = supportFragmentManager.A0U.A04();
                        0qQ.A07(A04);
                        Fragment fragment = (Fragment) 00k.A0K(A04);
                        if (!(fragment == null || (str = fragment.mTag) == null || !str.equals(r5.mTag))) {
                            int i = 2131972781;
                            if (A062.A5G()) {
                                i = 2131972782;
                            }
                            String string = requireContext.getString(i, new Object[]{A2A.getUsername()});
                            0qQ.A0A(string);
                            C310336ap r1 = new C310336ap();
                            r1.A01 = 5000;
                            r1.A0C(C310346aq.BANNER);
                            r1.A0D = string;
                            r1.A01();
                            String string2 = requireContext.getString(2131970876);
                            0qQ.A07(string2);
                            r1.A0G = string2;
                            r1.A0A(new IVS(A062, A2A, this));
                            r1.A02 = r5.requireView().getHeight();
                            r1.A03();
                            r1.A09 = A1Q;
                            1xC.A01.A00(new AnonymousClass3GP(r1.A00()));
                        }
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                return;
            }
        }
        if (182.A06(r4, userSession, 36331111177012126L) && (A06 = this.A03.A03.A06()) != null) {
            Fragment fragment2 = this.A00;
            FragmentActivity activity = fragment2.getActivity();
            0hq parentFragmentManager = fragment2.getParentFragmentManager();
            AnonymousClass4DU r12 = this.A02;
            0gy A003 = AnonymousClass07i.A00(fragment2);
            String A004 = AnonymousClass000.A00(604);
            C46395DeI.A0C(activity, parentFragmentManager, A003, new FT1(activity), userSession, A06, r12, (AnonymousClass3W1) null, false, AnonymousClass05K.A00, (Runnable) null, A004, AnonymousClass000.A00(2935), false);
        }
    }
}
