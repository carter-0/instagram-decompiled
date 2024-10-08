package X;

import android.os.Build;
import android.util.Pair;
import org.webrtc.ScreenCapturerAndroid;

public abstract class LQN {
    public static Boolean A00;
    public static final int[] A01 = {720, 640, ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI};

    public static final Pair A00(int i, int i2, int i3) {
        float f = (((float) i2) * 1.0f) / ((float) i3);
        if (A01()) {
            int i4 = Integer.MAX_VALUE;
            int[] iArr = A01;
            int i5 = 0;
            int i6 = i;
            do {
                int i7 = iArr[i5];
                int i8 = i - i7;
                if (Math.abs(i8) < i4) {
                    i4 = Math.abs(i8);
                    i6 = i7;
                }
                i5++;
            } while (i5 < 3);
            i = i6;
        }
        int A04 = JTO.A04((float) i, 16.0f) * 16;
        return new Pair(Integer.valueOf(A04), Integer.valueOf(JTO.A04(((float) A04) / f, 16.0f) * 16));
    }

    public static final boolean A01() {
        boolean z = true;
        if (1AW.A06(0Tu.A05, 18296779724292558L)) {
            return true;
        }
        Boolean bool = A00;
        if (bool == null) {
            String str = Build.MODEL;
            0qQ.A08(str);
            if (!00l.A0d(str, "XT1049", false) && !00l.A0d(str, "XT1050", false) && !00l.A0d(str, "XT1052", false) && !00l.A0d(str, "XT1053", false) && !00l.A0d(str, "XT1055", false) && !00l.A0d(str, "XT1056", false) && !00l.A0d(str, "XT1058", false) && !00l.A0d(str, "XT1060", false)) {
                z = false;
            }
            bool = Boolean.valueOf(z);
            A00 = bool;
            if (bool == null) {
                throw AnonymousClass7TE.A0y();
            }
        }
        return bool.booleanValue();
    }
}
