package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.6d9  reason: invalid class name and case insensitive filesystem */
public final class C311726d9 extends C228042kh {
    public final Context A00;
    public final UserSession A01;

    public C311726d9(Context context, UserSession userSession) {
        0qQ.A0B(context, 1);
        0qQ.A0B(userSession, 2);
        this.A00 = context;
        this.A01 = userSession;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        Context applicationContext = this.A00.getApplicationContext();
        0qQ.A07(applicationContext);
        return new C311736dA(applicationContext, this.A01);
    }
}
