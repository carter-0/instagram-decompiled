package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public abstract class FG3 {
    public static final void A00(Context context) {
        C358248ab A0Y = DbS.A0Y(context);
        A0Y.A09(2131967940);
        A0Y.A0q(002.A0g(context.getString(2131967939), "\n\n", context.getString(2131967935)));
        DbY.A1M(A0Y, 2131967938);
    }

    public static final void A01(Context context) {
        C358248ab A0Y = DbS.A0Y(context);
        A0Y.A09(2131967942);
        A0Y.A08(2131967941);
        DbY.A1M(A0Y, 2131967938);
    }

    public static final void A02(Context context) {
        C358248ab A0Y = DbS.A0Y(context);
        A0Y.A09(2131967945);
        A0Y.A08(2131967944);
        DbY.A1M(A0Y, 2131967938);
    }

    public static final void A03(Context context, C62320sa r5) {
        C358248ab A0Y = DbS.A0Y(context);
        A0Y.A09(2131967937);
        A0Y.A0q(002.A0g(context.getString(2131967936), "\n\n", context.getString(2131967935)));
        A0Y.A0J(C50020FJf.A00(r5, 46), 2131967943);
        DbY.A1M(A0Y, 2131967934);
    }

    public static final boolean A04(UserSession userSession) {
        Boolean CY5 = DbV.A0k(userSession).CY5();
        if (CY5 != null && CY5.booleanValue()) {
            0Tu r2 = 0Tu.A05;
            if (!182.A06(r2, userSession, 36317427412374651L) || !182.A06(r2, userSession, 36321627889215077L)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
