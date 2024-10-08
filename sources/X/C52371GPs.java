package X;

import android.content.Context;
import android.content.res.Resources;
import android.util.Size;
import com.instagram.android.R;
import java.util.NoSuchElementException;

/* renamed from: X.GPs  reason: case insensitive filesystem */
public abstract class C52371GPs {
    public static final 2WX A00(Context context, 2WX r9, JP2 jp2, float f, float f2, float f3, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        AnonymousClass2WY A0c;
        long j;
        Integer num;
        double d;
        if (jp2 == null) {
            return r9;
        }
        Size BJW = jp2.BJW();
        float width = (float) BJW.getWidth();
        float height = (float) BJW.getHeight();
        float f4 = width / height;
        if (f > f4) {
            float f5 = width / f;
            2WX A0X = C51971G9r.A0X(r9, AnonymousClass05K.A01, (f5 / height) * 100.0f, 0);
            if (!z2) {
                float f6 = 0.0f;
                if (f > 0.5625f) {
                    Resources A0A = AnonymousClass7TF.A0A(context);
                    float A01 = ((((0nA.A01(context, height) - 168.0f) - ((float) i)) - 16.0f) - (A0A.getDimension(R.dimen.abc_button_padding_horizontal_material) / A0A.getDisplayMetrics().density)) - 0nA.A01(context, f5);
                    if (A01 > 0.0f) {
                        f6 = A01 / 2.0f;
                    }
                }
                d = (double) f6;
            } else if ((z3 && !z) || (z4 && !z)) {
                return A0X;
            } else {
                if (z3 || (z && !z4)) {
                    return GPx.A00(A0X, f5, height, f2, f3);
                }
                float A012 = (0nA.A01(context, height) - 172.0f) - 0nA.A01(context, f5);
                if (A012 <= 24.0f) {
                    d = 0.0d;
                } else {
                    int i2 = (int) A012;
                    for (0eP r3 : GPx.A01) {
                        if (i2 >= ((Number) r3.A00).intValue()) {
                            j = C51965G9l.A07(C51969G9p.A0A(r3) + 172);
                            num = AnonymousClass05K.A0j;
                            return AnonymousClass9JR.A00(A0X, num, 1, j);
                        }
                    }
                    throw new NoSuchElementException(AnonymousClass000.A00(3));
                }
            }
            j = Double.doubleToRawLongBits(d);
            num = AnonymousClass05K.A0N;
            return AnonymousClass9JR.A00(A0X, num, 1, j);
        } else if (f >= f4) {
            return r9;
        } else {
            if (!z4 || !z2) {
                float f7 = height * f;
                float A00 = C51967G9n.A00(width, f7);
                r9 = C51974G9v.A0D(r9, C51965G9l.A0b(AnonymousClass05K.A00, (f7 / width) * 100.0f, 0), 100.0f, 0);
                A0c = C51965G9l.A0c(AnonymousClass05K.A0C, 1, C51969G9p.A0G((int) A00));
            } else {
                A0c = C51965G9l.A0b(AnonymousClass05K.A01, ((width / f) / height) * 100.0f, 0);
            }
            return C51965G9l.A0X(r9, A0c);
        }
    }
}
