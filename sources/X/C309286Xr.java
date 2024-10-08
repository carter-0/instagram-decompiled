package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;

/* renamed from: X.6Xr  reason: invalid class name and case insensitive filesystem */
public abstract class C309286Xr {
    public static int A00(Context context, TypedArray typedArray, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i, i2);
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i2);
        obtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    public static ColorStateList A02(Context context, 2Yi r3, int i) {
        int resourceId;
        ColorStateList A02;
        TypedArray typedArray = r3.A02;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (A02 = 02K.A02(context, resourceId)) == null) {
            return r3.A01(i);
        }
        return A02;
    }

    public static ColorStateList A01(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList A02;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (A02 = 02K.A02(context, resourceId)) == null) {
            return typedArray.getColorStateList(i);
        }
        return A02;
    }

    public static Drawable A03(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable A05;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (A05 = 2X8.A02().A05(context, resourceId)) == null) {
            return typedArray.getDrawable(i);
        }
        return A05;
    }

    public static boolean A04(Context context) {
        if (context.getResources().getConfiguration().fontScale >= 1.3f) {
            return true;
        }
        return false;
    }
}
