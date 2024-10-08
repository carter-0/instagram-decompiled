package X;

import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.UEs  reason: case insensitive filesystem */
public final class C14911UEs extends C238073Al {
    public final /* synthetic */ C298425tP A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14911UEs(RecyclerView recyclerView, C298425tP r2) {
        super(recyclerView);
        this.A00 = r2;
    }

    public final void A0Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        C298425tP r1 = this.A00;
        int[] iArr = C298425tP.A07;
        02Z r0 = r1.A00;
        if (r0 != null) {
            r0.A0Y(view, accessibilityNodeInfoCompat);
        }
        accessibilityNodeInfoCompat.removeAction(04x.A0e);
        accessibilityNodeInfoCompat.removeAction(04x.A0Y);
        accessibilityNodeInfoCompat.removeAction(04x.A0b);
        accessibilityNodeInfoCompat.removeAction(04x.A0c);
        accessibilityNodeInfoCompat.removeAction(04x.A0Z);
        accessibilityNodeInfoCompat.removeAction(04x.A0X);
        accessibilityNodeInfoCompat.mInfo.setScrollable(false);
    }
}
