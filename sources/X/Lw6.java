package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class Lw6 implements G6I {
    public final /* synthetic */ C310236ae A00;

    public Lw6(C310236ae r1) {
        this.A00 = r1;
    }

    public final void DZO() {
        C310236ae r0 = this.A00;
        UserSession userSession = r0.A09;
        FragmentActivity fragmentActivity = r0.A07;
        String A002 = C273654mx.A00(79);
        C52480GUi gUi = C63556Kz5.A01;
        0qQ.A0B(userSession, 0);
        gUi.A05(fragmentActivity, userSession, "ig_stories_consumption", A002);
    }
}
