package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.8h1  reason: invalid class name and case insensitive filesystem */
public final class C361908h1 implements 2YM {
    public final Context A00;
    public final UserSession A01;

    public C361908h1(Context context, UserSession userSession) {
        0qQ.A0B(userSession, 2);
        this.A00 = context;
        this.A01 = userSession;
    }

    public final /* synthetic */ 2YL create(C62230ry r2, AnonymousClass2YQ r3) {
        return 2YT.A00(this, r3, r2);
    }

    public final /* synthetic */ 2YL create(Class cls, AnonymousClass2YQ r3) {
        0qQ.A0B(cls, 1);
        return create(cls);
    }

    public final 2YL create(Class cls) {
        Context context = this.A00;
        UserSession userSession = this.A01;
        context.getApplicationContext();
        C351738Ad r1 = (C351738Ad) userSession.A01(C351738Ad.class, new C66297MMg(userSession, 39));
        return new AnonymousClass8XC(new C361938h4(new C351768Ah(r1), new C361928h3(r1), new C361918h2(r1)));
    }
}
