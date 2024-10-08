package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class L7N {
    public final Context A00;
    public final UserSession A01;
    public final AnonymousClass0eM A02;

    public L7N(AnonymousClass4DH r8, UserSession userSession, C16380Utx utx, C62423KfY kfY) {
        0qQ.A0B(userSession, 2);
        this.A01 = userSession;
        C20704Wxb wxb = new C20704Wxb(38, this, r8, kfY);
        AnonymousClass0eM A002 = C66292MMb.A00(C66292MMb.A01(r8, 48), 0eO.A02, 49);
        this.A02 = DbS.A0I(new MMN(A002, 0), wxb, new C20614Wvv(48, (Object) null, A002), DbS.A0z(C60302Jj0.class));
        this.A00 = r8.requireContext();
        DbZ.A1C(r8, new C52070GDq(utx, this, (AnonymousClass4D7) null, 7), ((C60302Jj0) this.A02.getValue()).A0F);
    }
}
