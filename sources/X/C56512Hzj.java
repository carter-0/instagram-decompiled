package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.Hzj  reason: case insensitive filesystem */
public final class C56512Hzj {
    public final C54678HOj A00;
    public final AnonymousClass0eM A01;
    public final String A02;

    public C56512Hzj(C54678HOj hOj, UserSession userSession, String str) {
        0qQ.A0B(userSession, 1);
        this.A00 = hOj;
        this.A02 = str;
        this.A01 = AnonymousClass0eN.A00(0eO.A02, new C73661Pha(userSession, 1));
    }

    public static final void A00(C54687HOs hOs, C56512Hzj hzj, String str) {
        Map map;
        0Aj A0e = AnonymousClass7TE.A0e((0wc) hzj.A01.getValue(), C273654mx.A00(343));
        if (A0e.isSampled()) {
            A0e.A8M(hOs, "event_type");
            DbS.A1F(hzj.A00, A0e);
            A0e.AAJ("surface_session_id", str);
            String str2 = hzj.A02;
            if (str2 != null) {
                map = AnonymousClass7TF.A0w("ig_mifu_ifysession_id", str2);
            } else {
                map = null;
            }
            A0e.A9H("app_context_data", map);
            A0e.AAJ("thread_type", "1012");
            A0e.Cgf();
        }
    }
}
