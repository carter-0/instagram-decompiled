package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.user.model.User;

/* renamed from: X.FEg  reason: case insensitive filesystem */
public final class C49908FEg {
    public static final C49908FEg A00 = new Object();

    public final void A01(Activity activity, G5P g5p, UserSession userSession, User user, String str, String str2) {
        0qQ.A0B(activity, 1);
        C331157Pu A0T = DbW.A0T(userSession);
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putParcelable("get_app_user", user);
        A0a.putString("get_app_entrypoint", str);
        A0a.putString("injected_actor_ids", str2);
        E24 e24 = new E24();
        e24.setArguments(A0a);
        e24.A00 = g5p;
        A0T.A02(activity, e24);
    }

    public static final void A00(Activity activity, UserSession userSession) {
        Bundle A0a = AnonymousClass7TE.A0a();
        C227642jf.A04(A0a, userSession);
        AnonymousClass6W8 A0b = DbS.A0b(activity, A0a, userSession, ModalActivity.class, C273654mx.A00(65));
        if (AnonymousClass9HN.A00(userSession).booleanValue() && 182.A06(0Tu.A05, userSession, 36318887702501973L)) {
            A0b.A0J = AnonymousClass6W8.A0Q;
        }
        A0b.A0C(activity);
    }
}
