package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.instagram.common.session.UserSession;

/* renamed from: X.VSr  reason: case insensitive filesystem */
public final class C17364VSr {
    public final SharedPreferences A00;
    public final UserSession A01;

    public C17364VSr(Context context, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = context.getSharedPreferences(002.A0g(userSession.A06, "_", "ViewStateModStore"), 0);
    }
}
