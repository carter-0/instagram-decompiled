package X;

import android.content.Context;
import com.facebook.avatar.expresso.instagram.ExpressoImpl;
import com.instagram.common.session.UserSession;

/* renamed from: X.KyK  reason: case insensitive filesystem */
public abstract class C63509KyK {
    public static final ExpressoImpl A00(Context context, UserSession userSession) {
        UserSession userSession2 = C62917KoV.A01;
        if (userSession2 == null || !userSession.equals(userSession2)) {
            C62917KoV.A01 = userSession;
            C62917KoV.A00 = new ExpressoImpl(userSession, context);
        }
        ExpressoImpl expressoImpl = C62917KoV.A00;
        if (expressoImpl != null) {
            return expressoImpl;
        }
        throw AnonymousClass7TE.A0y();
    }
}
