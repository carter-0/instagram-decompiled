package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.GWn  reason: case insensitive filesystem */
public final class C52536GWn {
    public final UserSession A00;
    public final C52435GSn A01;

    public C52536GWn(UserSession userSession, C52435GSn gSn) {
        0qQ.A0B(gSn, 2);
        this.A00 = userSession;
        this.A01 = gSn;
    }

    public final void A00(View view, C238863Ds r12, AnonymousClass4DU r13, boolean z) {
        C246153e7 r3;
        0qQ.A0B(view, 0);
        UserSession userSession = this.A00;
        C238833Dp A0X = C51967G9n.A0X(userSession);
        A0X.A05(view, r12);
        AnonymousClass4DU r7 = r13;
        C52435GSn gSn = this.A01;
        if (z) {
            1Xj BPf = gSn.BPf();
            r3 = new C246153e7(new AnonymousClass4HH(AnonymousClass7TE.A0S(view), gSn.A00, userSession, BPf), userSession, BPf, r7, "in_app_browser_v2", 0sl.A00);
        } else {
            r3 = new C246153e7((AnonymousClass4HI) null, userSession, gSn.BPf(), r13);
        }
        A0X.A0A(view, r3);
    }

    public final void A01(AnonymousClass4DU r10, String str) {
        C233822wX.A0S(this.A00, this.A01.BPf(), r10, 0, str, (String) null, (String) null, 0);
    }
}
