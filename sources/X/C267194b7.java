package X;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* renamed from: X.4b7  reason: invalid class name and case insensitive filesystem */
public final class C267194b7 extends 02Z {
    public final /* synthetic */ 2Vx A00;

    public C267194b7(2Vx r1) {
        this.A00 = r1;
    }

    public final void A0R(View view, int i) {
        2Vx.A06(view, this.A00, i);
    }

    public final void A0S(View view, AccessibilityEvent accessibilityEvent) {
        2Vx.A01(view, accessibilityEvent, this.A00);
    }

    public final void A0T(View view, AccessibilityEvent accessibilityEvent) {
        2Vx.A02(view, accessibilityEvent, this.A00);
    }

    public final void A0U(View view, AccessibilityEvent accessibilityEvent) {
        2Vx.A03(view, accessibilityEvent, this.A00);
    }

    public final boolean A0V(View view, int i, Bundle bundle) {
        return 2Vx.A07(bundle, view, this.A00, i);
    }

    public final boolean A0W(View view, AccessibilityEvent accessibilityEvent) {
        2Vx r1 = this.A00;
        Rect rect = 2Vx.A03;
        return r1.A01.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public final boolean A0X(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return 2Vx.A08(view, viewGroup, accessibilityEvent, this.A00);
    }

    public final void A0Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        2Vx.A05(view, accessibilityNodeInfoCompat, this.A00);
    }
}
