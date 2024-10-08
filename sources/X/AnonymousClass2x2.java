package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.2x2  reason: invalid class name */
public final class AnonymousClass2x2 implements 27S {
    public final /* synthetic */ C234042wt A00;

    public AnonymousClass2x2(C234042wt r1) {
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
        int A03 = AnonymousClass0fD.A03(-1271897043);
        C240293Ki r1 = (C240293Ki) obj;
        int A032 = AnonymousClass0fD.A03(-914173978);
        0qQ.A0B(r1, 0);
        1Xj r8 = r1.A00;
        C234042wt r5 = this.A00;
        AnonymousClass4DU r9 = r5.A0S;
        UserSession userSession = r5.A0B;
        int i = -1;
        if (r8.A5D()) {
            i = 0;
        }
        C233822wX.A0Q(userSession, r8, r9, (C249763kK) null, (Integer) null, (Integer) null, "number_of_mutual_followers", i);
        Fragment fragment = r5.A07;
        I6Q.A00(fragment, userSession, r8);
        C254523sc A04 = C254513sb.A04(r8, r9, "gesture");
        A04.A0G(userSession, r8);
        A04.A0G(userSession, r8);
        A04.A7M = AnonymousClass000.A00(1829);
        int i2 = -1;
        if (r8.A5D()) {
            i2 = 0;
        }
        C233822wX.A0E(userSession, A04, r8, r9, i2);
        C234062wv.A00(fragment.getActivity(), r9, userSession, r8, r5.A00, "media_followers");
        AnonymousClass0fD.A0A(-168665578, A032);
        AnonymousClass0fD.A0A(1681642853, A03);
    }
}
