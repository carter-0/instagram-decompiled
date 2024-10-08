package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.5zr  reason: invalid class name and case insensitive filesystem */
public final class C301725zr extends View {
    public float A00;
    public int A01 = 15000;
    public int A02 = -1;
    public int A03;
    public int A04;
    public Shader A05 = new Shader();
    public boolean A06;
    public final Paint A07 = new Paint(1);
    public final Paint A08 = new Paint(1);
    public final Paint A09 = new Paint(1);
    public final RectF A0A = new RectF();
    public final ArrayList A0B = new ArrayList();

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00ca, code lost:
        if (r0.A04 >= r0.A01) goto L_0x00cc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDraw(android.graphics.Canvas r17) {
        /*
            r16 = this;
            r14 = 0
            r10 = r17
            X.0qQ.A0B(r10, r14)
            r0 = r16
            android.graphics.Paint r15 = r0.A07
            android.graphics.Paint$Style r4 = android.graphics.Paint.Style.STROKE
            r15.setStyle(r4)
            float r1 = r0.A00
            r15.setStrokeWidth(r1)
            boolean r2 = r0.A06
            r6 = 0
            r1 = 0
            if (r2 == 0) goto L_0x001c
            r1 = 255(0xff, float:3.57E-43)
        L_0x001c:
            r15.setAlpha(r1)
            android.graphics.Shader r1 = r0.A05
            r15.setShader(r1)
            java.util.ArrayList r1 = r0.A0B
            int r5 = r1.size()
            r9 = 1069547520(0x3fc00000, float:1.5)
            r8 = 1069547520(0x3fc00000, float:1.5)
        L_0x002e:
            if (r6 >= r5) goto L_0x0068
            java.lang.Object r2 = r1.get(r6)
            X.0qQ.A07(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            float r3 = (float) r2
            int r2 = r0.A01
            float r2 = (float) r2
            float r3 = r3 / r2
            r7 = 1135869952(0x43b40000, float:360.0)
            float r3 = r3 * r7
            r2 = 1135837184(0x43b38000, float:359.0)
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x005f
            r8 = 0
            r3 = 1135935488(0x43b50000, float:362.0)
        L_0x004f:
            android.graphics.RectF r11 = r0.A0A
            r2 = 1132920832(0x43870000, float:270.0)
            float r12 = r8 + r2
            float r13 = r3 - r9
            r10.drawArc(r11, r12, r13, r14, r15)
            float r3 = r3 + r9
            float r8 = r8 + r3
            int r6 = r6 + 1
            goto L_0x002e
        L_0x005f:
            float r2 = r8 + r3
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x004f
            float r3 = r7 - r8
            goto L_0x004f
        L_0x0068:
            android.graphics.Paint r15 = r0.A08
            r15.setStyle(r4)
            float r2 = r0.A00
            r15.setStrokeWidth(r2)
            r2 = -1
            r15.setColor(r2)
            boolean r3 = r0.A06
            r2 = 0
            if (r3 == 0) goto L_0x007d
            r2 = 255(0xff, float:3.57E-43)
        L_0x007d:
            r15.setAlpha(r2)
            int r3 = r0.A04
            float r5 = (float) r3
            int r2 = r0.A01
            float r2 = (float) r2
            float r5 = r5 / r2
            r13 = 1135869952(0x43b40000, float:360.0)
            float r5 = r5 * r13
            int r2 = r1.size()
            float r2 = (float) r2
            float r2 = r2 * r9
            float r5 = r5 + r2
            float r5 = r5 + r9
            if (r3 != 0) goto L_0x009b
            android.graphics.RectF r11 = r0.A0A
            r12 = 1132920832(0x43870000, float:270.0)
            r10.drawArc(r11, r12, r13, r14, r15)
        L_0x009b:
            r2 = 1135837184(0x43b38000, float:359.0)
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x00ae
            float r13 = r13 - r5
            float r13 = r13 - r9
            android.graphics.RectF r3 = r0.A0A
            r2 = 1132920832(0x43870000, float:270.0)
            float r5 = r5 + r2
            r11 = r3
            r12 = r5
            r10.drawArc(r11, r12, r13, r14, r15)
        L_0x00ae:
            android.graphics.Paint r15 = r0.A09
            r15.setStyle(r4)
            float r2 = r0.A00
            r15.setStrokeWidth(r2)
            r2 = -3355444(0xffffffffffcccccc, float:NaN)
            r15.setColor(r2)
            boolean r2 = r0.A06
            r4 = 255(0xff, float:3.57E-43)
            if (r2 == 0) goto L_0x00cc
            int r5 = r0.A04
            int r3 = r0.A01
            r2 = 255(0xff, float:3.57E-43)
            if (r5 < r3) goto L_0x00cd
        L_0x00cc:
            r2 = 0
        L_0x00cd:
            r15.setAlpha(r2)
            int r3 = r0.A04
            float r12 = (float) r3
            int r2 = r0.A01
            float r2 = (float) r2
            float r12 = r12 / r2
            r6 = 1135869952(0x43b40000, float:360.0)
            float r12 = r12 * r6
            int r2 = r1.size()
            float r2 = (float) r2
            float r2 = r2 * r9
            float r12 = r12 + r2
            int r2 = r0.A03
            r5 = 1132920832(0x43870000, float:270.0)
            if (r2 <= 0) goto L_0x00fc
            int r2 = r2 - r3
            float r13 = (float) r2
            int r2 = r0.A01
            float r2 = (float) r2
            float r13 = r13 / r2
            float r13 = r13 * r6
            float r3 = r6 - r12
            float r3 = r3 - r9
            int r2 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x00f6
            r13 = r3
        L_0x00f6:
            android.graphics.RectF r11 = r0.A0A
            float r12 = r12 + r5
            r10.drawArc(r11, r12, r13, r14, r15)
        L_0x00fc:
            boolean r2 = r0.A06
            if (r2 == 0) goto L_0x0145
            int r3 = r0.A02
            r2 = -1
            if (r3 == r2) goto L_0x0145
        L_0x0105:
            r15.setAlpha(r4)
            int r2 = r0.A02
            if (r2 < 0) goto L_0x0144
            java.util.List r2 = r1.subList(r14, r2)
            X.0qQ.A07(r2)
            int r2 = X.00k.A02(r2)
            float r12 = (float) r2
            int r2 = r0.A01
            float r2 = (float) r2
            float r12 = r12 / r2
            float r12 = r12 * r6
            int r3 = r0.A02
            int r2 = r3 + 1
            float r2 = (float) r2
            float r2 = r2 * r9
            float r12 = r12 + r2
            java.lang.Object r1 = r1.get(r3)
            X.0qQ.A07(r1)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            float r13 = (float) r1
            int r1 = r0.A01
            float r1 = (float) r1
            float r13 = r13 / r1
            float r13 = r13 * r6
            float r6 = r6 - r12
            int r1 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r1 <= 0) goto L_0x013d
            r13 = r6
        L_0x013d:
            android.graphics.RectF r11 = r0.A0A
            float r12 = r12 + r5
            float r13 = r13 - r9
            r10.drawArc(r11, r12, r13, r14, r15)
        L_0x0144:
            return
        L_0x0145:
            r4 = 0
            goto L_0x0105
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C301725zr.onDraw(android.graphics.Canvas):void");
    }

    public final void setProgressShader(Shader shader) {
        0qQ.A0B(shader, 0);
        this.A05 = shader;
    }

    public final void setSegments(AnonymousClass831 r8) {
        int BrP;
        0qQ.A0B(r8, 0);
        ArrayList arrayList = this.A0B;
        arrayList.clear();
        this.A04 = 0;
        this.A03 = 0;
        Iterator it = r8.A05().iterator();
        while (it.hasNext()) {
            AnonymousClass51N r5 = (AnonymousClass51N) it.next();
            if (r5 instanceof AnonymousClass51M) {
                AnonymousClass51M r52 = (AnonymousClass51M) r5;
                AnonymousClass51R r53 = r52.A0F;
                BrP = (int) Math.ceil(((((double) (r52.A08 - r52.A09)) * ((double) Math.abs(r52.A00))) * ((double) r53.A06)) / ((double) (r53.A02 - r53.A03)));
            } else {
                BrP = r5.BrP();
            }
            arrayList.add(Integer.valueOf(BrP));
            this.A04 = 00k.A02(arrayList);
        }
    }

    public final int getProgressRingMaxDurationMs() {
        return this.A01;
    }

    public final int getRetakeSegmentIndex() {
        return this.A02;
    }

    public final ArrayList getSegmentArray() {
        return this.A0B;
    }

    public final int getTotalElapsedDurationMs() {
        return this.A04;
    }

    public C301725zr(Context context) {
        super(context);
    }

    public final void setProgressRingMaxDurationMs(int i) {
        this.A01 = i;
    }

    public final void setRetakeSegmentIndex(int i) {
        this.A02 = i;
    }

    public final void setStrokeWidth(float f) {
        this.A00 = f;
    }

    public final void setTargetDuration(int i) {
        this.A03 = i;
    }

    public final void setTotalElapsedDurationMs(int i) {
        this.A04 = i;
    }
}
