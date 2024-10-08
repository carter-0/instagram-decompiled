package X;

import android.app.ActivityManager;
import android.graphics.Bitmap;
import java.util.ArrayList;

public abstract class UH3 extends C14633Tzf {
    public static final ArrayList A0C = new ArrayList(5);
    public static final String[] A0D;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public C18017Vjt A08 = new C18017Vjt();
    public final W0J A09;
    public final AnonymousClass2R4 A0A = new Object();
    public final int[] A0B = new int[2];

    public abstract W1g A0H(int i, int i2, int i3);

    public final void A0J(int i, int i2, int i3, int i4) {
        String str;
        int i5 = this.A0B;
        W1g w1g = new W1g(i5, i5);
        w1g.A02 = i;
        w1g.A03 = i2;
        w1g.A04 = i3;
        w1g.A0B = 1;
        this.A09.A03(w1g);
        UHH uhh = new UHH(this, w1g, i, i2, i3, i4);
        if (i3 >= 0) {
            String[] strArr = A0D;
            if (i3 < 22) {
                str = strArr[i3];
                C18796W2e.A02(uhh, str);
            }
        }
        str = "INVALID_ZOOM_LEVEL";
        C18796W2e.A02(uhh, str);
    }

    static {
        String[] strArr = new String[22];
        A0D = strArr;
        int i = 0;
        do {
            strArr[i] = String.valueOf(i);
            i++;
        } while (i <= 21);
    }

