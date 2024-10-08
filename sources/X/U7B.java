package X;

import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

public final class U7B extends 02Z {
    public final int A00;

    public U7B(int i) {
        this.A00 = i;
    }

    public final void A0Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        switch (this.A00) {
            case 0:
                U7B.super.A0Y(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setClickable(false);
                accessibilityNodeInfoCompat.removeAction(04x.A08);
                return;
            case 1:
                AnonymousClass7TG.A1N(view, accessibilityNodeInfoCompat);
                U7B.super.A0Y(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setClassName("android.widget.Button");
                return;
            case 2:
                boolean A1Z = AnonymousClass7TG.A1Z(view, accessibilityNodeInfoCompat);
                U7B.super.A0Y(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.mInfo.setFocusable(A1Z);
                accessibilityNodeInfoCompat.setClickable(A1Z);
                return;
            default:
                AnonymousClass7TG.A1N(view, accessibilityNodeInfoCompat);
                U7B.super.A0Y(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.addAction(16);
                return;
        }
    }
}
