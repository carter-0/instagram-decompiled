package X;

import android.content.Context;
import android.os.Bundle;
import com.instagram.common.session.UserSession;

public final class FEb {
    public static final ENZ A00(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return (ENZ) userSession.A01(ENZ.class, new C58178Ini(userSession, 17));
    }

    public final void A02(Context context, UserSession userSession, C51911G7f g7f, boolean z, boolean z2) {
        A01(context, userSession, g7f, true, false, z, z2);
    }

    public static final void A01(Context context, UserSession userSession, C51911G7f g7f, boolean z, boolean z2, boolean z3, boolean z4) {
        ENZ A00 = A00(userSession);
        if (g7f != null) {
            A00.A00 = g7f;
        }
        A00.A02 = z3;
        A00.A01 = z;
        A00.A00 = z2;
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putBoolean(AnonymousClass000.A00(1111), z);
        A0a.putBoolean(AnonymousClass000.A00(1110), z2);
        A0a.putBoolean(AnonymousClass000.A00(1112), z4);
        A00.A02(context, A0a);
    }
}
