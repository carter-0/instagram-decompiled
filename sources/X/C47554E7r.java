package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.E7r  reason: case insensitive filesystem */
public final class C47554E7r extends C361158fl {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;

    public final void A04(C268654dm r1) {
    }

    public C47554E7r(UserSession userSession, FragmentActivity fragmentActivity) {
        this.A01 = userSession;
        this.A00 = fragmentActivity;
    }

    public final /* bridge */ /* synthetic */ void A05(Object obj) {
        C46620Di0 A0Q = DbV.A0Q(obj);
        UserSession userSession = this.A01;
        C48382Edd.A00(DbY.A0L(this.A00, userSession, "UserBlockPluginImpl"), A0Q);
        0xY A0c = DbV.A0c(userSession, 2B0.A01);
        A0c.E5T("HAS_SEEN_SUPERVISION_UPSELL", true);
        A0c.apply();
    }
}
