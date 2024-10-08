package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.4ia  reason: invalid class name and case insensitive filesystem */
public abstract class C271274ia {
    public static final void A00(Activity activity, Context context, UserSession userSession, C258453z5 r7, C247113fn r8, AnonymousClass3W1 r9, boolean z) {
        0qQ.A0B(activity, 0);
        0qQ.A0B(r8, 2);
        0qQ.A0B(r9, 3);
        0qQ.A0B(userSession, 4);
        0qQ.A0B(context, 5);
        if (r7 != null) {
            AnonymousClass3W1 r2 = r7.A02;
            if (!(r2 == null || r2 == r9)) {
                r2.A0M(r7, (Integer) null, true);
            }
            r7.A02 = r9;
            r7.A01 = r8;
            r7.A00 = activity;
            if (r8.A07) {
                C255913uv A00 = r7.A00();
                if (A00 != null) {
                    C247033ff r0 = r8.A02;
                    C247053fh r1 = r8.A03;
                    Integer num = r0.A00;
                    if (num != null) {
                        A00.setActiveColor(context.getColor(num.intValue()));
                    }
                    Integer num2 = r1.A00;
                    if (num2 != null) {
                        A00.setInactiveColor(context.getColor(num2.intValue()));
                    }
                    A00.setVisibility(0);
                    A00.A01(r9.A03, r8.A00);
                    A00.setCurrentPage(r9.A02);
                    A00.setDarkMode(false);
                    r9.A0L(r7, (Integer) null, true);
                    if (r8.A06) {
                        A00.A08 = new AnonymousClass54P(A00, new GVA(userSession, r8.A04, r9));
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            } else if (z || !r8.A05 || r7.A03) {
                0nA.A0O(r7.A00());
            }
        }
    }
}
