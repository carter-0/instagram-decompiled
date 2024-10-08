package X;

import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

public final class U7C extends 02Z {
    public final int A00;

    public U7C(int i) {
        this.A00 = i;
    }

    public final void A0Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        switch (this.A00) {
            case 0:
            case 1:
            case 3:
                U7C.super.A0Y(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setEnabled(true);
                return;
            case 2:
                AnonymousClass7TG.A1N(view, accessibilityNodeInfoCompat);
                U7C.super.A0Y(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setRoleDescription("Button");
                return;
            default:
                U7C.super.A0Y(view, accessibilityNodeInfoCompat);
                return;
        }
    }
}
