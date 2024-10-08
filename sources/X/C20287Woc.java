package X;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: X.Woc  reason: case insensitive filesystem */
public final class C20287Woc implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ BottomSheetBehavior A02;

    public C20287Woc(View view, BottomSheetBehavior bottomSheetBehavior, int i) {
        this.A02 = bottomSheetBehavior;
        this.A01 = view;
        this.A00 = i;
    }

    public final void run() {
        this.A02.A0Y(this.A01, this.A00);
    }
}
