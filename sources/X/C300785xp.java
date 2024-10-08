package X;

import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.instagram.ui.widget.drawing.StrokeWidthTool;

/* renamed from: X.5xp  reason: invalid class name and case insensitive filesystem */
public final class C300785xp extends 02Z {
    public Integer A00;
    public final StrokeWidthTool A01;

    public final void A0Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        0qQ.A0B(view, 0);
        0qQ.A0B(accessibilityNodeInfoCompat, 1);
        C300785xp.super.A0Y(view, accessibilityNodeInfoCompat);
        04x r0 = 04x.A04;
        accessibilityNodeInfoCompat.addAction(new 04x(32, this.A01.getContext().getString(2131974576)));
    }

    public C300785xp(StrokeWidthTool strokeWidthTool) {
        this.A01 = strokeWidthTool;
        03v.A0B(strokeWidthTool, this);
    }
}
