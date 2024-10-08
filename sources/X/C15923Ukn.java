package X;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.Spannable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.animation.OvershootInterpolator;
import com.instagram.common.session.UserSession;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ukn  reason: case insensitive filesystem */
public final class C15923Ukn extends AnonymousClass91c {
    public float A00;
    public float A01 = 0.5f;
    public final ArrayList A02 = new ArrayList();
    public final List A03 = new ArrayList();
    public final OvershootInterpolator A04 = new OvershootInterpolator(1.5f);
    public final UserSession A05;
    public final C360728f3 A06 = C360728f3.STRETCH_SHRINK;
    public final BreakIterator A07 = BreakIterator.getCharacterInstance();
    public final ArrayList A08 = new ArrayList();
    public final ArrayList A09 = new ArrayList();
    public final ArrayList A0A = new ArrayList();

    private final void A01(Canvas canvas, C17576VaU vaU, float f, boolean z) {
        float f2;
        int i = -1;
        if (z) {
            i = 1;
        }
        if (A0O()) {
            i = -i;
        }
        Layout.Alignment alignment = this.A0E;
        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
        if (alignment == alignment2) {
            canvas.translate((((float) AnonymousClass6M0.A02(vaU.A01)) / 2.0f) * ((float) i) * f, 0.0f);
        }
        StaticLayout staticLayout = vaU.A02;
        if (staticLayout != null) {
            staticLayout.draw(canvas);
        }
        StaticLayout staticLayout2 = vaU.A01;
        staticLayout2.draw(canvas);
        Layout.Alignment alignment3 = this.A0E;
        int A022 = AnonymousClass6M0.A02(staticLayout2);
        if (alignment3 == alignment2) {
            f2 = (((float) A022) / 2.0f) * ((float) i);
        } else {
            f2 = (float) (A022 * i);
        }
        canvas.translate(f2 * f, 0.0f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x0133 A[LOOP:1: B:43:0x012d->B:45:0x0133, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x014e A[LOOP:2: B:47:0x0148->B:49:0x014e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x022d  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0242 A[LOOP:4: B:81:0x023c->B:83:0x0242, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0Z(android.graphics.Canvas r25, android.text.Spannable r26, android.text.TextPaint r27, X.0rN r28, float r29, float r30, int r31) {
        /*
            r24 = this;
            r6 = 0
            r7 = r25
            r22 = r27
            r0 = r22
            boolean r13 = X.AnonymousClass7TF.A1U(r6, r7, r0)
            r12 = 2
            r23 = r26
            r1 = r28
            r0 = r23
            X.AnonymousClass7TF.A1D(r0, r12, r1)
            r14 = r24
            android.text.StaticLayout r5 = r14.A0G
            int r0 = r23.length()
            if (r0 == 0) goto L_0x0277
            if (r5 == 0) goto L_0x0277
            r9 = 300(0x12c, float:4.2E-43)
            android.view.animation.OvershootInterpolator r1 = r14.A04
            r10 = r31
            float r8 = (float) r10
            r4 = 1133903872(0x43960000, float:300.0)
            float r0 = r8 % r4
            float r0 = r0 / r4
            float r3 = r1.getInterpolation(r0)
            r19 = 1073741824(0x40000000, float:2.0)
            r2 = 1056964608(0x3f000000, float:0.5)
            r11 = 0
            if (r10 >= r9) goto L_0x00f5
            float r3 = r3 * r2
            r14.A00 = r3
            float r2 = r2 - r3
        L_0x003c:
            r14.A01 = r2
        L_0x003e:
            r0 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 + r0
            r14.A00 = r3
            float r2 = r2 + r0
            r14.A01 = r2
            android.text.StaticLayout r15 = r14.A0G
            if (r15 == 0) goto L_0x0127
            java.util.List r0 = r14.A03
            r21 = r0
            r21.clear()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.ArrayList r0 = r14.A02
            java.util.Iterator r18 = r0.iterator()
            r9 = 0
        L_0x005d:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x011c
            int r17 = r9 + 1
            java.lang.Object r8 = r18.next()
            java.util.List r8 = (java.util.List) r8
            int r4 = r8.size()
            int r0 = r4 / 2
            r20 = r0
            int r0 = r9 % 2
            if (r0 != 0) goto L_0x00f2
            float r3 = r14.A00
        L_0x0079:
            float r2 = r15.getLineLeft(r9)
            float r1 = r15.getLineRight(r9)
            android.text.Layout$Alignment r0 = r14.A0E
            int[] r16 = X.C17144VJt.A00
            int r0 = r0.ordinal()
            r0 = r16[r0]
            if (r0 == r13) goto L_0x00e3
            float r3 = A00(r8, r3, r6, r4)
            if (r0 == r12) goto L_0x00f0
            float r2 = r2 - r3
        L_0x0094:
            int r0 = r15.getLineTop(r9)
            float r4 = (float) r0
            int r0 = r15.getLineBottom(r9)
            float r0 = (float) r0
            android.graphics.RectF r3 = new android.graphics.RectF
            r3.<init>(r2, r4, r1, r0)
            float r0 = r3.width()
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d2
            java.lang.CharSequence r2 = r15.getText()
            int r1 = r15.getLineStart(r9)
            int r0 = r15.getLineEnd(r9)
            java.lang.String r2 = X.C13988Tno.A0c(r2, r1, r0)
            X.0qQ.A0B(r2, r6)
            java.lang.String r1 = "\n"
            java.lang.String r0 = ""
            java.lang.String r0 = X.00p.A0g(r2, r1, r0, r6)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00d2
            r10.add(r3)
        L_0x00cf:
            r9 = r17
            goto L_0x005d
        L_0x00d2:
            boolean r0 = X.DbT.A1b(r10)
            if (r0 == 0) goto L_0x00cf
            r0 = r21
            r0.add(r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            goto L_0x00cf
        L_0x00e3:
            r0 = r20
            float r0 = A00(r8, r3, r6, r0)
            float r2 = r2 - r0
            r0 = r20
            float r3 = A00(r8, r3, r0, r4)
        L_0x00f0:
            float r1 = r1 + r3
            goto L_0x0094
        L_0x00f2:
            float r3 = r14.A01
            goto L_0x0079
        L_0x00f5:
            r1 = 1161527296(0x453b8000, float:3000.0)
            float r1 = r1 / r19
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0107
            r14.A00 = r2
            r3 = 1056964608(0x3f000000, float:0.5)
            r14.A01 = r11
            r2 = 0
            goto L_0x003e
        L_0x0107:
            float r1 = r1 + r4
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0117
            float r0 = r3 * r2
            float r2 = r2 - r0
            r14.A00 = r2
            r3 = r2
            r14.A01 = r0
            r2 = r0
            goto L_0x003e
        L_0x0117:
            r14.A00 = r11
            r3 = 0
            goto L_0x003c
        L_0x011c:
            boolean r0 = X.DbT.A1b(r10)
            if (r0 == 0) goto L_0x0127
            r0 = r21
            r0.add(r10)
        L_0x0127:
            java.util.ArrayList r0 = r14.A08
            java.util.Iterator r2 = X.AnonymousClass7TE.A1G(r0)
        L_0x012d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0142
            java.lang.Object r1 = X.AnonymousClass7TF.A0a(r2)
            X.WeG r1 = (X.C19714WeG) r1
            java.util.List r0 = r14.A03
            X.C19714WeG.A01(r1, r14, r0, r13)
            r1.AQG(r7)
            goto L_0x012d
        L_0x0142:
            java.util.ArrayList r0 = r14.A09
            java.util.Iterator r1 = X.AnonymousClass7TE.A1G(r0)
        L_0x0148:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0157
            java.lang.Object r0 = X.AnonymousClass7TF.A0a(r1)
            X.91R r0 = (X.AnonymousClass91R) r0
            r0.A04 = r6
            goto L_0x0148
        L_0x0157:
            r7.save()
            int r2 = r14.A0A
            android.text.Layout$Alignment r0 = r14.A0E
            int[] r17 = X.C17144VJt.A00
            int r0 = r0.ordinal()
            r1 = r17[r0]
            if (r1 == r13) goto L_0x022d
            r0 = 0
            if (r1 == r12) goto L_0x016d
            int r2 = r2 - r2
            float r0 = (float) r2
        L_0x016d:
            r7.translate(r0, r11)
            java.util.ArrayList r0 = r14.A02
            java.util.Iterator r16 = r0.iterator()
            r8 = 0
        L_0x0177:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0233
            int r15 = r8 + 1
            java.lang.Object r4 = r16.next()
            java.util.List r4 = (java.util.List) r4
            r7.save()
            int r10 = r4.size()
            if (r10 <= 0) goto L_0x01a5
            android.text.Layout$Alignment r0 = r14.A0E
            int r0 = r0.ordinal()
            r0 = r17[r0]
            if (r0 == r13) goto L_0x01ed
            if (r0 == r12) goto L_0x01e5
            int r2 = r10 + -1
            r1 = -1
            X.2HZ r0 = new X.2HZ
            r0.<init>(r2, r6, r1)
            r14.A02(r7, r0, r8, r6)
        L_0x01a5:
            r7.restore()
            boolean r0 = X.AnonymousClass7TE.A1b(r4)
            if (r0 == 0) goto L_0x01e3
            java.lang.Object r0 = r4.get(r6)
            X.VaU r0 = (X.C17576VaU) r0
            android.text.StaticLayout r1 = r0.A01
            int r0 = r1.getHeight()
            float r2 = (float) r0
            X.0rN r0 = r14.A08()
            float r0 = r0.A02
            float r2 = r2 * r0
            java.lang.CharSequence r1 = r1.getText()
            X.0qQ.A07(r1)
            java.lang.String r0 = "\n"
            boolean r0 = X.00l.A0d(r1, r0, r6)
            if (r0 == 0) goto L_0x01d9
            r1 = 1073741824(0x40000000, float:2.0)
        L_0x01d3:
            float r2 = r2 / r1
        L_0x01d4:
            r7.translate(r11, r2)
            r8 = r15
            goto L_0x0177
        L_0x01d9:
            X.0rN r0 = r14.A08()
            float r1 = r0.A01
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 + r0
            goto L_0x01d3
        L_0x01e3:
            r2 = 0
            goto L_0x01d4
        L_0x01e5:
            int r0 = r10 + -1
            X.2HY r1 = new X.2HY
            r1.<init>(r6, r0)
            goto L_0x0228
        L_0x01ed:
            int r3 = r10 / 2
            int r9 = r10 % 2
            java.lang.Object r0 = r4.get(r3)
            X.VaU r0 = (X.C17576VaU) r0
            float r2 = r0.A00
            float r1 = r5.getLineLeft(r8)
            float r0 = r5.getLineRight(r8)
            float r1 = r1 + r0
            float r1 = r1 / r19
            float r2 = r2 - r1
            r7.translate(r2, r11)
            int r2 = r3 + -1
            r1 = -1
            X.2HZ r0 = new X.2HZ
            r0.<init>(r2, r6, r1)
            r14.A02(r7, r0, r8, r6)
            if (r9 != r13) goto L_0x0220
            java.lang.Object r1 = r4.get(r3)
            X.VaU r1 = (X.C17576VaU) r1
            r0 = 1065353216(0x3f800000, float:1.0)
            r14.A01(r7, r1, r0, r13)
        L_0x0220:
            int r3 = r3 + r9
            int r0 = r10 + -1
            X.2HY r1 = new X.2HY
            r1.<init>(r3, r0)
        L_0x0228:
            r14.A02(r7, r1, r8, r13)
            goto L_0x01a5
        L_0x022d:
            int r2 = r2 - r2
            float r0 = (float) r2
            float r0 = r0 / r19
            goto L_0x016d
        L_0x0233:
            r7.restore()
            java.util.ArrayList r0 = r14.A0A
            java.util.Iterator r2 = X.AnonymousClass7TE.A1G(r0)
        L_0x023c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0277
            java.lang.Object r1 = X.AnonymousClass7TF.A0a(r2)
            X.91Q r1 = (X.AnonymousClass91Q) r1
            r0 = r23
            int r0 = r0.getSpanStart(r1)
            int r0 = r5.getLineForOffset(r0)
            int r12 = r5.getWidth()
            int r13 = r5.getLineTop(r0)
            int r14 = r5.getLineBaseline(r0)
            int r15 = r5.getLineBottom(r0)
            int r17 = r5.getLineStart(r0)
            int r18 = r5.getLineEnd(r0)
            r8 = r1
            r9 = r7
            r10 = r22
            r11 = r6
            r16 = r23
            r19 = r0
            r8.drawBackground(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            goto L_0x023c
        L_0x0277:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15923Ukn.A0Z(android.graphics.Canvas, android.text.Spannable, android.text.TextPaint, X.0rN, float, float, int):void");
    }

    public final int getDurationInMs() {
        return 3000;
    }

    private final void A02(Canvas canvas, 2HZ r8, int i, boolean z) {
        float f;
        ArrayList arrayList = this.A02;
        if (!arrayList.isEmpty()) {
            List list = (List) DbZ.A0g(arrayList, i);
            if (!list.isEmpty()) {
                canvas.save();
                int i2 = r8.A00;
                int i3 = r8.A01;
                int i4 = r8.A02;
                if (i4 <= 0 ? !(i4 >= 0 || i3 > i2) : i2 <= i3) {
                    while (true) {
                        C17576VaU vaU = (C17576VaU) list.get(i2);
                        if (i % 2 == 0) {
                            f = this.A00;
                        } else {
                            f = this.A01;
                        }
                        A01(canvas, vaU, f, z);
                        if (i2 == i3) {
                            break;
                        }
                        i2 += i4;
                    }
                }
                canvas.restore();
            }
        }
    }

    public final void A0R() {
        super.A0R();
        StaticLayout staticLayout = this.A0G;
        if (staticLayout != null) {
            ArrayList arrayList = this.A02;
            arrayList.clear();
            ArrayList arrayList2 = this.A0A;
            arrayList2.clear();
            ArrayList arrayList3 = this.A08;
            arrayList3.clear();
            ArrayList arrayList4 = this.A09;
            arrayList4.clear();
            if (!TextUtils.isEmpty(this.A0F)) {
                Spannable spannable = this.A0F;
                0qQ.A07(spannable);
                018.A18(arrayList2, C263324Kh.A06(spannable, AnonymousClass91P.class));
                Spannable spannable2 = this.A0F;
                0qQ.A07(spannable2);
                C13990Tnq.A0t(spannable2, this, C19714WeG.class, arrayList3, arrayList4);
                int lineCount = staticLayout.getLineCount();
                for (int i = 0; i < lineCount; i++) {
                    ArrayList arrayList5 = new ArrayList();
                    CharSequence subSequence = this.A0F.subSequence(staticLayout.getLineStart(i), staticLayout.getLineEnd(i));
                    BreakIterator breakIterator = this.A07;
                    C13988Tno.A1P(subSequence, breakIterator);
                    int i2 = 0;
                    for (int next = breakIterator.next(); next != -1; next = breakIterator.next()) {
                        TextPaint textPaint = this.A0b;
                        float primaryHorizontal = new StaticLayout(subSequence, textPaint, A08().A00, this.A0E, A08().A02, A08().A01, false).getPrimaryHorizontal(subSequence.length() / 2);
                        0qQ.A07(textPaint);
                        0rN A082 = A08();
                        arrayList5.add(new C17576VaU(this.A0E, (Spannable) subSequence, textPaint, A082, primaryHorizontal, i2, next));
                        i2 = next;
                    }
                    arrayList.add(arrayList5);
                }
            }
            invalidateSelf();
        }
    }

    public final float A0U() {
        return ((float) this.A0A) * 0.25f;
    }

    public final C360728f3 A0X() {
        return this.A06;
    }

    public final void A0Y() {
        StaticLayout staticLayout = this.A0G;
        Spannable spannable = this.A0F;
        if (spannable != null && spannable.length() != 0 && staticLayout != null) {
            Iterator A1G = AnonymousClass7TE.A1G(this.A08);
            while (A1G.hasNext()) {
                ArrayList A012 = C306496Mj.A01(staticLayout, 1.0f);
                TextPaint textPaint = this.A0b;
                ((C19714WeG) AnonymousClass7TF.A0a(A1G)).A03(C306496Mj.A03(A012, textPaint.getTextSize() * 0.3f, textPaint.getTextSize() * 0.0f, textPaint.getTextSize() * -0.01f, textPaint.getTextSize() / 4.0f, true), textPaint.getTextSize());
            }
            Spannable spannable2 = this.A0F;
            0qQ.A07(spannable2);
            C263324Kh.A05(spannable2, U2W.class);
        }
    }

    public C15923Ukn(Context context, UserSession userSession, int i) {
        super(context, i);
        this.A05 = userSession;
    }

    public static final float A00(List list, float f, int i, int i2) {
        float f2 = 0.0f;
        for (C17576VaU vaU : list.subList(i, i2)) {
            f2 += ((float) AnonymousClass6M0.A02(vaU.A01)) * (f - 1.0f);
        }
        return f2;
    }
}
