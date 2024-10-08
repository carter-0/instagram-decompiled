package X;

import android.animation.ArgbEvaluator;
import android.content.Context;
import com.instagram.android.R;

/* renamed from: X.3z1  reason: invalid class name and case insensitive filesystem */
public abstract class C258443z1 {
    public static final ArgbEvaluator A00 = new ArgbEvaluator();

    public static final int A00(1Xj r2, Integer num, int i) {
        String str;
        if (r2 == null || (r2.A5D() && num != null && (r2 = r2.A1c(num.intValue())) == null)) {
            str = null;
        } else {
            str = r2.A0C.getDominantColor();
        }
        Integer A0D = 0nH.A0D(str);
        if (A0D != null) {
            return A0D.intValue();
        }
        return i;
    }

    public static final void A02(AnonymousClass3z2 r2, 1Xj r3, 0sP r4, float f, int i, int i2) {
        int i3 = r2.A00;
        Object evaluate = A00.evaluate(f, Integer.valueOf(A00(r3, Integer.valueOf(i), i3)), Integer.valueOf(A00(r3, Integer.valueOf(i2), i3)));
        0qQ.A0C(evaluate, "null cannot be cast to non-null type kotlin.Int");
        r4.invoke(evaluate);
    }

    public static final AnonymousClass3z2 A01(Context context) {
        return new AnonymousClass3z2(context.getColor(2Yu.A0H(context, R.attr.igds_color_primary_text)), context.getColor(2Yu.A0H(context, R.attr.igds_color_primary_background)), context.getColor(2Yu.A0H(context, R.attr.igds_color_primary_icon)), context.getColor(R.color.badge_color), context.getColor(2Yu.A0H(context, R.attr.igds_color_icon_on_color)), 2Yu.A0F(context, R.attr.ctaMetadataTextNormal), context.getColor(R.color.grey_1), 2Yu.A0F(context, R.attr.ctaPressedColorNormal), context.getColor(R.color.track_background_color), context.getColor(2Yu.A0H(context, R.attr.igds_color_elevated_separator)));
    }
}
