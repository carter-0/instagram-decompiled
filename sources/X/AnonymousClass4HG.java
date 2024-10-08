package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.4HG  reason: invalid class name */
public abstract class AnonymousClass4HG {
    public static final void A00(Context context, View view, UserSession userSession, 1Xj r6, AnonymousClass4DU r7, AnonymousClass3W1 r8) {
        0qQ.A0B(r6, 3);
        0qQ.A0B(r8, 4);
        0qQ.A0B(r7, 5);
        C238833Dp A00 = C238833Dp.A00(userSession);
        0qQ.A07(A00);
        if (!r6.A5D()) {
            A00.A05(view, C238863Ds.ATTACHMENT);
        } else if (!r6.A4e()) {
            A00.A06(view, C238863Ds.ATTACHMENT, r8.A03);
        }
        A00.A0A(view, new C246153e7(new AnonymousClass4HH(context, r8, userSession, r6), userSession, r6, r7));
    }
}
