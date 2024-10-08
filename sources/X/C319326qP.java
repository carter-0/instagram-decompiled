package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.user.model.User;
import java.util.Set;

/* renamed from: X.6qP  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C319326qP implements View.OnClickListener {
    public final /* synthetic */ C323366xN A00;

    public /* synthetic */ C319326qP(C323366xN r1) {
        this.A00 = r1;
    }

    public final void onClick(View view) {
        String str;
        C323346xL r5 = this.A00.A0H;
        UserDetailFragment userDetailFragment = r5.A07;
        if (userDetailFragment.A15()) {
            C323256xC r0 = r5.A05;
            int A002 = C323256xC.A00(r0);
            if (A002 > 0) {
                UserSession userSession = r0.A09;
                2aT A003 = 2aN.A00(userSession).A00();
                2aX r1 = new 2aX(2aD.A0m, A002);
                AnonymousClass2g1 r02 = AnonymousClass2g1.PROFILE_PAGE;
                C226252fx r8 = C226252fx.DOT;
                A003.A01(r8, r02, r1);
                2aV A01 = 2aN.A00(userSession).A01();
                2aX r4 = new 2aX(2aD.A0b, A002);
                AnonymousClass2g1 r12 = AnonymousClass2g1.TOP_NAVIGATION_BAR;
                0qQ.A0B(r12, 0);
                A01.A03(new C239993Jd(r8, r12, (C71062aE) null, (Set) null), r4, false);
                1Av A004 = 1Au.A00(userSession);
                A004.A1p.Epx(A004, true, 1Av.A8a[451]);
            }
            UserSession userSession2 = r5.A02;
            C319986rY r2 = C319986rY.SELF;
            User user = r5.A08.A03;
            if (user != null) {
                str = user.getId();
            } else {
                str = null;
            }
            C319976rX.A05(userDetailFragment, userSession2, r2, "profile_creation_sheet_tap", str);
            new C49697F2i(r5.A00, r5.A03, userSession2).A00();
        }
    }
}
