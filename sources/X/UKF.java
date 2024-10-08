package X;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.RectF;
import android.text.StaticLayout;
import android.text.TextPaint;

public final class UKF extends C71572e9 implements AnonymousClass2eD {
    public float A00;
    public float A01;
    public StaticLayout A02;
    public final TextPaint A03;
    public final C71542dx A04;
    public final String A05;

    public UKF(2dy r6, AnonymousClass2e5 r7) {
        super(r6, r7);
        int i;
        String str = r6.A0s;
        if (str != null) {
            this.A05 = str;
            2dy r1 = this.A04;
            this.A04 = r1.A0r;
            TextPaint textPaint = new TextPaint(1);
            this.A03 = textPaint;
            2dn r0 = r1.A0U;
            if (r0 != null) {
                i = Color.argb(r0.A00, r0.A03, r0.A02, r0.A01);
            } else {
                i = -16777216;
            }
            textPaint.setColor(i);
            A00();
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void A0E(RectF rectF) {
        0qQ.A0B(rectF, 0);
        StaticLayout staticLayout = this.A02;
        if (staticLayout != null) {
            float width = (float) staticLayout.getWidth();
            StaticLayout staticLayout2 = this.A02;
            if (staticLayout2 != null) {
                C13990Tnq.A0q(rectF, width, staticLayout2.getHeight());
                return;
            }
        }
        0qQ.A0F("textLayout");
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00ee  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00() {
        /*
            r22 = this;
            r2 = r22
            android.text.TextPaint r8 = r2.A03
            X.2dy r3 = r2.A04
            float r4 = r3.A0C
            X.2e5 r1 = r2.A0B
            float r0 = r1.A00
            float r4 = r4 * r0
            r8.setTextSize(r4)
            float r4 = r3.A0D
            r0 = 1148846080(0x447a0000, float:1000.0)
            float r4 = r4 / r0
            r8.setLetterSpacing(r4)
            X.WI9 r0 = r3.A0R
            if (r0 == 0) goto L_0x0031
            java.lang.Integer r5 = r0.A00
        L_0x001e:
            int r4 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r4 < r0) goto L_0x004f
            int r0 = r5.intValue()
            switch(r0) {
                case 0: goto L_0x0069;
                case 1: goto L_0x004c;
                case 2: goto L_0x0049;
                case 3: goto L_0x0046;
                case 4: goto L_0x0043;
                case 5: goto L_0x0040;
                case 6: goto L_0x003d;
                case 7: goto L_0x003a;
                case 8: goto L_0x0037;
                case 9: goto L_0x0034;
                default: goto L_0x002b;
            }
        L_0x002b:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0031:
            java.lang.Integer r5 = X.WI9.A01
            goto L_0x001e
        L_0x0034:
            r5 = 1000(0x3e8, float:1.401E-42)
            goto L_0x006b
        L_0x0037:
            r5 = 900(0x384, float:1.261E-42)
            goto L_0x006b
        L_0x003a:
            r5 = 800(0x320, float:1.121E-42)
            goto L_0x006b
        L_0x003d:
            r5 = 700(0x2bc, float:9.81E-43)
            goto L_0x006b
        L_0x0040:
            r5 = 600(0x258, float:8.41E-43)
            goto L_0x006b
        L_0x0043:
            r5 = 500(0x1f4, float:7.0E-43)
            goto L_0x006b
        L_0x0046:
            r5 = 400(0x190, float:5.6E-43)
            goto L_0x006b
        L_0x0049:
            r5 = 300(0x12c, float:4.2E-43)
            goto L_0x006b
        L_0x004c:
            r5 = 200(0xc8, float:2.8E-43)
            goto L_0x006b
        L_0x004f:
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            int r5 = r5.compareTo(r0)
            r4 = 1
            boolean r0 = r3.A0v
            if (r5 < 0) goto L_0x0064
            if (r0 == 0) goto L_0x005d
            r4 = 3
        L_0x005d:
            android.graphics.Typeface r0 = android.graphics.Typeface.DEFAULT
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r0, r4)
            goto L_0x0073
        L_0x0064:
            r4 = 0
            if (r0 == 0) goto L_0x005d
            r4 = 2
            goto L_0x005d
        L_0x0069:
            r5 = 100
        L_0x006b:
            android.graphics.Typeface r4 = android.graphics.Typeface.DEFAULT
            boolean r0 = r3.A0v
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r4, r5, r0)
        L_0x0073:
            X.0qQ.A0A(r0)
            r8.setTypeface(r0)
            X.2dx r4 = r2.A04
            r11 = 1065353216(0x3f800000, float:1.0)
            r13 = 0
            r5 = 1
            if (r4 == 0) goto L_0x0106
            float r6 = r3.A0A
            r0 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x00ff
            android.text.Layout$Alignment r10 = android.text.Layout.Alignment.ALIGN_CENTER
        L_0x008b:
            float r6 = r4.A01
            float r0 = r1.A00
            float r6 = r6 * r0
            int r9 = (int) r6
        L_0x0091:
            java.lang.String r7 = r2.A05
            r12 = 0
            android.text.StaticLayout r6 = new android.text.StaticLayout
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r2.A02 = r6
            int r0 = r6.getLineCount()
            java.lang.String r6 = "textLayout"
            if (r0 <= r5) goto L_0x00dd
            android.text.StaticLayout r0 = r2.A02
            if (r0 == 0) goto L_0x010e
            int r5 = r0.getLineBaseline(r5)
            android.text.StaticLayout r0 = r2.A02
            if (r0 == 0) goto L_0x010e
            int r0 = r0.getLineBaseline(r13)
            int r5 = r5 - r0
            float r3 = r3.A0B
            float r0 = r1.A00
            float r3 = r3 * r0
            float r0 = (float) r5
            float r3 = r3 - r0
            float r0 = java.lang.Math.abs(r3)
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x00dd
            android.text.StaticLayout r0 = r2.A02
            if (r0 == 0) goto L_0x010e
            int r17 = r0.getWidth()
            android.text.StaticLayout r14 = new android.text.StaticLayout
            r15 = r7
            r16 = r8
            r18 = r10
            r19 = r11
            r20 = r3
            r21 = r13
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
            r2.A02 = r14
        L_0x00dd:
            if (r4 != 0) goto L_0x00ee
            r2.A00 = r12
            android.text.StaticLayout r0 = r2.A02
            if (r0 == 0) goto L_0x010e
            int r0 = r0.getHeight()
            float r0 = (float) r0
            float r0 = -r0
        L_0x00eb:
            r2.A01 = r0
            return
        L_0x00ee:
            float r0 = r4.A01
            float r0 = -r0
            r3 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r3
            float r1 = r1.A00
            float r0 = r0 * r1
            r2.A00 = r0
            float r0 = r4.A00
            float r0 = -r0
            float r0 = r0 / r3
            float r0 = r0 * r1
            goto L_0x00eb
        L_0x00ff:
            int r0 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x0106
            android.text.Layout$Alignment r10 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L_0x008b
        L_0x0106:
            android.text.Layout$Alignment r10 = android.text.Layout.Alignment.ALIGN_NORMAL
            if (r4 != 0) goto L_0x008b
            r9 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0091
        L_0x010e:
            X.0qQ.A0F(r6)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UKF.A00():void");
    }

    public final void A09(float f) {
        StaticLayout staticLayout = this.A02;
        if (staticLayout == null) {
            0qQ.A0F("textLayout");
            throw AnonymousClass00P.createAndThrow();
        } else {
            staticLayout.getPaint().setAlpha(this.A01);
        }
    }

    public final void ESG(ColorFilter colorFilter) {
        StaticLayout staticLayout = this.A02;
        if (staticLayout == null) {
            0qQ.A0F("textLayout");
            throw AnonymousClass00P.createAndThrow();
        } else {
            staticLayout.getPaint().setColorFilter(colorFilter);
        }
    }

    public final void A07() {
        super.A07();
        A00();
    }

    public final void A0A(Canvas canvas) {
        AnonymousClass7TF.A12(canvas);
        canvas.translate(this.A00, this.A01);
        StaticLayout staticLayout = this.A02;
        if (staticLayout == null) {
            0qQ.A0F("textLayout");
            throw AnonymousClass00P.createAndThrow();
        }
        staticLayout.draw(canvas);
        canvas.restore();
    }
}
