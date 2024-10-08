package X;

import android.content.Context;
import android.content.res.Configuration;

/* renamed from: X.V4h  reason: case insensitive filesystem */
public abstract class C16748V4h {
    public static int A00(Context context) {
        Configuration A0G = Pxf.A0G(context);
        int i = A0G.screenWidthDp;
        int i2 = A0G.screenHeightDp;
        if (A0G.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i < 500) {
            if (i > 480) {
                if (i2 > 640) {
                    return 4;
                }
                return 3;
            } else if (i >= 360) {
                return 3;
            } else {
                return 2;
            }
        }
        return 4;
    }
}
