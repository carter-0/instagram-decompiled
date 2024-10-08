package X;

import android.content.Context;
import android.graphics.Point;
import com.instagram.common.session.UserSession;

public abstract class AEW {
    public static Point A00(float f, int i) {
        int round = Math.round(((float) i) / 2.0f) * 2;
        float f2 = (float) round;
        if (f <= 0.0f || f >= 100.0f) {
            0wb.A03("wrong_aspect_ratio", 002.A0N("value ", f));
        }
        if (f != 0.0f) {
            return new Point(round, Math.round((f2 / f) / 2.0f) * 2);
        }
        throw AnonymousClass7TE.A0w("Aspect Ratio cannot be 0.");
    }

    public static final Point A01(Context context, UserSession userSession, float f, int i) {
        return A00(f, C63472Kxb.A00(context, userSession, i, false, false));
    }

    public static Point A02(Context context, UserSession userSession, int i, int i2, boolean z, boolean z2) {
        if (z) {
            return A00(((float) i) / ((float) i2), C63472Kxb.A00(context, userSession, i, z2, false));
        }
        Point A01 = A01(context, userSession, ((float) i2) / ((float) i), i2);
        return new Point(A01.y, A01.x);
    }
}
