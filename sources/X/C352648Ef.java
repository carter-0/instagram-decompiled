package X;

import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* renamed from: X.8Ef  reason: invalid class name and case insensitive filesystem */
public final class C352648Ef extends 02Z {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;

    public final void A0Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        0qQ.A0B(view, 0);
        0qQ.A0B(accessibilityNodeInfoCompat, 1);
        C352648Ef.super.A0Y(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.mInfo.setTraversalAfter(this.A01);
        View view2 = this.A00;
        int i = 2131954602;
        if (view2.isSelected()) {
            i = 2131954601;
        }
        04x r0 = 04x.A08;
        accessibilityNodeInfoCompat.addAction(new 04x(16, view2.getResources().getString(i)));
    }

    public C352648Ef(View view, View view2) {
        this.A01 = view;
        this.A00 = view2;
    }
}
