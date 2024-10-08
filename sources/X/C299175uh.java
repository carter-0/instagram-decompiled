package X;

import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* renamed from: X.5uh  reason: invalid class name and case insensitive filesystem */
public final class C299175uh extends 02Z {
    public final C276544tV A00;

    public C299175uh(C276544tV r1) {
        this.A00 = r1;
    }

    public final void A0Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        C299175uh.super.A0Y(view, accessibilityNodeInfoCompat);
        C276544tV r3 = this.A00;
        String A0K = r3.A0K(36);
        String A0K2 = r3.A0K(38);
        if (A0K != null) {
            accessibilityNodeInfoCompat.setContentDescription(A0K);
        }
        V6J.A00(view.getContext(), view, accessibilityNodeInfoCompat, A0K2);
        String A0K3 = r3.A0K(40);
        if (A0K3 != null) {
            accessibilityNodeInfoCompat.addAction(new 04x(16, A0K3));
        }
        boolean A0R = r3.A0R(42, false);
        boolean A0R2 = r3.A0R(43, false);
        accessibilityNodeInfoCompat.mInfo.setSelected(A0R);
        accessibilityNodeInfoCompat.setEnabled(!A0R2);
    }
}
