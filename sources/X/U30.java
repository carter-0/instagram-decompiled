package X;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

public final class U30 extends View.AccessibilityDelegate {
    public final /* synthetic */ boolean A00;

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean A1U = AnonymousClass7TF.A1U(0, view, accessibilityNodeInfo);
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setCheckable(A1U);
        accessibilityNodeInfo.setChecked(this.A00);
        accessibilityNodeInfo.setSelected(false);
        accessibilityNodeInfo.setClassName("android.widget.Button");
    }

    public U30(boolean z) {
        this.A00 = z;
    }
}
