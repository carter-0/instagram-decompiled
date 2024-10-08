package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ajp  reason: case insensitive filesystem */
public final class C40819Ajp implements Runnable {
    public final /* synthetic */ C353438Hq A00;

    public C40819Ajp(C353438Hq r1) {
        this.A00 = r1;
    }

    public final void run() {
        C353438Hq r0 = this.A00;
        C352888Fl r7 = r0.A09;
        C40647AgN agN = new C40647AgN(r0, 1);
        UserSession userSession = r7.A0f;
        0qQ.A0B(userSession, 0);
        Bundle A0a = AnonymousClass7TE.A0a();
        AnonymousClass0Dg.A00(A0a, userSession);
        C384849hz r3 = new C384849hz();
        r3.setArguments(A0a);
        C331127Pr r2 = new C331127Pr(userSession);
        r2.A1C = false;
        Activity activity = r7.A0P;
        r2.A0d = activity.getString(2131974296);
        r2.A0g = activity.getString(2131974295);
        r2.A1J = true;
        r2.A0v = true;
        r2.A0U = agN;
        r2.A00().A02(activity, r3);
    }
}
