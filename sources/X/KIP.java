package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class KIP extends AnonymousClass0mG {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KIP(C65634LxB lxB, C64789Li5 li5, int i) {
        super(1000);
        this.A00 = i;
        this.A01 = lxB;
        this.A02 = li5;
    }

    public final void A00(View view) {
        int i;
        C65634LxB lxB = (C65634LxB) this.A01;
        boolean z = ((C64789Li5) this.A02).A01;
        UserSession userSession = lxB.A02;
        if (AnonymousClass8PU.A0B(userSession, z)) {
            0Tu r2 = 0Tu.A05;
            boolean A06 = 182.A06(r2, userSession, 36329066772643597L);
            FragmentActivity fragmentActivity = lxB.A00;
            C61438K7n k7n = lxB.A05;
            AnonymousClass818 r11 = AnonymousClass818.IG_STORY_SHARE_SHEET_SHARING_OPTIONS;
            EXN exn = EXN.A0N;
            String A012 = exn.A01();
            C363008it r4 = lxB.A06;
            FragmentActivity fragmentActivity2 = fragmentActivity;
            AnonymousClass818 r16 = r11;
            C61438K7n k7n2 = k7n;
            UserSession userSession2 = userSession;
            C363008it r19 = r4;
            LA0 la0 = new LA0(fragmentActivity2, r16, k7n2, userSession2, r19, A012);
            if (A06) {
                C62052KYa.A03.A02(fragmentActivity, k7n, r11, AnonymousClass819.BOTTOMSHEET_UNLINKED_USER_EVERGREEN_STORY, userSession, la0, C65647LxO.A00, (C66462MSq) null, (LBI) null, "", "", false);
                return;
            }
            String A013 = exn.A01();
            MIW miw = new MIW(k7n, 63);
            0qQ.A0B(A013, 4);
            C358248ab A0U = DbW.A0U(k7n);
            A0U.A09(2131961931);
            A0U.A0r(true);
            A0U.A0s(true);
            long A014 = 182.A01(r2, userSession, 36610541749278766L);
            if (A014 == 1) {
                i = 2131952260;
            } else {
                i = 2131956706;
                if (A014 == 2) {
                    i = 2131973560;
                }
            }
            A0U.A0I(new C71198OfK(fragmentActivity2, r16, k7n2, userSession2, r19, miw, A013, 0), i);
            A0U.A0C(LV0.A00(r11, userSession, 50));
            int i2 = 2131961886;
            if (27u.A00(userSession).A01()) {
                i2 = 2131961887;
            }
            A0U.A08(i2);
            DbT.A1V(A0U);
            C64071LLp.A00(r11, C368278sM.VIEW, userSession);
            return;
        }
        C61438K7n k7n3 = lxB.A05;
        Integer num = AnonymousClass05K.A0C;
        boolean A002 = C363018iu.A00(userSession);
        C363008it r1 = lxB.A06;
        new C64372Lao(AnonymousClass818.IG_STORY_SHARE_SHEET_SHARING_OPTIONS, k7n3, userSession, (C255773uh) null, lxB, num, A002, r1.A06()).A01();
        r1.A03 = C363018iu.A00(userSession);
        C65634LxB.A00(C368278sM.VIEW, lxB);
    }
}
