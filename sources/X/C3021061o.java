package X;

import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* renamed from: X.61o  reason: invalid class name and case insensitive filesystem */
public final class C3021061o extends 02Z {
    public final /* synthetic */ CharSequence A00;

    public C3021061o(CharSequence charSequence) {
        this.A00 = charSequence;
    }

    public final void A0Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        C3021061o.super.A0Y(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.addAction(new 04x(16, this.A00));
    }
}
