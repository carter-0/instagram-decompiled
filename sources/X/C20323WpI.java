package X;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: X.WpI  reason: case insensitive filesystem */
public final class C20323WpI implements Runnable {
    public int A00;
    public boolean A01;
    public final View A02;
    public final /* synthetic */ BottomSheetBehavior A03;

    public C20323WpI(View view, BottomSheetBehavior bottomSheetBehavior, int i) {
        this.A03 = bottomSheetBehavior;
        this.A02 = view;
        this.A00 = i;
    }

    public final void run() {
        BottomSheetBehavior bottomSheetBehavior = this.A03;
        W3p w3p = bottomSheetBehavior.A0J;
        if (w3p == null || !w3p.A0I()) {
            bottomSheetBehavior.A0X(this.A00);
        } else {
            this.A02.postOnAnimation(this);
        }
        this.A01 = false;
    }
}
