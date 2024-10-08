package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.Kqo  reason: case insensitive filesystem */
public abstract class C63059Kqo {
    public static final void A00(Activity activity, View view, UserSession userSession) {
        boolean A1Y = DbW.A1Y(userSession);
        AnonymousClass5Gt A0e = AnonymousClass7TG.A0e(activity, 2131953511);
        A0e.A03(view);
        A0e.A01();
        A0e.A07(C283255Gu.A07);
        A0e.A0B = A1Y;
        A0e.A00 = 5000;
        A0e.A0A = A1Y;
        A0e.A00().A07(userSession);
    }
}
