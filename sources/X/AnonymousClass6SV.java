package X;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.6SV  reason: invalid class name */
public final class AnonymousClass6SV extends Drawable implements C311566ct {
    public String A00;
    public final List A01 = new ArrayList();
    public final Map A02 = new HashMap();
    public final float A03;
    public final float A04;
    public final Paint A05;
    public final Paint A06;
    public final Rect A07;
    public final UserSession A08;
    public final float[] A09 = new float[3];

    public AnonymousClass6SV(Context context, UserSession userSession) {
        0qQ.A0B(userSession, 2);
        Paint paint = new Paint(1);
        this.A05 = paint;
        paint.setStrokeWidth(0nA.A04(context, 2));
        Paint paint2 = new Paint(1);
        this.A06 = paint2;
        paint2.setColor(-16777216);
        this.A07 = new Rect();
        this.A03 = 0nA.A04(context, 9);
        this.A04 = 0nA.A04(context, 3);
        this.A08 = userSession;
    }

    public final void DPq(String str, String str2) {
        0qQ.A0B(str2, 1);
        this.A02.put(str2, C8883REa.CANCELED);
        invalidateSelf();
    }

    public final void DQ3(String str, String str2) {
        0qQ.A0B(str2, 1);
        this.A02.put(str2, C8883REa.FAILED);
        invalidateSelf();
    }

    public final void DQo(String str, String str2) {
        0qQ.A0B(str2, 1);
        Map map = this.A02;
        if (map.get(str2) != C8883REa.SUCCESS) {
            map.put(str2, C8883REa.IN_PROGRESS);
            invalidateSelf();
        }
    }

