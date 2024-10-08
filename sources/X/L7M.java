package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class L7M {
    public final Context A00;
    public final UserSession A01;
    public final AnonymousClass0eM A02;

    public L7M(AnonymousClass4DH r11, UserSession userSession, C16380Utx utx, M0W m0w, C63678L2o l2o, String str) {
        0qQ.A0B(userSession, 2);
        this.A01 = userSession;
        C20614Wvv wvv = new C20614Wvv(47, m0w, this);
        AnonymousClass0eM A002 = C66292MMb.A00(C66292MMb.A01(r11, 45), 0eO.A02, 46);
        this.A02 = DbS.A0I(C66292MMb.A01(A002, 47), wvv, new C20614Wvv(46, (Object) null, A002), DbS.A0z(C60256JiD.class));
        this.A00 = r11.requireContext();
        2YL A0H = DbS.A0H(this.A02);
        DbX.A1W(A0H, str, C318116oQ.A00(A0H), 30);
        DbZ.A1C(r11, new C66172MGj(utx, l2o, this, (AnonymousClass4D7) null, 32), ((C60256JiD) this.A02.getValue()).A08);
    }
}
