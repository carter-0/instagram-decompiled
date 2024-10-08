package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.ELn  reason: case insensitive filesystem */
public final class C47893ELn extends AnonymousClass2xK {
    public final /* synthetic */ 2aC A00;

    public C47893ELn(2aC r1) {
        this.A00 = r1;
    }

    public final void DsC(AnonymousClass5Gv r2) {
        this.A00.A07();
    }

    public final void DsE(AnonymousClass5Gv r6) {
        C62880wX r4 = C61170le.A00;
        0xa A0g = DbT.A0g(r4);
        AnonymousClass7TG.A1L(A0g.AR4(), A0g, "preference_double_tap_profile_tab_tooltip_impressions", 0);
        0xm A002 = AnonymousClass0xl.A00(r4);
        long currentTimeMillis = System.currentTimeMillis();
        0xY A0d = DbS.A0d(A002);
        A0d.E5c("preference_double_tap_profile_tab_tooltip_last_impression_time", currentTimeMillis);
        A0d.apply();
        2aC r1 = this.A00;
        Map map = 2aC.A0V;
        UserSession userSession = r1.A0J;
        if (userSession != null) {
            C46400DeN.A07(userSession, AnonymousClass000.A00(3031));
        }
    }
}
