package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;

public final class P11 implements C74386Pu2 {
    public final UserSession A00;

    public final void E2b(Activity activity, 1a8 r10, C68714NUa nUa, 0sP r12, boolean z) {
        String str;
        Activity activity2 = activity;
        C68714NUa nUa2 = nUa;
        DbZ.A0t(0, activity, r10, nUa);
        UserSession userSession = this.A00;
        C69902Nu4.A00(userSession, activity.getApplication(), "attempt auto restore");
        if (z) {
            str = "DB_DROP";
        } else {
            str = "NORMAL_RESTORE";
        }
        C68714NUa.A05(nUa, str);
        nUa.A0D("RESTORE_TYPE", "AUTORESTORE");
        r10.A02(C72168Oxd.A00(r10, userSession, C69888Ntq.A00(userSession, AnonymousClass05K.A1I), 0), new PSW(0, activity2, nUa2, this, r12));
    }

    public P11(UserSession userSession) {
        this.A00 = userSession;
    }

    public final void E2a(Context context, 1a8 r4, Integer num, Integer num2, 0sP r7, boolean z) {
        C51974G9v.A1K(num, num2, r4);
        C69889Ntr.A00(r4, C69888Ntq.A00(this.A00, num), new C72297P0o(r7), num2);
    }
}
