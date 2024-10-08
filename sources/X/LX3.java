package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

public final class LX3 implements View.OnClickListener {
    public final /* synthetic */ C64855LjH A00;

    public LX3(C64855LjH ljH) {
        this.A00 = ljH;
    }

    public final void onClick(View view) {
        String str;
        String sessionId;
        int A05 = AnonymousClass0fD.A05(-1941473517);
        C60205JhO jhO = this.A00.A00;
        if (jhO == null) {
            C51965G9l.A15();
            throw AnonymousClass00P.createAndThrow();
        }
        MG2.A01(jhO, C318116oQ.A00(jhO), 36);
        C313716gt r8 = jhO.A00;
        C63921LDa lDa = jhO.A01;
        C250973mM r7 = lDa.A00;
        long A0A = JTT.A0A(jhO.A02.A07);
        if (r7 != null) {
            UserSession userSession = r8.A09;
            AnonymousClass0iw r0 = r8.A00;
            if (r0 == null) {
                r0 = r8.A07;
            }
            1Ln A0C = 1Ln.A0C(AnonymousClass0kN.A01(r0, userSession));
            Reel reel = r7.A0H;
            C270194gL r02 = reel.A0H;
            String str2 = "";
            if (r02 != null) {
                str = r02.A0e;
                str.getClass();
            } else {
                str = str2;
            }
            A0C.A0m(str);
            A0C.A0Q("m_t", C51971G9r.A0m());
            A0C.A0P(C273654mx.A00(96), Double.valueOf(((double) A0A) / 1000.0d));
            A0C.A0P(C273654mx.A00(413), Double.valueOf(0.0d));
            String str3 = r8.A05;
            if (str3 == null) {
                str3 = str2;
            }
            A0C.A0R("tray_session_id", str3);
            C249763kK r03 = r8.A01;
            if (!(r03 == null || (sessionId = r03.getSessionId()) == null)) {
                str2 = sessionId;
            }
            A0C.A0R("viewer_session_id", str2);
            A0C.A0R("reel_id", reel.getId());
            A0C.A0k("live_preview_cta_click");
            A0C.A0R("reel_type", AnonymousClass000.A00(3514));
            A0C.A0Q("a_pk", DbV.A0q(r8.A03));
            A0C.A0Q(AnonymousClass000.A00(810), DbS.A0j(r7.A0E));
            A0C.Cgf();
        }
        lDa.A00();
        AnonymousClass0fD.A0C(-2144730181, A05);
    }
}
