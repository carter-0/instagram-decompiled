package X;

import android.os.Bundle;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.facebook.common.dextricks.Constants;

public final class U7L extends 02Z {
    public final /* synthetic */ 2Tb A00;

    public U7L(2Tb r1) {
        this.A00 = r1;
    }

    public final boolean A0V(View view, int i, Bundle bundle) {
        if (i == 1048576) {
            2Tb r1 = this.A00;
            if (r1.A0C) {
                r1.A06(AnonymousClass05K.A0N);
                return true;
            }
        }
        return U7L.super.A0V(view, i, bundle);
    }

    public final void A0Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        boolean z;
        U7L.super.A0Y(view, accessibilityNodeInfoCompat);
        if (this.A00.A0C) {
            accessibilityNodeInfoCompat.addAction(Constants.LOAD_RESULT_NEED_REOPTIMIZATION);
            z = true;
        } else {
            z = false;
        }
        accessibilityNodeInfoCompat.mInfo.setDismissable(z);
    }
}
