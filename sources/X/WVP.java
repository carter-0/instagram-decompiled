package X;

import com.instagram.common.session.UserSession;

public final class WVP implements C51869G5g {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass35N A01;
    public final /* synthetic */ String A02;

    public WVP(AnonymousClass35N r1, String str, long j) {
        this.A01 = r1;
        this.A02 = str;
        this.A00 = j;
    }

    public final void DrE() {
        long A0L = JTR.A0L();
        AnonymousClass35N r4 = this.A01;
        0wc r5 = (0wc) r4.A0J.getValue();
        String str = this.A02;
        long j = this.A00;
        AnonymousClass7TG.A1N(r5, str);
        C14428Tvx.A02(r5, str, "ig_home_feed_donut", "", "", j, A0L);
        UserSession userSession = r4.A0E;
        if (182.A06(AnonymousClass7TF.A0H(userSession), userSession, 36328044571605911L)) {
            C49951FGg.A07(userSession, r4.A0B, C69503Nml.A0A.toString());
        }
    }
}
