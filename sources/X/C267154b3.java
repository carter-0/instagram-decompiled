package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.4b3  reason: invalid class name and case insensitive filesystem */
public abstract class C267154b3 {
    public static final void A00(View view, AnonymousClass0iw r3, UserSession userSession, 1Xj r5) {
        0qQ.A0B(userSession, 2);
        0qQ.A0B(r3, 3);
        A01(view, userSession, r5, new C308396Uc(r3), false);
    }

    public static final void A01(View view, UserSession userSession, 1Xj r14, AnonymousClass4DU r15, boolean z) {
        C246153e7 r5;
        1Xj r8 = r14;
        0qQ.A0B(r14, 1);
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 2);
        AnonymousClass4DU r9 = r15;
        0qQ.A0B(r15, 3);
        C238833Dp A00 = C238833Dp.A00(userSession);
        0qQ.A07(A00);
        if (z) {
            Context context = view.getContext();
            0qQ.A07(context);
            r5 = new C246153e7(new AnonymousClass4HH(context, new AnonymousClass3W1(r14.A0o(), r14.A4o()), userSession, r14), userSession2, r8, r9, "in_app_browser_v2", 0sl.A00);
        } else {
            r5 = new C246153e7((AnonymousClass4HI) null, userSession, r14, r15);
        }
        A00.A0A(view, r5);
    }

    public static final void A02(View view, UserSession userSession, String str) {
        long j;
        0qQ.A0B(view, 0);
        0qQ.A0B(userSession, 1);
        if (AnonymousClass3GL.A01(userSession)) {
            Long A0n = 00y.A0n(10, str);
            if (A0n != null) {
                j = A0n.longValue();
            } else {
                j = 0;
            }
            C238833Dp A00 = C238833Dp.A00(userSession);
            0qQ.A07(A00);
            A00.A0A(view, new C267164b4(j));
        }
    }
}
