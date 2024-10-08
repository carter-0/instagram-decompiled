package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class FCJ {
    public static final void A01(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2) {
        0qQ.A0B(userSession, 1);
        if (!AnonymousClass7TF.A1R(str.length())) {
            throw AnonymousClass7TE.A0z("Check failed.");
        } else if (str2.length() <= 0) {
            throw AnonymousClass7TE.A0z("Check failed.");
        } else if (fragmentActivity != null) {
            C309516Yo A0J = DbY.A0J(fragmentActivity, userSession);
            E77 e77 = new E77();
            Bundle A09 = DbY.A09(userSession);
            A09.putString(Dbj.A00(), str);
            A09.putString(Dbj.A04(39, 17, 26), str2);
            DbW.A0x(A09, e77, A0J);
        } else {
            throw AnonymousClass7TE.A0y();
        }
    }

    public static final synchronized C49496Ewb A00(UserSession userSession) {
        C49496Ewb ewb;
        synchronized (FCJ.class) {
            0qQ.A0B(userSession, 0);
            ewb = (C49496Ewb) userSession.A00(C49496Ewb.class);
        }
        return ewb;
    }
}
