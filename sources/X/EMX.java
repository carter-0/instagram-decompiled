package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public final class EMX extends C47907EMb {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ C49557Exs A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EMX(Fragment fragment, FragmentActivity fragmentActivity, AnonymousClass0iw r11, AnonymousClass0iw r12, AnonymousClass0aP r13, G8H g8h, C49557Exs exs, C46634DiE diE, String str, String str2) {
        super(fragment, r11, r13, g8h, diE, str, str2);
        this.A02 = exs;
        this.A01 = r12;
        this.A00 = fragmentActivity;
    }

    public final void A03(UserSession userSession, User user) {
        UserSession userSession2 = userSession;
        if (this.A02.A02) {
            C319606qt A012 = C319606qt.A01(userSession);
            String id = user.getId();
            A012.A09(this.A00, this.A01, userSession2, AnonymousClass05K.A05, id, true);
        }
        super.A03(userSession, user);
    }
}
