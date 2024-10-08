package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.HpR  reason: case insensitive filesystem */
public final class C55904HpR {
    public final void A00(Activity activity, Context context, UserSession userSession, String str, boolean z) {
        AnonymousClass7TG.A1Q(userSession, str);
        H0C h0c = new H0C();
        Bundle A0N = C51971G9r.A0N(str);
        A0N.putBoolean("is_story", z);
        h0c.setArguments(A0N);
        C331127Pr A0e = DbX.A0e(userSession, false);
        C51975G9x.A0z(context, A0e);
        DbU.A0y(activity, h0c, A0e);
    }
}
