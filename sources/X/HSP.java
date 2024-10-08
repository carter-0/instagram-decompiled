package X;

import android.view.View;
import com.facebook.litho.ComponentTree;

public abstract class HSP {
    public static void A00(C251263mp r3, ComponentTree componentTree, AnonymousClass2T3 r5, int i, int i2) {
        int max;
        if (!componentTree.Cab()) {
            componentTree.A0O(r3, r5, i, View.MeasureSpec.makeMeasureSpec(0, 0));
            if (r5 != null) {
                int mode = View.MeasureSpec.getMode(i2);
                if (mode == Integer.MIN_VALUE) {
                    max = Math.max(0, Math.min(View.MeasureSpec.getSize(i2), r5.A00));
                } else if (mode == 1073741824) {
                    max = View.MeasureSpec.getSize(i2);
                }
                r5.A00 = max;
            } else {
                return;
            }
        } else if (r5 == null) {
            return;
        }
        r5.A01 = Math.max(0, r5.A01);
        r5.A00 = Math.max(0, r5.A00);
    }
}
