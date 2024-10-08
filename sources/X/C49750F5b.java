package X;

import android.content.Context;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* renamed from: X.F5b  reason: case insensitive filesystem */
public abstract class C49750F5b {
    public static final int A00(Context context, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        if (((int) 0nA.A01(context, (float) AnonymousClass0nB.A01(context))) < 384 || !182.A06(0Tu.A05, userSession, 36329573578784971L)) {
            return 3;
        }
        return 4;
    }

    public static final void A01(Context context, ViewGroup.MarginLayoutParams marginLayoutParams, UserSession userSession, int i, int i2) {
        0qQ.A0B(marginLayoutParams, 2);
        int A02 = DbS.A02(context, i);
        int A00 = A00(context, userSession);
        if (A00 != 4) {
            int i3 = i2 % A00;
            if (i3 == 2) {
                marginLayoutParams.setMarginEnd(A02);
            } else if (i3 == 0) {
                marginLayoutParams.setMarginStart(A02);
            }
        }
    }
}
