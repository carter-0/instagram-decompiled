package X;

import android.content.Context;
import android.content.res.Resources;
import com.instagram.android.R;

/* renamed from: X.8jP  reason: invalid class name and case insensitive filesystem */
public final class C363248jP {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public int A07;
    public long A08;
    public float A09;
    public float A0A;
    public boolean A0B;
    public final int A0C;
    public final int A0D;
    public final C363148jF A0E;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        if (r8 == 5) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (r8 != 0) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0189, code lost:
        if (java.lang.Math.abs((float) java.lang.Math.toDegrees(java.lang.Math.atan2((double) r9.A0A, (double) r9.A09) - java.lang.Math.atan2((double) r4, (double) r5))) > 3.0f) goto L_0x018b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x016b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(android.view.MotionEvent r24) {
        /*
            r23 = this;
            r3 = 0
            r2 = r24
            int r8 = r2.getActionMasked()
            r7 = 1
            r9 = r23
            if (r8 == r7) goto L_0x01bb
            r0 = 3
            if (r8 == r0) goto L_0x01bb
            r1 = 0
            if (r8 == 0) goto L_0x01bc
        L_0x0012:
            r1 = 6
            if (r8 == 0) goto L_0x001c
            if (r8 == r1) goto L_0x001c
            r0 = 5
            r22 = 0
            if (r8 != r0) goto L_0x001e
        L_0x001c:
            r22 = 1
        L_0x001e:
            if (r8 != r1) goto L_0x01b7
            r0 = 1
            int r5 = r2.getActionIndex()
        L_0x0025:
            int r6 = r2.getPointerCount()
            r4 = r6
            if (r0 == 0) goto L_0x002e
            int r4 = r6 + -1
        L_0x002e:
            r1 = 0
            r21 = 0
            r20 = 0
        L_0x0033:
            if (r1 >= r6) goto L_0x0046
            if (r5 == r1) goto L_0x0043
            float r0 = r2.getX(r1)
            float r21 = r21 + r0
            float r0 = r2.getY(r1)
            float r20 = r20 + r0
        L_0x0043:
            int r1 = r1 + 1
            goto L_0x0033
        L_0x0046:
            float r4 = (float) r4
            float r21 = r21 / r4
            float r20 = r20 / r4
            long r14 = android.os.SystemClock.uptimeMillis()
            int r13 = r2.getPointerCount()
            long r0 = r9.A08
            long r14 = r14 - r0
            r10 = 128(0x80, double:6.32E-322)
            int r0 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            r19 = 0
            if (r0 < 0) goto L_0x0060
            r19 = 1
        L_0x0060:
            r18 = 0
            r15 = 0
            r14 = 0
        L_0x0064:
            if (r15 >= r13) goto L_0x00d2
            float r0 = r9.A04
            boolean r0 = java.lang.Float.isNaN(r0)
            r17 = r0 ^ 1
            int r12 = r2.getHistorySize()
            int r11 = r12 + 1
            r10 = 0
        L_0x0075:
            if (r10 >= r11) goto L_0x00ce
            if (r10 >= r12) goto L_0x00c9
            float r1 = r2.getHistoricalTouchMajor(r15, r10)
        L_0x007d:
            int r0 = r9.A0C
            float r0 = (float) r0
            int r16 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r16 >= 0) goto L_0x0085
            r1 = r0
        L_0x0085:
            float r18 = r18 + r1
            float r0 = r9.A06
            boolean r16 = java.lang.Float.isNaN(r0)
            if (r16 != 0) goto L_0x0093
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0095
        L_0x0093:
            r9.A06 = r1
        L_0x0095:
            float r0 = r9.A05
            boolean r16 = java.lang.Float.isNaN(r0)
            if (r16 != 0) goto L_0x00a1
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x00a3
        L_0x00a1:
            r9.A05 = r1
        L_0x00a3:
            if (r17 == 0) goto L_0x00c1
            float r0 = r9.A04
            float r1 = r1 - r0
            float r0 = java.lang.Math.signum(r1)
            int r1 = (int) r0
            int r0 = r9.A07
            if (r1 != r0) goto L_0x00b5
            if (r1 != 0) goto L_0x00c1
            if (r0 != 0) goto L_0x00c1
        L_0x00b5:
            r9.A07 = r1
            if (r10 >= r12) goto L_0x00c4
            long r0 = r2.getHistoricalEventTime(r10)
        L_0x00bd:
            r9.A08 = r0
            r19 = 0
        L_0x00c1:
            int r10 = r10 + 1
            goto L_0x0075
        L_0x00c4:
            long r0 = r2.getEventTime()
            goto L_0x00bd
        L_0x00c9:
            float r1 = r2.getTouchMajor(r15)
            goto L_0x007d
        L_0x00ce:
            int r14 = r14 + r11
            int r15 = r15 + 1
            goto L_0x0064
        L_0x00d2:
            float r0 = (float) r14
            float r18 = r18 / r0
            if (r19 == 0) goto L_0x00f6
            float r11 = r9.A06
            float r10 = r9.A05
            float r1 = r11 + r10
            float r1 = r1 + r18
            r0 = 1077936128(0x40400000, float:3.0)
            float r1 = r1 / r0
            float r11 = r11 + r1
            r0 = 1073741824(0x40000000, float:2.0)
            float r11 = r11 / r0
            r9.A06 = r11
            float r10 = r10 + r1
            float r10 = r10 / r0
            r9.A05 = r10
            r9.A04 = r1
            r9.A07 = r3
            long r0 = r2.getEventTime()
            r9.A08 = r0
        L_0x00f6:
            r10 = 0
            r1 = 0
            r12 = 0
        L_0x00f9:
            r11 = 2
            if (r10 >= r6) goto L_0x011e
            if (r5 == r10) goto L_0x011b
            float r11 = r9.A04
            r0 = 1073741824(0x40000000, float:2.0)
            float r11 = r11 / r0
            float r0 = r2.getX(r10)
            float r0 = r0 - r21
            float r0 = java.lang.Math.abs(r0)
            float r0 = r0 + r11
            float r1 = r1 + r0
            float r0 = r2.getY(r10)
            float r0 = r0 - r20
            float r0 = java.lang.Math.abs(r0)
            float r0 = r0 + r11
            float r12 = r12 + r0
        L_0x011b:
            int r10 = r10 + 1
            goto L_0x00f9
        L_0x011e:
            float r1 = r1 / r4
            float r12 = r12 / r4
            if (r6 <= r7) goto L_0x01b3
            float r5 = r2.getX(r7)
            float r0 = r2.getX(r3)
            float r5 = r5 - r0
            float r4 = r2.getY(r7)
            float r0 = r2.getY(r3)
            float r4 = r4 - r0
        L_0x0134:
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 * r0
            float r12 = r12 * r0
            float r1 = r1 * r1
            float r12 = r12 * r12
            float r1 = r1 + r12
            double r0 = (double) r1
            double r0 = java.lang.Math.sqrt(r0)
            float r2 = (float) r0
            boolean r1 = r9.A0B
            r10 = r1
            if (r1 == 0) goto L_0x0152
            int r0 = r9.A0D
            float r0 = (float) r0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x014f
            if (r22 == 0) goto L_0x0160
        L_0x014f:
            r9.A0B = r3
            r10 = 0
        L_0x0152:
            if (r22 == 0) goto L_0x0160
            r9.A00 = r5
            r9.A02 = r5
            r9.A09 = r5
            r9.A01 = r4
            r9.A03 = r4
            r9.A0A = r4
        L_0x0160:
            int r0 = r9.A0D
            if (r10 != 0) goto L_0x019b
            float r0 = (float) r0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x019b
            if (r1 != 0) goto L_0x018b
            float r1 = r9.A0A
            float r0 = r9.A09
            double r2 = (double) r1
            double r0 = (double) r0
            double r12 = java.lang.Math.atan2(r2, r0)
            double r2 = (double) r4
            double r0 = (double) r5
            double r0 = java.lang.Math.atan2(r2, r0)
            double r12 = r12 - r0
            double r0 = java.lang.Math.toDegrees(r12)
            float r2 = (float) r0
            float r1 = java.lang.Math.abs(r2)
            r0 = 1077936128(0x40400000, float:3.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x019b
        L_0x018b:
            r9.A00 = r5
            r9.A02 = r5
            r9.A01 = r4
            r9.A03 = r4
            X.8jF r0 = r9.A0E
            boolean r10 = r0.Dfz(r9)
            r9.A0B = r10
        L_0x019b:
            if (r6 <= r7) goto L_0x01d2
            if (r8 != r11) goto L_0x01d2
            r9.A00 = r5
            r9.A01 = r4
            if (r10 == 0) goto L_0x01aa
            X.8jF r0 = r9.A0E
            r0.Dfy(r9)
        L_0x01aa:
            float r0 = r9.A00
            r9.A02 = r0
            float r0 = r9.A01
            r9.A03 = r0
            return
        L_0x01b3:
            r5 = 0
            r4 = 0
            goto L_0x0134
        L_0x01b7:
            r0 = 0
            r5 = -1
            goto L_0x0025
        L_0x01bb:
            r1 = 1
        L_0x01bc:
            boolean r0 = r9.A0B
            if (r0 == 0) goto L_0x01c2
            r9.A0B = r3
        L_0x01c2:
            if (r1 == 0) goto L_0x0012
            r0 = -4194304(0xffffffffffc00000, float:NaN)
            r9.A06 = r0
            r9.A05 = r0
            r9.A04 = r0
            r9.A07 = r3
            r0 = 0
            r9.A08 = r0
        L_0x01d2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C363248jP.A00(android.view.MotionEvent):void");
    }

    public C363248jP(Context context, C363148jF r4) {
        this.A0E = r4;
        Resources resources = context.getResources();
        this.A0C = resources.getDimensionPixelSize(R.dimen.abc_alert_dialog_button_dimen);
        this.A0D = resources.getDimensionPixelSize(R.dimen.config_minScalingSpan);
    }
}
