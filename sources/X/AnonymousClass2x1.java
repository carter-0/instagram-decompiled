package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.2x1  reason: invalid class name */
public final class AnonymousClass2x1 implements 27S {
    public final /* synthetic */ C234042wt A00;

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        String str;
        int A03 = AnonymousClass0fD.A03(-606921322);
        C240283Kh r1 = (C240283Kh) obj;
        int A032 = AnonymousClass0fD.A03(39220146);
        0qQ.A0B(r1, 0);
        C234042wt r4 = this.A00;
        1Xj r6 = r1.A00;
        AnonymousClass4DU r7 = r4.A0S;
        UserSession userSession = r4.A0B;
        int i = -1;
        if (r6.A5D()) {
            i = 0;
        }
        C233822wX.A0Q(userSession, r6, r7, (C249763kK) null, (Integer) null, (Integer) null, "number_of_likes", i);
        User CCd = r6.A0C.CCd();
        if (CCd != null) {
            str = CCd.getId();
        } else {
            str = null;
        }
        AnonymousClass59S.A02(userSession, str, "number_of_likes_tapped");
        Fragment fragment = r4.A07;
        I6Q.A00(fragment, userSession, r6);
        C234062wv.A00(fragment.getActivity(), r7, userSession, r6, r4.A00, AnonymousClass000.A00(3573));
        AnonymousClass0fD.A0A(761124674, A032);
        AnonymousClass0fD.A0A(1363862846, A03);
    }

    public AnonymousClass2x1(C234042wt r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ boolean A72(Object obj) {
        C234042wt r1 = this.A00;
        if (C234042wt.A02(r1) || C234042wt.A03(r1)) {
            return true;
        }
        return false;
    }
}
