package X;

import android.content.Context;
import android.view.MotionEvent;
import com.instagram.common.session.UserSession;

public final class FGG {
    public static final FGG A00 = new Object();

    public static final void A00(UserSession userSession, float f) {
        0xY A0p = AnonymousClass7TE.A0p(1Au.A00(userSession));
        A0p.E5c("stories_swipe_up_iab_dwell", (long) f);
        A0p.apply();
    }

    public static final boolean A01(Context context, MotionEvent motionEvent, MotionEvent motionEvent2) {
        double A09 = (double) 0nA.A09(context);
        int i = (int) (0.7d * A09);
        int i2 = (int) (A09 * 0.3d);
        if (Math.abs(motionEvent.getRawY() - motionEvent2.getRawY()) <= 0.0f || motionEvent.getRawX() <= ((float) i2) || motionEvent.getRawX() >= ((float) i)) {
            return false;
        }
        return true;
    }

    public static final boolean A02(Context context, MotionEvent motionEvent, MotionEvent motionEvent2) {
        return AnonymousClass7TF.A1R((Math.abs(motionEvent.getRawY() - motionEvent2.getRawY()) > 0nA.A04(context, 120) ? 1 : (Math.abs(motionEvent.getRawY() - motionEvent2.getRawY()) == 0nA.A04(context, 120) ? 0 : -1)));
    }

    public final float A03(UserSession userSession) {
        0xa A0q = AnonymousClass7TE.A0q(userSession);
        if (DbT.A1a(A0q, "has_set_stories_swipe_up_iab_dwell")) {
            return (float) DbW.A06(A0q, "stories_swipe_up_iab_dwell");
        }
        float A002 = new F26(userSession).A00("4279");
        A00(userSession, A002);
        DbW.A1L(A0q.AR4(), "has_set_stories_swipe_up_iab_dwell");
        return A002;
    }

    public final float A04(UserSession userSession) {
        float A06 = (float) DbW.A06(AnonymousClass7TE.A0q(userSession), "stories_swipe_up_iab_dwell");
        if (A06 < 150.0f) {
            float A002 = new F26(userSession).A00("4279");
            if (A002 >= 150.0f) {
                A00(userSession, A002);
                return A002;
            }
        }
        return A06;
    }
}
