package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.HXj  reason: case insensitive filesystem */
public abstract class C54901HXj {
    public static final H1T A00(UserSession userSession, String str, boolean z) {
        AnonymousClass7TG.A1N(userSession, str);
        Bundle A09 = DbY.A09(userSession);
        A09.putString("media_id", str);
        A09.putBoolean("is_story", z);
        H1T h1t = new H1T();
        h1t.setArguments(A09);
        return h1t;
    }
}
