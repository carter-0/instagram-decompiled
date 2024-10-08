package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.KuB  reason: case insensitive filesystem */
public abstract class C63266KuB {
    public static final C61921KRq A00(Context context, UserSession userSession, String str) {
        DbY.A1S(userSession, str);
        return (C61921KRq) userSession.A01(C61921KRq.class, new C73673Phm(context, userSession, str, 19));
    }
}
