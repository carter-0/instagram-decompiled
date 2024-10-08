package X;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;

/* renamed from: X.7Df  reason: invalid class name and case insensitive filesystem */
public final class C328047Df extends C308496Um {
    public float A00;
    public float A01;
    public float A02;
    public boolean A03;
    public final Path A04;
    public final RectF A05;
    public final RectF A06;
    public final C242553Us A07;
    public final C242553Us A08;
    public final C242553Us A09;
    public final C242553Us A0A;
    public final C328057Dg A0B;
    public final float[] A0C;
    public final Rect A0D;

    public C328047Df() {
        this((C242553Us) null, 127);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C328047Df(X.C242553Us r9, int r10) {
        /*
            r8 = this;
            r2 = r9
            r3 = 0
            r4 = 0
            r1 = 0
            r0 = r10 & 1
            if (r0 == 0) goto L_0x000d
            X.3Us r2 = new X.3Us
            r2.<init>()
        L_0x000d:
            r0 = r10 & 2
            if (r0 == 0) goto L_0x0016
            X.3Us r3 = new X.3Us
            r3.<init>()
        L_0x0016:
            r0 = r10 & 4
            r6 = 1065353216(0x3f800000, float:1.0)
            r5 = 0
            if (r0 == 0) goto L_0x001f
            r5 = 1065353216(0x3f800000, float:1.0)
        L_0x001f:
            r0 = r10 & 8
            if (r0 != 0) goto L_0x0024
            r6 = 0
        L_0x0024:
            r7 = 0
            r0 = r10 & 32
            if (r0 == 0) goto L_0x002e
            X.3Us r4 = new X.3Us
            r4.<init>()
        L_0x002e:
            r0 = r10 & 64
            if (r0 == 0) goto L_0x0037
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
        L_0x0037:
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C328047Df.<init>(X.3Us, int):void");
    }

    public final boolean A02(C242553Us r5, Integer num) {
        0qQ.A0B(r5, 0);
        C242553Us r2 = this.A09;
        if (0qQ.A0K(r2, r5)) {
            return false;
        }
        this.A08.A08(r2, AnonymousClass05K.A00);
        r2.A08(r5, num);
        this.A03 = true;
        return true;
    }

    public final void draw(Canvas canvas, Paint paint) {
        float[] fArr;
        0qQ.A0B(canvas, 0);
        0qQ.A0B(paint, 1);
        if (this.A03) {
            float[] fArr2 = this.A09.A01;
            0qQ.A07(fArr2);
            float[] fArr3 = this.A0A.A01;
            0qQ.A07(fArr3);
            C242553Us r5 = this.A07;
            float[] fArr4 = r5.A01;
            int length = fArr4.length;
            int i = 0;
            while (true) {
                fArr = this.A0C;
                if (i >= length) {
                    break;
                }
                fArr[i] = fArr2[i] + fArr3[i];
                i++;
            }
            if (r5 != C242553Us.A02) {
                System.arraycopy(fArr, 0, fArr4, 0, length);
                int A002 = C242553Us.A00(AnonymousClass05K.A00);
                System.arraycopy(fArr, A002, fArr4, A002, fArr.length);
                C242553Us.A01(r5);
            }
            this.A08.A08(r5, AnonymousClass05K.A00);
            float f = this.A00 / 2.0f;
            C328057Dg r6 = this.A0B;
            r6.ESv(r5);
            RectF rectF = this.A06;
            RectF rectF2 = this.A05;
            rectF.set(0.0f, 0.0f, rectF2.width() * this.A01, rectF2.height() * this.A02);
            rectF.inset(f, f);
            Path path = this.A04;
            path.rewind();
            path.addRoundRect(rectF, fArr4, Path.Direction.CW);
            r6.EPz(rectF);
            this.A03 = false;
        }
        this.A0B.AQJ(canvas, paint);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C328047Df) {
                C328047Df r5 = (C328047Df) obj;
                if (!0qQ.A0K(this.A09, r5.A09) || !0qQ.A0K(this.A0A, r5.A0A) || Float.compare(this.A01, r5.A01) != 0 || Float.compare(this.A02, r5.A02) != 0 || Float.compare(this.A00, r5.A00) != 0 || !0qQ.A0K(this.A08, r5.A08) || !0qQ.A0K(this.A05, r5.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void getOutline(Outline outline) {
        0qQ.A0B(outline, 0);
        super.getOutline(outline);
        C242553Us r2 = this.A07;
        if (r2.A00 == AnonymousClass05K.A00) {
            RectF rectF = this.A06;
            Rect rect = this.A0D;
            rectF.round(rect);
            outline.setRoundRect(rect, r2.A01[0]);
            return;
        }
        outline.setConvexPath(this.A04);
    }

    public final int hashCode() {
        return (((((((((((this.A09.hashCode() * 31) + this.A0A.hashCode()) * 31) + Float.floatToIntBits(this.A01)) * 31) + Float.floatToIntBits(this.A02)) * 31) + Float.floatToIntBits(this.A00)) * 31) + this.A08.hashCode()) * 31) + this.A05.hashCode();
    }

    /* renamed from: A01 */
    public final C328047Df clone() {
        C242553Us A042 = this.A09.A04();
        C242553Us A043 = this.A0A.A04();
        C242553Us A044 = this.A08.A04();
        RectF rectF = new RectF(this.A05);
        float f = this.A01;
        float f2 = this.A02;
        float f3 = this.A00;
        0qQ.A0B(A042, 0);
        0qQ.A0B(A043, 1);
        0qQ.A0B(A044, 5);
        C328047Df r1 = new C328047Df(rectF, A042, A043, A044, f, f2, f3);
        r1.A03 = true;
        return r1;
    }

    public final void onResize(float f, float f2) {
        RectF rectF = this.A05;
        if (rectF.width() != f || rectF.height() != f2) {
            rectF.set(0.0f, 0.0f, f, f2);
            this.A03 = true;
        }
    }

    public C328047Df(RectF rectF, C242553Us r5, C242553Us r6, C242553Us r7, float f, float f2, float f3) {
        C328057Dg r0;
        0qQ.A0B(r5, 1);
        0qQ.A0B(r6, 2);
        0qQ.A0B(r7, 6);
        0qQ.A0B(rectF, 7);
        this.A09 = r5;
        this.A0A = r6;
        this.A01 = f;
        this.A02 = f2;
        this.A00 = f3;
        this.A08 = r7;
        this.A05 = rectF;
        this.A0D = new Rect();
        this.A04 = new Path();
        C242553Us r2 = new C242553Us();
        this.A07 = r2;
        this.A06 = new RectF();
        if (Build.VERSION.SDK_INT < 29) {
            r0 = new C66779McP();
        } else {
            r0 = new C331367Qs();
        }
        this.A0B = r0;
        this.A0C = new float[r2.A01.length];
    }
}
