package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.text.TextPaint;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.music.common.model.WordOffset;
import java.util.List;
import org.webrtc.CameraCapturer;

/* renamed from: X.Upv  reason: case insensitive filesystem */
public final class C16170Upv extends AnonymousClass9XK implements C300645xY {
    public List A00 = 0sn.A00;
    public int A01;
    public final Context A02;
    public final C17800VgD A03;
    public final int A04;
    public final TextPaint A05;
    public final C18614Vv7 A06;

    public C16170Upv(Context context, MusicOverlayStickerModel musicOverlayStickerModel, C19498Wak wak, int i) {
        super(context, musicOverlayStickerModel, wak, AnonymousClass6KJ.LYRICS_DYNAMIC_REVEAL, 0.7f);
        this.A02 = context;
        this.A06 = new C18614Vv7(wak, 0, 0, CameraCapturer.OPEN_CAMERA_DELAY_MS);
        TextPaint textPaint = new TextPaint(1);
        this.A05 = textPaint;
        textPaint.setColor(i);
        textPaint.setTextAlign(Paint.Align.LEFT);
        textPaint.setTypeface(AnonymousClass0qo.A00(context).A02(0qm.A0z));
        this.A01 = Color.alpha(i);
        this.A03 = new C17800VgD(textPaint);
        this.A04 = (int) (((float) (0nA.A09(context) * 16)) / 1080.0f);
    }

