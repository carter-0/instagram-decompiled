package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Kpq  reason: case insensitive filesystem */
public abstract class C63000Kpq {
    public static final void A00(Activity activity, C66499MUd mUd, UserSession userSession, String str, List list) {
        AnonymousClass7TF.A1B(userSession, 1, list);
        C61426K7a k7a = new C61426K7a();
        k7a.A00 = mUd;
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putStringArrayList("arg_audience_list", AnonymousClass7TE.A1D(list));
        A0a.putString("arg_entry_point", str);
        C331127Pr A0V = DbV.A0V(A0a, k7a, userSession);
        DbZ.A0z(activity, A0V, 2131952710);
        A0V.A0g = activity.getString(2131960992);
        A0V.A1J = true;
        A0V.A0v = true;
        C331157Pu A00 = A0V.A00();
        k7a.A01 = new C58719IwS(A00, userSession, str, 11);
        A00.A02(activity, k7a);
    }
}
