package X;

import android.app.Application;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.fanclub.consideration.FanClubConsiderationRepository;
import com.instagram.fanclub.consideration.FanClubConsiderationViewModel;

public final class KEI extends C228042kh {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public KEI(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, boolean z) {
        0qQ.A0B(userSession, 2);
        this.A00 = fragmentActivity;
        this.A01 = userSession;
        this.A03 = str;
        this.A04 = z;
        this.A02 = str2;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        FragmentActivity fragmentActivity = this.A00;
        Application A0A = JTP.A0A(fragmentActivity);
        UserSession userSession = this.A01;
        String str = this.A02;
        String str2 = this.A03;
        boolean z = this.A04;
        FanClubConsiderationRepository fanClubConsiderationRepository = new FanClubConsiderationRepository(userSession);
        0qQ.A0B(userSession, 0);
        return new FanClubConsiderationViewModel(A0A, userSession, fanClubConsiderationRepository, (C64828Lio) userSession.A01(C64828Lio.class, new C58187Inr(2, userSession, fragmentActivity)), C314986jA.A00(userSession), str, str2, z);
    }
}
