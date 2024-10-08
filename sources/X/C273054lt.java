package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.TextView;

/* renamed from: X.4lt  reason: invalid class name and case insensitive filesystem */
public final class C273054lt extends C273044lr {
    public float A00;
    public int A01;
    public ColorStateList A02;
    public ColorStateList A03;
    public ColorStateList A04;
    public Resources A05;
    public C273024lp A06;
    public boolean A07;
    public final Paint A08 = new Paint(1);
    public final Paint A09 = new Paint(1);
    public final RectF A0A = new RectF();
    public final RectF A0B = new RectF();
    public final 1QG A0C;

    public C273054lt(C273024lp r3, 1QG r4) {
        0qQ.A0B(r4, 1);
        0qQ.A0B(r3, 2);
        this.A0C = r4;
        this.A06 = r3;
    }

    public final void A0A(View view, TextView textView, boolean z) {
        0qQ.A0B(textView, 1);
        A00(textView, this, false, z);
    }

    public final void A0B(View view, TextView textView, boolean z) {
        0qQ.A0B(textView, 1);
        0qQ.A0B(view, 2);
        A00(textView, this, z, view.isEnabled());
        view.postInvalidate();
    }

    public static final void A00(TextView textView, C273054lt r4, boolean z, boolean z2) {
        int i;
        float f;
        if (!r4.A0C.A00) {
            if (z2) {
                i = 255;
                f = 1.0f;
                if (z) {
                    i = 179;
                    f = 0.7f;
                }
            } else {
                i = 77;
                f = 0.3f;
            }
            r4.A09.setAlpha(i);
            textView.setAlpha(f);
        }
    }
}
