package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Nan  reason: case insensitive filesystem */
public final class C68910Nan extends PC8 {
    public final Context A00;
    public final AnonymousClass9HO A01;
    public final AnonymousClass7L2 A02;
    public final 2FW A03 = 2FW.A1g;

    public final boolean AFT(C74541Pwa pwa, C74552Pwl pwl, int i) {
        0qQ.A0B(pwl, 0);
        if (!(pwl instanceof PCL) || ((PCL) pwl).BmP(i) == null) {
            return super.AFT(pwa, pwl, i);
        }
        return false;
    }

    public C68910Nan(Context context, UserSession userSession, AnonymousClass9HO r4, AnonymousClass9HC r5, AnonymousClass7L2 r6) {
        super(context, userSession, r5, r6);
        this.A00 = context;
        this.A02 = r6;
        this.A01 = r4;
    }
}
