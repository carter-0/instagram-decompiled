package X;

import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* renamed from: X.3Ji  reason: invalid class name and case insensitive filesystem */
public final class C240033Ji extends 02Z {
    public final boolean A00;

    public final void A0Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        0qQ.A0B(view, 0);
        0qQ.A0B(accessibilityNodeInfoCompat, 1);
        C240033Ji.super.A0Y(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.setClassName("android.widget.Button");
        if (this.A00) {
            04x r0 = 04x.A08;
            accessibilityNodeInfoCompat.addAction(new 04x(16, C60960kU.A00.getString(2131964366)));
        }
    }

    public C240033Ji(boolean z) {
        this.A00 = z;
    }
}
