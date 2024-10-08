package X;

import android.content.Context;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* renamed from: X.7vf  reason: invalid class name and case insensitive filesystem */
public final class C346737vf extends 02Z {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C346607vS A01;

    public final void A0Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        0qQ.A0B(view, 0);
        0qQ.A0B(accessibilityNodeInfoCompat, 1);
        C346737vf.super.A0Y(view, accessibilityNodeInfoCompat);
        04x r0 = 04x.A08;
        Context context = this.A01.A09;
        04x r3 = new 04x(16, 02K.A01(context).getString(this.A00));
        04x r02 = new 04x(32, 02K.A01(context).getString(2131976978));
        accessibilityNodeInfoCompat.addAction(r3);
        accessibilityNodeInfoCompat.addAction(r02);
    }

    public C346737vf(C346607vS r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }
}
