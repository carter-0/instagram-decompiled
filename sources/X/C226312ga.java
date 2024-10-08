package X;

import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* renamed from: X.2ga  reason: invalid class name and case insensitive filesystem */
public final class C226312ga extends 02Z {
    public final /* synthetic */ CharSequence A00;
    public final /* synthetic */ boolean A01;

    public final void A0Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        0qQ.A0B(view, 0);
        0qQ.A0B(accessibilityNodeInfoCompat, 1);
        C226312ga.super.A0Y(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.mInfo.setSelected(this.A01);
        accessibilityNodeInfoCompat.setRoleDescription(view.getContext().getString(2131974924));
        accessibilityNodeInfoCompat.mInfo.setTooltipText(this.A00);
    }

    public C226312ga(CharSequence charSequence, boolean z) {
        this.A01 = z;
        this.A00 = charSequence;
    }
}
