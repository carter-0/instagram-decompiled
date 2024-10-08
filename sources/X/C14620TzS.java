package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import com.instagram.android.R;

/* renamed from: X.TzS  reason: case insensitive filesystem */
public abstract class C14620TzS {
    public static final int[][] A00 = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    public static ColorStateList A00(Context context, Integer num, Integer num2, Integer num3, Integer num4) {
        int A0C;
        int defaultColor;
        int colorForState;
        int i = -7829368;
        if (num != null) {
            A0C = num.intValue();
        } else {
            A0C = C13989Tnp.A0C(context.getTheme(), R.attr.colorControlActivated, -7829368);
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.colorSwitchThumbNormal});
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(0);
        obtainStyledAttributes.recycle();
        if (num2 != null) {
            defaultColor = num2.intValue();
        } else if (colorStateList == null) {
            defaultColor = -7829368;
        } else {
            defaultColor = colorStateList.getDefaultColor();
        }
        if (num3 != null) {
            colorForState = num3.intValue();
        } else if (colorStateList == null) {
            colorForState = -7829368;
        } else {
            colorForState = colorStateList.getColorForState(new int[]{-16842910}, colorStateList.getDefaultColor());
        }
        if (num4 != null) {
            i = num4.intValue();
        } else if (colorStateList != null) {
            i = colorStateList.getColorForState(new int[]{-16842910}, colorStateList.getDefaultColor());
        }
        return new ColorStateList(A00, new int[]{A0C, defaultColor, colorForState, i});
    }

    public static ColorStateList A01(Context context, Integer num, Integer num2, Integer num3, Integer num4) {
        int A0C;
        int A0C2;
        int A06;
        int A062;
        if (num != null) {
            A0C = num.intValue();
        } else {
            A0C = C13989Tnp.A0C(context.getTheme(), 16843818, -7829368);
        }
        if (num2 != null) {
            A0C2 = num2.intValue();
        } else {
            A0C2 = C13989Tnp.A0C(context.getTheme(), 16842800, -7829368);
        }
        if (num3 != null) {
            A06 = num3.intValue();
        } else {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16843818});
            A06 = 2eL.A06(obtainStyledAttributes.getColor(0, -7829368), AnonymousClass7TE.A05((float) Color.alpha(A0C), 0.25f));
            obtainStyledAttributes.recycle();
        }
        if (num4 != null) {
            A062 = num4.intValue();
        } else {
            TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{16842800});
            A062 = 2eL.A06(obtainStyledAttributes2.getColor(0, -7829368), AnonymousClass7TE.A05((float) Color.alpha(A0C2), 0.25f));
            obtainStyledAttributes2.recycle();
        }
        return new ColorStateList(A00, new int[]{A0C, A0C2, A06, A062});
    }
}
