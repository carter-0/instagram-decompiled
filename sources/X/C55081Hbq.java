package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.Hbq  reason: case insensitive filesystem */
public abstract class C55081Hbq {
    public static final Bundle A00(C55813Hnt hnt) {
        Bundle A0a = AnonymousClass7TE.A0a();
        UserSession userSession = hnt.A01;
        if (userSession != null) {
            DbU.A1D(A0a, userSession);
        }
        A0a.putString(AnonymousClass000.A00(2395), hnt.A02);
        A0a.putParcelable(AnonymousClass000.A00(2399), hnt.A00);
        A0a.putBoolean(AnonymousClass000.A00(2398), false);
        A0a.putString(AnonymousClass000.A00(2396), hnt.A03);
        A0a.putBoolean(AnonymousClass000.A00(2397), hnt.A04);
        return A0a;
    }
}
