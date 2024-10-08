package X;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;

public final class WC7 implements ViewGroup.OnHierarchyChangeListener {
    public ViewGroup.OnHierarchyChangeListener A00;
    public final /* synthetic */ ChipGroup A01;

    public WC7(ChipGroup chipGroup) {
        this.A01 = chipGroup;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        r3 = (com.google.android.material.chip.ChipGroup) r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onChildViewAdded(android.view.View r8, android.view.View r9) {
        /*
            r7 = this;
            com.google.android.material.chip.ChipGroup r6 = r7.A01
            if (r8 != r6) goto L_0x003c
            boolean r0 = r9 instanceof com.google.android.material.chip.Chip
            if (r0 == 0) goto L_0x003c
            int r0 = r9.getId()
            r5 = -1
            if (r0 != r5) goto L_0x0012
            X.JTP.A13(r9)
        L_0x0012:
            r4 = r9
            com.google.android.material.chip.Chip r4 = (com.google.android.material.chip.Chip) r4
            boolean r0 = r4.isChecked()
            if (r0 == 0) goto L_0x0038
            r3 = r8
            com.google.android.material.chip.ChipGroup r3 = (com.google.android.material.chip.ChipGroup) r3
            int r2 = r4.getId()
            int r1 = r3.A00
            if (r2 == r1) goto L_0x0038
            if (r1 == r5) goto L_0x0030
            boolean r0 = r3.A03
            if (r0 == 0) goto L_0x0030
            r0 = 0
            com.google.android.material.chip.ChipGroup.A00(r3, r1, r0)
        L_0x0030:
            if (r2 == r5) goto L_0x0036
            r0 = 1
            com.google.android.material.chip.ChipGroup.A00(r3, r2, r0)
        L_0x0036:
            r3.A00 = r2
        L_0x0038:
            X.WCo r0 = r6.A08
            r4.A03 = r0
        L_0x003c:
            android.view.ViewGroup$OnHierarchyChangeListener r0 = r7.A00
            if (r0 == 0) goto L_0x0043
            r0.onChildViewAdded(r8, r9)
        L_0x0043:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WC7.onChildViewAdded(android.view.View, android.view.View):void");
    }

    public final void onChildViewRemoved(View view, View view2) {
        if (view == this.A01 && (view2 instanceof Chip)) {
            ((Chip) view2).A03 = null;
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.A00;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
