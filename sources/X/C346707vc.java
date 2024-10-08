package X;

import android.content.Context;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* renamed from: X.7vc  reason: invalid class name and case insensitive filesystem */
public final class C346707vc extends 02Z {
    public final /* synthetic */ C346607vS A00;

    public final void A0Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        0qQ.A0B(view, 0);
        0qQ.A0B(accessibilityNodeInfoCompat, 1);
        C346707vc.super.A0Y(view, accessibilityNodeInfoCompat);
        04x r0 = 04x.A08;
        Context context = this.A00.A09;
        04x r3 = new 04x(16, 02K.A01(context).getString(2131956167));
        04x r02 = new 04x(32, 02K.A01(context).getString(2131961451));
        accessibilityNodeInfoCompat.addAction(r3);
        accessibilityNodeInfoCompat.addAction(r02);
    }

    public C346707vc(C346607vS r1) {
        this.A00 = r1;
    }
}
