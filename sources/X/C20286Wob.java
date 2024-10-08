package X;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: X.Wob  reason: case insensitive filesystem */
public final class C20286Wob implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ViewGroup.LayoutParams A01;
    public final /* synthetic */ BottomSheetBehavior A02;

    public C20286Wob(View view, ViewGroup.LayoutParams layoutParams, BottomSheetBehavior bottomSheetBehavior) {
        this.A02 = bottomSheetBehavior;
        this.A00 = view;
        this.A01 = layoutParams;
    }

    public final void run() {
        this.A00.setLayoutParams(this.A01);
    }
}