    public final void A01(Canvas canvas, int i) {
        float f;
        float f2;
        float A022;
        Paint.Align align;
        Canvas canvas2 = canvas;
        canvas2.save();
        canvas2.translate((float) getBounds().left, (float) (getBounds().top + this.A04));
        C18614Vv7 vv7 = this.A06;
        vv7.A02(i);
        int i2 = vv7.A01;
        List list = (List) this.A00.get(i2);
        C19498Wak wak = this.A08;
        List A002 = wak.A00(i2);
        if (AnonymousClass3S1.A04(A002) || (A002 != null && A002.size() == list.size())) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                C17898Vhp vhp = (C17898Vhp) list.get(i3);
                if (!AnonymousClass3S1.A04(A002) && A002 != null) {
                    WordOffset wordOffset = (WordOffset) A002.get(i3);
                    int Byp = i - wak.Byp(i2);
                    0qQ.A0B(wordOffset, 0);
                    int i4 = wordOffset.A03;
                    if (i4 > Byp) {
                        break;
                    }
                    f2 = 0.0f;
                    A022 = 0mi.A02((float) Byp, (float) i4, (float) (((wordOffset.A01 - i4) / 2) + i4), 0.0f, 1.0f);
                } else {
                    Integer num = vv7.A02;
                    if (num != null) {
                        if (num == AnonymousClass05K.A01) {
                            f = vv7.A00;
                        } else {
                            f = 1.0f;
                        }
                        float f3 = 1.0f / ((float) size);
                        float f4 = ((float) i3) * f3;
                        if (f < f4) {
                            break;
                        }
                        f2 = 0.0f;
                        A022 = 0mi.A02(f, f4, (f3 / 2.0f) + f4, 0.0f, 1.0f);
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                }
                if (A022 == -1.0f) {
                    break;
                }
                TextPaint textPaint = this.A05;
                0qQ.A0B(textPaint, 1);
                textPaint.setAlpha((int) (((float) this.A01) * A022));
                textPaint.setTextSize(vhp.A01);
                if (vhp.A05) {
                    align = Paint.Align.RIGHT;
                } else {
                    align = Paint.Align.LEFT;
                }
                textPaint.setTextAlign(align);
                canvas2.save();
                canvas2.translate(vhp.A02, vhp.A03);
                canvas2.drawText(vhp.A04, f2, vhp.A00, textPaint);
                canvas2.restore();
            }
            canvas2.restore();
            return;
        }
        throw DbT.A0m();
    }

    public final String C4F() {
        return C273654mx.A00(825);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0115, code lost:
        if (((com.instagram.music.common.model.WordOffset) r10.get(r2)).A04 != false) goto L_0x0117;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBoundsChange(android.graphics.Rect r40) {
        /*
            r39 = this;
            r6 = 0
            r0 = r40
            X.0qQ.A0B(r0, r6)
            r7 = r39
            super.onBoundsChange(r0)
            android.graphics.Rect r0 = X.AnonymousClass7TE.A0X(r7)
            int r23 = r0.width()
            X.Wak r0 = r7.A08
            r38 = r0
            int r1 = r38.BcH()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            r7.A00 = r0
            int r22 = r38.BcH()
            r5 = 0
        L_0x0027:
            r0 = r22
            if (r5 >= r0) goto L_0x0253
            java.util.List r0 = r7.A00
            r21 = r0
            java.lang.String r1 = "null cannot be cast to non-null type java.util.ArrayList<kotlin.collections.List<com.instagram.reels.music.view.DynamicRevealPhraseLayoutCalculator.WordLayout>>"
            X.0qQ.A0C(r0, r1)
            r0 = r21
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            r21 = r0
            r0 = r38
            java.lang.String r8 = r0.BcG(r5)
            java.util.List r10 = r0.A00(r5)
            android.content.Context r0 = r7.A02
            r18 = r0
            X.VgD r4 = r7.A03
            X.AnonymousClass7TF.A1B(r0, r6, r4)
            r20 = 3
            r0 = r20
            X.0qQ.A0B(r8, r0)
            r0 = r23
            float r3 = (float) r0
            int[] r17 = X.VK9.A00
            r11 = 5
            int r0 = r8.hashCode()
            long r0 = (long) r0
            java.util.Random r19 = new java.util.Random
            r2 = r19
            r2.<init>(r0)
            boolean r0 = X.AnonymousClass3S1.A04(r10)
            if (r0 == 0) goto L_0x006d
            r10 = 0
        L_0x006d:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r11)
            r13 = 0
        L_0x0073:
            r1 = r17[r13]
            int r0 = X.0nA.A09(r18)
            int r1 = r1 * r0
            float r12 = (float) r1
            r16 = 1149698048(0x44870000, float:1080.0)
            float r12 = r12 / r16
            r0 = 1067030938(0x3f99999a, float:1.2)
            float r12 = r12 * r0
            android.text.TextPaint r15 = r4.A01
            float r14 = r15.getTextSize()
            r15.setTextSize(r12)
            android.graphics.Rect r2 = r4.A00
            java.lang.String r0 = "A"
            r1 = 1
            r15.getTextBounds(r0, r6, r1, r2)
            r15.setTextSize(r14)
            int r0 = r2.height()
            float r2 = (float) r0
            X.VTF r0 = new X.VTF
            r0.<init>(r12, r2)
            r9.add(r0)
            int r13 = r13 + 1
            if (r13 < r11) goto L_0x0073
            int r0 = X.0nA.A09(r18)
            int r0 = r0 * 20
            float r14 = (float) r0
            float r14 = r14 / r16
            boolean r30 = X.0mk.A03(r8)
            java.util.Locale r0 = java.util.Locale.getDefault()
            X.0qQ.A07(r0)
            java.lang.String r12 = X.Pxf.A0n(r0, r8)
            if (r10 != 0) goto L_0x020a
            java.lang.String r0 = " "
            java.lang.String[] r0 = android.text.TextUtils.split(r12, r0)
        L_0x00c8:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            X.0qQ.A0A(r0)
            int r15 = r0.length
            if (r15 == 0) goto L_0x0201
            int r18 = r9.size()
            int r18 = r18 - r1
        L_0x00d9:
            r28 = 0
            r29 = 0
            r17 = 0
            r11 = r0[r6]
            X.0qQ.A0A(r11)
            r8 = 4
            r2 = r19
            r1 = r20
            int r1 = r2.nextInt(r1)
            int r8 = r8 - r1
        L_0x00ee:
            if (r8 <= 0) goto L_0x0103
            java.lang.Object r1 = r9.get(r8)
            X.VTF r1 = (X.VTF) r1
            float r1 = r1.A01
            float r1 = r4.A00(r11, r1)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x0104
            int r8 = r8 + -1
            goto L_0x00ee
        L_0x0103:
            r8 = 0
        L_0x0104:
            r2 = 0
        L_0x0105:
            if (r2 >= r15) goto L_0x01e6
            r1 = r0[r2]
            if (r10 == 0) goto L_0x0117
            java.lang.Object r11 = r10.get(r2)
            com.instagram.music.common.model.WordOffset r11 = (com.instagram.music.common.model.WordOffset) r11
            boolean r11 = r11.A04
            r16 = 0
            if (r11 == 0) goto L_0x0119
        L_0x0117:
            r16 = 1
        L_0x0119:
            int r11 = (r17 > r28 ? 1 : (r17 == r28 ? 0 : -1))
            if (r11 != 0) goto L_0x0159
            if (r8 != 0) goto L_0x0159
            X.0qQ.A0A(r1)
            java.lang.Object r11 = r9.get(r8)
            X.VTF r11 = (X.VTF) r11
            float r11 = r11.A01
            float r12 = r4.A00(r1, r11)
            int r11 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r11 <= 0) goto L_0x0159
            float r27 = r3 / r12
            java.lang.Object r11 = r9.get(r6)
            X.VTF r11 = (X.VTF) r11
            float r11 = r11.A01
            float r26 = r27 * r11
            java.lang.Object r11 = r9.get(r6)
            X.VTF r11 = (X.VTF) r11
            float r11 = r11.A00
            float r27 = r27 * r11
            X.Vhp r11 = new X.Vhp
            r24 = r11
            r25 = r1
            r24.<init>(r25, r26, r27, r28, r29, r30)
            r13.add(r11)
            r17 = r3
        L_0x0156:
            int r2 = r2 + 1
            goto L_0x0105
        L_0x0159:
            X.0qQ.A0A(r1)
            int r11 = (r17 > r28 ? 1 : (r17 == r28 ? 0 : -1))
            if (r11 == 0) goto L_0x019c
            java.lang.Object r11 = r9.get(r8)
            X.VTF r11 = (X.VTF) r11
            float r11 = r11.A01
            float r11 = r4.A00(r1, r11)
            float r11 = r17 + r11
            int r11 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r11 <= 0) goto L_0x019c
            java.lang.Object r11 = r9.get(r8)
            X.VTF r11 = (X.VTF) r11
            float r11 = r11.A00
            float r11 = r11 + r14
            float r29 = r29 + r11
            int r12 = r18 + 1
            r11 = r19
            int r12 = r11.nextInt(r12)
        L_0x0185:
            if (r12 <= 0) goto L_0x01e4
            if (r12 == r8) goto L_0x01e1
            java.lang.Object r11 = r9.get(r12)
            X.VTF r11 = (X.VTF) r11
            float r11 = r11.A01
            float r11 = r4.A00(r1, r11)
            int r11 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r11 > 0) goto L_0x01e1
        L_0x0199:
            r8 = r12
            r17 = 0
        L_0x019c:
            java.lang.Object r11 = r9.get(r8)
            X.VTF r11 = (X.VTF) r11
            float r11 = r11.A01
            r24 = r11
            java.lang.Object r11 = r9.get(r8)
            X.VTF r11 = (X.VTF) r11
            float r12 = r11.A00
            if (r30 == 0) goto L_0x01de
            float r35 = r3 - r17
        L_0x01b2:
            X.Vhp r11 = new X.Vhp
            r31 = r11
            r32 = r1
            r33 = r24
            r34 = r12
            r36 = r29
            r37 = r30
            r31.<init>(r32, r33, r34, r35, r36, r37)
            r13.add(r11)
            if (r16 == 0) goto L_0x01ce
            r11 = 32
            java.lang.String r1 = X.002.A0C(r1, r11)
        L_0x01ce:
            java.lang.Object r11 = r9.get(r8)
            X.VTF r11 = (X.VTF) r11
            float r11 = r11.A01
            float r1 = r4.A00(r1, r11)
            float r17 = r17 + r1
            goto L_0x0156
        L_0x01de:
            r35 = r17
            goto L_0x01b2
        L_0x01e1:
            int r12 = r12 + -1
            goto L_0x0185
        L_0x01e4:
            r12 = 0
            goto L_0x0199
        L_0x01e6:
            java.lang.Object r1 = r9.get(r8)
            X.VTF r1 = (X.VTF) r1
            float r1 = r1.A00
            float r29 = r29 + r1
            int r1 = (r29 > r3 ? 1 : (r29 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x01fb
            if (r18 == 0) goto L_0x01fb
            r13.clear()
            int r18 = r18 + -1
        L_0x01fb:
            boolean r1 = r13.isEmpty()
            if (r1 != 0) goto L_0x00d9
        L_0x0201:
            r0 = r21
            r0.add(r13)
            int r5 = r5 + 1
            goto L_0x0027
        L_0x020a:
            java.util.ArrayList r11 = X.AnonymousClass7TG.A0r(r10)
            java.util.Iterator r16 = r10.iterator()
        L_0x0212:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x024d
            java.lang.Object r0 = r16.next()
            com.instagram.music.common.model.WordOffset r0 = (com.instagram.music.common.model.WordOffset) r0
            int r2 = r0.A02
            int r0 = r0.A00
            java.lang.String r13 = X.C51967G9n.A0q(r12, r2, r0)
            int r8 = r13.length()
            int r8 = r8 - r1
            r2 = 0
            r15 = 0
        L_0x022d:
            if (r2 > r8) goto L_0x0245
            r0 = r8
            if (r15 != 0) goto L_0x0233
            r0 = r2
        L_0x0233:
            boolean r0 = X.Dbc.A13(r13, r0)
            if (r15 != 0) goto L_0x0240
            if (r0 != 0) goto L_0x023d
            r15 = 1
            goto L_0x022d
        L_0x023d:
            int r2 = r2 + 1
            goto L_0x022d
        L_0x0240:
            if (r0 == 0) goto L_0x0245
            int r8 = r8 + -1
            goto L_0x022d
        L_0x0245:
            java.lang.String r0 = X.Dba.A0c(r13, r8, r2)
            r11.add(r0)
            goto L_0x0212
        L_0x024d:
            java.lang.String[] r0 = X.DbU.A1b(r11, r6)
            goto L_0x00c8
        L_0x0253:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16170Upv.onBoundsChange(android.graphics.Rect):void");
    }

    public final int Aox() {
        return C13989Tnp.A0D(this.A05, this.A01);
    }

    public final /* bridge */ /* synthetic */ C2802350v BzV() {
        AnonymousClass6KJ r4 = this.A09;
        return new Af1(this.A08.A00, this.A01, (C40599Aen) null, r4, Aox());
    }

    public final void ESC(int i) {
        this.A05.setColor(i);
        this.A01 = Color.alpha(i);
        invalidateSelf();
    }

    public final int getIntrinsicHeight() {
        return this.A06 + (this.A04 * 2);
    }

    public final void setAlpha(int i) {
        this.A01 = i;
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        if (colorFilter != null) {
            this.A05.setColorFilter(colorFilter);
            invalidateSelf();
        }
    }
}
