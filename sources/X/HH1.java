package X;

import com.instagram.api.schemas.MediaControlEventSourceEnum;
import com.instagram.common.session.UserSession;

public final class HH1 extends C51086FoG {
    public final /* synthetic */ C2363033f A00;
    public final /* synthetic */ 1Xj A01;
    public final /* synthetic */ C53157GjT A02;
    public final /* synthetic */ JOG A03;
    public final /* synthetic */ AnonymousClass3W1 A04;

    public HH1(C2363033f r1, 1Xj r2, C53157GjT gjT, JOG jog, AnonymousClass3W1 r5) {
        this.A00 = r1;
        this.A02 = gjT;
        this.A04 = r5;
        this.A01 = r2;
        this.A03 = jog;
    }

    public final void Cyb(boolean z) {
        JOG jog = this.A03;
        if (jog != null) {
            jog.DGZ(!z, false);
        }
    }

    public final void De7() {
        C59689JTv.A0D(this.A00.A00.getActivity(), C66579MXk.A00(70));
    }

    public final void Do1(String str) {
        AnonymousClass3WA r6;
        if ("ig_spam_v3".equals(str)) {
            r6 = AnonymousClass3WA.ORGANIC_REPORT_SPAM;
        } else if ("ig_false_news".equals(str)) {
            r6 = AnonymousClass3WA.ORGANIC_REPORT_FALSE_NEWS;
        } else {
            r6 = AnonymousClass3WA.ORGANIC_REPORT;
        }
        C53157GjT gjT = this.A02;
        if (gjT != null) {
            AnonymousClass3W1 r4 = this.A04;
            r4.A0m = r6;
            C2363733m r3 = C2363633l.A03;
            C2363033f r0 = this.A00;
            UserSession userSession = r0.A01;
            r3.A09(new I4I(userSession, r0.A02.C87()).A02(this.A01, r4), userSession, gjT, r4);
            return;
        }
        this.A00.A02.BD7().DJB((MediaControlEventSourceEnum) null, this.A01, r6, this.A04);
    }
}
