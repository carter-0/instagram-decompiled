package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.3NJ  reason: invalid class name */
public final class AnonymousClass3NJ extends AnonymousClass3NK {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ AnonymousClass3N5 A01;

    public AnonymousClass3NJ(UserSession userSession, AnonymousClass3N5 r2) {
        this.A00 = userSession;
        this.A01 = r2;
    }

    public final void DP5(View view) {
        String str;
        AnonymousClass3N5 r0 = this.A01;
        AnonymousClass3NS r1 = r0.A00;
        if (r1 != null && (str = r0.A02.A01) != null) {
            r1.DcM(str);
        }
    }

    public final boolean Dqe(View view) {
        String str;
        182.A06(0Tu.A05, this.A00, 36327361670560122L);
        AnonymousClass3N5 r0 = this.A01;
        AnonymousClass3NS r1 = r0.A00;
        if (r1 == null || (str = r0.A02.A01) == null) {
            return false;
        }
        r1.DcV(str);
        return true;
    }
}
