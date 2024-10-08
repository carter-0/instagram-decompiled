package X;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.TypedValue;
import com.instagram.android.R;

/* renamed from: X.879  reason: invalid class name */
public abstract class AnonymousClass879 {
    public static final int A00(Context context) {
        0qQ.A0B(context, 0);
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.quickCaptureControllerShutterButtonSize, typedValue, true);
        int complexToDimensionPixelSize = TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
        TypedValue typedValue2 = new TypedValue();
        Resources.Theme theme = context.getTheme();
        theme.resolveAttribute(R.attr.shutterButtonStyle, typedValue2, false);
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(typedValue2.data, new int[]{R.attr.borderInnerPadding, R.attr.borderStrokeWidth});
        0qQ.A07(obtainStyledAttributes);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        return complexToDimensionPixelSize - ((dimensionPixelSize + dimensionPixelSize2) * 2);
    }
}
