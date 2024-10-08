package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.XFBFXIGPCEntryPoint;
import com.instagram.common.session.UserSession;

public final class F2W {
    public boolean A00;
    public boolean A01;
    public boolean A02 = true;
    public final 1wn A03 = FXZ.A00(this, 0);
    public final UserSession A04;

    public final void A00(FragmentActivity fragmentActivity, boolean z) {
        if (this.A02) {
            this.A02 = false;
            UserSession userSession = this.A04;
            0qQ.A0B(userSession, 1);
            XFBFXIGPCEntryPoint xFBFXIGPCEntryPoint = XFBFXIGPCEntryPoint.LOGIN_INFO;
            EDQ edq = new EDQ(0, (Object) fragmentActivity, (Object) this, z);
            try {
                1OC A002 = C48320Ecd.A00(new C61080JwI(xFBFXIGPCEntryPoint), userSession);
                A002.A00 = edq;
                1ES.A03(A002);
            } catch (Exception e) {
                Dbc.A0w(userSession, xFBFXIGPCEntryPoint, e);
            }
        }
    }

    public F2W(UserSession userSession) {
        this.A04 = userSession;
    }
}
