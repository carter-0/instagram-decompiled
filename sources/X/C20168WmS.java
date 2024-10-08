package X;

import android.util.SparseArray;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: X.WmS  reason: case insensitive filesystem */
public final class C20168WmS implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C11651Sdt A01;

    public C20168WmS(View view, C11651Sdt sdt) {
        this.A01 = sdt;
        this.A00 = view;
    }

    public final void run() {
        BottomSheetBehavior bottomSheetBehavior;
        View view = this.A00;
        SparseArray sparseArray = QCW.A06;
        View view2 = (View) view.getParent();
        if (view2 != null && (view2.getLayoutParams() instanceof 2dP) && (bottomSheetBehavior = (BottomSheetBehavior) view2.getLayoutParams().A0A) != null) {
            bottomSheetBehavior.A0V(view.getMeasuredHeight());
        }
    }
}
