package X;

import android.content.Context;

public abstract class GNJ {
    public static final GNW A00(Context context, String str) {
        0qQ.A0B(str, 0);
        0qQ.A0B(context, 1);
        GNW gnw = GNW.CLIPS_LAYOUT;
        if (!str.equals("VIDEO_LAYOUT")) {
            gnw = GNW.DUAL;
            if (!str.equals("DUAL") || !C3495180r.A01(context)) {
                return null;
            }
        }
        return gnw;
    }
}
