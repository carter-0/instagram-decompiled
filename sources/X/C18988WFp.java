package X;

import android.app.Activity;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.WFp  reason: case insensitive filesystem */
public final class C18988WFp implements X2H {
    public final /* synthetic */ C18986WFn A00;
    public final /* synthetic */ AnonymousClass1ZO A01;

    public C18988WFp(C18986WFn wFn, AnonymousClass1ZO r2) {
        this.A01 = r2;
        this.A00 = wFn;
    }

    public final void CIa(Activity activity, String str) {
        UserSession userSession = this.A00.A00;
        SUL sul = new SUL(activity, userSession, 2EG.A0M, str, false);
        sul.A0E(userSession.A06);
        sul.A0S = "ar_ads_camera";
        sul.A0A();
        C238833Dp A002 = C238833Dp.A00(userSession);
        0qQ.A07(A002);
        View requireViewById = activity.requireViewById(R.id.arads_camera_container);
        0qQ.A07(requireViewById);
        A002.A0B(requireViewById, new String[0]);
    }
}
