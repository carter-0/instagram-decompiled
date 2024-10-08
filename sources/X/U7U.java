package X;

import android.os.Bundle;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.facebook.common.dextricks.Constants;

public final class U7U extends 057 {
    public final /* synthetic */ 2Vy A00;

    public final AccessibilityNodeInfoCompat A00(int i) {
        int i2;
        2Vy r0 = this.A00;
        if (i == 2) {
            i2 = r0.A00;
        } else {
            i2 = r0.A01;
        }
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return createAccessibilityNodeInfo(i2);
    }

    public U7U(2Vy r1) {
        this.A00 = r1;
    }

    public final AccessibilityNodeInfoCompat createAccessibilityNodeInfo(int i) {
        return new AccessibilityNodeInfoCompat(AccessibilityNodeInfo.obtain(this.A00.A0b(i).mInfo));
    }

    public final boolean performAction(int i, int i2, Bundle bundle) {
        int i3;
        int i4;
        2Vy r2 = this.A00;
        if (i == -1) {
            return r2.A03.performAccessibilityAction(i2, bundle);
        }
        if (i2 == 1) {
            return r2.A0l(i);
        }
        if (i2 == 2) {
            return r2.A0k(i);
        }
        if (i2 == 64) {
            AccessibilityManager accessibilityManager = r2.A04;
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i4 = r2.A00) == i) {
                return false;
            }
            if (i4 != Integer.MIN_VALUE) {
                r2.A00 = AnonymousClass972.MUTABLE_FLAG_MASK;
                r2.A03.invalidate();
                r2.A0d(i4, Constants.LOAD_RESULT_PGO_ATTEMPTED);
            }
            r2.A00 = i;
            r2.A03.invalidate();
            i3 = Constants.LOAD_RESULT_PGO;
        } else if (i2 != 128) {
            return r2.A0m(i, i2, bundle);
        } else {
            if (r2.A00 != i) {
                return false;
            }
            r2.A00 = AnonymousClass972.MUTABLE_FLAG_MASK;
            r2.A03.invalidate();
            i3 = Constants.LOAD_RESULT_PGO_ATTEMPTED;
        }
        r2.A0d(i, i3);
        return true;
    }
}
