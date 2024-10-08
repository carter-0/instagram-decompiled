package X;

import com.instagram.common.session.UserSession;

public final class WVR implements C51869G5g {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C14437TwL A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    public WVR(C14437TwL twL, String str, String str2, String str3, long j, boolean z) {
        this.A01 = twL;
        this.A03 = str;
        this.A02 = str2;
        this.A00 = j;
        this.A04 = str3;
        this.A05 = z;
    }

    public final void DrE() {
        long A0L = JTR.A0L();
        C14437TwL twL = this.A01;
        boolean z = twL.A09;
        if (!z) {
            C14428Tvx.A03(twL.A03, this.A03, this.A02, twL.A07, this.A04, this.A00, A0L);
        }
        if (!this.A05 && !0qQ.A0K(this.A02, "ig_search:serp_hcm_pill") && (twL.A08 || z)) {
            C13990Tnq.A0y(twL.A01, twL.A04);
        }
        UserSession userSession = twL.A04;
        if (182.A06(AnonymousClass7TF.A0H(userSession), userSession, 36328044571605911L)) {
            C49951FGg.A07(userSession, twL.A01, C69503Nml.A0B.toString());
        }
    }
}
