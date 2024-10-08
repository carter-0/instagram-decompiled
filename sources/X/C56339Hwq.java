package X;

import android.os.SystemClock;
import android.view.MotionEvent;
import com.instagram.api.schemas.IGAdsStoryInteractiveMediaGestureType;
import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.List;

/* renamed from: X.Hwq  reason: case insensitive filesystem */
public abstract class C56339Hwq {
    public static final boolean A00(MotionEvent motionEvent, C239733Hx r8, UserSession userSession, C309426Yf r10, int i, int i2) {
        int i3;
        Integer num;
        if (!(!r10.A0q)) {
            return true;
        }
        if (r8 == null || (num = r8.A04) == null) {
            i3 = 0;
        } else {
            i3 = num.intValue();
        }
        if (((double) (SystemClock.uptimeMillis() - r10.A0O)) > ((double) i3)) {
            return true;
        }
        0Tu r2 = 0Tu.A06;
        if (!182.A06(r2, userSession, 36319059498965901L)) {
            return false;
        }
        float A00 = C51965G9l.A00(r2, userSession, 37163484429156639L);
        float A002 = C51965G9l.A00(r2, userSession, 37163484429222176L);
        if (A00 <= 0.0f || A002 <= 0.0f) {
            return false;
        }
        float f = (float) i2;
        float f2 = ((1.0f - A002) / 2.0f) * f;
        float f3 = f - f2;
        float y = motionEvent.getY();
        if (f2 > y || y > f3) {
            return false;
        }
        float f4 = (float) i;
        float f5 = ((1.0f - A00) / 2.0f) * f4;
        float f6 = f4 - f5;
        float x = motionEvent.getX();
        if (f5 > x || x > f6) {
            return false;
        }
        return true;
    }

    public static final boolean A01(C239733Hx r4) {
        List<Object> list;
        if (!(r4 == null || (list = r4.A05) == null || ((list instanceof Collection) && list.isEmpty()))) {
            for (Object obj : list) {
                if (obj == IGAdsStoryInteractiveMediaGestureType.TAP_AND_HOLD_TO_INTERACT) {
                    return true;
                }
            }
        }
        return false;
    }
}
