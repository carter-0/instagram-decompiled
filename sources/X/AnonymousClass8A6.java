package X;

import android.content.Context;
import android.util.DisplayMetrics;
import com.instagram.common.session.UserSession;

/* renamed from: X.8A6  reason: invalid class name */
public final class AnonymousClass8A6 {
    public final Context A00;
    public final DisplayMetrics A01;
    public final UserSession A02;
    public final 2Nn A03;

    public AnonymousClass8A6(Context context, UserSession userSession) {
        0qQ.A0B(context, 1);
        0qQ.A0B(userSession, 2);
        this.A00 = context;
        this.A02 = userSession;
        this.A03 = 2Nm.A00(context, userSession);
        this.A01 = context.getResources().getDisplayMetrics();
    }
}
