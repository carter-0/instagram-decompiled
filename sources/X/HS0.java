package X;

import android.text.Layout;
import android.util.SparseIntArray;
import android.view.View;
import com.facebook.rendercore.text.RCTextView;

public abstract class HS0 {
    public static final boolean A00(C307896Rx r3, AnonymousClass6Tm r4) {
        View A05 = DbY.A0P(r4, 0).A05(r3.A03);
        if (A05 instanceof RCTextView) {
            RCTextView rCTextView = (RCTextView) A05;
            if (rCTextView.A04) {
                return true;
            }
            Layout layout = rCTextView.A02;
            SparseIntArray sparseIntArray = C308176Ta.A00;
            int i = 0;
            while (i < layout.getLineCount()) {
                if (layout.getEllipsisCount(i) <= 0) {
                    i++;
                } else if (i != -1) {
                    return true;
                } else {
                    return false;
                }
            }
            return false;
        }
        1Kn.A02(C273654mx.A00(572), "called on non-text component");
        return false;
    }
}
