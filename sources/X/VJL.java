package X;

import android.os.Build;
import android.view.ViewGroup;

public abstract class VJL {
    public static boolean A00 = true;

    public static void A00(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            C16764V4x.A00(viewGroup, z);
        } else if (A00) {
            try {
                C16764V4x.A00(viewGroup, z);
            } catch (NoSuchMethodError unused) {
                A00 = false;
            }
        }
    }
}
