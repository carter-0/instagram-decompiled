package X;

import android.view.View;
import android.widget.ScrollView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: X.WBj  reason: case insensitive filesystem */
public final class C18892WBj implements View.OnScrollChangeListener {
    public final /* synthetic */ ScrollView A00;
    public final /* synthetic */ BottomSheetBehavior A01;

    public C18892WBj(ScrollView scrollView, BottomSheetBehavior bottomSheetBehavior) {
        this.A01 = bottomSheetBehavior;
        this.A00 = scrollView;
    }

    public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
        this.A01.A0N = this.A00.canScrollVertically(1);
    }
}
