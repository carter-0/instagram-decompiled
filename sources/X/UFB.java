package X;

import android.os.Build;
import android.view.View;

public class UFB extends UFC {
    public static boolean A00 = true;

    public void A04(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.A04(view, i);
        } else if (A00) {
            try {
                C16766V4z.A00(view, i);
            } catch (NoSuchMethodError unused) {
                A00 = false;
            }
        }
    }
}
