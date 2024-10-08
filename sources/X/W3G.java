package X;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.RectF;
import android.transition.Transition;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.PathInterpolator;

public abstract class W3G {
    public static final RectF A00 = new RectF();

    public static RectF A03(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        return new RectF((float) i, (float) i2, (float) (view.getWidth() + i), (float) (view.getHeight() + i2));
    }

    public static float A00(float f, float f2, float f3, float f4, float f5) {
        if (f5 < f3) {
            return f;
        }
        if (f5 > f4) {
            return f2;
        }
        return C13988Tno.A00(f2, f, (f5 - f3) / (f4 - f3));
    }

    public static float A01(String[] strArr, int i) {
        float parseFloat = Float.parseFloat(strArr[i]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException(002.A0N("Motion easing control point value must be between 0 and 1; instead got: ", parseFloat));
    }

    public static int A02(float f, float f2, float f3, int i, int i2) {
        if (f3 < f) {
            return i;
        }
        if (f3 > f2) {
            return i2;
        }
        return (int) C13988Tno.A00((float) i2, (float) i, (f3 - f) / (f2 - f));
    }

    public static C297935sb A04(RectF rectF, C297935sb r3, C297935sb r4) {
        if (!(r3 instanceof C324136yh)) {
            return new C324136yh(r3.ArV(rectF) / rectF.height());
        }
        return r4;
    }

    public static C297895sX A05(RectF rectF, C297895sX r3) {
        C324126yg r1 = new C324126yg(r3);
        C297935sb r0 = r3.A02;
        r1.A02 = A04(rectF, r0, r0);
        C297935sb r02 = r3.A03;
        r1.A03 = A04(rectF, r02, r02);
        C297935sb r03 = r3.A00;
        r1.A00 = A04(rectF, r03, r03);
        C297935sb r04 = r3.A01;
        r1.A01 = A04(rectF, r04, r04);
        return new C297895sX(r1);
    }

    public static void A06(TimeInterpolator timeInterpolator, Context context, Transition transition, int i) {
        if (i != 0 && transition.getInterpolator() == null) {
            TypedValue typedValue = new TypedValue();
            if (context.getTheme().resolveAttribute(i, typedValue, true)) {
                if (typedValue.type == 3) {
                    String valueOf = String.valueOf(typedValue.string);
                    if (valueOf.startsWith(002.A0R("cubic-bezier", "(")) && valueOf.endsWith(")")) {
                        String[] split = valueOf.substring("cubic-bezier".length() + 1, valueOf.length() - 1).split(",");
                        int length = split.length;
                        if (length == 4) {
                            timeInterpolator = new PathInterpolator(A01(split, 0), A01(split, 1), A01(split, 2), A01(split, 3));
                        } else {
                            throw DbW.A0a("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: ", length);
                        }
                    } else if (!valueOf.startsWith(002.A0R("path", "(")) || !valueOf.endsWith(")")) {
                        throw AnonymousClass7TF.A0W("Invalid motion easing type: ", valueOf);
                    } else {
                        timeInterpolator = new PathInterpolator(C18667VwP.A00(valueOf.substring("path".length() + 1, valueOf.length() - 1)));
                    }
                } else {
                    throw new IllegalArgumentException("Motion easing theme attribute must be a string");
                }
            }
            transition.setInterpolator(timeInterpolator);
        }
    }

    public static void A07(Context context, Transition transition, int i) {
        TypedValue A02;
        int i2;
        if (i != 0 && transition.getDuration() == -1 && (A02 = C298035sl.A02(context, i)) != null && A02.type == 16 && (i2 = A02.data) != -1) {
            transition.setDuration((long) i2);
        }
    }
}
