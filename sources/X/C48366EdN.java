package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.instagram.common.session.UserSession;

/* renamed from: X.EdN  reason: case insensitive filesystem */
public abstract class C48366EdN {
    public static final void A00(Context context, Bitmap bitmap, 1P0 r8, UserSession userSession, AnonymousClass4D6 r10, boolean z) {
        0qQ.A0B(r10, 4);
        Bitmap bitmap2 = bitmap;
        if (bitmap != null) {
            String valueOf = String.valueOf(System.currentTimeMillis());
            Context context2 = context;
            if (context != null) {
                C290815g0 r3 = new C290815g0(new C13148TNg(context2, bitmap2, userSession, valueOf, 1), 449);
                1Fc r2 = new 1Fc();
                r2.A05(AnonymousClass000.A00(5225), String.valueOf(z));
                r3.A00 = new EHP(r8, r2, userSession, valueOf);
                r10.schedule(r3);
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }
}
