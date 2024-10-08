package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.Gh6  reason: case insensitive filesystem */
public final class C53015Gh6 extends 2YL {
    public C229352nF A00;
    public IgSimpleImageView A01;
    public final UserSession A02;
    public final C55474HiI A03;
    public final String A04;
    public final AnonymousClass0eM A05;
    public final C249513ju A06;
    public final AnonymousClass0r6 A07;
    public final 05G A08 = C51967G9n.A0u();

    public C53015Gh6(UserSession userSession, C55474HiI hiI, String str) {
        AnonymousClass7TG.A1O(userSession, str);
        this.A02 = userSession;
        this.A04 = str;
        this.A03 = hiI;
        0t0 A012 = AnonymousClass0eN.A01(new C58673Ivi(this, 22));
        this.A05 = A012;
        if (!AnonymousClass7TE.A1a(A012.getValue())) {
            A00();
        }
        1HR r0 = new 1HR(0);
        this.A06 = r0;
        this.A07 = 0u9.A04(r0);
    }

    public final void A00() {
        ArrayList A1C = AnonymousClass7TE.A1C();
        C55474HiI hiI = this.A03;
        UserSession userSession = this.A02;
        String str = this.A04;
        C55936Hq0 hq0 = new C55936Hq0(userSession, 1vm.A01(userSession));
        Map map = hiI.A00;
        0qQ.A0B(map, 1);
        2IS A042 = C41845B3m.A04();
        2IS A043 = C41845B3m.A04();
        A042.A03("section_content_at_stream_initial_count", 0);
        A042.A01("enable_section_content_at_stream");
        DbW.A18(C41845B3m.A03(GraphQlCallInput.A02, str, "creator_inspiration_hub_type"), A042, "input");
        A042.A02("enable_section_content_at_stream", true);
        AnonymousClass11O.A03(C318116oQ.A00(this), new C61860pz(new C52070GDq(A1C, this, (AnonymousClass4D7) null, 35), AnonymousClass0Zq.A00(new MHM(II3.A00(A042, A043), HZR.A00(hq0.A00), hq0, str, map, (AnonymousClass4D7) null)))).CO3(J6R.A00(this, A1C, 11));
    }
}
