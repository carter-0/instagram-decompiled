package X;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;

/* renamed from: X.4WA  reason: invalid class name */
public abstract class AnonymousClass4WA {
    public static final float A00(View view, C265674Vs r11) {
        AnonymousClass4W8 A00;
        0qQ.A0B(view, 1);
        if (AnonymousClass4W7.A01(r11) != AnonymousClass88T.TABLE_TOP || (A00 = AnonymousClass4W7.A00(r11)) == null) {
            return 1.0f;
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        Rect rect = new Rect(i, iArr[1], view.getWidth() + i, iArr[1] + view.getHeight());
        Rect rect2 = new Rect(A00.AhW());
        rect2.bottom = rect2.bottom;
        rect2.top = rect2.top;
        boolean intersect = rect2.intersect(rect);
        if ((rect2.width() == 0 && rect2.height() == 0) || !intersect) {
            return 1.0f;
        }
        rect2.offset(-iArr[0], -iArr[1]);
        return ((float) rect2.top) / ((float) view.getHeight());
    }

    public static final Integer A01(Activity activity) {
        0qQ.A0B(activity, 0);
        Rect A00 = ((AnonymousClass2YD) AnonymousClass2YA.A00.invoke(AnonymousClass2YC.A00)).AIh(activity).A00();
        float width = ((float) A00.width()) / ((float) A00.height());
        if (0.0f <= width && width <= 0.75f) {
            return AnonymousClass05K.A0C;
        }
        if (1.33f > width || width > Float.MAX_VALUE) {
            return AnonymousClass05K.A01;
        }
        return AnonymousClass05K.A00;
    }
}
