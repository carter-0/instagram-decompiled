package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.8Hn  reason: invalid class name and case insensitive filesystem */
public abstract class C353418Hn implements AnonymousClass8Ho {
    public boolean A00 = true;
    public final Context A01;
    public final UserSession A02;

    public C353418Hn(UserSession userSession, Context context) {
        this.A02 = userSession;
        this.A01 = context;
    }

    public final boolean A03() {
        W0T A002;
        C357488Yc A012 = C357488Yc.A03.A01(this.A02);
        if (A012 == null || (A002 = A012.A00()) == null || !A002.A0I()) {
            return false;
        }
        return true;
    }

    public final void Dru() {
        if (A03()) {
            APG();
        }
    }
}
