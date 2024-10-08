package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.Eqv  reason: case insensitive filesystem */
public abstract class C49190Eqv {
    public static final E0c A00(UserSession userSession, String str) {
        0qQ.A0B(userSession, 0);
        E0c e0c = new E0c();
        Bundle A09 = DbY.A09(userSession);
        A09.putString("arg_media_id", str);
        e0c.setArguments(A09);
        return e0c;
    }
}