    /* JADX WARNING: Removed duplicated region for block: B:69:0x01ac  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0D(android.graphics.Canvas r32) {
        /*
            r31 = this;
            r9 = r31
            X.WFU r0 = r9.A07
            X.U4m r8 = r0.A0I
            r0 = 0
            r9.A01 = r0
            r9.A00 = r0
            int r0 = r8.A0H
            int r2 = r9.A06
            if (r0 == r2) goto L_0x001e
            if (r2 < 0) goto L_0x022e
            java.lang.String[] r1 = A0D
            r0 = 22
            if (r2 >= r0) goto L_0x022e
            r0 = r1[r2]
        L_0x001b:
            X.C18796W2e.A03(r0)
        L_0x001e:
            int r0 = r8.A0H
            r9.A06 = r0
            X.W2R r0 = r9.A08
            X.2R4 r6 = r9.A0A
            r0.A05(r6)
            double r12 = r8.A02
            double r1 = r6.A01
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0038
            double r0 = r8.A00
            double r0 = java.lang.Math.ceil(r0)
            double r12 = r12 + r0
        L_0x0038:
            double r14 = r8.A03
            r30 = r32
            r30.save()
            float r3 = r8.A0B
            float r2 = r8.A04
            float r1 = r8.A05
            r0 = r30
            r0.rotate(r3, r2, r1)
            float r3 = r8.A0C
            float r2 = r8.A04
            float r1 = r8.A05
            r0.scale(r3, r3, r2, r1)
            int r0 = r8.A0F
            double r4 = (double) r0
            double r2 = r6.A01
            double r0 = r4 * r2
            int r2 = (int) r0
            r29 = r2
            double r2 = r6.A03
            double r0 = r4 * r2
            int r2 = (int) r0
            r28 = r2
            double r2 = r6.A02
            double r0 = r4 * r2
            int r2 = (int) r0
            r27 = r2
            double r0 = r6.A00
            double r4 = r4 * r0
            int r0 = (int) r4
            r26 = r0
            int r1 = r9.A04
            r0 = r29
            if (r1 != r0) goto L_0x0087
            int r1 = r9.A05
            r0 = r28
            if (r1 != r0) goto L_0x0087
            int r1 = r9.A02
            if (r1 != r2) goto L_0x0087
            int r1 = r9.A03
            r0 = r26
            if (r1 == r0) goto L_0x0096
        L_0x0087:
            int r2 = r8.A0H
            if (r2 < 0) goto L_0x022a
            java.lang.String[] r1 = A0D
            r0 = 22
            if (r2 >= r0) goto L_0x022a
            r0 = r1[r2]
        L_0x0093:
            X.C18796W2e.A03(r0)
        L_0x0096:
            r0 = r29
            r9.A04 = r0
            r0 = r28
            r9.A05 = r0
            r0 = r27
            r9.A02 = r0
            r0 = r26
            r9.A03 = r0
            int r10 = r8.A0F
            r7 = 1
            int r25 = r10 + -1
            int r0 = r27 - r29
            int r24 = r0 + 1
            int r0 = r26 - r28
            int r6 = r0 + 1
            r23 = r6
            r0 = r24
            if (r0 <= r6) goto L_0x00bb
            r23 = r0
        L_0x00bb:
            int r23 = r23 * r23
            int r24 = r24 - r7
            int r24 = r24 >> r7
            int r24 = r24 + r29
            int r6 = r6 - r7
            int r6 = r6 >> r7
            int r6 = r6 + r28
            long r0 = r8.A0K
            double r4 = (double) r0
            r0 = r24
            double r2 = (double) r0
            r16 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r2 = r2 * r16
            double r10 = (double) r10
            double r2 = r2 / r10
            double r2 = r2 - r12
            double r0 = r4 * r2
            float r2 = r8.A04
            double r2 = (double) r2
            double r0 = r0 + r2
            float r2 = (float) r0
            r22 = r2
            double r0 = (double) r6
            double r0 = r0 * r16
            double r0 = r0 / r10
            double r0 = r0 - r14
            double r4 = r4 * r0
            float r0 = r8.A05
            double r0 = (double) r0
            double r4 = r4 + r0
            float r0 = (float) r4
            r21 = r0
            r1 = -1
            r20 = 0
            r5 = 0
            r4 = 0
            r17 = 0
        L_0x00f1:
            r2 = r20
            r0 = r23
            if (r2 >= r0) goto L_0x0232
            int r3 = r5 + r24
            int r2 = r4 + r6
            int r10 = r9.A0B
            int r0 = r10 * r5
            float r0 = (float) r0
            float r19 = r22 + r0
            int r0 = r10 * r4
            float r0 = (float) r0
            float r18 = r21 + r0
            r0 = r28
            if (r2 < r0) goto L_0x01b2
            r0 = r26
            if (r2 > r0) goto L_0x01b2
            float r0 = (float) r10
            float r13 = r19 + r0
            float r14 = r18 + r0
            android.graphics.Canvas$EdgeType r15 = android.graphics.Canvas.EdgeType.BW
            r10 = r30
            r11 = r19
            r12 = r18
            boolean r0 = r10.quickReject(r11, r12, r13, r14, r15)
            if (r0 != 0) goto L_0x01b2
            r12 = r3 & r25
            X.W0J r11 = r9.A09
            int r13 = r8.A0H
            X.Vjt r10 = r9.A08
            r14 = 0
            r10.A03 = r14
            r15 = 0
            r10.A05 = r15
            r10.A04 = r15
        L_0x0132:
            X.W1g[] r0 = r10.A06
            r0[r14] = r15
            int r14 = r14 + 1
            r16 = 4
            r0 = r16
            if (r14 < r0) goto L_0x0132
            r10.A00 = r12
            r10.A01 = r2
            r10.A02 = r13
            X.W1g r14 = r11.A06
        L_0x0146:
            int r0 = r14.A04
            if (r0 >= r13) goto L_0x0160
            android.graphics.Bitmap r0 = r14.A02()
            if (r0 == 0) goto L_0x0152
            r10.A04 = r14
        L_0x0152:
            int r0 = r14.A04
            int r15 = X.C13989Tnp.A09(r13, r0, r12, r2)
            X.W1g[] r0 = r14.A09
            r0 = r0[r15]
            if (r0 == 0) goto L_0x0160
            r14 = r0
            goto L_0x0146
        L_0x0160:
            int r0 = r14.A04
            if (r0 != r13) goto L_0x0174
            int r0 = r14.A02
            if (r0 != r12) goto L_0x0174
            int r0 = r14.A03
            if (r0 != r2) goto L_0x0174
            android.graphics.Bitmap r0 = r14.A02()
            if (r0 == 0) goto L_0x0204
            r10.A05 = r14
        L_0x0174:
            X.W1g r13 = r10.A05
            if (r13 != 0) goto L_0x017c
            X.W1g r13 = r10.A04
            if (r13 == 0) goto L_0x0187
        L_0x017c:
            X.W0J.A01(r11, r13)
            X.W1g r0 = r11.A05
            r0.A07 = r13
            r13.A06 = r0
            r11.A05 = r13
        L_0x0187:
            X.Vjt r10 = r9.A08
            X.W1g r0 = r10.A05
            r13 = 1
            if (r0 != 0) goto L_0x01fa
            r13 = 0
            int r0 = r10.A03
            if (r0 == r7) goto L_0x01fa
            int r10 = r8.A0H
            r0 = 2
            r9.A0J(r12, r2, r10, r0)
        L_0x0199:
            X.Vjt r12 = r9.A08
            r11 = r30
            r10 = r19
            r0 = r18
            r12.A00(r11, r10, r0)
            int r0 = r9.A01
            int r0 = r0 + 1
            r9.A01 = r0
            if (r13 != 0) goto L_0x01b2
            int r0 = r9.A00
            int r0 = r0 + 1
            r9.A00 = r0
        L_0x01b2:
            if (r5 == r4) goto L_0x01f6
            if (r5 >= 0) goto L_0x01f0
            int r0 = -r5
            if (r0 == r4) goto L_0x01f6
        L_0x01b9:
            r10 = r17
        L_0x01bb:
            int r3 = r3 + r10
            int r2 = r2 + r1
            r0 = r28
            if (r0 > r2) goto L_0x01d5
            r0 = r26
            if (r2 > r0) goto L_0x01d5
            r0 = r29
            if (r0 > r3) goto L_0x01d5
            r0 = r27
            if (r3 > r0) goto L_0x01d5
            int r5 = r5 + r10
            int r4 = r4 + r1
            r17 = r10
        L_0x01d1:
            int r20 = r20 + 1
            goto L_0x00f1
        L_0x01d5:
            r3 = r10 & 1
            int r3 = r3 << r7
            int r3 = r3 - r7
            int r3 = r3 * r5
            int r0 = r1 >> 1
            r0 = r0 & 1
            int r3 = r3 + r0
            r2 = r1 & 1
            int r2 = r2 << r7
            int r2 = r2 - r7
            int r2 = r2 * r4
            int r0 = -r10
            r17 = r0
            int r0 = r0 >> 1
            r0 = r0 & 1
            int r2 = r2 + r0
            int r1 = -r1
            r5 = r3
            r4 = r2
            goto L_0x01d1
        L_0x01f0:
            if (r5 <= 0) goto L_0x01b9
            int r0 = 1 - r4
            if (r5 != r0) goto L_0x01b9
        L_0x01f6:
            int r10 = -r1
            r1 = r17
            goto L_0x01bb
        L_0x01fa:
            int r0 = r10.A03
            if (r0 != r7) goto L_0x0199
            java.util.ArrayList r0 = A0C
            X.JTR.A1S(r9, r0)
            goto L_0x0199
        L_0x0204:
            int r0 = r14.A0B
            r10.A03 = r0
            X.W1g[] r0 = r14.A09
            r15 = r0
            X.W1g[] r0 = r10.A06
            r13 = 0
            r14 = r0
            r0 = r16
            java.lang.System.arraycopy(r15, r13, r14, r13, r0)
        L_0x0214:
            r14 = r15[r13]
            if (r14 == 0) goto L_0x0223
            X.W0J.A01(r11, r14)
            X.W1g r0 = r11.A05
            r0.A07 = r14
            r14.A06 = r0
            r11.A05 = r14
        L_0x0223:
            int r13 = r13 + 1
            r0 = r16
            if (r13 >= r0) goto L_0x0174
            goto L_0x0214
        L_0x022a:
            java.lang.String r0 = "INVALID_ZOOM_LEVEL"
            goto L_0x0093
        L_0x022e:
            java.lang.String r0 = "INVALID_ZOOM_LEVEL"
            goto L_0x001b
        L_0x0232:
            int r1 = r9.A01
            int r0 = r9.A07
            if (r1 <= r0) goto L_0x024f
            r9.A07 = r1
            int[] r2 = r9.A0B
            java.util.ArrayList r0 = X.UHI.A07
            X.JTR.A1S(r9, r0)
            X.UHI.A00(r2)
            X.W0J r1 = r9.A09
            r0 = 0
            r0 = r2[r0]
            r1.A01 = r0
            r0 = r2[r7]
            r1.A02 = r0
        L_0x024f:
            r30.restore()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UH3.A0D(android.graphics.Canvas):void");
    }

    public void A0I() {
        W0J w0j = this.A09;
        W1g w1g = w0j.A04;
        while (w1g != null) {
            W1g w1g2 = w1g.A07;
            w1g.A03();
            w1g = w1g2;
        }
        W1g w1g3 = new W1g(-1, -1);
        w0j.A06 = w1g3;
        w1g3.A02 = 0;
        w1g3.A03 = 0;
        w1g3.A04 = 0;
        w0j.A04 = w1g3;
        w0j.A05 = w1g3;
        w0j.A00 = 0;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.2R4, java.lang.Object] */
    public UH3(WFU wfu, W0J w0j) {
        super(wfu);
        this.A09 = w0j;
        ActivityManager activityManager = (ActivityManager) wfu.A0G.getSystemService("activity");
        if (activityManager != null) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            if (!memoryInfo.lowMemory && memoryInfo.availMem >= 500000000 && memoryInfo.totalMem >= 3000000000L) {
                return;
            }
        }
        W1g.A0D = Bitmap.Config.RGB_565;
    }

    public final void A09(boolean z) {
        super.A09(z);
    }
}
