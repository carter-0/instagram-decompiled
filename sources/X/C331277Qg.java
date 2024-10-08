package X;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.Shape;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.WeakHashMap;

/* renamed from: X.7Qg  reason: invalid class name and case insensitive filesystem */
public final class C331277Qg extends AnonymousClass0T0 {
    public static final WeakHashMap A06 = new WeakHashMap();
    public final ShapeDrawable A00;
    public final ShapeDrawable A01;
    public final ShapeDrawable A02;
    public final Shape A03;
    public final AnonymousClass763 A04;
    public final WeakReference A05;

    public final boolean A05(C242553Us r10, Integer num, float f) {
        Integer num2;
        Shape shape = this.A03;
        if (!(shape instanceof C328047Df)) {
            return false;
        }
        C328047Df r8 = (C328047Df) shape;
        C242553Us r7 = r8.A09;
        if (r10.equals(r7)) {
            return false;
        }
        C242553Us r6 = r8.A0A;
        if (r6 != C242553Us.A02) {
            switch (num.intValue()) {
                case 1:
                case 3:
                    num2 = AnonymousClass05K.A0N;
                    break;
                case 2:
                    num2 = AnonymousClass05K.A01;
                    break;
                case 6:
                    num2 = AnonymousClass05K.A0j;
                    break;
                default:
                    num2 = AnonymousClass05K.A15;
                    break;
            }
            int A002 = C328647Fp.A00(num2) + 1;
            for (int A003 = C242553Us.A00(num); A003 < A002; A003++) {
                r6.A01[A003] = (1.0f - f) * (r10.A01[A003] - r7.A01[A003]);
            }
            C242553Us.A01(r6);
        }
        r8.A03 = true;
        Drawable drawable = (Drawable) this.A05.get();
        if (drawable != null) {
            drawable.invalidateSelf();
        }
        return true;
    }

    public final C328047Df A00() {
        Shape shape = this.A03;
        if (shape instanceof C328047Df) {
            return (C328047Df) shape;
        }
        return null;
    }

    public final void A01(int i) {
        C308486Ul.A02(Paint.Style.FILL, this.A01, this.A03, 0.0f, i);
        this.A00.getPaint().setAlpha(0);
    }

    public final void A02(int i, float f, boolean z) {
        C308486Ul.A03(this.A00, this.A03, f, i);
        Paint paint = this.A01.getPaint();
        int i2 = 255;
        if (z) {
            i2 = 0;
        }
        paint.setAlpha(i2);
    }

    public final void A03(int i, int i2, float f) {
        ShapeDrawable shapeDrawable = this.A01;
        Shape shape = this.A03;
        C308486Ul.A02(Paint.Style.FILL, shapeDrawable, shape, 0.0f, i);
        C308486Ul.A03(this.A00, shape, f, i2);
    }

    public final void A04(Integer num) {
        Integer num2;
        Shape shape = this.A03;
        if (shape instanceof C328047Df) {
            C328047Df r6 = (C328047Df) shape;
            C242553Us r5 = r6.A0A;
            if (r5.A00 != AnonymousClass05K.A00 || r5.A01[0] != 0.0f) {
                int A002 = C242553Us.A00(num);
                switch (num.intValue()) {
                    case 1:
                    case 3:
                        num2 = AnonymousClass05K.A0N;
                        break;
                    case 2:
                        num2 = AnonymousClass05K.A01;
                        break;
                    case 6:
                        num2 = AnonymousClass05K.A0j;
                        break;
                    default:
                        num2 = AnonymousClass05K.A15;
                        break;
                }
                Arrays.fill(r5.A01, A002, C328647Fp.A00(num2) + 1, 0.0f);
                C242553Us.A01(r5);
                r6.A03 = true;
                Drawable drawable = (Drawable) this.A05.get();
                if (drawable != null) {
                    drawable.invalidateSelf();
                }
            }
        }
    }

    public C331277Qg(ShapeDrawable shapeDrawable, ShapeDrawable shapeDrawable2, ShapeDrawable shapeDrawable3, Shape shape, AnonymousClass763 r5, WeakReference weakReference) {
        this.A03 = shape;
        this.A01 = shapeDrawable;
        this.A00 = shapeDrawable2;
        this.A04 = r5;
        this.A02 = shapeDrawable3;
        this.A05 = weakReference;
    }
}
