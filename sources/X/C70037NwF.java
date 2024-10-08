package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.NwF  reason: case insensitive filesystem */
public abstract class C70037NwF {
    public static final C68590NOm A00(Context context, AnonymousClass0iw r9, UserSession userSession, C3256673q r11, AnonymousClass7XR r12, AnonymousClass9HC r13) {
        AnonymousClass7XR r7 = r12;
        P8B p8b = new P8B(new O76(r9, userSession), (AnonymousClass7Ws) r7);
        C3266077l A01 = C3259074q.A01(p8b, r12, r13);
        C3266077l A012 = C3259074q.A01(P8L.A00, r12, r13);
        C72565PAw pAw = new C72565PAw(context, r9, userSession, p8b, A01);
        return new C68590NOm(userSession, r11, (AnonymousClass7Y0) r7, pAw, A012);
    }
}
