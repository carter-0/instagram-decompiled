package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.2x3  reason: invalid class name */
public final class AnonymousClass2x3 implements 27S {
    public final /* synthetic */ C234042wt A00;

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = AnonymousClass0fD.A03(590582993);
        C240273Kg r3 = (C240273Kg) obj;
        int A032 = AnonymousClass0fD.A03(560188679);
        0qQ.A0B(r3, 0);
        1Xj r5 = r3.A00;
        C234042wt r32 = this.A00;
        AnonymousClass4DU r6 = r32.A0S;
        String A002 = AnonymousClass000.A00(3683);
        UserSession userSession = r32.A0B;
        int i = -1;
        if (r5.A5D()) {
            i = 0;
        }
        C233822wX.A0Q(userSession, r5, r6, (C249763kK) null, (Integer) null, (Integer) null, A002, i);
        Fragment fragment = r32.A07;
        I6Q.A00(fragment, userSession, r5);
        C234062wv.A00(fragment.getActivity(), r6, userSession, r5, r32.A00, AnonymousClass000.A00(3584));
        AnonymousClass0fD.A0A(-652823306, A032);
        AnonymousClass0fD.A0A(-41683691, A03);
    }

    public AnonymousClass2x3(C234042wt r1) {
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
