package X;

import android.content.res.Resources;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* renamed from: X.2gZ  reason: invalid class name */
public final class AnonymousClass2gZ extends 02Z {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Resources A02;
    public final /* synthetic */ boolean A03;

    public final void A0Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        0qQ.A0B(view, 0);
        0qQ.A0B(accessibilityNodeInfoCompat, 1);
        AnonymousClass2gZ.super.A0Y(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.mInfo.setSelected(this.A03);
        accessibilityNodeInfoCompat.setRoleDescription(view.getContext().getString(2131974924));
        accessibilityNodeInfoCompat.mInfo.setTooltipText(this.A02.getString(2131963049, new Object[]{Integer.valueOf(this.A01), Integer.valueOf(this.A00)}));
    }

    public AnonymousClass2gZ(Resources resources, int i, int i2, boolean z) {
        this.A03 = z;
        this.A02 = resources;
        this.A01 = i;
        this.A00 = i2;
    }
}
