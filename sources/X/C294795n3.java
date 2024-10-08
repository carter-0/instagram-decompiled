package X;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: X.5n3  reason: invalid class name and case insensitive filesystem */
public final class C294795n3 extends View.AccessibilityDelegate {
    public final /* synthetic */ Context A00;

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        0qQ.A0B(view, 0);
        0qQ.A0B(accessibilityNodeInfo, 1);
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, this.A00.getString(2131971731)));
    }

    public C294795n3(Context context) {
        this.A00 = context;
    }
}
