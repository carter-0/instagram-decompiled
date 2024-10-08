package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.35K  reason: invalid class name */
public final class AnonymousClass35K extends C252233om {
    public final Activity A00;
    public final UserSession A01;
    public final C2355630i A02;

    public final void onResume() {
        UserSession userSession = this.A01;
        List A08 = 28K.A00(userSession).A08();
        if (!A08.isEmpty()) {
            AnonymousClass3Q2 r0 = (AnonymousClass3Q2) A08.get(A08.size() - 1);
            String str = r0.A33;
            if (r0.A5P && str != null && AnonymousClass0t1.A01.A01(userSession).A0N() == AnonymousClass05K.A01) {
                11Z.A04(new C20234WnY(this, str), 200);
            }
        }
    }

    public AnonymousClass35K(Activity activity, UserSession userSession, C2355630i r3) {
        this.A00 = activity;
        this.A01 = userSession;
        this.A02 = r3;
    }
}
