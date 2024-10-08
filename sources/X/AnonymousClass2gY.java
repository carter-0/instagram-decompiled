package X;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: X.2gY  reason: invalid class name */
public abstract class AnonymousClass2gY {
    public static final void A00(View view, int i, int i2, boolean z) {
        0qQ.A0B(view, 0);
        2eS.A04(view, AnonymousClass05K.A01);
        03v.A0B(view, new AnonymousClass2gZ(view.getResources(), i, i2, z));
    }

    public static final void A01(View view, boolean z) {
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        try {
            view.onInitializeAccessibilityNodeInfo(obtain);
            CharSequence tooltipText = obtain.getTooltipText();
            if (tooltipText != null && tooltipText.length() != 0) {
                03v.A0B(view, new C226312ga(tooltipText, z));
            }
        } catch (NullPointerException unused) {
        }
    }
}
