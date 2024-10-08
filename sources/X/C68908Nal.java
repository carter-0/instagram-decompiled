package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Nal  reason: case insensitive filesystem */
public final class C68908Nal extends PC8 {
    public final 2FW A00 = 2FW.A1b;
    public final UserSession A01;
    public final AnonymousClass9HC A02;

    public final boolean AFT(C74541Pwa pwa, C74552Pwl pwl, int i) {
        0qQ.A0B(pwl, 0);
        if (!super.AFT(pwa, pwl, i) || 0qQ.A0K(pwl.Acr(i), "image/png")) {
            return false;
        }
        return true;
    }

    public C68908Nal(Context context, UserSession userSession, AnonymousClass9HC r4, AnonymousClass7L2 r5) {
        super(context, userSession, r4, r5);
        this.A01 = userSession;
        this.A02 = r4;
    }
}
