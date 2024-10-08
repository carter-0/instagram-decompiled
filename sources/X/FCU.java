package X;

import android.app.Activity;
import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

public abstract class FCU {
    public static final G7U A01(Activity activity, UserSession userSession, G7U g7u) {
        if (!182.A06(DbS.A0J(userSession, 2), userSession, 36318423843608698L)) {
            return g7u;
        }
        return new C51133Fp5(0, activity, userSession.A01(C19291WSz.class, new C20699WxV(userSession, 13)), g7u);
    }

    public static final G6P A00(Activity activity, UserSession userSession, G6P g6p) {
        DbY.A1S(g6p, userSession);
        if (!182.A06(0Tu.A05, userSession, 36318423843608698L)) {
            return g6p;
        }
        return new C50962Flp(activity, g6p, (C19291WSz) userSession.A01(C19291WSz.class, new C20699WxV(userSession, 13)));
    }

    public static final void A02(Activity activity) {
        C358248ab A0X = DbS.A0X(activity);
        A0X.A09(2131963550);
        A0X.A08(2131963549);
        A0X.A0G((DialogInterface.OnClickListener) null, 2131968772);
        A0X.A04();
        DbT.A1V(A0X);
    }
}
