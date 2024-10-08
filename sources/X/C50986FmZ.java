package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Set;

/* renamed from: X.FmZ  reason: case insensitive filesystem */
public final class C50986FmZ implements C322776wO {
    public final /* synthetic */ C322756wM A00;
    public final /* synthetic */ User A01;

    public final /* synthetic */ void DBz(C320156rr r1) {
    }

    public C50986FmZ(C322756wM r1, User user) {
        this.A00 = r1;
        this.A01 = user;
    }

    public final void DBx() {
        C322756wM.A01(this.A00);
    }

    public final void DBy() {
        1Yy A012 = FC8.A01();
        C322756wM r0 = this.A00;
        FragmentActivity fragmentActivity = r0.A00;
        UserSession userSession = r0.A03;
        String id = this.A01.getId();
        Set set = C49280EsP.A00;
        A012.A04(fragmentActivity, userSession, (Boolean) null, (Boolean) null, id, "profile_tab");
    }
}
