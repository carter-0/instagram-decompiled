package X;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5sh  reason: invalid class name and case insensitive filesystem */
public final class C297995sh {
    @Deprecated
    public float A00;
    @Deprecated
    public float A01;
    @Deprecated
    public float A02;
    @Deprecated
    public float A03;
    @Deprecated
    public float A04;
    public final List A05 = new ArrayList();
    public final List A06 = new ArrayList();

    public final void A02(float f, float f2, float f3) {
        this.A04 = f;
        this.A02 = 0.0f;
        this.A03 = f;
        this.A00 = f2;
        this.A01 = (f2 + f3) % 360.0f;
        this.A06.clear();
        this.A05.clear();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.6yj, X.6yk] */
    public static void A00(C297995sh r4, float f) {
        float f2 = r4.A00;
        if (f2 != f) {
            float f3 = ((f - f2) + 360.0f) % 360.0f;
            if (f3 <= 180.0f) {
                float f4 = r4.A02;
                float f5 = r4.A03;
                ? r2 = new C324166yk();
                r2.A01 = f4;
                r2.A05 = f5;
                r2.A02 = f4;
                r2.A00 = f5;
                r2.A03 = r4.A00;
                r2.A04 = f3;
                r4.A05.add(new C324176yl(r2));
                r4.A00 = f;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.6yn, java.lang.Object, X.6yk] */
    public final void A01(float f, float f2) {
        ? r2 = new C324166yk();
        r2.A00 = f;
        r2.A01 = f2;
        this.A06.add(r2);
        C324206yo r4 = new C324206yo(r2, this.A02, this.A03);
        C324196yn r1 = r4.A02;
        float degrees = ((float) Math.toDegrees(Math.atan((double) ((r1.A01 - r4.A01) / (r1.A00 - r4.A00))))) + 270.0f;
        A00(this, degrees);
        this.A05.add(r4);
        this.A00 = degrees;
        this.A02 = f;
        this.A03 = f2;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.6yj, X.6yk] */
    public final void A03(float f, float f2, float f3, float f4, float f5) {
        float f6;
        float f7 = 180.0f;
        ? r1 = new C324166yk();
        r1.A01 = f;
        r1.A05 = f2;
        r1.A02 = f3;
        r1.A00 = f4;
        r1.A03 = 180.0f;
        r1.A04 = f5;
        this.A06.add(r1);
        C324176yl r3 = new C324176yl(r1);
        float f8 = 180.0f + f5;
        if (f5 < 0.0f) {
            f7 = (180.0f + 180.0f) % 360.0f;
            f6 = (180.0f + f8) % 360.0f;
        } else {
            f6 = f8;
        }
        A00(this, f7);
        this.A05.add(r3);
        this.A00 = f6;
        double radians = Math.toRadians((double) f8);
        this.A02 = ((f + f3) * 0.5f) + (((f3 - f) / 2.0f) * ((float) Math.cos(radians)));
        this.A03 = ((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.sin(radians)));
    }

    public final void A04(Matrix matrix, Path path) {
        List list = this.A06;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C324166yk r8 = (C324166yk) list.get(i);
            if (r8 instanceof C324156yj) {
                C324156yj r82 = (C324156yj) r8;
                Matrix matrix2 = r82.A00;
                matrix.invert(matrix2);
                path.transform(matrix2);
                RectF rectF = C324156yj.A06;
                rectF.set(r82.A01, r82.A05, r82.A02, r82.A00);
                path.arcTo(rectF, r82.A03, r82.A04, false);
            } else {
                C324196yn r83 = (C324196yn) r8;
                Matrix matrix3 = r83.A00;
                matrix.invert(matrix3);
                path.transform(matrix3);
                path.lineTo(r83.A00, r83.A01);
            }
            path.transform(matrix);
        }
    }

    public C297995sh() {
        A02(0.0f, 270.0f, 0.0f);
    }
}
