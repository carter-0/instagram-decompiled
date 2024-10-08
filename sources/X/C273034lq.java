package X;

import android.content.res.ColorStateList;
import android.view.View;
import android.widget.TextView;

/* renamed from: X.4lq  reason: invalid class name and case insensitive filesystem */
public final class C273034lq extends C273044lr {
    public ColorStateList A00;
    public final 1QG A01;

    public C273034lq(C273024lp r2, 1QG r3) {
        0qQ.A0B(r3, 1);
        0qQ.A0B(r2, 2);
        this.A01 = r3;
    }

    public final void A0A(View view, TextView textView, boolean z) {
        0qQ.A0B(textView, 1);
        0qQ.A0B(view, 2);
        if (!this.A01.A00) {
            super.A0A(view, textView, z);
        }
    }

    public final void A0B(View view, TextView textView, boolean z) {
        0qQ.A0B(textView, 1);
        0qQ.A0B(view, 2);
        if (!this.A01.A00) {
            super.A0B(view, textView, z);
        }
    }
}
