package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.text.Layout;
import android.text.Spannable;
import android.text.StaticLayout;
import android.text.TextPaint;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ukr  reason: case insensitive filesystem */
public abstract class C15927Ukr extends AnonymousClass91c {
    public int A00;
    public int A01;
    public int A02;
    public float A03;
    public int A04;
    public final Integer A05;
    public final Integer A06;
    public final List A07;
    public final List A08 = new ArrayList();

    public final void A0T(Canvas canvas) {
        List list = this.A07;
        ArrayList<AnonymousClass91R> arrayList = new ArrayList<>();
        for (Object next : list) {
            if (next instanceof AnonymousClass91R) {
                arrayList.add(next);
            }
        }
        for (AnonymousClass91R r0 : arrayList) {
            r0.A04 = false;
        }
        canvas.save();
        AnonymousClass7TG.A0z(canvas, this);
        A0H(canvas);
        A0e(canvas);
        canvas.restore();
    }

    private final List A06() {
        List list = this.A07;
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (next instanceof C19713WeF) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    private final List A07() {
        List list = this.A07;
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (next instanceof C19714WeG) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:115:0x02c9  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x02d8 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0R() {
        /*
            r35 = this;
            r11 = r35
            super.A0R()
            java.util.List r2 = r11.A07
            r2.clear()
            java.util.List r0 = r11.A08
            r34 = r0
            r34.clear()
            android.text.Spannable r0 = r11.A0F
            r10 = 0
            if (r0 == 0) goto L_0x030b
            int r0 = r0.length()
            if (r0 == 0) goto L_0x030b
            android.text.Spannable r1 = r11.A0F
            X.0qQ.A07(r1)
            java.lang.Class<X.6MP> r0 = X.AnonymousClass6MP.class
            java.lang.Object[] r1 = X.C263324Kh.A06(r1, r0)
            X.6MP[] r1 = (X.AnonymousClass6MP[]) r1
            int r0 = r1.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            java.util.Collections.addAll(r2, r0)
            android.text.Spannable r1 = r11.A0F
            X.0qQ.A07(r1)
            android.text.TextPaint r0 = r11.A0b
            r33 = r0
            X.0qQ.A07(r33)
            X.W10.A02(r1, r0)
            r33.clearShadowLayer()
            android.text.StaticLayout r9 = r11.A0G
            if (r9 == 0) goto L_0x030b
            X.0rN r4 = r11.A08()
            X.0rN r0 = r11.A08()
            int r0 = r0.A00
            float r1 = (float) r0
            boolean r14 = r11 instanceof X.C15925Ukp
            if (r14 == 0) goto L_0x01fa
            r0 = 1073741824(0x40000000, float:2.0)
        L_0x0058:
            float r1 = r1 * r0
            int r3 = (int) r1
            float r2 = r4.A01
            float r1 = r4.A02
            android.text.Layout$Alignment r0 = r4.A03
            r23 = 0
            X.0rN r24 = new X.0rN
            r25 = r0
            r26 = r33
            r27 = r23
            r28 = r2
            r29 = r1
            r30 = r3
            r31 = r10
            r24.<init>(r25, r26, r27, r28, r29, r30, r31)
            boolean r32 = r11.A0O()
            r11.A02 = r10
            r11.A00 = r10
            r11.A04 = r10
            r0 = 0
            r11.A03 = r0
            int r22 = r9.getLineCount()
            r8 = 0
        L_0x0087:
            r0 = r22
            if (r8 >= r0) goto L_0x0204
            int r7 = r9.getLineStart(r8)
            int r1 = r9.getLineEnd(r8)
            int r15 = r9.getLineTop(r8)
            float r21 = r9.getLineLeft(r8)
            float r20 = r9.getLineRight(r8)
            float r20 = r20 - r21
            android.text.Spannable r0 = r11.A0F
            java.lang.CharSequence r6 = r0.subSequence(r7, r1)
            if (r6 == 0) goto L_0x01f6
            int r0 = r6.length()
            if (r0 == 0) goto L_0x01f6
            int r0 = android.text.TextUtils.getTrimmedLength(r6)
            if (r0 <= 0) goto L_0x01f6
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            int r4 = r6.length()
            r3 = 0
            r19 = 0
        L_0x00c1:
            if (r3 >= r4) goto L_0x01f1
            boolean r0 = X.C13988Tno.A1Z(r6, r3)
            if (r0 != 0) goto L_0x01ed
            int r1 = r3 + 1
        L_0x00cb:
            if (r1 >= r4) goto L_0x00d6
            boolean r0 = X.C13988Tno.A1Z(r6, r1)
            if (r0 != 0) goto L_0x00d6
            int r1 = r1 + 1
            goto L_0x00cb
        L_0x00d6:
            r2 = r1
        L_0x00d7:
            if (r2 >= r4) goto L_0x00e2
            boolean r0 = X.C13988Tno.A1Z(r6, r2)
            if (r0 == 0) goto L_0x00e2
            int r2 = r2 + 1
            goto L_0x00d7
        L_0x00e2:
            if (r2 >= r4) goto L_0x00e5
            r1 = r2
        L_0x00e5:
            android.content.Context r13 = r11.A0Z
            X.0qQ.A07(r13)
            int r31 = r7 + r3
            java.lang.CharSequence r12 = r6.subSequence(r3, r1)
            r0 = 66
            java.lang.String r0 = X.C66579MXk.A00(r0)
            X.0qQ.A0C(r12, r0)
            android.text.Spannable r12 = (android.text.Spannable) r12
            r3 = r11
            boolean r0 = r11 instanceof X.C15924Uko
            if (r0 == 0) goto L_0x01ad
            r0 = r3
            X.Uko r0 = (X.C15924Uko) r0
            java.lang.Integer r0 = r0.A03
        L_0x0105:
            X.Vw7 r2 = new X.Vw7
            r25 = r2
            r26 = r13
            r27 = r12
            r28 = r33
            r29 = r24
            r30 = r0
            r25.<init>(r26, r27, r28, r29, r30, r31, r32)
            float r18 = r2.A03()
            float r17 = r2.A01()
            if (r14 == 0) goto L_0x019f
            X.Ukp r3 = (X.C15925Ukp) r3
            java.lang.Integer r12 = r3.A01
        L_0x0124:
            int r0 = r12.intValue()
            r3 = 1073741824(0x40000000, float:2.0)
            r13 = 1
            if (r0 != r13) goto L_0x0196
            float r16 = r18 / r3
            float r17 = r17 / r3
        L_0x0131:
            if (r32 == 0) goto L_0x0191
            java.util.List r0 = r2.A0C
            java.lang.Object r0 = X.00k.A0O(r0, r10)
            X.Vkc r0 = (X.C18054Vkc) r0
            if (r0 == 0) goto L_0x018f
            X.Vhy r0 = r0.A02
            android.text.DynamicLayout r0 = r0.A01
            float r0 = r0.getLineLeft(r10)
        L_0x0145:
            float r3 = r21 - r0
            float r3 = r3 + r20
            float r3 = r3 - r19
            float r3 = r3 - r16
        L_0x014d:
            float r0 = (float) r15
            float r0 = r0 + r17
            r2.A03 = r3
            r2.A04 = r0
            r2.A05 = r12
            r5.add(r2)
            float r19 = r19 + r18
            int r3 = r1 + -1
            int r1 = r11.A00
            int r0 = r2.A06
            int r1 = r1 + r0
            r11.A00 = r1
            int r12 = r11.A04
            java.lang.Integer r1 = r2.A0A
            int r1 = r1.intValue()
            if (r1 == r13) goto L_0x01c4
            if (r1 == r10) goto L_0x01b1
            r0 = 2
            if (r1 != r0) goto L_0x01fe
            java.util.List r0 = r2.A0C
            java.util.ArrayList r1 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r13 = r0.iterator()
        L_0x017d:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x01d1
            java.lang.Object r0 = r13.next()
            X.Vkc r0 = (X.C18054Vkc) r0
            int r0 = r0.A01
            X.AnonymousClass7TF.A1M(r1, r0)
            goto L_0x017d
        L_0x018f:
            r0 = 0
            goto L_0x0145
        L_0x0191:
            float r3 = r21 + r19
            float r3 = r3 + r16
            goto L_0x014d
        L_0x0196:
            r16 = 0
            if (r32 == 0) goto L_0x019c
            r16 = r18
        L_0x019c:
            r17 = 0
            goto L_0x0131
        L_0x019f:
            boolean r0 = r11 instanceof X.C15926Ukq
            if (r0 == 0) goto L_0x01a9
            X.Ukq r3 = (X.C15926Ukq) r3
            java.lang.Integer r12 = r3.A02
            goto L_0x0124
        L_0x01a9:
            java.lang.Integer r12 = r11.A06
            goto L_0x0124
        L_0x01ad:
            java.lang.Integer r0 = r11.A05
            goto L_0x0105
        L_0x01b1:
            android.text.Spannable r0 = r2.A08
            java.lang.String r13 = r0.toString()
            java.lang.String r1 = " "
            java.lang.String r0 = ""
            java.lang.String r0 = X.00p.A0g(r13, r1, r0, r10)
            int r0 = r0.length()
            goto L_0x01d5
        L_0x01c4:
            java.util.List r1 = r2.A0C
            java.lang.Object r1 = X.00k.A0L(r1)
            X.Vkc r1 = (X.C18054Vkc) r1
            if (r1 == 0) goto L_0x01d5
            int r0 = r1.A01
            goto L_0x01d5
        L_0x01d1:
            int r0 = X.00k.A02(r1)
        L_0x01d5:
            int r12 = r12 + r0
            r11.A04 = r12
            X.6Lz r1 = r11.A0I
            X.6Lz r0 = X.C306396Lz.SPARKLE
            if (r1 != r0) goto L_0x01e7
            float r1 = r11.A03
            float r0 = r2.A02()
            float r1 = r1 + r0
            r11.A03 = r1
        L_0x01e7:
            int r0 = r11.A02
            int r0 = r0 + 1
            r11.A02 = r0
        L_0x01ed:
            int r3 = r3 + 1
            goto L_0x00c1
        L_0x01f1:
            r0 = r34
            r0.add(r5)
        L_0x01f6:
            int r8 = r8 + 1
            goto L_0x0087
        L_0x01fa:
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0058
        L_0x01fe:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0204:
            X.6Lz r0 = r11.A0I
            if (r0 == 0) goto L_0x030b
            int r0 = r0.ordinal()
            if (r0 != r10) goto L_0x030b
            java.util.ArrayList r6 = X.0Yv.A1F(r34)
            int r0 = r11.A04
            float r1 = (float) r0
            r0 = 1077936128(0x40400000, float:3.0)
            float r1 = r1 / r0
            double r0 = (double) r1
            double r1 = java.lang.Math.floor(r0)
            float r0 = (float) r1
            int r0 = (int) r0
            int r1 = r0 + 3
            r0 = 16
            int r5 = java.lang.Math.min(r0, r1)
            r4 = 0
        L_0x0228:
            if (r4 >= r5) goto L_0x0306
            X.2SP r0 = X.2SP.A01
            float r3 = r0.A02()
            float r0 = r11.A03
            float r3 = r3 * r0
            int r7 = r6.size()
            r1 = 0
        L_0x0238:
            if (r1 >= r7) goto L_0x02d4
            java.lang.Object r0 = r6.get(r1)
            X.Vw7 r0 = (X.C18653Vw7) r0
            float r0 = r0.A02()
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            java.lang.Object r2 = r6.get(r1)
            X.Vw7 r2 = (X.C18653Vw7) r2
            if (r0 >= 0) goto L_0x0288
            java.lang.Integer r0 = r2.A0A
            int r1 = r0.intValue()
            r9 = 0
            r7 = 1
            if (r1 == r7) goto L_0x0290
            if (r1 == r10) goto L_0x0281
            r0 = 2
            if (r1 != r0) goto L_0x0300
            java.util.List r8 = r2.A0C
            int r1 = r8.size()
        L_0x0263:
            if (r9 >= r1) goto L_0x02d4
            java.lang.Object r0 = r8.get(r9)
            X.Vkc r0 = (X.C18054Vkc) r0
            float r0 = r0.A00()
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            java.lang.Object r2 = r8.get(r9)
            X.Vkc r2 = (X.C18054Vkc) r2
            if (r0 < 0) goto L_0x02af
            float r0 = r2.A00()
            float r3 = r3 - r0
            int r9 = r9 + 1
            goto L_0x0263
        L_0x0281:
            java.util.List r0 = r2.A0C
            java.lang.Object r2 = X.00k.A0L(r0)
            goto L_0x02ab
        L_0x0288:
            float r0 = r2.A02()
            float r3 = r3 - r0
            int r1 = r1 + 1
            goto L_0x0238
        L_0x0290:
            java.util.List r0 = r2.A0C
            java.util.Iterator r1 = r0.iterator()
        L_0x0296:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x02fe
            java.lang.Object r2 = r1.next()
            r0 = r2
            X.Vkc r0 = (X.C18054Vkc) r0
            float r0 = r0.A00()
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0296
        L_0x02ab:
            X.Vkc r2 = (X.C18054Vkc) r2
            if (r2 == 0) goto L_0x02d4
        L_0x02af:
            X.Vhy r2 = r2.A02
            X.0eM r0 = r2.A05
            java.lang.Object r0 = r0.getValue()
            android.graphics.Path r0 = (android.graphics.Path) r0
            android.graphics.PathMeasure r1 = new android.graphics.PathMeasure
            r1.<init>(r0, r10)
            r0 = 2
            float[] r8 = new float[r0]
        L_0x02c1:
            float r0 = r1.getLength()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x02d8
            float r0 = r1.getLength()
            float r3 = r3 - r0
            boolean r0 = r1.nextContour()
            if (r0 != 0) goto L_0x02c1
        L_0x02d4:
            int r4 = r4 + 1
            goto L_0x0228
        L_0x02d8:
            r0 = r23
            r1.getPosTan(r3, r8, r0)
            X.0eM r2 = r2.A04
            java.util.List r1 = X.JTO.A15(r2)
            if (r1 == 0) goto L_0x02ee
            r0 = r8[r10]
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r1.add(r0)
        L_0x02ee:
            java.util.List r1 = X.JTO.A15(r2)
            if (r1 == 0) goto L_0x02d4
            r0 = r8[r7]
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r1.add(r0)
            goto L_0x02d4
        L_0x02fe:
            r2 = 0
            goto L_0x02ab
        L_0x0300:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0306:
            int r0 = r11.A00
            r11.A0d(r0)
        L_0x030b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15927Ukr.A0R():void");
    }

    public final void A0S(Canvas canvas) {
        if (this instanceof C15924Uko) {
            C15924Uko uko = (C15924Uko) this;
            if (uko.A01 > 0) {
                canvas.save();
                AnonymousClass7TG.A0z(canvas, uko);
                uko.A0H(canvas);
                uko.A0f(canvas, uko.A00, uko.A0a(uko.A01));
            } else {
                return;
            }
        } else {
            canvas.save();
            AnonymousClass7TG.A0z(canvas, this);
            A0H(canvas);
            A0f(canvas, 1.0f, this.A0F.length());
        }
        canvas.restore();
    }

    public final void A0Y() {
        Spannable spannable = this.A0F;
        0qQ.A07(spannable);
        if (spannable.length() != 0) {
            C263324Kh.A05(spannable, U2W.class);
        }
        StaticLayout staticLayout = this.A0G;
        if (staticLayout != null) {
            for (Object A002 : A07()) {
                C19714WeG.A00(staticLayout, this, A002);
            }
            for (C19713WeF weF : A06()) {
                float textSize = this.A0b.getTextSize();
                AnonymousClass9UN r1 = AnonymousClass9UV.A00;
                Layout.Alignment alignment = this.A0E;
                0qQ.A07(alignment);
                weF.FLc(staticLayout, r1.A00(alignment), textSize, spannable.getSpanStart(weF), spannable.getSpanEnd(weF));
                weF.A01.setAlpha(255);
            }
        }
    }

    public final void A0Z(Canvas canvas, Spannable spannable, TextPaint textPaint, 0rN r7, float f, float f2, int i) {
        if (this instanceof C15924Uko) {
            C15924Uko uko = (C15924Uko) this;
            0qQ.A0B(canvas, 0);
            uko.A0c();
            uko.A0b();
            int i2 = uko.A01;
            if (i2 > 0) {
                uko.A0f(canvas, uko.A00, uko.A0a(i2));
            }
            uko.A0e(canvas);
            return;
        }
        0qQ.A0B(canvas, 0);
        A0c();
        A0b();
        A0f(canvas, 1.0f, this.A0F.length());
        A0e(canvas);
    }

    public final int A0a(int i) {
        for (List it : this.A08) {
            Iterator it2 = it.iterator();
            while (true) {
                if (it2.hasNext()) {
                    C18653Vw7 vw7 = (C18653Vw7) it2.next();
                    int i2 = vw7.A06;
                    if (i < i2) {
                        BreakIterator breakIterator = vw7.A0B;
                        Spannable spannable = vw7.A08;
                        C13988Tno.A1P(spannable, breakIterator);
                        int next = breakIterator.next();
                        int i3 = 0;
                        int i4 = 0;
                        int i5 = 0;
                        while (i3 < i && next != -1) {
                            i4 += spannable.subSequence(i5, next).length();
                            i3++;
                            i5 = next;
                            next = breakIterator.next();
                        }
                        return vw7.A07 + i4;
                    }
                    i -= i2;
                }
            }
        }
        Spannable spannable2 = this.A0F;
        0qQ.A07(spannable2);
        return (spannable2.length() - 1) + 1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: X.Ukq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: X.Ukp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: X.Ukq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: X.Ukq} */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0082, code lost:
        if (r4 == 1) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x017f, code lost:
        if (r4 != 3) goto L_0x0185;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0185, code lost:
        r4 = false;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0b() {
        /*
            r23 = this;
            r1 = r23
            boolean r0 = r1 instanceof X.C15925Ukp
            if (r0 == 0) goto L_0x0190
            r12 = r1
            X.Ukp r12 = (X.C15925Ukp) r12
            int r11 = r12.A00
            int r0 = r12.A01
            int r11 = r11 - r0
            r10 = 0
            if (r11 >= r10) goto L_0x0012
            r11 = 0
        L_0x0012:
            java.util.List r0 = r12.A08
            r22 = r0
            int r19 = r22.size()
            r9 = 0
            r18 = 0
        L_0x001d:
            r0 = r19
            if (r9 >= r0) goto L_0x0271
            r0 = r22
            java.lang.Object r8 = r0.get(r9)
            java.util.List r8 = (java.util.List) r8
            int r17 = r8.size()
            r7 = 0
        L_0x002e:
            r0 = r17
            if (r7 >= r0) goto L_0x018c
            java.lang.Object r6 = r8.get(r7)
            X.Vw7 r6 = (X.C18653Vw7) r6
            int r0 = r12.A0W()
            int r0 = r0 + -416
            if (r11 < r0) goto L_0x0131
            int r0 = r12.A0W()
            int r0 = r0 + -416
            int r0 = r11 - r0
            float r5 = (float) r0
            r0 = 1137704960(0x43d00000, float:416.0)
            float r5 = r5 / r0
            r13 = 1
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x012e
            java.util.List r3 = r12.A04
            int r2 = r3.size()
            r4 = 0
        L_0x005a:
            if (r4 >= r2) goto L_0x012e
            java.util.List r14 = r12.A05
            int r1 = r4 + 1
            float r0 = A05(r14, r1)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x012b
            java.lang.Object r3 = r3.get(r4)
            android.animation.TimeInterpolator r3 = (android.animation.TimeInterpolator) r3
            float r0 = A04(r14, r5, r4, r1)
            float r5 = X.C229632nm.A01(r0)
            java.lang.Object r2 = r14.get(r4)
            android.graphics.PointF r2 = (android.graphics.PointF) r2
            java.lang.Object r0 = r14.get(r1)
            android.graphics.PointF r0 = (android.graphics.PointF) r0
            if (r4 != r13) goto L_0x0185
        L_0x0084:
            r4 = 1
        L_0x0085:
            float r1 = r2.y
            float r3 = r3.getInterpolation(r5)
            float r2 = r2.y
            float r0 = r0.y
            float r0 = X.AnonymousClass7TE.A00(r2, r0)
            float r3 = r3 * r0
            r0 = 1
            if (r4 == 0) goto L_0x0098
            r0 = -1
        L_0x0098:
            float r0 = (float) r0
            float r3 = r3 * r0
            float r1 = r1 + r3
        L_0x009b:
            java.text.BreakIterator r0 = r6.A0B
            r21 = r0
            android.text.Spannable r0 = r6.A08
            r20 = r0
            r2 = r21
            X.C13988Tno.A1P(r0, r2)
            java.lang.Integer r0 = r6.A0A
            int r14 = r0.intValue()
            r13 = 2
            r5 = 1
            if (r14 == r5) goto L_0x00bc
            if (r14 == r10) goto L_0x00c1
            if (r14 == r13) goto L_0x00bc
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x00bc:
            int r4 = r21.next()
            goto L_0x00c5
        L_0x00c1:
            int r4 = r21.last()
        L_0x00c5:
            android.text.TextPaint r0 = r6.A09
            android.text.TextPaint r3 = new android.text.TextPaint
            r3.<init>(r0)
            float r0 = r0.getTextSize()
            float r0 = r0 * r1
            r3.setTextSize(r0)
            r2 = 0
        L_0x00d5:
            r0 = -1
            if (r4 == r0) goto L_0x0125
            java.util.List r0 = r6.A0C
            java.lang.Object r2 = X.00k.A0O(r0, r2)
            X.Vkc r2 = (X.C18054Vkc) r2
            if (r2 == 0) goto L_0x0111
            X.Vhy r0 = r2.A02
            r0.A00(r1)
            java.util.List r0 = r2.A04
            java.util.Iterator r15 = r0.iterator()
        L_0x00ed:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x00fd
            java.lang.Object r0 = r15.next()
            X.Vhy r0 = (X.C17907Vhy) r0
            r0.A00(r1)
            goto L_0x00ed
        L_0x00fd:
            X.Vhy r0 = r2.A02
            android.text.DynamicLayout r0 = r0.A01
            int r16 = X.AnonymousClass6M0.A02(r0)
            r0 = r20
            float r15 = r3.measureText(r0, r10, r4)
            r0 = r16
            float r0 = (float) r0
            float r15 = r15 - r0
            r2.A00 = r15
        L_0x0111:
            if (r14 == r5) goto L_0x011f
            if (r14 == r10) goto L_0x011d
            if (r14 == r13) goto L_0x011d
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x011d:
            r2 = r4
            goto L_0x0120
        L_0x011f:
            r2 = 0
        L_0x0120:
            int r4 = r21.next()
            goto L_0x00d5
        L_0x0125:
            int r18 = r18 + 1
            int r7 = r7 + 1
            goto L_0x002e
        L_0x012b:
            r4 = r1
            goto L_0x005a
        L_0x012e:
            r1 = 0
            goto L_0x009b
        L_0x0131:
            int r0 = r12.A00
            int r0 = r0 * r18
            int r1 = r11 - r0
            r0 = 750(0x2ee, float:1.051E-42)
            if (r1 <= r0) goto L_0x013d
            r1 = 750(0x2ee, float:1.051E-42)
        L_0x013d:
            float r1 = (float) r1
            r0 = 1144750080(0x443b8000, float:750.0)
            float r1 = r1 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = X.C229632nm.A01(r1)
            r13 = 1
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0188
            java.util.List r3 = r12.A02
            int r2 = r3.size()
            r4 = 0
        L_0x0154:
            if (r4 >= r2) goto L_0x0188
            java.util.List r14 = r12.A03
            int r1 = r4 + 1
            float r0 = A05(r14, r1)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0183
            java.lang.Object r3 = r3.get(r4)
            android.animation.TimeInterpolator r3 = (android.animation.TimeInterpolator) r3
            float r0 = A04(r14, r5, r4, r1)
            float r5 = X.C229632nm.A01(r0)
            java.lang.Object r2 = r14.get(r4)
            android.graphics.PointF r2 = (android.graphics.PointF) r2
            java.lang.Object r0 = r14.get(r1)
            android.graphics.PointF r0 = (android.graphics.PointF) r0
            if (r4 == r13) goto L_0x0084
            r1 = 3
            if (r4 != r1) goto L_0x0185
            goto L_0x0084
        L_0x0183:
            r4 = r1
            goto L_0x0154
        L_0x0185:
            r4 = 0
            goto L_0x0085
        L_0x0188:
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L_0x009b
        L_0x018c:
            int r9 = r9 + 1
            goto L_0x001d
        L_0x0190:
            boolean r0 = r1 instanceof X.C15924Uko
            if (r0 == 0) goto L_0x0215
            r4 = r1
            X.Uko r4 = (X.C15924Uko) r4
            int r7 = r4.A00
            int r0 = r4.A01
            int r7 = r7 - r0
            r0 = 0
            if (r7 >= r0) goto L_0x01a0
            r7 = 0
        L_0x01a0:
            float r6 = (float) r7
            int r0 = r4.A00
            float r3 = (float) r0
            r0 = 1101004800(0x41a00000, float:20.0)
            float r2 = r3 / r0
            r0 = 1148846080(0x447a0000, float:1000.0)
            float r2 = r2 * r0
            float r1 = r6 / r2
            r5 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x01b5
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x01b5:
            float r1 = r1 * r3
            int r0 = (int) r1
            r4.A01 = r0
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x01de
            int r0 = r4.A0W()
            int r0 = r0 + -250
            if (r7 <= r0) goto L_0x01de
            android.view.animation.Interpolator r3 = r4.A02
            int r0 = r4.A0W()
            int r0 = r0 + -250
            float r2 = (float) r0
            int r0 = r4.A0W()
            float r1 = (float) r0
            r0 = 0
            float r0 = X.0mi.A02(r6, r2, r1, r5, r0)
            float r1 = r3.getInterpolation(r0)
        L_0x01de:
            r4.A00 = r1
            java.util.List r9 = r4.A08
            int r8 = r9.size()
            int r7 = r4.A01
            r6 = 0
        L_0x01e9:
            if (r6 >= r8) goto L_0x020d
            java.lang.Object r5 = r9.get(r6)
            java.util.List r5 = (java.util.List) r5
            int r3 = r5.size()
            r2 = 0
        L_0x01f6:
            if (r2 >= r3) goto L_0x020a
            if (r7 < 0) goto L_0x020d
            java.lang.Object r1 = r5.get(r2)
            X.Vw7 r1 = (X.C18653Vw7) r1
            float r0 = r4.A00
            r1.A01 = r0
            int r0 = r1.A06
            int r7 = r7 - r0
            int r2 = r2 + 1
            goto L_0x01f6
        L_0x020a:
            int r6 = r6 + 1
            goto L_0x01e9
        L_0x020d:
            int r0 = r4.A01
            int r0 = r0 + 1
            r4.A0d(r0)
            return
        L_0x0215:
            r12 = r1
            X.Ukq r12 = (X.C15926Ukq) r12
            int r1 = r12.A00
            int r0 = r12.A01
            int r1 = r1 - r0
            r0 = 0
            if (r1 >= r0) goto L_0x0221
            r1 = 0
        L_0x0221:
            r12.A00 = r1
            java.util.List r9 = r12.A08
            int r8 = r9.size()
            r7 = 0
            r6 = 0
        L_0x022b:
            if (r7 >= r8) goto L_0x0271
            java.lang.Object r5 = r9.get(r7)
            java.util.List r5 = (java.util.List) r5
            int r4 = r5.size()
            r3 = 0
        L_0x0238:
            if (r3 >= r4) goto L_0x026e
            java.lang.Object r2 = r5.get(r3)
            X.Vw7 r2 = (X.C18653Vw7) r2
            int r1 = r12.A00
            int r0 = r12.A0W()
            int r0 = r0 + -500
            boolean r1 = X.JTQ.A1P(r1, r0)
            int r0 = r12.A00
            float r0 = X.C15926Ukq.A01(r12, r0, r6, r1)
            if (r1 == 0) goto L_0x0269
            X.VVY r1 = X.C15926Ukq.A03(r12, r0)
        L_0x0258:
            float r0 = r1.A00
            r2.A01 = r0
            float r0 = r1.A02
            r2.A00 = r0
            float r0 = r1.A01
            r2.A02 = r0
            int r6 = r6 + 1
            int r3 = r3 + 1
            goto L_0x0238
        L_0x0269:
            X.VVY r1 = X.C15926Ukq.A02(r12, r0)
            goto L_0x0258
        L_0x026e:
            int r7 = r7 + 1
            goto L_0x022b
        L_0x0271:
            int r0 = r12.A00
            r12.A0d(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15927Ukr.A0b():void");
    }

    public final void A0c() {
        List list = this.A07;
        ArrayList<AnonymousClass91R> arrayList = new ArrayList<>();
        for (Object next : list) {
            if (next instanceof AnonymousClass91R) {
                arrayList.add(next);
            }
        }
        for (AnonymousClass91R r1 : arrayList) {
            r1.A04 = false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00bd A[LOOP:2: B:35:0x00bb->B:36:0x00bd, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0d(int r15) {
        /*
            r14 = this;
            X.6Lz r1 = r14.A0I
            X.6Lz r0 = X.C306396Lz.SPARKLE
            if (r1 != r0) goto L_0x0140
            r9 = 0
            r8 = 0
            float[] r7 = new float[r9]
            float[] r6 = new float[r9]
            java.util.List r0 = r14.A08
            java.util.ArrayList r0 = X.0Yv.A1F(r0)
            java.util.Iterator r13 = r0.iterator()
        L_0x0016:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x00d1
            java.lang.Object r5 = r13.next()
            X.Vw7 r5 = (X.C18653Vw7) r5
            if (r15 <= 0) goto L_0x00d1
            int r4 = r5.A06
            if (r9 >= r4) goto L_0x00cd
            r2 = r9
            if (r9 >= r8) goto L_0x002c
            r2 = 0
        L_0x002c:
            r1 = r15
            if (r15 <= r4) goto L_0x0030
            r1 = r4
        L_0x0030:
            java.lang.Integer r0 = r5.A0A
            int r3 = r0.intValue()
            r12 = 1
            if (r3 == r12) goto L_0x0044
            if (r3 == r8) goto L_0x005b
            r0 = 2
            if (r3 == r0) goto L_0x0044
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0044:
            float[] r11 = new float[r8]
        L_0x0046:
            if (r2 >= r1) goto L_0x0069
            java.util.List r0 = r5.A0C
            java.lang.Object r0 = r0.get(r2)
            X.Vkc r0 = (X.C18054Vkc) r0
            float[] r0 = r0.A02()
            float[] r11 = X.0Yw.A0Y(r11, r0)
            int r2 = r2 + 1
            goto L_0x0046
        L_0x005b:
            java.util.List r0 = r5.A0C
            java.lang.Object r0 = X.00k.A0L(r0)
            X.Vkc r0 = (X.C18054Vkc) r0
            if (r0 == 0) goto L_0x00c6
            float[] r11 = r0.A02()
        L_0x0069:
            android.graphics.Matrix r10 = new android.graphics.Matrix
            r10.<init>()
            float r2 = r5.A02
            float r0 = X.C18653Vw7.A00(r5)
            float r1 = -r0
            java.lang.Integer r0 = r5.A05
            int r0 = r0.intValue()
            if (r0 != r12) goto L_0x00c4
            float r3 = r5.A01()
            r0 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r0
            float r0 = -r3
        L_0x0085:
            float r0 = -r0
            r10.setRotate(r2, r1, r0)
            r10.mapPoints(r11)
            float r3 = r5.A03
            float r0 = X.C18653Vw7.A00(r5)
            float r3 = r3 + r0
            r1 = 0
            float r3 = r3 + r1
            float r2 = r5.A04
            java.lang.Integer r0 = r5.A05
            int r0 = r0.intValue()
            if (r0 != r12) goto L_0x00a7
            float r1 = r5.A01()
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
            float r1 = -r1
        L_0x00a7:
            float r2 = r2 + r1
            float r0 = r5.A00
            float r2 = r2 + r0
            r10.setTranslate(r3, r2)
            r10.mapPoints(r11)
            float[] r7 = X.0Yw.A0Y(r7, r11)
            int r0 = r11.length
            int r3 = r0 / 2
            float[] r2 = new float[r3]
            r1 = 0
        L_0x00bb:
            if (r1 >= r3) goto L_0x00c9
            float r0 = r5.A01
            r2[r1] = r0
            int r1 = r1 + 1
            goto L_0x00bb
        L_0x00c4:
            r0 = 0
            goto L_0x0085
        L_0x00c6:
            float[] r11 = new float[r8]
            goto L_0x0069
        L_0x00c9:
            float[] r6 = X.0Yw.A0Y(r6, r2)
        L_0x00cd:
            int r9 = r9 - r4
            int r15 = r15 - r4
            goto L_0x0016
        L_0x00d1:
            android.graphics.Matrix r2 = new android.graphics.Matrix
            r2.<init>()
            float r1 = r14.A00
            boolean r0 = r14.A0P()
            if (r0 == 0) goto L_0x0138
            android.text.StaticLayout r0 = r14.A0G
            int r0 = X.AnonymousClass6M0.A00(r0)
            float r0 = (float) r0
        L_0x00e5:
            float r1 = r1 - r0
            float r0 = r14.A01
            r2.setTranslate(r1, r0)
            r2.mapPoints(r7)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r5 = r6.length
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r5)
            r0 = 0
        L_0x00fa:
            if (r8 >= r5) goto L_0x013a
            r9 = r6[r8]
            int r10 = r0 + 1
            int r1 = r0 * 2
            r0 = 0
            X.0qQ.A0B(r7, r0)
            if (r1 < 0) goto L_0x0136
            int r0 = r7.length
            if (r1 >= r0) goto L_0x0136
            r0 = r7[r1]
            java.lang.Float r2 = java.lang.Float.valueOf(r0)
        L_0x0111:
            int r1 = r1 + 1
            if (r1 < 0) goto L_0x0134
            int r0 = r7.length
            if (r1 >= r0) goto L_0x0134
            r0 = r7[r1]
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
        L_0x011e:
            if (r2 == 0) goto L_0x012b
            if (r0 == 0) goto L_0x012b
            r4.add(r2)
            r4.add(r0)
            X.JTP.A1V(r4, r9)
        L_0x012b:
            X.0gF r0 = X.C60340gF.A00
            r3.add(r0)
            int r8 = r8 + 1
            r0 = r10
            goto L_0x00fa
        L_0x0134:
            r0 = 0
            goto L_0x011e
        L_0x0136:
            r2 = 0
            goto L_0x0111
        L_0x0138:
            r0 = 0
            goto L_0x00e5
        L_0x013a:
            X.9c2 r5 = new X.9c2
            r5.<init>(r4)
            goto L_0x0144
        L_0x0140:
            r0 = 0
            r14.A0J = r0
            r5 = 0
        L_0x0144:
            X.6Lz r4 = r14.A0I
            if (r4 == 0) goto L_0x016d
            r7 = 1065353216(0x3f800000, float:1.0)
            r9 = 0
            android.content.Context r2 = r14.A0Z
            android.text.TextPaint r1 = r14.A0b
            float r0 = r1.getTextSize()
            float r10 = X.0nA.A02(r2, r0)
            float r0 = r14.A04
            float r10 = r10 / r0
            float r11 = r14.A05
            int r12 = r14.A09
            boolean r13 = r14.A0P
            r6 = 0
            android.graphics.Typeface r3 = r1.getTypeface()
            X.8ik r2 = new X.8ik
            r8 = r7
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r14.A0J = r2
        L_0x016d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15927Ukr.A0d(int):void");
    }

    public final void A0e(Canvas canvas) {
        VVY A022;
        Canvas canvas2 = canvas;
        if (this instanceof C15925Ukp) {
            List list = this.A08;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                List list2 = (List) list.get(i);
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    C18653Vw7 vw7 = (C18653Vw7) list2.get(i2);
                    vw7.A04(canvas2, C51966G9m.A06(vw7.A0C));
                }
            }
        } else if (this instanceof C15924Uko) {
            C15924Uko uko = (C15924Uko) this;
            if (uko.A01 > 0) {
                List list3 = uko.A08;
                int size3 = list3.size();
                int i3 = uko.A01;
                for (int i4 = 0; i4 < size3; i4++) {
                    List list4 = (List) list3.get(i4);
                    int size4 = list4.size();
                    int i5 = 0;
                    while (i5 < size4) {
                        if (i3 >= 0) {
                            C18653Vw7 vw72 = (C18653Vw7) list4.get(i5);
                            int i6 = vw72.A06;
                            int i7 = i6 - 1;
                            int i8 = i3 - 1;
                            if (i7 > i8) {
                                i7 = i8;
                            }
                            vw72.A04(canvas2, i7);
                            i3 -= i6;
                            i5++;
                        } else {
                            return;
                        }
                    }
                }
            }
        } else {
            C15926Ukq ukq = (C15926Ukq) this;
            List list5 = ukq.A08;
            int size5 = list5.size();
            int i9 = 0;
            for (int i10 = 0; i10 < size5; i10++) {
                List list6 = (List) list5.get(i10);
                int size6 = list6.size();
                canvas2.save();
                for (int i11 = 0; i11 < size6; i11++) {
                    C18653Vw7 vw73 = (C18653Vw7) list6.get(i11);
                    boolean A1P = JTQ.A1P(ukq.A00, ukq.A0W() - 500);
                    vw73.A04(canvas2, C51966G9m.A06(vw73.A0C));
                    if (ukq.A0I == null) {
                        int i12 = ukq.A00;
                        float A012 = C15926Ukq.A01(ukq, i12, i9, A1P);
                        int i13 = 1;
                        do {
                            float A013 = C15926Ukq.A01(ukq, i12 - (i13 * 5), i9, A1P);
                            if (A012 == A013) {
                                break;
                            }
                            if (A1P) {
                                A022 = C15926Ukq.A03(ukq, A013);
                            } else {
                                A022 = C15926Ukq.A02(ukq, A013);
                            }
                            canvas2.save();
                            vw73.A01 = A022.A00 * 0.2f;
                            vw73.A00 = A022.A02;
                            vw73.A02 = A022.A01;
                            vw73.A04(canvas2, C51966G9m.A06(vw73.A0C));
                            canvas2.restore();
                            i13++;
                        } while (i13 < 4);
                    }
                    i9++;
                }
                canvas2.restore();
            }
        }
    }

    public final int getDurationInMs() {
        if (this instanceof C15924Uko) {
            int i = this.A01;
            if (i < 0) {
                return Math.max(5000, ((int) ((((float) this.A00) / 20.0f) * 1000.0f)) + C355538Qj.DEFAULT_SWIPE_ANIMATION_DURATION);
            }
            return i;
        }
        int i2 = this.A01;
        if (i2 < 0) {
            return 5000;
        }
        return i2;
    }

    public C15927Ukr(Context context, int i) {
        super(context, i);
        Integer num = AnonymousClass05K.A00;
        this.A05 = num;
        this.A06 = num;
        this.A07 = new ArrayList();
        this.A01 = 5000;
    }

    public static float A04(List list, float f, int i, int i2) {
        float f2 = ((PointF) list.get(i)).x;
        return (f - f2) / (((PointF) list.get(i2)).x - f2);
    }

    public static float A05(List list, int i) {
        PointF pointF = (PointF) 00k.A0O(list, i);
        if (pointF != null) {
            return pointF.x;
        }
        return 0.0f;
    }

    public final void A0f(Canvas canvas, float f, int i) {
        StaticLayout staticLayout;
        int i2 = i;
        if (AnonymousClass7TE.A1b(A07())) {
            StaticLayout staticLayout2 = this.A0G;
            if (staticLayout2 != null) {
                for (C19714WeG weG : A07()) {
                    List A1I = AnonymousClass7TE.A1I(C18698Vww.A02(staticLayout2, 0.0f, 0.0f, 0.0f, 0.0f, weG.A0A, this.A0F.getSpanStart(weG), Math.min(this.A0F.getSpanEnd(weG), i2)));
                    TextPaint textPaint = this.A0b;
                    weG.A03(C306496Mj.A03(A1I, weG.A09 * textPaint.getTextSize(), weG.A0B * textPaint.getTextSize(), weG.A08 * textPaint.getTextSize(), weG.A00, true), textPaint.getTextSize());
                    weG.onPreDraw();
                    weG.A02(canvas, Integer.valueOf((int) (255.0f * f)));
                }
                return;
            }
            return;
        }
        List list = this.A07;
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (next instanceof C19712WeE) {
                arrayList.add(next);
            }
        }
        if (AnonymousClass7TE.A1b(arrayList)) {
            ArrayList<C19712WeE> arrayList2 = new ArrayList<>();
            for (Object next2 : list) {
                if (next2 instanceof C19712WeE) {
                    arrayList2.add(next2);
                }
            }
            for (C19712WeE weE : arrayList2) {
                weE.onPreDraw();
                int i3 = (int) (255.0f * f);
                Integer valueOf = Integer.valueOf(i3);
                if (weE.A05) {
                    weE.A05 = false;
                    if (valueOf != null) {
                        weE.A02.setAlpha(i3);
                    }
                    canvas.drawRect(weE.A03, weE.A02);
                }
            }
        } else if (AnonymousClass7TE.A1b(A06()) && (staticLayout = this.A0G) != null) {
            for (C19713WeF weF : A06()) {
                weF.A01.setAlpha((int) (255.0f * f));
                C18525Vtb vtb = C19713WeF.A07;
                float textSize = this.A0b.getTextSize();
                AnonymousClass9UN r3 = AnonymousClass9UV.A00;
                Layout.Alignment alignment = this.A0E;
                0qQ.A07(alignment);
                Integer A002 = r3.A00(alignment);
                int spanStart = this.A0F.getSpanStart(weF);
                int spanEnd = this.A0F.getSpanEnd(weF);
                if (spanEnd > i2) {
                    spanEnd = i2;
                }
                ArrayList A012 = vtb.A01(staticLayout, A002, textSize, spanStart, spanEnd);
                weF.A04 = A012;
                weF.A03 = C13988Tno.A0i(A012);
                weF.onPreDraw();
                weF.AQG(canvas);
            }
        }
    }

    public final void EXC(int i, int i2) {
        super.EXC(i, i2);
        this.A01 = i2;
    }
}
