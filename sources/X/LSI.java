package X;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import java.util.LinkedList;
import java.util.List;

public final class LSI {
    public static float A00 = 0.5f;
    public static int A01;
    public static LAK A02;
    public static Integer A03 = AnonymousClass05K.A01;
    public static Paint A04;
    public static final LSI A05 = new Object();

    public static final LinkedList A00(Float f, List list, float f2, float f3, int i, int i2, boolean z) {
        float f4;
        if (f != null) {
            f4 = f.floatValue();
        } else {
            f4 = 32.0f;
        }
        float f5 = (1000.0f / f4) / f2;
        float f6 = -5.0f;
        float size = (float) list.size();
        if (z) {
            f6 = -5.0f + (((float) i) / f4);
            size = Math.min(size, ((((float) i2) / f4) * f3) + f6);
        }
        LinkedList linkedList = new LinkedList();
        while (true) {
            float f7 = f6;
            if (f6 < 0.0f) {
                f7 = 0.0f;
            }
            Object A0O = 00k.A0O(list, (int) ((float) Math.floor((double) f7)));
            if (f7 >= size || A0O == null) {
                return linkedList;
            }
            linkedList.add(A0O);
            f6 += f5;
        }
        return linkedList;
    }

    public static final void A01(Canvas canvas, float f, float f2, float f3, int i) {
        LAK lak = A02;
        if (lak != null) {
            float max = Math.max(f * f2, lak.A06);
            float A002 = C51967G9n.A00(f2, max) + f3;
            float f4 = max + A002;
            float f5 = ((float) i) * lak.A01;
            Paint paint = A04;
            if (paint == null) {
                0qQ.A0F("paint");
                throw AnonymousClass00P.createAndThrow();
            } else {
                canvas.drawLine(f5, A002, f5, f4, paint);
            }
        }
    }

    public final void A02(LAK lak) {
        float f;
        A02 = lak;
        Paint A0C = JTO.A0C();
        A0C.setColor(Color.parseColor("#CCFFFFFF"));
        JTO.A1N(A0C);
        LAK lak2 = A02;
        if (lak2 != null) {
            f = lak2.A02;
        } else {
            f = 1.0f;
        }
        A0C.setStrokeWidth(f);
        A04 = A0C;
    }
}
