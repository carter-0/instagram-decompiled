package X;

import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* renamed from: X.3NQ  reason: invalid class name */
public final class AnonymousClass3NQ extends 02Z {
    public final /* synthetic */ AnonymousClass3NG A00;

    public final void A0Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        0qQ.A0B(view, 0);
        0qQ.A0B(accessibilityNodeInfoCompat, 1);
        AnonymousClass3NQ.super.A0Y(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.setClickable(true);
        Integer num = this.A00.A05;
        if (num != null) {
            accessibilityNodeInfoCompat.setClassName(C226302gX.A01(num));
        }
    }

    public AnonymousClass3NQ(AnonymousClass3NG r1) {
        this.A00 = r1;
    }
}
