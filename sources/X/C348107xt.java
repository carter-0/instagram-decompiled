package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.instagram.android.R;

/* renamed from: X.7xt  reason: invalid class name and case insensitive filesystem */
public final class C348107xt implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ C3497781s A00;
    public final /* synthetic */ boolean A01;

    public C348107xt(C3497781s r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public final void onGlobalLayout() {
        ViewGroup viewGroup = this.A00.A0K;
        viewGroup.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        View findViewById = viewGroup.findViewById(R.id.ar_effect_picker_pager);
        if (findViewById != null) {
            int i = 8;
            if (this.A01) {
                i = 0;
            }
            findViewById.setVisibility(i);
        }
    }
}
