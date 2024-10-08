package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Elp  reason: case insensitive filesystem */
public abstract class C48889Elp {
    public static final boolean A00(Context context, UserSession userSession, String str, boolean z) {
        0qQ.A0B(context, 0);
        if (!z) {
            return false;
        }
        C358248ab A0Y = DbS.A0Y(context);
        int i = 2131958704;
        if (182.A05(0Tu.A05, userSession)) {
            i = 2131958703;
        }
        A0Y.A09(i);
        DbY.A0w(context, A0Y, str, 2131958707);
        Dba.A1L(A0Y);
        return true;
    }
}
