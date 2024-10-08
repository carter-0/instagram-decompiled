package X;

import android.graphics.Bitmap;
import com.instagram.common.session.UserSession;

public final class OKW {
    public final UserSession A00;
    public final AnonymousClass0vF A01;

    public OKW(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        C61620nx A002 = C61610nw.A00();
        A002.A01 = "OnDeviceNudityInferencingManager";
        this.A01 = new AnonymousClass0vF(A002);
    }

    public final void A00(C66515MUt mUt, String str) {
        UserSession userSession = this.A00;
        C278384wn.A00(userSession).A02(str);
        this.A01.ATE(new KJ8((Bitmap) null, (C227052iZ) null, userSession, mUt, str));
    }
}
