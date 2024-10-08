package X;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import com.instagram.common.session.UserSession;

public final class I5V {
    public static int A00;
    public static final I5V A01 = new Object();

    public static final 0eP A00(UserSession userSession, 1Xj r7, C53155GjR gjR, int i, int i2) {
        float A0l = r7.A0l();
        if (r7.CeS() || (r7.A5p() && 182.A06(0Tu.A05, userSession, 2342155896851400110L))) {
            0Tu r2 = 0Tu.A06;
            if (A0l <= C51965G9l.A00(r2, userSession, 37157312567246894L) && 182.A06(r2, userSession, 2342155896850744743L)) {
                if (!182.A06(r2, userSession, 2342155896850875816L)) {
                    gjR.A05.setBackgroundColor(Color.parseColor(r7.A0C.getDominantColor()));
                }
                i = (int) (((double) i) * 0.8d);
                return AnonymousClass7TF.A0x(Integer.valueOf(i), i2);
            }
        }
        if (((double) r7.A0l()) >= 182.A00(0Tu.A06, userSession, 37157312568229935L) && 182.A06(0Tu.A05, userSession, 2342155896851858868L)) {
            C51972G9s.A0x(gjR.A05, i, i2);
            i2 = (int) (((float) i2) / r7.A0l());
        }
        return AnonymousClass7TF.A0x(Integer.valueOf(i), i2);
    }

    public static final void A01(Context context, View view, C238863Ds r5, AnonymousClass0iw r6, UserSession userSession, 1Xj r8) {
        C238833Dp.A00(userSession).A05(view, r5);
        C238833Dp A002 = C238833Dp.A00(userSession);
        AnonymousClass4DU r62 = (AnonymousClass4DU) r6;
        AnonymousClass3W1 r1 = new AnonymousClass3W1();
        if (r8.A5D()) {
            r1.A0B(0);
        }
        A002.A0A(view, C51971G9r.A0f(context, r1, userSession, r8, r62));
    }
}
