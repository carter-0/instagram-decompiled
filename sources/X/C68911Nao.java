package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Nao  reason: case insensitive filesystem */
public final class C68911Nao extends PC8 {
    public final AnonymousClass9HC A00;
    public final AnonymousClass7L2 A01;
    public final 2FW A02 = 2FW.A1j;
    public final UserSession A03;

    public final boolean AFT(C74541Pwa pwa, C74552Pwl pwl, int i) {
        0qQ.A0B(pwl, 0);
        if (!super.AFT(pwa, pwl, i)) {
            return false;
        }
        Integer BS8 = pwl.BS8(i);
        if (BS8 == null || BS8.intValue() != 3) {
            return true;
        }
        return false;
    }

    public C68911Nao(Context context, UserSession userSession, AnonymousClass9HC r4, AnonymousClass7L2 r5) {
        super(context, userSession, r4, r5);
        this.A03 = userSession;
        this.A01 = r5;
        this.A00 = r4;
    }
}
