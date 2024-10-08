package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.common.session.UserSession;

public final class IQF implements C66475MTd {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ 28D A01;
    public final /* synthetic */ AnonymousClass4DH A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ AnonymousClass9P8 A04;

    public IQF(Activity activity, 28D r2, AnonymousClass4DH r3, UserSession userSession, AnonymousClass9P8 r5) {
        this.A03 = userSession;
        this.A01 = r2;
        this.A00 = activity;
        this.A04 = r5;
        this.A02 = r3;
    }

    public final void D81() {
        28D r3 = this.A01;
        I3M.A01(this.A00, (Bundle) null, this.A02, r3, this.A03, false, true);
    }

    public final void DdC(1Xj r11) {
        UserSession userSession = this.A03;
        28D r6 = this.A01;
        C56044Hrt A0C = C250563lf.A0C(r6);
        C52345GOp gOp = C52345GOp.A00;
        Activity activity = this.A00;
        gOp.A0G(activity, this.A04, r11, A0C);
        A0C.A0q = false;
        A0C.A0l = true;
        I3M.A01(activity, A0C.A00(), this.A02, r6, userSession, false, true);
    }
}
