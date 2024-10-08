package X;

import android.graphics.RectF;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.profilecard.domain.ProfileCardViewModel;

public final class HA3 extends C50366FaR {
    public final FragmentActivity A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final L3W A03;
    public final ProfileCardViewModel A04;

    public HA3(FragmentActivity fragmentActivity, AnonymousClass0iw r3, UserSession userSession, L3W l3w, ProfileCardViewModel profileCardViewModel) {
        AnonymousClass7TG.A0w(1, userSession, l3w, profileCardViewModel);
        this.A02 = userSession;
        this.A00 = fragmentActivity;
        this.A03 = l3w;
        this.A04 = profileCardViewModel;
        this.A01 = r3;
    }

    public final void DLb() {
        ProfileCardViewModel profileCardViewModel = this.A04;
        FragmentActivity fragmentActivity = this.A00;
        0qQ.A0B(fragmentActivity, 0);
        C48958Emw.A00(fragmentActivity, C48145EZn.PROFILE_CARD, profileCardViewModel.A0F, false, false);
    }

    public final void DAE() {
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putInt("header_res_key", 2131961017);
        C54105Gza gza = new C54105Gza();
        gza.setArguments(A0a);
        UserSession userSession = this.A02;
        boolean A06 = 182.A06(0Tu.A05, userSession, 36327426095856048L);
        ProfileCardViewModel profileCardViewModel = this.A04;
        AnonymousClass0iw r4 = this.A01;
        C58736Iwj iwj = new C58736Iwj(21, this, A06);
        C51973G9u.A1E(profileCardViewModel, userSession, r4);
        gza.A00 = new F0P(r4, userSession, profileCardViewModel, iwj, false, A06);
        C331127Pr A0W = DbS.A0W(userSession);
        A0W.A0k = true;
        A0W.A1O = true;
        A0W.A00().A02(this.A00, gza);
    }

    public final void Df4(RectF rectF, int i) {
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putInt("header_res_key", 2131952400);
        C54105Gza gza = new C54105Gza();
        gza.setArguments(A0a);
        ProfileCardViewModel profileCardViewModel = this.A04;
        UserSession userSession = this.A02;
        AnonymousClass0iw r4 = this.A01;
        G4S g4s = new G4S(this, 36);
        0qQ.A0B(profileCardViewModel, 0);
        AnonymousClass7TF.A1B(userSession, 1, r4);
        gza.A00 = new F0P(r4, userSession, profileCardViewModel, g4s, true, false);
        C331127Pr A0W = DbS.A0W(userSession);
        A0W.A0k = true;
        A0W.A1O = true;
        A0W.A00().A02(this.A00, gza);
    }
}
