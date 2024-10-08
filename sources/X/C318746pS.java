package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.6pS  reason: invalid class name and case insensitive filesystem */
public final class C318746pS implements C3250670x {
    public final Context A00;
    public final UserSession A01;
    public final C319866rM A02;
    public final C3250770y A03;
    public final User A04;

    public C318746pS(Context context, UserSession userSession, C319866rM r6, User user) {
        long j;
        0qQ.A0B(r6, 3);
        this.A01 = userSession;
        this.A00 = context;
        this.A02 = r6;
        this.A04 = user;
        Long A0n = 00y.A0n(10, user.getId());
        if (A0n != null) {
            j = A0n.longValue();
        } else {
            j = 0;
        }
        r6.Cze(j, Air());
        this.A03 = C3250770y.SUBSCRIBE;
    }

    public final String Aix() {
        return "generic";
    }

    public final String Air() {
        return C66909Mes.A00(this.A00, C324726zn.A00(this.A01, this.A04)).toString();
    }

    public final C3250770y Aiv() {
        return this.A03;
    }

    public final /* synthetic */ Integer BEK() {
        return null;
    }

    public final /* synthetic */ boolean DP6() {
        return false;
    }

    public final void onClick() {
        this.A02.CzU(this.A04);
    }
}
