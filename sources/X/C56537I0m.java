package X;

import com.instagram.adshistory.fragment.RecentAdActivityFragment;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.util.List;

/* renamed from: X.I0m  reason: case insensitive filesystem */
public final class C56537I0m {
    public C54076Gz0 A00;
    public 1OC A01;
    public Integer A02 = AnonymousClass05K.A01;
    public String A03;
    public String A04;
    public boolean A05;
    public final C57413IaJ A06 = new C57413IaJ(this);
    public final RecentAdActivityFragment A07;
    public final UserSession A08;
    public final C228602lw A09;
    public final List A0A;

    public C56537I0m(RecentAdActivityFragment recentAdActivityFragment, C228602lw r3, UserSession userSession, List list) {
        0qQ.A0B(userSession, 1);
        this.A08 = userSession;
        this.A07 = recentAdActivityFragment;
        this.A09 = r3;
        this.A0A = list;
    }

    public final void A01() {
        this.A02 = AnonymousClass05K.A00;
        A00(this, true);
        for (C55591HkB hkB : this.A0A) {
            C360678ey A062 = C359988do.A06(hkB.A01, "com.instagram.ads.ad_activity.ad_activity_entrypoint", 0Yt.A0E());
            A062.A00(new C15412UcO(hkB, 0));
            1ES.A03(A062);
        }
    }

    public static final void A00(C56537I0m i0m, boolean z) {
        String str;
        if (!z) {
            i0m.A02 = AnonymousClass05K.A00;
        }
        UserSession userSession = i0m.A08;
        String str2 = null;
        if (z) {
            str = null;
        } else {
            str = i0m.A04;
            str2 = i0m.A03;
        }
        1NY A0M = DbU.A0M(userSession);
        A0M.A04();
        A0M.A0A("ads/ads_history/");
        A0M.A9m("ig_user_id", userSession.A06);
        A0M.A9m("page_type", "35");
        A0M.A0G("next_max_id", str);
        A0M.A0G(AnonymousClass000.A00(685), str2);
        A0M.A02 = new 1NT(new 0bH(userSession), new 1NX((File) null), C56193HuM.class, false);
        1OC A0M2 = A0M.A0M();
        A0M2.A00 = new C54243H4m(1, i0m, z);
        if (z) {
            i0m.A01 = A0M2;
        }
        i0m.A09.schedule(A0M2);
    }
}
