package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;

public final class IU6 implements C242813Wa {
    public C56008HrG A00;
    public final Fragment A01;
    public final 0hq A02;
    public final UserSession A03;
    public final AnonymousClass4DU A04;

    public final void CnN(View view, String str) {
    }

    public final void Cna(View view, String str) {
    }

    public final void CuN(1Xj r1, AnonymousClass3W1 r2, Integer num, String str, boolean z) {
    }

    public final void Cx1(1Xj r1) {
    }

    public final void Cy5(AnonymousClass3ZH r1, AnonymousClass3W1 r2) {
    }

    public final void Cy7(1Xj r1, String str) {
    }

    public final void D2C(1Xj r1, AnonymousClass3W1 r2, User user, int i) {
    }

    public final void D2D(1Xj r1, AnonymousClass3W1 r2) {
    }

    public final void D2E(User user) {
    }

    public final void D2I(1Xj r1) {
    }

    public final void D2J(1Xj r1, AnonymousClass3W1 r2, int i) {
    }

    public final void D2L(1Xj r1) {
    }

    public final void D2O(1Xj r1, AnonymousClass3W1 r2, int i, boolean z) {
    }

    public final void D2P(1Xj r1, AnonymousClass3W1 r2, int i, boolean z) {
    }

    public final void D2U(1Xj r1, AnonymousClass3W1 r2) {
    }

    public final void D2Z(1Xj r1, AnonymousClass3W1 r2) {
    }

    public final void D2c(1Xj r1) {
    }

    public final void D2f(1Xj r1, AnonymousClass3W1 r2, Hashtag hashtag, int i) {
    }

    public final void D2h(1Xj r1) {
    }

    public final void D2k(1Xj r5) {
        0qQ.A0B(r5, 0);
        FragmentActivity requireActivity = this.A01.requireActivity();
        2AS r2 = AnonymousClass2AV.A00;
        if (r2 == null) {
            return;
        }
        if (r5.A2M() == AnonymousClass05K.A0C) {
            r2.A03(requireActivity, r5, this.A04);
        } else if (r5.A2M() == AnonymousClass05K.A01) {
            r2.A02(requireActivity, r5, this.A04);
        }
    }

    public final void D2l(String str) {
    }

    public final void D2m(1Xj r1, AnonymousClass3W1 r2, int i) {
    }

    public final void D2n(1Xj r1, AnonymousClass3W1 r2) {
    }

    public final void D2q(1Xj r1, AnonymousClass3W1 r2, String str) {
    }

    public final void D2r() {
    }

    public final void D2w(1Xj r1, AnonymousClass3W1 r2, Reel reel, AnonymousClass3N3 r4) {
    }

    public final void D2z(1Xj r1, AnonymousClass3W1 r2, Reel reel, AnonymousClass3N3 r4) {
    }

    public final void D30(1Xj r1) {
    }

    public final void D3B(1Xj r1, AnonymousClass3W1 r2, int i) {
    }

    public final void D3C(1Xj r1, AnonymousClass3W1 r2) {
    }

    public final void D3D(1Xj r1, AnonymousClass3W1 r2, boolean z) {
    }

    public final void D3I(1Xj r1, AnonymousClass3W1 r2, boolean z) {
    }

    public final void D3L(User user) {
    }

    public final void D3M(1Xj r1, AnonymousClass3W1 r2, int i) {
    }

    public final void D3N(1Xj r1) {
    }

    public final void D3b(AnonymousClass8ZN r1, C67231sQ r2, 1Xj r3, AnonymousClass3W1 r4) {
    }

    public final View.OnTouchListener D3c(1Xj r2) {
        return null;
    }

    public final void D3d(1Xj r1, boolean z) {
    }

    public final void D3x(1Xj r1) {
    }

    public final void D44(1Xj r1) {
    }

    public final void D4B(String str) {
    }

    public final void D4L(1Xj r1) {
    }

    public final void DQd(View view, 1Xj r2) {
    }

    public final void DV6(String str) {
    }

    public final void DVd(1Xj r1) {
    }

    public final void DVe(1Xj r1, AnonymousClass3W1 r2) {
    }

    public final void DbT(1Xj r1) {
    }

    public final View.OnTouchListener Dsc(1Xj r2, String str, String str2) {
        return null;
    }

    public final View.OnTouchListener Dsd(1Xj r2, String str, String str2) {
        return null;
    }

    public final View.OnTouchListener Dsk(1Xj r2, String str, String str2) {
        return null;
    }

    public final void Dtz(1Xj r1) {
    }

    private final void A00(1Xj r15, AnonymousClass3W1 r16, int i) {
        UserSession userSession = this.A03;
        AnonymousClass4DU r8 = this.A04;
        AnonymousClass3W1 r3 = r16;
        int i2 = r3.A03;
        Integer valueOf = Integer.valueOf(i);
        C56008HrG hrG = this.A00;
        0qQ.A0A(hrG);
        1Xj r7 = r15;
        C233822wX.A0Q(userSession, r7, r8, (C249763kK) null, valueOf, Integer.valueOf(hrG.A09.A0N.getCurrentScans().get()), "profile_button", i2);
        C271794jb r5 = new C271794jb(userSession, r15);
        r5.A00 = r3.A03;
        User A2A = r15.A2A(userSession);
        if (A2A != null) {
            C233822wX.A0K(userSession, r5, HLF.BRAND, r7, r8, (C249763kK) null, Integer.valueOf(r3.A03), "peek", A2A.A2Q());
            C309516Yo A0H = DbW.A0H(this.A01, userSession);
            1a1 A022 = C46447Df9.A02();
            User A2A2 = r15.A2A(userSession);
            if (A2A2 != null) {
                A0H.A0B((Bundle) null, A022.A02(userSession, C46474Dfc.A01(userSession, A2A2.getId(), "peek", r8.getModuleName())));
                A0H.A0B = r8.getModuleName();
                A0H.A04();
                return;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public final C2360732i BD7() {
        return IU3.A00;
    }

    public IU6(Fragment fragment, 0hq r2, UserSession userSession, AnonymousClass4DU r4) {
        AnonymousClass7TG.A1P(userSession, r2);
        this.A03 = userSession;
        this.A01 = fragment;
        this.A02 = r2;
        this.A04 = r4;
    }

    public final void D2u(1Xj r1, AnonymousClass3W1 r2, Boolean bool, int i, boolean z) {
        AnonymousClass7TG.A1N(r1, r2);
        A00(r1, r2, i);
    }

    public final void D3K(1Xj r1, AnonymousClass3W1 r2, String str, int i, boolean z) {
        AnonymousClass7TG.A1N(r1, r2);
        A00(r1, r2, i);
    }
}
