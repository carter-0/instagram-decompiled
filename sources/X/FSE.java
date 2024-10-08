package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

public final class FSE implements AnonymousClass2Kv {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ UserSession A01;

    public FSE(Activity activity, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = activity;
    }

    public final void invoke(AnonymousClass3JD r6) {
        C250663lr A0U;
        C250663lr optionalTreeField;
        if (r6 != null && (A0U = C41845B3m.A0U(r6)) != null && (optionalTreeField = A0U.getOptionalTreeField(0, C273654mx.A00(1019), BqW.class, -1369013323)) != null) {
            String A002 = AnonymousClass000.A00(3232);
            if (optionalTreeField.hasFieldValue(A002) && optionalTreeField.getCoercedBooleanField(0, A002)) {
                UserSession userSession = this.A01;
                Activity activity = this.A00;
                1Wj r0 = 1Wj.A00;
                if (r0 != null) {
                    r0.A03(userSession, activity, "773795347802528");
                }
            }
        }
    }
}
