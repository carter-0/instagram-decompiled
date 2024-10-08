package X;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

public final class U32 extends View.AccessibilityDelegate {
    public final int A00;
    public final Object A01;

    public U32(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        if (this.A00 != 0) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            return;
        }
        AnonymousClass7TG.A1N(view, accessibilityEvent);
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setChecked(((JW8) this.A01).A0F.A07);
    }

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        if (this.A00 != 0) {
            AnonymousClass7TG.A1N(view, accessibilityNodeInfo);
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            String str2 = ((W7n) this.A01).A0A.A00;
            if (str2 == null || str2.length() == 0) {
                str = null;
            } else {
                str = DbW.A0h(view.getContext(), str2, 2131961741);
            }
            accessibilityNodeInfo.setError(str);
            return;
        }
        boolean A1Z = AnonymousClass7TG.A1Z(view, accessibilityNodeInfo);
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setCheckable(A1Z);
        accessibilityNodeInfo.setChecked(((JW8) this.A01).A0F.A07);
    }
}
