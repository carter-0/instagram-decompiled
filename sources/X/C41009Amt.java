package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Amt  reason: case insensitive filesystem */
public final /* synthetic */ class C41009Amt implements Runnable {
    public final /* synthetic */ AnonymousClass8BA A00;
    public final /* synthetic */ C3498782e A01;

    public /* synthetic */ C41009Amt(AnonymousClass8BA r1, C3498782e r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void run() {
        AnonymousClass8BA r8 = this.A00;
        C3498782e r2 = this.A01;
        UserSession userSession = r8.A0v;
        17i A002 = 17h.A00(userSession);
        String str = r2.A01;
        User A02 = A002.A02(str);
        if (A02 != null || (A02 = AnonymousClass0BO.A00(userSession).BNx(str)) != null) {
            Context A0T = AnonymousClass7TE.A0T(r8);
            C369868vS A003 = C39808AAf.A00(A0T, userSession, A02, r2.A00);
            C39890ADo aDo = new C39890ADo();
            aDo.A0H = true;
            aDo.A06 = new AnonymousClass8BG(0.5f, 0.27f);
            r8.A0g(A003, new C310416b1(aDo));
            r8.A0e(new C386019jv(A0T, userSession, A02), AnonymousClass57C.CREATE_MODE_USER_SEARCH, C317876nz.A17, C39808AAf.A01(), true);
        }
    }
}