    public final void DQr(String str, String str2) {
        0qQ.A0B(str2, 1);
        this.A02.put(str2, C8883REa.SUCCESS);
        invalidateSelf();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b2, code lost:
        if (r2 != 4) goto L_0x00b4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0084 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void draw(android.graphics.Canvas r36) {
        /*
            r35 = this;
            r15 = 0
            r34 = r36
            r0 = r34
            X.0qQ.A0B(r0, r15)
            r12 = r35
            java.util.List r0 = r12.A01
            r33 = r0
            int r0 = r33.size()
            float r1 = (float) r0
            float r11 = r12.A03
            float r0 = r12.A04
            r25 = r0
            float r24 = r0 + r11
            float r1 = r1 * r24
            float r1 = r1 + r11
            int r5 = java.lang.Math.round(r1)
            int r4 = r33.size()
            r3 = 0
            r10 = 0
        L_0x0028:
            if (r3 >= r4) goto L_0x004d
            r0 = r33
            java.lang.Object r1 = r0.get(r3)
            X.3mM r1 = (X.C250973mM) r1
            com.instagram.common.session.UserSession r0 = r12.A08
            int r2 = r1.A02(r0)
            r1 = 0
        L_0x0039:
            if (r1 >= r2) goto L_0x004a
            float r0 = (float) r1
            float r0 = r0 * r24
            float r0 = r0 + r11
            int r0 = java.lang.Math.round(r0)
            int r10 = java.lang.Math.max(r0, r10)
            int r1 = r1 + 1
            goto L_0x0039
        L_0x004a:
            int r3 = r3 + 1
            goto L_0x0028
        L_0x004d:
            android.graphics.Picture r23 = new android.graphics.Picture
            r23.<init>()
            r0 = r23
            android.graphics.Canvas r9 = r0.beginRecording(r5, r10)
            X.0qQ.A07(r9)
            r9.save()
            int r0 = r9.getHeight()
            float r1 = (float) r0
            r22 = 0
            r0 = r22
            r9.translate(r0, r1)
            int r21 = r33.size()
            r8 = 0
        L_0x006f:
            r0 = r21
            if (r8 >= r0) goto L_0x017d
            r0 = r33
            java.lang.Object r7 = r0.get(r8)
            X.3mM r7 = (X.C250973mM) r7
            com.instagram.common.session.UserSession r0 = r12.A08
            r32 = r0
            int r20 = r7.A02(r0)
            r6 = 0
        L_0x0084:
            r0 = r20
            if (r6 >= r0) goto L_0x0179
            r0 = r32
            X.3uh r14 = r7.A0A(r0, r6)
            java.lang.String r1 = r14.A0j
            X.0qQ.A07(r1)
            java.util.Map r0 = r12.A02
            java.lang.Object r0 = r0.get(r1)
            X.REa r0 = (X.C8883REa) r0
            if (r0 != 0) goto L_0x009f
            X.REa r0 = X.C8883REa.NOT_STARTED
        L_0x009f:
            int r2 = r0.ordinal()
            r0 = 1
            if (r2 == r15) goto L_0x00b4
            if (r2 == r0) goto L_0x0175
            r0 = 2
            if (r2 == r0) goto L_0x0170
            r0 = 3
            if (r2 == r0) goto L_0x016c
            r1 = 4
            r0 = -12303292(0xffffffffff444444, float:-2.6088314E38)
            if (r2 == r1) goto L_0x00b5
        L_0x00b4:
            r0 = -1
        L_0x00b5:
            float r1 = (float) r8
            float r27 = r24 * r1
            int r6 = r6 + 1
            float r1 = (float) r6
            float r5 = -r11
            float r5 = r5 - r25
            float r5 = r5 * r1
            float r29 = r27 + r11
            float r30 = r5 + r11
            float r4 = r29 - r27
            r19 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r19
            java.lang.String r2 = r14.A0j
            java.lang.String r1 = r12.A00
            boolean r18 = X.0qQ.A0K(r2, r1)
            if (r18 == 0) goto L_0x00d5
            r22 = r27
        L_0x00d5:
            X.2O0 r2 = X.2O0.A00(r32)
            com.instagram.model.reels.Reel r1 = r7.A0H
            boolean r1 = r2.CaU(r1, r14)
            if (r1 == 0) goto L_0x00f2
            float[] r1 = r12.A09
            android.graphics.Color.colorToHSV(r0, r1)
            r3 = 2
            r2 = r1[r3]
            r0 = 1061158912(0x3f400000, float:0.75)
            float r2 = r2 * r0
            r1[r3] = r2
            int r0 = android.graphics.Color.HSVToColor(r1)
        L_0x00f2:
            android.graphics.Paint r3 = r12.A05
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL
            r3.setStyle(r1)
            r3.setColor(r0)
            boolean r0 = r14.A1m()
            if (r0 == 0) goto L_0x0162
            float r1 = r27 + r4
            float r0 = r5 + r4
            r9.drawCircle(r1, r0, r4, r3)
        L_0x0109:
            boolean r0 = r14.A1m()
            if (r0 == 0) goto L_0x015f
            java.lang.String r2 = "V"
        L_0x0111:
            android.graphics.Paint r13 = r12.A06
            int r1 = r2.length()
            android.graphics.Rect r0 = r12.A07
            r13.getTextBounds(r2, r15, r1, r0)
            float r1 = r13.measureText(r2)
            int r0 = r0.height()
            float r0 = (float) r0
            float r17 = r27 + r4
            float r1 = r1 / r19
            float r16 = r17 - r1
            float r1 = r5 - r30
            float r1 = r1 / r19
            float r1 = r30 + r1
            float r0 = r0 / r19
            float r1 = r1 + r0
            r0 = r16
            r9.drawText(r2, r0, r1, r13)
            if (r18 == 0) goto L_0x0084
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.STROKE
            r3.setStyle(r0)
            r0 = -65281(0xffffffffffff00ff, float:NaN)
            r3.setColor(r0)
            boolean r0 = r14.A1m()
            if (r0 == 0) goto L_0x0154
            float r5 = r5 + r4
            r0 = r17
            r9.drawCircle(r0, r5, r4, r3)
            goto L_0x0084
        L_0x0154:
            r26 = r9
            r28 = r5
            r31 = r3
            r26.drawRect(r27, r28, r29, r30, r31)
            goto L_0x0084
        L_0x015f:
            java.lang.String r2 = "P"
            goto L_0x0111
        L_0x0162:
            r26 = r9
            r28 = r5
            r31 = r3
            r26.drawRect(r27, r28, r29, r30, r31)
            goto L_0x0109
        L_0x016c:
            r0 = -65536(0xffffffffffff0000, float:NaN)
            goto L_0x00b5
        L_0x0170:
            r0 = -16711936(0xffffffffff00ff00, float:-1.7146522E38)
            goto L_0x00b5
        L_0x0175:
            r0 = -256(0xffffffffffffff00, float:NaN)
            goto L_0x00b5
        L_0x0179:
            int r8 = r8 + 1
            goto L_0x006f
        L_0x017d:
            r9.restore()
            r34.save()
            int r0 = r34.getWidth()
            float r2 = (float) r0
            r0 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r0
            float r2 = r2 - r22
            int r0 = r34.getHeight()
            int r0 = r0 - r10
            float r1 = (float) r0
            r0 = r34
            r0.translate(r2, r1)
            r1 = r23
            r0.drawPicture(r1)
            r34.restore()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6SV.draw(android.graphics.Canvas):void");
    }

    public final int getOpacity() {
        return -1;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void DMh(String str) {
        invalidateSelf();
    }

    public final void DMi(String str) {
        invalidateSelf();
    }

    public final void DMj(String str, boolean z) {
        invalidateSelf();
    }
}
