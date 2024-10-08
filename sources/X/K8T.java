package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class K8T extends C361158fl {
    public final int A00;
    public final Object A01;

    public K8T(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void A04(C268654dm r4) {
        switch (this.A00) {
            case 0:
                0qQ.A0B(r4, 0);
                1K2 r1 = (1K2) this.A01;
                Throwable A012 = r4.A01();
                if (A012 == null) {
                    A012 = AnonymousClass7TE.A15("Network error in InstagramConsentBloksActionLauncher");
                }
                r1.setException(A012);
                return;
            case 1:
                return;
            default:
                C59689JTv.A0F(((C65315LrE) this.A01).A00.requireActivity(), "add_yours_participation_screen_error_loading", 2131952438);
                return;
        }
    }

    public final /* bridge */ /* synthetic */ void A05(Object obj) {
        C46620Di0 di0;
        UserSession userSession;
        FragmentActivity fragmentActivity;
        AnonymousClass0iw r0;
        switch (this.A00) {
            case 0:
                0qQ.A0B(obj, 0);
                ((1K2) this.A01).set(obj);
                return;
            case 1:
                di0 = (C46620Di0) obj;
                0qQ.A0B(di0, 0);
                C64963Ll2 ll2 = (C64963Ll2) this.A01;
                FragmentActivity fragmentActivity2 = ll2.A03;
                if (fragmentActivity2 instanceof FragmentActivity) {
                    userSession = ll2.A06;
                    fragmentActivity = fragmentActivity2;
                    r0 = ll2.A05;
                    break;
                } else {
                    return;
                }
            default:
                di0 = (C46620Di0) obj;
                0qQ.A0B(di0, 0);
                C65315LrE lrE = (C65315LrE) this.A01;
                userSession = lrE.A01;
                fragmentActivity = lrE.A00.requireActivity();
                r0 = lrE.A02;
                break;
        }
        C48382Edd.A00(C229382nI.A04(fragmentActivity, r0, userSession), di0);
    }
}
