package X;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: X.6rA  reason: invalid class name and case insensitive filesystem */
public final class C319756rA {
    public static final C319756rA A00 = new Object();

    public static final void A00(View view) {
        C270354gb r3 = new C270354gb();
        ViewParent parent = view.getParent();
        0qQ.A0C(parent, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        r3.A0I((ConstraintLayout) parent);
        r3.A0C(view.getId(), 3, 0, 3);
        r3.A0C(view.getId(), 6, 0, 6);
        r3.A09(view.getId(), 7);
        r3.A09(view.getId(), 4);
        ViewParent parent2 = view.getParent();
        0qQ.A0C(parent2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        r3.A0G((ConstraintLayout) parent2);
    }

    public static final void A01(View view, View view2) {
        if (view2 != null) {
            C270354gb r5 = new C270354gb();
            ViewParent parent = view.getParent();
            0qQ.A0C(parent, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            r5.A0I((ConstraintLayout) parent);
            r5.A09(view.getId(), 6);
            r5.A09(view.getId(), 7);
            r5.A0C(view.getId(), 6, view2.getId(), 6);
            r5.A0C(view.getId(), 7, view2.getId(), 7);
            ViewParent parent2 = view.getParent();
            0qQ.A0C(parent2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            r5.A0G((ConstraintLayout) parent2);
        }
    }

    public static final void A02(View view, View view2) {
        if (view2 != null) {
            C270354gb r4 = new C270354gb();
            ViewParent parent = view.getParent();
            0qQ.A0C(parent, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            r4.A0I((ConstraintLayout) parent);
            r4.A09(view.getId(), 6);
            r4.A09(view.getId(), 7);
            r4.A0C(view.getId(), 6, view2.getId(), 6);
            ViewParent parent2 = view.getParent();
            0qQ.A0C(parent2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            r4.A0G((ConstraintLayout) parent2);
        }
    }

    public static final void A03(View view, View view2, int i, boolean z) {
        view.post(new C66960Mft(view, view2, i, z));
    }

    public final void A04(TextView textView, C62320sa r7, boolean z, boolean z2) {
        if (z) {
            textView.setTextSize(18.0f);
            r7.invoke();
        }
        TextPaint paint = textView.getPaint();
        float f = 14.0f;
        if (z2) {
            f = 14.0f / 0.75f;
        }
        Context context = textView.getContext();
        0qQ.A07(context);
        paint.setTextSize(C61380mr.A00(context, f));
        if (paint.measureText(textView.getText().toString()) > ((float) (textView.getMaxWidth() - (textView.getPaddingStart() + textView.getPaddingEnd())))) {
            f = 11.0f;
            if (z2) {
                f = 11.0f / 0.75f;
            }
        }
        textView.setTextSize(f);
        r7.invoke();
    }
}
