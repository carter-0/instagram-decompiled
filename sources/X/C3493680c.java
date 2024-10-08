package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.80c  reason: invalid class name and case insensitive filesystem */
public final class C3493680c extends C228042kh {
    public final Context A00;
    public final UserSession A01;
    public final boolean A02;
    public final boolean A03;

    public C3493680c(Context context, UserSession userSession, boolean z, boolean z2) {
        0qQ.A0B(context, 1);
        0qQ.A0B(userSession, 2);
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = z;
        this.A03 = z2;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        Context applicationContext = this.A00.getApplicationContext();
        0qQ.A07(applicationContext);
        UserSession userSession = this.A01;
        boolean z = this.A02;
        boolean z2 = this.A03;
        0qQ.A0B(userSession, 1);
        C3493780d r1 = (C3493780d) userSession.A01(C3493780d.class, new C377869No(applicationContext, userSession, 0, z, z2));
        r1.A00 = z;
        r1.A01 = z2;
        return new C357638Yz(userSession, r1);
    }
}
