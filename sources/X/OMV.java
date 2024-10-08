package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.perf.constants.ThreadFetchReason;
import com.instagram.direct.request.DirectThreadApi;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class OMV {
    public final UserSession A00;
    public final C71009OYf A01;

    public OMV(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = new C71009OYf(userSession);
    }

    public final void A00(ThreadFetchReason threadFetchReason, C74413PuT puT, long j) {
        OE3 oe3;
        Long A0r = C66581MXm.A0r(this.A00, AnonymousClass0t1.A01);
        if (A0r != null) {
            C71009OYf oYf = this.A01;
            List A1P = 0sr.A1P(new Long[]{Long.valueOf(j), A0r});
            UserSession userSession = oYf.A00;
            2Dr A002 = 2L2.A00(userSession);
            if (!A002.A0H.A0F) {
                A002.CnE("GetThreadByRecipientIds");
            }
            AnonymousClass3U9 B34 = A002.B34(AnonymousClass7TE.A0R(00k.A0I(A1P)));
            if (B34 == null || B34.BMT() != AnonymousClass05K.A0N) {
                List<Object> A0Z = 00k.A0Z(A1P);
                ArrayList A0r2 = AnonymousClass7TG.A0r(A0Z);
                for (Object A0R : A0Z) {
                    A0r2.add(String.valueOf(AnonymousClass7TE.A0R(A0R)));
                }
                Map map = oYf.A02;
                List A13 = C66580MXl.A13(A0r2, map);
                if (A13 != null) {
                    A13.add(puT);
                    puT.DFL(true);
                    return;
                }
                map.put(A0r2, 0sr.A1M(new C74413PuT[]{puT}));
                C71129OdS.A05(userSession, threadFetchReason, new C72668PEy(oYf, A0r2), A0r2, true, true);
                return;
            }
            oe3 = new OE3(B34, 0sn.A00, 0);
        } else {
            oe3 = new OE3((Object) null, 0sn.A00, 23);
        }
        puT.DFJ(oe3);
    }

    public final void A01(ThreadFetchReason threadFetchReason, C74413PuT puT, long j) {
        C71009OYf oYf = this.A01;
        UserSession userSession = oYf.A00;
        2Dr A002 = 2L2.A00(userSession);
        if (!A002.A0H.A0F) {
            A002.CnE("GetThreadByThreadJid");
        }
        long j2 = j;
        AnonymousClass3U9 B34 = A002.B34(j2);
        C74413PuT puT2 = puT;
        if (B34 == null || B34.BMT() != AnonymousClass05K.A0N) {
            Map map = oYf.A01;
            Long valueOf = Long.valueOf(j2);
            List A13 = C66580MXl.A13(valueOf, map);
            if (A13 != null) {
                A13.add(puT2);
                puT2.DFL(true);
                return;
            }
            map.put(valueOf, 0sr.A1M(new C74413PuT[]{puT2}));
            C72669PEz pEz = new C72669PEz(oYf, j2);
            UserSession userSession2 = userSession;
            0eP A02 = C71129OdS.A02(userSession2, threadFetchReason, (String) null, "threadJid", AnonymousClass7TG.A0j(), true);
            AnonymousClass7BV r14 = (AnonymousClass7BV) A02.A01;
            1OC A04 = DirectThreadApi.A04(userSession, valueOf, DbV.A0s(), (String) null, 0sn.A00, false, true);
            A04.A00 = new C68435NHu(userSession, r14, (AnonymousClass43S) A02.A00, pEz, j2);
            1ES.A03(A04);
            return;
        }
        puT2.DFJ(new OE3(B34, 0sn.A00, 0));
    }
}
