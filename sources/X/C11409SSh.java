package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.SSh  reason: case insensitive filesystem */
public abstract class C11409SSh {
    public static void A00(TypedArray typedArray, View view, int i, int i2) {
        A05(view, typedArray.getResourceId(i, i2), false);
    }

    public static final void A02(View view, int i, int i2, int i3, int i4) {
        0qQ.A0B(view, 0);
        StateListDrawable stateListDrawable = new StateListDrawable();
        GradientDrawable gradientDrawable = new GradientDrawable();
        SPB A0A = AnonymousClass2E0.A0A();
        Context A0S = AnonymousClass7TE.A0S(view);
        gradientDrawable.setColor(A0A.A03(A0S, i));
        gradientDrawable.setCornerRadii((float[]) null);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(SPB.A00(A0S, i2));
        gradientDrawable2.setCornerRadii((float[]) null);
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setColor(SPB.A00(A0S, i3));
        gradientDrawable3.setCornerRadii((float[]) null);
        GradientDrawable gradientDrawable4 = new GradientDrawable();
        gradientDrawable4.setColor(SPB.A00(A0S, i4));
        gradientDrawable4.setCornerRadii((float[]) null);
        stateListDrawable.addState(new int[]{16842919}, new LayerDrawable(new GradientDrawable[]{gradientDrawable, gradientDrawable2}));
        stateListDrawable.addState(new int[]{16842908}, new LayerDrawable(new GradientDrawable[]{gradientDrawable, gradientDrawable3}));
        stateListDrawable.addState(new int[0], new LayerDrawable(new GradientDrawable[]{gradientDrawable, gradientDrawable4}));
        view.setBackground(stateListDrawable);
    }

    public static final void A04(View view, int i, boolean z) {
        0qQ.A0B(view, 0);
        A05(view, AnonymousClass2E0.A0A().A02(i), z);
    }

    public static final void A05(View view, int i, boolean z) {
        int dimensionPixelSize;
        TypedArray obtainStyledAttributes = JTP.A0C(view, 0).obtainStyledAttributes(i, C71382cm.A0j);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = obtainStyledAttributes.getLayoutDimension(3, "layout_width");
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.height = obtainStyledAttributes.getLayoutDimension(4, "layout_height");
        }
        ViewGroup.MarginLayoutParams A0L = Pxj.A0L(view);
        int i2 = 0;
        if (A0L != null) {
            A0L.topMargin = obtainStyledAttributes.getDimensionPixelSize(5, 0);
            A0L.bottomMargin = obtainStyledAttributes.getDimensionPixelSize(6, 0);
            A0L.leftMargin = obtainStyledAttributes.getDimensionPixelSize(9, 0);
            A0L.rightMargin = obtainStyledAttributes.getDimensionPixelSize(10, 0);
            view.setLayoutParams(A0L);
        }
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(7, 0);
        if (z) {
            dimensionPixelSize = 0;
        } else {
            dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        }
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        if (!z) {
            i2 = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        }
        view.setPadding(dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize3, i2);
        obtainStyledAttributes.recycle();
    }

    public static final void A01(View view, int i) {
        view.setBackgroundColor(AnonymousClass2E0.A0A().A03(AnonymousClass7TE.A0S(view), i));
    }

    public static final void A03(View view, int i, View view2) {
        C60036Jdo jdo;
        TouchDelegate touchDelegate = view2.getTouchDelegate();
        if (!(touchDelegate instanceof C60036Jdo) || (jdo = (C60036Jdo) touchDelegate) == null || !jdo.A00.containsKey(Integer.valueOf(view.getId()))) {
            view2.getViewTreeObserver().addOnGlobalLayoutListener(new C64297LYx(i, 1, view2, view));
        }
    }
}
