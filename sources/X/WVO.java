package X;

import com.instagram.common.session.UserSession;

public final class WVO implements C51869G5g {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C14388TvH A01;
    public final /* synthetic */ String A02;

    public WVO(C14388TvH tvH, String str, long j) {
        this.A01 = tvH;
        this.A02 = str;
        this.A00 = j;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.base.activity.BaseFragmentActivity, android.app.Activity] */
    public final void DrE() {
        long A0L = JTR.A0L();
        C14388TvH tvH = this.A01;
        if (!tvH.A0G) {
            0wc r5 = tvH.A08;
            String str = this.A02;
            long j = this.A00;
            AnonymousClass7TG.A1N(r5, str);
            C14428Tvx.A02(r5, str, "ig_search_explore_donut", "", "", j, A0L);
        }
        UserSession userSession = tvH.A09;
        if (182.A06(AnonymousClass7TF.A0H(userSession), userSession, 36328044571605911L)) {
            C49951FGg.A07(userSession, tvH.A06, C69503Nml.A09.toString());
        }
    }
}
