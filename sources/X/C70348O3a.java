package X;

import java.util.Set;

/* renamed from: X.O3a  reason: case insensitive filesystem */
public abstract class C70348O3a {
    public static final C266444Yx A00(1R7 r1, String str) {
        int i;
        Set set = r1.A0C;
        if (set.contains("ig_select_video_nux")) {
            i = 2131976999;
        } else if (set.contains("ig_video_nux")) {
            i = 2131977006;
        } else if (str != null) {
            return new C52255GKw(str);
        } else {
            return null;
        }
        return JTP.A0Q(i);
    }
}
