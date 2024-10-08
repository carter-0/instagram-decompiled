package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.securityalert.data.SecurityAlertRepository;

public final class NMv extends C228042kh {
    public final FragmentActivity A00;
    public final UserSession A01;

    public NMv(FragmentActivity fragmentActivity, UserSession userSession) {
        0qQ.A0B(userSession, 2);
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        return new C60091JfX(this.A00, SecurityAlertRepository.A04.A00(this.A01));
    }
}
