package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Eo2  reason: case insensitive filesystem */
public abstract class C49026Eo2 {
    public static 1OC A00(Context context, UserSession userSession, boolean z) {
        0qv r1 = 0qv.A02;
        1NY A0N = DbU.A0N(userSession);
        DbU.A1O(A0N, DbT.A0t(context, A0N, "nux/new_account_nux_seen/"));
        DbW.A19(19f.A26, A0N, DbW.A0I(A0N, userSession, "guid", r1.A05(context)));
        A0N.A0H("is_fb4a_installed", z);
        DbW.A1F(A0N);
        return DbY.A0N(A0N, 1XP.class, 1XY.class);
    }
}
