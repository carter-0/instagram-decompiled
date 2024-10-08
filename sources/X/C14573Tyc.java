package X;

import android.content.Context;
import android.util.TypedValue;
import android.widget.TextView;

/* renamed from: X.Tyc  reason: case insensitive filesystem */
public abstract class C14573Tyc {
    public static final float A00(Context context, float f) {
        return TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    public static void A01(Context context, TextView textView, C21255XRa xRa, Integer num, boolean z) {
        textView.setTextColor(1Kq.A03(xRa, z));
        textView.setHeight((int) A00(context, 1Kq.A01(num)));
    }
}
