package X;

import android.os.Build;

public abstract class RRV {
    public static boolean A00(int i) {
        if (!(i == 15 || i == 255)) {
            if (i != 32768) {
                if (i != 32783) {
                    if (i == 33023 || i == 0) {
                        return true;
                    }
                    return false;
                } else if (Build.VERSION.SDK_INT > 29) {
                    return true;
                } else {
                    return false;
                }
            } else if (Build.VERSION.SDK_INT >= 30) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }
}
