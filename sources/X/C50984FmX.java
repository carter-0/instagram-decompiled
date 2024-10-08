package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.FmX  reason: case insensitive filesystem */
public final class C50984FmX implements C322776wO {
    public final /* synthetic */ C322746wL A00;

    public final void DBx() {
    }

    public final /* synthetic */ void DBz(C320156rr r1) {
    }

    public C50984FmX(C322746wL r1) {
        this.A00 = r1;
    }

    public final void DBy() {
        C322746wL r0 = this.A00;
        UserSession userSession = r0.A01;
        FragmentActivity fragmentActivity = r0.A00;
        DbS.A1X(fragmentActivity);
        F79.A01(fragmentActivity, userSession, "profile_tagged_tab_empty_state", false);
    }
}
