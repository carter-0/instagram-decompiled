package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.TextView;

/* renamed from: X.4lu  reason: invalid class name and case insensitive filesystem */
public final class C273064lu extends C273044lr {
    public int A00;
    public ColorStateList A01;
    public ColorStateList A02;
    public Resources A03;
    public C273024lp A04;
    public 1QG A05;
    public final Paint A06 = new Paint(1);
    public final RectF A07 = new RectF();
    public final 1QG A08;

    public C273064lu(C273024lp r3, 1QG r4) {
        0qQ.A0B(r4, 1);
        0qQ.A0B(r3, 2);
        this.A08 = r4;
        this.A04 = r3;
    }

    public final void A0A(View view, TextView textView, boolean z) {
        0qQ.A0B(view, 2);
        A00(this, z, view.isPressed());
    }

    public final void A0B(View view, TextView textView, boolean z) {
        0qQ.A0B(view, 2);
        A00(this, view.isEnabled(), z);
        view.postInvalidate();
    }

    public static final void A00(C273064lu r1, boolean z, boolean z2) {
        int i;
        1QG r0 = r1.A05;
        if (r0 == null) {
            r0 = r1.A08;
        }
        if (!r0.A00) {
            Paint paint = r1.A06;
            if (z) {
                i = 255;
                if (z2) {
                    i = 179;
                }
            } else {
                i = 77;
            }
            paint.setAlpha(i);
        }
    }
}
