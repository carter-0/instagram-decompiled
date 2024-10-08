package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;

/* renamed from: X.VuL  reason: case insensitive filesystem */
public final class C18569VuL {
    public final Rect A00;
    public final int A01;
    public final ColorStateList A02;
    public final ColorStateList A03;
    public final ColorStateList A04;
    public final C297895sX A05;

    public static C18569VuL A00(Context context, int i) {
        02V.A06(AnonymousClass7TF.A1P(i), "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C297865sU.A0M);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList A012 = C309286Xr.A01(context, obtainStyledAttributes, 4);
        ColorStateList A013 = C309286Xr.A01(context, obtainStyledAttributes, 9);
        ColorStateList A014 = C309286Xr.A01(context, obtainStyledAttributes, 7);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        C297895sX r9 = new C297895sX(C297895sX.A02(context, new C297925sa(0.0f), obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0)));
        obtainStyledAttributes.recycle();
        return new C18569VuL(A012, A013, A014, rect, r9, dimensionPixelSize);
    }

    public final void A01(TextView textView) {
        C297875sV r3 = new C297875sV();
        C297875sV r2 = new C297875sV();
        C297895sX r0 = this.A05;
        r3.setShapeAppearanceModel(r0);
        r2.setShapeAppearanceModel(r0);
        r3.A0F(this.A02);
        r3.A0H(this.A03, (float) this.A01);
        ColorStateList colorStateList = this.A04;
        textView.setTextColor(colorStateList);
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateList.withAlpha(30), r3, r2);
        Rect rect = this.A00;
        textView.setBackground(new InsetDrawable(rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }

    public C18569VuL(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, Rect rect, C297895sX r6, int i) {
        02V.A00(rect.left);
        02V.A00(rect.top);
        02V.A00(rect.right);
        02V.A00(rect.bottom);
        this.A00 = rect;
        this.A04 = colorStateList2;
        this.A02 = colorStateList;
        this.A03 = colorStateList3;
        this.A01 = i;
        this.A05 = r6;
    }
}
