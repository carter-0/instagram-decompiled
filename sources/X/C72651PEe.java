package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.PEe  reason: case insensitive filesystem */
public final class C72651PEe implements C74416PuW {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ JPL A02;
    public final /* synthetic */ N4P A03;

    public C72651PEe(Context context, UserSession userSession, JPL jpl, N4P n4p) {
        this.A01 = userSession;
        this.A03 = n4p;
        this.A00 = context;
        this.A02 = jpl;
    }

    public final void D84() {
        int i;
        UserSession userSession = this.A01;
        N4P n4p = this.A03;
        C69955Nuv.A00(userSession, n4p, true);
        Context context = this.A00;
        AnonymousClass7TG.A1N(context, userSession);
        new C67100MiK(context, userSession).A03(n4p.A08(), AnonymousClass05K.A07);
        C313756gx A002 = C313746gw.A00(userSession);
        int A06 = n4p.A06();
        A002.A0J(AnonymousClass05K.A01, N4P.A03(n4p), n4p.A0Q, A06);
        int i2 = n4p.A09;
        if (AnonymousClass48O.A02(i2) || AnonymousClass48O.A01(i2)) {
            i = 2131959030;
        } else {
            i = 2131958987;
            if (i2 == 29) {
                i = 2131958920;
            }
        }
        DbU.A0z(context, i);
        this.A02.Cfo();
    }

    public final void onDismiss() {
        C69955Nuv.A00(this.A01, this.A03, false);
    }
}
