package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class GIY extends 2YL {
    public 1Xj A00;
    public C51979GAc A01;
    public boolean A02;
    public final UserSession A03;
    public final 05G A04;
    public final AnonymousClass0Ud A05;

    public final void A00(String str) {
        String str2;
        String str3;
        String str4 = str;
        0qQ.A0B(str4, 0);
        05G r1 = this.A04;
        r1.Epw(00k.A0f((Iterable) r1.getValue(), str4));
        UserSession userSession = this.A03;
        C51979GAc gAc = this.A01;
        if (gAc != null) {
            String str5 = gAc.A03.A01;
            boolean isEmpty = ((List) r1.getValue()).isEmpty();
            0qQ.A0B(str5, 2);
            0Aj A0M = C51972G9s.A0M(gAc, userSession);
            if (A0M.isSampled()) {
                if (isEmpty) {
                    str3 = "translation_all_remove";
                } else {
                    str3 = "translation_audio_remove";
                }
                A0M.AAJ("organic_tap_action", str3);
                A0M.AAJ("organic_tap_action_source", C273654mx.A00(997));
                C51979GAc.A01(A0M, gAc);
                C51969G9p.A16(A0M, 0);
                C51965G9l.A1O(A0M, str5);
                A0M.Cgf();
            }
            1Xj r0 = this.A00;
            if (r0 != null) {
                String A30 = r0.A30();
                C19136WMs wMs = new C19136WMs(this, 2);
                RRN A002 = C62959KpB.A00();
                A002.A03 = 360;
                A002.A02 = 30;
                A002.A00 = 240.0d;
                A002.A01 = 30;
                QGH qgh = new QGH(A002, userSession);
                qgh.A04 = wMs;
                if (A30 != null) {
                    2IV r5 = new 2IV();
                    r5.A09(str4, AnonymousClass000.A00(3487));
                    r5.A09(A30, "media_id");
                    1vn A012 = 1vm.A01(qgh.A07);
                    2IS A042 = C41845B3m.A04();
                    2IS A043 = C41845B3m.A04();
                    A042.A00(r5, "input");
                    PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(C41845B3m.A05(), "RemoveAutodubLanguageMutation", A042.getParamsCopy(), A043.getParamsCopy(), BSU.class, true, (PandoRealtimeInfoJNI) null, 0, (String) null, "xdt_remove_autodub_language", AnonymousClass7TE.A1C());
                    0qQ.A0A(pandoGraphQLRequest);
                    C56925IHu.A00(new C56928IHx(qgh, 0), pandoGraphQLRequest, A012, qgh, 0);
                    return;
                }
                return;
            }
            str2 = "media";
        } else {
            str2 = "analyticsModule";
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }

    public GIY(UserSession userSession) {
        this.A03 = userSession;
        02z A012 = 106.A01(0sn.A00);
        this.A04 = A012;
        this.A05 = A012;
    }
}
