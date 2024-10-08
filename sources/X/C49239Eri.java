package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Eri  reason: case insensitive filesystem */
public abstract class C49239Eri {
    public static final void A00(Activity activity, Context context, UserSession userSession, String str) {
        0qQ.A0B(userSession, 1);
        if (182.A06(0Tu.A06, userSession, 36321486155294136L)) {
            C310336ap A0a = DbS.A0a();
            A0a.A0D = DbW.A0h(context, str, 2131972348);
            A0a.A0I = context.getString(2131972347);
            A0a.A0L = true;
            DbW.A0q(context, A0a, 2131972333);
            A0a.A0A(new FdA(5, activity, context, userSession));
            DbY.A1N(A0a);
            return;
        }
        C59689JTv.A07(context, 2131952092);
    }
}
