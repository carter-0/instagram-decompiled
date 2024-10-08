package X;

import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* renamed from: X.6pB  reason: invalid class name and case insensitive filesystem */
public final class C318576pB extends 02Z {
    public final /* synthetic */ String A00;

    public C318576pB(String str) {
        this.A00 = str;
    }

    public final void A0Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        C318576pB.super.A0Y(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.addAction(new 04x(16, this.A00));
    }
}
