package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.T8a  reason: case insensitive filesystem */
public final class C12813T8a implements MUX {
    public final /* synthetic */ R8T A00;

    public C12813T8a(R8T r8t) {
        this.A00 = r8t;
    }

    public final void DJm(Integer num) {
        SQH.A03(this.A00);
    }

    public final void DJn() {
        R8T r8t = this.A00;
        Context context = r8t.A00;
        0qQ.A0A(context);
        UserSession userSession = r8t.A08;
        0qQ.A0A(userSession);
        r8t.requireActivity();
        0hq r0 = r8t.A07;
        0qQ.A0A(r0);
        F8T.A01(context, r0, userSession);
    }
}
