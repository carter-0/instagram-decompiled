package X;

import android.view.View;
import com.instagram.android.R;

/* renamed from: X.7oR  reason: invalid class name and case insensitive filesystem */
public final class C342347oR implements Runnable {
    public final /* synthetic */ AnonymousClass86m A00;

    public C342347oR(AnonymousClass86m r1) {
        this.A00 = r1;
    }

    public final void run() {
        int i;
        AnonymousClass86m r5 = this.A00;
        View view = r5.A0W.A00;
        View findViewById = view.findViewById(R.id.dial_ar_effect_picker_left_side_button_container);
        View findViewById2 = view.findViewById(R.id.dial_ar_effect_picker_right_side_button_container);
        view.getWidth();
        int i2 = 0;
        if (findViewById != null) {
            i = findViewById.getWidth();
        } else {
            i = 0;
        }
        if (findViewById2 != null) {
            i2 = findViewById2.getWidth();
        }
        r5.A01 = Math.max(i, i2);
        C347487wt r1 = r5.A0A;
        if (r1 != null) {
            if (!(findViewById == null || findViewById2 == null)) {
                view.getWidth();
            }
            r1.setHorizontalMargin(r5.A01);
            if (r5.A0D) {
                r5.EUr(true);
            }
        }
    }
}
