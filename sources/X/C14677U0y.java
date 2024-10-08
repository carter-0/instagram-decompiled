package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: X.U0y  reason: case insensitive filesystem */
public final class C14677U0y extends Drawable {
    public Paint A00;
    public Paint A01;
    public Drawable A02;
    public Rect A03;
    public final Context A04;
    public final Path A05 = new Path();
    public final C18030VkA A06;

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        Paint paint = this.A01;
        if (paint != null) {
            canvas.drawPath(this.A05, paint);
        }
        Drawable drawable = this.A02;
        if (drawable != null) {
            Path path = this.A05;
            int save = canvas.save();
            canvas.clipPath(path);
            try {
                drawable.draw(canvas);
            } finally {
                canvas.restoreToCount(save);
            }
        }
        Paint paint2 = this.A00;
        if (paint2 != null) {
            canvas.drawPath(this.A05, paint2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x01d9, code lost:
        if (r5 == r0) goto L_0x01db;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBoundsChange(android.graphics.Rect r41) {
        /*
            r40 = this;
            r2 = 0
            r1 = r41
            X.0qQ.A0B(r1, r2)
            r39 = r40
            r0 = r39
            super.onBoundsChange(r1)
            android.graphics.Rect r0 = r0.A03
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 != 0) goto L_0x023b
            r0 = r39
            r0.A03 = r1
            X.VkA r1 = r0.A06
            android.graphics.Path r0 = r0.A05
            r38 = r0
            X.Vka r0 = r1.A00
            r37 = r0
            float r8 = r0.A01
            X.VkU r7 = r1.A01
            android.graphics.RectF r0 = r7.A01
            r36 = r0
            X.Uws r6 = r7.A04
            X.UxH r0 = r7.A03
            r35 = r0
            r26 = 1
            r1 = r36
            r0 = r26
            X.0qQ.A0B(r1, r0)
            r25 = 2
            r24 = 3
            android.graphics.Path r15 = new android.graphics.Path
            r15.<init>()
            r23 = 8
            X.Uws r5 = X.C16545Uws.TOP
            X.UxH r13 = X.C16564UxH.EDGE_LEFT
            X.0eP r4 = new X.0eP
            r4.<init>(r5, r13)
            r22 = 6
            java.lang.Integer r14 = java.lang.Integer.valueOf(r22)
            r21 = 7
            java.lang.Integer r1 = java.lang.Integer.valueOf(r21)
            X.0eP r3 = new X.0eP
            r3.<init>(r14, r1)
            X.0eP r20 = new X.0eP
            r0 = r20
            r0.<init>(r4, r3)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
            X.UxH r19 = X.C16564UxH.EDGE_RIGHT
            X.0eP r4 = new X.0eP
            r0 = r19
            r4.<init>(r5, r0)
            r18 = 4
            java.lang.Integer r9 = java.lang.Integer.valueOf(r18)
            r17 = 5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r17)
            X.0eP r3 = new X.0eP
            r3.<init>(r9, r5)
            X.0eP r16 = new X.0eP
            r0 = r16
            r0.<init>(r4, r3)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r26)
            X.Uws r0 = X.C16545Uws.RIGHT
            X.UxH r10 = X.C16564UxH.EDGE_TOP
            X.0eP r29 = A00(r0, r10, r12, r11)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r25)
            X.UxH r3 = X.C16564UxH.EDGE_BOTTOM
            X.0eP r30 = A00(r0, r3, r14, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r24)
            X.Uws r0 = X.C16545Uws.BOTTOM
            X.0eP r31 = A00(r0, r13, r12, r11)
            r11 = r19
            X.0eP r32 = A00(r0, r11, r4, r1)
            X.Uws r0 = X.C16545Uws.LEFT
            X.0eP r33 = A00(r0, r10, r4, r1)
            X.0eP r34 = A00(r0, r3, r9, r5)
            r27 = r20
            r28 = r16
            X.0eP[] r0 = new X.0eP[]{r27, r28, r29, r30, r31, r32, r33, r34}
            java.util.HashMap r3 = X.0Yt.A02(r0)
            r0 = r23
            float[] r4 = new float[r0]
            r4[r2] = r8
            r4[r26] = r8
            r4[r25] = r8
            r4[r24] = r8
            r4[r18] = r8
            r4[r17] = r8
            r4[r22] = r8
            r4[r21] = r8
            int r1 = r35.ordinal()
            r0 = r25
            if (r1 == r0) goto L_0x0105
            r0 = r24
            if (r1 == r0) goto L_0x0105
            X.0eP r1 = new X.0eP
            r0 = r35
            r1.<init>(r6, r0)
            java.lang.Object r1 = r3.get(r1)
            X.0eP r1 = (X.0eP) r1
            if (r1 == 0) goto L_0x0105
            java.lang.Object r0 = r1.A00
            int r3 = X.AnonymousClass7TE.A0M(r0)
            int r1 = X.C51969G9p.A0A(r1)
            r0 = 0
            r4[r3] = r0
            r4[r1] = r0
        L_0x0105:
            android.graphics.Path$Direction r1 = android.graphics.Path.Direction.CCW
            r0 = r36
            r15.addRoundRect(r0, r4, r1)
            r0 = r38
            r0.set(r15)
            r0 = r39
            android.content.Context r4 = r0.A04
            android.graphics.RectF r3 = r7.A00
            r0 = r37
            java.lang.Integer r1 = r0.A05
            X.0qQ.A0B(r4, r2)
            r0 = r26
            X.0qQ.A0B(r3, r0)
            int r1 = r1.intValue()
            r0 = r25
            if (r1 == r0) goto L_0x021c
            if (r1 == r2) goto L_0x03b6
            r0 = r26
            if (r1 != r0) goto L_0x03c9
            X.UFd r1 = new X.UFd
            r0 = r35
            r1.<init>(r4, r3, r0, r6)
        L_0x0138:
            boolean r0 = r1 instanceof X.C14919UFd
            if (r0 == 0) goto L_0x0312
            X.UFd r1 = (X.C14919UFd) r1
            X.UxH r5 = r1.A02
            int r3 = r5.ordinal()
            r0 = r25
            if (r3 == r0) goto L_0x025e
            r0 = r24
            if (r3 == r0) goto L_0x025e
            android.content.Context r4 = r1.A00
            android.graphics.Path r9 = new android.graphics.Path
            r9.<init>()
            android.graphics.RectF r3 = r1.A01
            float r6 = r3.width()
            r0 = 0
            r9.moveTo(r6, r0)
            r6 = 1100195529(0x4193a6c9, float:18.456438)
            X.0qQ.A0B(r4, r2)
            float r10 = X.C18183Vmx.A00(r4, r6)
            r6 = 1057698238(0x3f0b31be, float:0.54372776)
            float r11 = X.C18183Vmx.A00(r4, r6)
            r6 = 1099120798(0x4183409e, float:16.406551)
            float r12 = X.C18183Vmx.A00(r4, r6)
            r6 = 1073884914(0x40022ef2, float:2.0341153)
            float r13 = X.C18183Vmx.A00(r4, r6)
            r6 = 1097338737(0x41680f71, float:14.50377)
            float r14 = X.C18183Vmx.A00(r4, r6)
            r6 = 1080130887(0x40617d47, float:3.5232713)
            float r15 = X.C18183Vmx.A00(r4, r6)
            r9.cubicTo(r10, r11, r12, r13, r14, r15)
            r6 = 1085068990(0x40acd6be, float:5.4012136)
            float r7 = X.C18183Vmx.A00(r4, r6)
            r6 = 1093602135(0x412f0b57, float:10.9402685)
            float r6 = X.C18183Vmx.A00(r4, r6)
            r9.lineTo(r7, r6)
            r6 = 1079508673(0x4057fec1, float:3.374924)
            float r10 = X.C18183Vmx.A00(r4, r6)
            r6 = 1096004422(0x4153b346, float:13.231268)
            float r11 = X.C18183Vmx.A00(r4, r6)
            r6 = -1123573603(0xffffffffbd07a09d, float:-0.033112157)
            float r12 = X.C18183Vmx.A00(r4, r6)
            r6 = 1094252252(0x4138f6dc, float:11.560268)
            float r13 = X.C18183Vmx.A00(r4, r6)
            r6 = 1090825507(0x4104ad23, float:8.29227)
            float r15 = X.C18183Vmx.A00(r4, r6)
            r14 = r0
            r9.cubicTo(r10, r11, r12, r13, r14, r15)
            r9.lineTo(r0, r0)
            float r4 = r3.width()
            r9.lineTo(r4, r0)
            r9.close()
            r0 = r19
            if (r5 == r0) goto L_0x01db
            X.UxH r0 = X.C16564UxH.EDGE_BOTTOM
        L_0x01d8:
            r8 = 0
            if (r5 != r0) goto L_0x01dc
        L_0x01db:
            r8 = 1
        L_0x01dc:
            X.Uws r0 = r1.A03
            int r6 = r0.ordinal()
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r6 == r2) goto L_0x024a
            r4 = 0
            r0 = r24
            if (r6 == r0) goto L_0x023e
            r0 = r26
            if (r6 == r0) goto L_0x0250
            r0 = r25
            if (r6 != r0) goto L_0x03bd
            android.graphics.Matrix r7 = new android.graphics.Matrix
            r7.<init>()
            if (r8 != 0) goto L_0x01ff
            X.V5E.A00(r7, r3, r5, r1)
        L_0x01ff:
            r0 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r7.postRotate(r0, r4, r4)
            float r0 = r3.width()
            r7.postTranslate(r4, r0)
        L_0x020b:
            float r1 = r3.left
            float r0 = r3.top
            r7.postTranslate(r1, r0)
            r9.transform(r7)
            android.graphics.Path$Op r1 = android.graphics.Path.Op.UNION
            r0 = r38
            r0.op(r9, r1)
        L_0x021c:
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0 = r38
            r0.computeBounds(r1, r2)
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r1.round(r2)
            r0 = r37
            android.graphics.drawable.Drawable r1 = r0.A03
            if (r1 == 0) goto L_0x023c
            r1.setBounds(r2)
        L_0x0237:
            r0 = r39
            r0.A02 = r1
        L_0x023b:
            return
        L_0x023c:
            r1 = 0
            goto L_0x0237
        L_0x023e:
            android.graphics.Matrix r7 = new android.graphics.Matrix
            r7.<init>()
            if (r8 == 0) goto L_0x03a1
            X.V5E.A00(r7, r3, r5, r1)
            goto L_0x03a1
        L_0x024a:
            android.graphics.Matrix r7 = new android.graphics.Matrix
            r7.<init>()
            goto L_0x0258
        L_0x0250:
            android.graphics.Matrix r7 = new android.graphics.Matrix
            r7.<init>()
            X.V5E.A00(r7, r3, r1, r5)
        L_0x0258:
            if (r8 == 0) goto L_0x020b
            X.V5E.A00(r7, r3, r5, r1)
            goto L_0x020b
        L_0x025e:
            android.content.Context r0 = r1.A00
            android.graphics.Path r9 = new android.graphics.Path
            r9.<init>()
            android.graphics.RectF r3 = r1.A01
            float r4 = r3.width()
            r11 = 0
            r9.moveTo(r4, r11)
            r4 = 1101928553(0x41ae1869, float:21.761919)
            X.0qQ.A0B(r0, r2)
            float r10 = X.C18183Vmx.A00(r0, r4)
            r4 = 1100286926(0x41950bce, float:18.630764)
            float r12 = X.C18183Vmx.A00(r0, r4)
            r4 = 1070664146(0x3fd109d2, float:1.6331122)
            float r13 = X.C18183Vmx.A00(r0, r4)
            r4 = 1099313212(0x4186303c, float:16.773552)
            float r14 = X.C18183Vmx.A00(r0, r4)
            r4 = 1080278157(0x4063bc8d, float:3.5583832)
            float r15 = X.C18183Vmx.A00(r0, r4)
            r9.cubicTo(r10, r11, r12, r13, r14, r15)
            r4 = 1088742272(0x40e4e380, float:7.152771)
            float r6 = X.C18183Vmx.A00(r0, r4)
            r4 = 1093225300(0x41294b54, float:10.580891)
            float r4 = X.C18183Vmx.A00(r0, r4)
            r9.lineTo(r6, r4)
            r4 = 1083606066(0x40968432, float:4.703637)
            float r13 = X.C18183Vmx.A00(r0, r4)
            r4 = 1095889401(0x4151f1f9, float:13.121575)
            float r14 = X.C18183Vmx.A00(r0, r4)
            r4 = 1068484091(0x3fafc5fb, float:1.3732294)
            float r15 = X.C18183Vmx.A00(r0, r4)
            r4 = 1094950089(0x41439cc9, float:12.225778)
            float r16 = X.C18183Vmx.A00(r0, r4)
            r4 = 1068484091(0x3fafc5fb, float:1.3732294)
            float r17 = X.C18183Vmx.A00(r0, r4)
            r4 = 1090617917(0x4101823d, float:8.094296)
            float r18 = X.C18183Vmx.A00(r0, r4)
            r12 = r9
            r12.cubicTo(r13, r14, r15, r16, r17, r18)
            r4 = 1068484091(0x3fafc5fb, float:1.3732294)
            float r6 = X.C18183Vmx.A00(r0, r4)
            r4 = 1074099317(0x40057475, float:2.085233)
            float r4 = X.C18183Vmx.A00(r0, r4)
            r9.lineTo(r6, r4)
            r4 = 1068484091(0x3fafc5fb, float:1.3732294)
            float r13 = X.C18183Vmx.A00(r0, r4)
            r4 = 1066951682(0x3f986402, float:1.190552)
            float r14 = X.C18183Vmx.A00(r0, r4)
            r4 = 1062766946(0x3f588962, float:0.8458463)
            float r15 = X.C18183Vmx.A00(r0, r4)
            r4 = 1054343040(0x3ed7ff80, float:0.4218712)
            float r16 = X.C18183Vmx.A00(r0, r4)
            r17 = r11
            r18 = r11
            r12.cubicTo(r13, r14, r15, r16, r17, r18)
            r9.close()
            X.UxH r0 = X.C16564UxH.INSET_RIGHT
            goto L_0x01d8
        L_0x0312:
            X.UFc r1 = (X.C14918UFc) r1
            android.content.Context r5 = r1.A00
            android.graphics.Path r9 = new android.graphics.Path
            r9.<init>()
            r4 = 0
            r9.moveTo(r4, r4)
            r0 = 1082130432(0x40800000, float:4.0)
            X.0qQ.A0B(r5, r2)
            float r10 = X.C18183Vmx.A00(r5, r0)
            float r11 = X.C18183Vmx.A00(r5, r4)
            r0 = 1090139455(0x40fa353f, float:7.819)
            float r12 = X.C18183Vmx.A00(r5, r0)
            android.graphics.RectF r3 = r1.A01
            float r13 = r3.height()
            r0 = 1093140480(0x41280000, float:10.5)
            float r14 = X.C18183Vmx.A00(r5, r0)
            float r15 = r3.height()
            r9.cubicTo(r10, r11, r12, r13, r14, r15)
            r0 = 1095952237(0x4152e76d, float:13.1815)
            float r10 = X.C18183Vmx.A00(r5, r0)
            float r11 = r3.height()
            r0 = 1099432198(0x41880106, float:17.0005)
            float r12 = X.C18183Vmx.A00(r5, r0)
            float r14 = r3.width()
            r13 = r4
            r15 = r4
            r9.cubicTo(r10, r11, r12, r13, r14, r15)
            r9.lineTo(r4, r4)
            r9.close()
            X.Uws r0 = r1.A02
            int r1 = r0.ordinal()
            if (r1 == r2) goto L_0x03af
            r0 = r24
            if (r1 == r0) goto L_0x039c
            r0 = r26
            if (r1 == r0) goto L_0x0382
            r0 = r25
            if (r1 != r0) goto L_0x03c3
            android.graphics.Matrix r7 = new android.graphics.Matrix
            r7.<init>()
            goto L_0x01ff
        L_0x0382:
            android.graphics.Matrix r7 = new android.graphics.Matrix
            r7.<init>()
            r6 = 1065353216(0x3f800000, float:1.0)
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r4 = r3.width()
            r1 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r1
            float r0 = r3.height()
            float r0 = r0 / r1
            r7.postScale(r6, r5, r4, r0)
            goto L_0x020b
        L_0x039c:
            android.graphics.Matrix r7 = new android.graphics.Matrix
            r7.<init>()
        L_0x03a1:
            r0 = 1119092736(0x42b40000, float:90.0)
            r7.postRotate(r0, r4, r4)
            float r0 = r3.height()
            r7.postTranslate(r0, r4)
            goto L_0x020b
        L_0x03af:
            android.graphics.Matrix r7 = new android.graphics.Matrix
            r7.<init>()
            goto L_0x020b
        L_0x03b6:
            X.UFc r1 = new X.UFc
            r1.<init>(r4, r3, r6)
            goto L_0x0138
        L_0x03bd:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x03c3:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x03c9:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14677U0y.onBoundsChange(android.graphics.Rect):void");
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public static 0eP A00(Object obj, Object obj2, Object obj3, Object obj4) {
        return new 0eP(new 0eP(obj, obj2), new 0eP(obj3, obj4));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
        if (android.graphics.Color.alpha(r4.A02) != 255) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int getOpacity() {
        /*
            r5 = this;
            X.VkA r0 = r5.A06
            X.Vka r4 = r0.A00
            float r2 = r4.A00
            r1 = 1
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0031
            int r0 = r4.A02
            if (r0 == 0) goto L_0x0031
        L_0x0010:
            r3 = 1
            if (r1 == 0) goto L_0x001e
            int r0 = r4.A02
            int r1 = android.graphics.Color.alpha(r0)
            r0 = 255(0xff, float:3.57E-43)
            r2 = 1
            if (r1 == r0) goto L_0x001f
        L_0x001e:
            r2 = 0
        L_0x001f:
            android.graphics.drawable.Drawable r0 = r4.A03
            r1 = -1
            if (r0 == 0) goto L_0x002f
            int r0 = r0.getOpacity()
            if (r0 != r1) goto L_0x002f
        L_0x002a:
            if (r2 == 0) goto L_0x0033
            if (r3 == 0) goto L_0x0033
            return r1
        L_0x002f:
            r3 = 0
            goto L_0x002a
        L_0x0031:
            r1 = 0
            goto L_0x0010
        L_0x0033:
            r1 = -3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14677U0y.getOpacity():int");
    }

    public C14677U0y(Context context, C18030VkA vkA) {
        int i;
        int i2;
        this.A04 = context;
        this.A06 = vkA;
        C18052Vka vka = vkA.A00;
        float f = vka.A00;
        if (!(f == 0.0f || (i2 = vka.A02) == 0)) {
            Paint paint = new Paint(5);
            JTO.A1N(paint);
            paint.setStrokeWidth(f);
            paint.setColor(i2);
            this.A00 = paint;
        }
        C18041VkP vkP = vka.A04;
        if (vkP != null) {
            float f2 = vkP.A02;
            if (f2 != 0.0f && (i = vkP.A03) != 0) {
                Paint paint2 = new Paint(5);
                AnonymousClass7TE.A1Q(paint2);
                paint2.setColor(i);
                paint2.setShadowLayer(f2, vkP.A00, vkP.A01, i);
                this.A01 = paint2;
            }
        }
    }
}
