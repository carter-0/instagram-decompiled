package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Hau  reason: case insensitive filesystem */
public abstract class C55023Hau {
    public static final void A00(Activity activity, C69486NmU nmU, UserSession userSession, String str, 0sK r9, boolean z) {
        0qQ.A0B(userSession, 1);
        C331127Pr A0W = DbS.A0W(userSession);
        A0W.A1I = true;
        C57385IZq.A00(A0W, new C73898PlZ(r9, 18), 6);
        C331157Pu A00 = A0W.A00();
        C54130Gzz gzz = new C54130Gzz();
        gzz.A00 = r9;
        gzz.setArguments(DbY.A0C("arg_current_hidden_place_name", str, AnonymousClass7TE.A1L("arg_entrypoint", nmU), AnonymousClass7TE.A1L("arg_is_from_nux", Boolean.valueOf(z))));
        A00.A02(activity, gzz);
    }
}
