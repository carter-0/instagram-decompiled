package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Naq  reason: case insensitive filesystem */
public final class C68913Naq extends PC8 {
    public final Context A00;
    public final AnonymousClass7L2 A01;
    public final 2FW A02 = 2FW.A1A;
    public final UserSession A03;
    public final AnonymousClass9HC A04;

    public final boolean AFT(C74541Pwa pwa, C74552Pwl pwl, int i) {
        Integer Acu;
        0qQ.A0B(pwl, 0);
        if (super.AFT(pwa, pwl, i) || ((Acu = pwl.Acu(i)) != null && Acu.intValue() == 1 && 0qQ.A0K(pwl.Acr(i), "image/png"))) {
            return true;
        }
        return false;
    }

    public C68913Naq(Context context, UserSession userSession, AnonymousClass9HC r4, AnonymousClass7L2 r5) {
        super(context, userSession, r4, r5);
        this.A00 = context;
        this.A03 = userSession;
        this.A01 = r5;
        this.A04 = r4;
    }
}
