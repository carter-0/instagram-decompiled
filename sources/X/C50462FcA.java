package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.FcA  reason: case insensitive filesystem */
public final class C50462FcA implements C51873G5k {
    public final /* synthetic */ AnonymousClass36O A00;

    public C50462FcA(AnonymousClass36O r1) {
        this.A00 = r1;
    }

    public final void D5S() {
        boolean z = AnonymousClass36O.A0G;
        AnonymousClass36O r0 = this.A00;
        UserSession userSession = r0.A04;
        Fragment fragment = r0.A01;
        User user = r0.A05;
        0hq r3 = r0.A02;
        AnonymousClass57Y r4 = r0.A03;
        0sP r7 = r0.A06;
        EDH edh = new EDH(fragment, r3, r4, userSession, user, r7);
        if (r7 != null) {
            r7.invoke(AnonymousClass7TE.A0v());
        }
        1OC A002 = C49736F4b.A00(userSession);
        A002.A00 = edh;
        Dbb.A15(fragment, A002);
    }
}
