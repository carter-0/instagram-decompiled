package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.PHh  reason: case insensitive filesystem */
public final class C72727PHh implements MVB {
    public final /* synthetic */ AnonymousClass921 A00;

    public final void onDismiss() {
    }

    public final void onShow() {
    }

    public final /* synthetic */ void onTextClick(View view) {
    }

    public C72727PHh(AnonymousClass921 r1) {
        this.A00 = r1;
    }

    public final void onButtonClick(View view) {
        I4R i4r = I4R.A00;
        AnonymousClass921 r5 = this.A00;
        UserSession userSession = r5.A05;
        i4r.A01(r5.A00, AnonymousClass0kN.A02(userSession), r5.A09, "reminder_toast_tap");
        C56352Hx3.A01(r5.A02, userSession, "reminder_toast");
    }
}
