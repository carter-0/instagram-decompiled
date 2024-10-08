package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

public final class LO1 {
    public static final long A03 = TimeUnit.DAYS.toMillis(7);
    public AnonymousClass5Gv A00;
    public AnonymousClass5Gv A01;
    public AnonymousClass5Gv A02;

    public final void A00(Activity activity, View view, UserSession userSession) {
        boolean A1b = C51973G9u.A1b(activity, userSession, view);
        AnonymousClass5Gv r0 = this.A02;
        if (r0 == null) {
            AnonymousClass5Gt A0V = DbZ.A0V(activity, 2131962384);
            A0V.A03(view);
            A0V.A02();
            A0V.A0A = A1b;
            A0V.A00 = 3000;
            r0 = KSP.A00(A0V, userSession, 12);
            this.A02 = r0;
        }
        if (r0 != null) {
            r0.A07(userSession);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
