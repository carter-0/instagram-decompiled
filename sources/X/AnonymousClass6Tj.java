package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.6Tj  reason: invalid class name */
public abstract class AnonymousClass6Tj {
    public static final float A00 = ((float) Math.sqrt(5.0d));

    public static float A00(Context context, float f) {
        if (f == 0.0f) {
            f = 2.14748365E9f;
        }
        float f2 = context.getResources().getDisplayMetrics().density;
        return f2 * f2 * (-f) * A00;
    }

    public static void A01(View view, C308246Th r4) {
        float width = (float) view.getWidth();
        float f = r4.A09;
        if (r4.A0I) {
            f = (f * width) / 100.0f;
        }
        view.setTranslationX(f);
        float height = (float) view.getHeight();
        float f2 = r4.A0A;
        if (r4.A0J) {
            f2 = (f2 * height) / 100.0f;
        }
        view.setTranslationY(f2);
        if (r4.A0F) {
            float width2 = (float) view.getWidth();
            float f3 = r4.A02;
            if (r4.A0G) {
                f3 = (f3 * width2) / 100.0f;
            }
            view.setPivotX(f3);
            float height2 = (float) view.getHeight();
            float f4 = r4.A03;
            if (r4.A0H) {
                f4 = (f4 * height2) / 100.0f;
            }
            view.setPivotY(f4);
        }
    }
}
