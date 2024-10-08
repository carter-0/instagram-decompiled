package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class WOA implements X6L {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ FragmentActivity A02;
    public final /* synthetic */ AnonymousClass07Z A03;
    public final /* synthetic */ X7i A04;
    public final /* synthetic */ UserSession A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    public final void Doe(String str) {
        0qQ.A0B(str, 0);
        UserSession userSession = this.A05;
        FragmentActivity fragmentActivity = this.A02;
        AnonymousClass07Z r2 = this.A03;
        String str2 = this.A07;
        String str3 = this.A06;
        int i = this.A01;
        int i2 = this.A00;
        C19178WOk wOk = new C19178WOk(this.A04);
        C228602lw A0Q = DbW.A0Q(fragmentActivity, r2);
        C15625Ufr ufr = new C15625Ufr(10, fragmentActivity, wOk, userSession);
        String str4 = WGU.A00(userSession).A03;
        0qQ.A0B(str4, 6);
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        C13990Tnq.A1C(A0a, "ads/ads_manager/edit_budget_and_duration_v2/", str);
        JTO.A1W(A0a, str2);
        A0a.A0C(AnonymousClass000.A00(3626), i);
        A0a.A0C(AnonymousClass000.A00(3625), i2);
        A0a.A0G("flow_id", str4);
        A0a.A0G("boosted_id", str3);
        1OC A0S = DbU.A0S(A0a, UXC.class, C18166Vmg.class);
        A0S.A00 = ufr;
        A0Q.schedule(A0S);
    }

    public WOA(FragmentActivity fragmentActivity, AnonymousClass07Z r2, X7i x7i, UserSession userSession, String str, String str2, int i, int i2) {
        this.A05 = userSession;
        this.A02 = fragmentActivity;
        this.A03 = r2;
        this.A07 = str;
        this.A06 = str2;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = x7i;
    }

    public final void DED() {
        this.A04.DEI((String) null, "failed to obtain access token");
    }
}
