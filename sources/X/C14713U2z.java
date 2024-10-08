package X;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: X.U2z  reason: case insensitive filesystem */
public final class C14713U2z extends View.AccessibilityDelegate {
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        AnonymousClass7TF.A1H(view, accessibilityNodeInfo);
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.removeAction(16);
    }
}
