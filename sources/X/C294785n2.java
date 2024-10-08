package X;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: X.5n2  reason: invalid class name and case insensitive filesystem */
public final class C294785n2 extends View.AccessibilityDelegate {
    public final /* synthetic */ Context A00;

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        0qQ.A0B(view, 0);
        0qQ.A0B(accessibilityNodeInfo, 1);
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, this.A00.getString(2131971756)));
        accessibilityNodeInfo.setClickable(true);
    }

    public C294785n2(Context context) {
        this.A00 = context;
    }
}
