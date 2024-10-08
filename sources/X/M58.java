package X;

import com.instagram.common.session.UserSession;

public final class M58 implements Runnable {
    public final /* synthetic */ C313616gj A00;

    public M58(C313616gj r1) {
        this.A00 = r1;
    }

    public final void run() {
        C313616gj r2 = this.A00;
        UserSession userSession = r2.A0N;
        if (!JTR.A1a(((L5Q) C313766gy.A00(userSession).A03.getValue()).A01)) {
            if (r2.A01 != null) {
                AnonymousClass7TF.A1O(C313766gy.A00(userSession).A02().A0H, true);
                C313616gj.A02(r2);
            }
            C313716gt r4 = r2.A03;
            if (r4 != null) {
                String sessionId = r2.A0S.getSessionId();
                0qQ.A0B(sessionId, 0);
                0Aj A0e = AnonymousClass7TE.A0e(r4.A08, "ig_live_viewer_end_screen_impression");
                C51965G9l.A1O(A0e, sessionId);
                A0e.AAJ("a_pk", r4.A03);
                C51965G9l.A1I(A0e, r4.A04);
                A0e.Cgf();
            }
        }
    }
}
