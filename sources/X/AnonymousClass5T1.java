package X;

import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5T1  reason: invalid class name */
public final class AnonymousClass5T1 {
    public int A00 = -1;
    public int A01 = -1;
    public long A02;
    public final SparseBooleanArray A03 = new SparseBooleanArray();
    public final SparseLongArray A04 = new SparseLongArray();
    public final List A05 = new ArrayList();

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0065, code lost:
        if (r5 == 10) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00f1, code lost:
        if (r10 != 4) goto L_0x00f3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0180  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.GQK A00(android.view.MotionEvent r44, X.C268134cp r45) {
        /*
            r43 = this;
            r0 = r44
            int r5 = r0.getActionMasked()
            r2 = 3
            r1 = r43
            if (r5 == r2) goto L_0x0243
            r2 = 4
            if (r5 == r2) goto L_0x0243
            int r3 = r0.getPointerCount()
            r2 = 1
            if (r3 != r2) goto L_0x0034
            r2 = 0
            int r4 = r0.getToolType(r2)
            int r3 = r0.getSource()
            int r2 = r1.A01
            if (r4 != r2) goto L_0x0026
            int r2 = r1.A00
            if (r3 == r2) goto L_0x0034
        L_0x0026:
            r1.A01 = r4
            r1.A00 = r3
            android.util.SparseBooleanArray r2 = r1.A03
            r2.clear()
            android.util.SparseLongArray r2 = r1.A04
            r2.clear()
        L_0x0034:
            int r3 = r0.getActionMasked()
            r21 = 1
            if (r3 == 0) goto L_0x01b9
            r2 = 5
            if (r3 == r2) goto L_0x01b9
            r2 = 9
            if (r3 != r2) goto L_0x0059
            r2 = 0
            int r8 = r0.getPointerId(r2)
            android.util.SparseLongArray r4 = r1.A04
            int r2 = r4.indexOfKey(r8)
            if (r2 >= 0) goto L_0x0059
            long r6 = r1.A02
            long r2 = r21 + r6
            r1.A02 = r2
            r4.put(r8, r6)
        L_0x0059:
            r2 = 9
            r4 = 1
            if (r5 == r2) goto L_0x0067
            r2 = 7
            if (r5 == r2) goto L_0x0067
            r2 = 10
            r23 = 0
            if (r5 != r2) goto L_0x0069
        L_0x0067:
            r23 = 1
        L_0x0069:
            r20 = 8
            r19 = 0
            r2 = r20
            if (r5 != r2) goto L_0x0073
            r19 = 1
        L_0x0073:
            if (r23 == 0) goto L_0x0082
            int r2 = r0.getActionIndex()
            int r3 = r0.getPointerId(r2)
            android.util.SparseBooleanArray r2 = r1.A03
            r2.put(r3, r4)
        L_0x0082:
            if (r5 == r4) goto L_0x01b6
            r2 = 6
            if (r5 == r2) goto L_0x01b0
            r12 = -1
        L_0x0088:
            java.util.List r2 = r1.A05
            r42 = r2
            r42.clear()
            int r18 = r0.getPointerCount()
            r2 = 0
        L_0x0094:
            r3 = r18
            if (r2 >= r3) goto L_0x01e1
            if (r23 != 0) goto L_0x01ac
            if (r2 == r12) goto L_0x01ac
            if (r19 == 0) goto L_0x00a4
            int r3 = r0.getButtonState()
            if (r3 == 0) goto L_0x01ac
        L_0x00a4:
            r40 = 1
        L_0x00a6:
            int r6 = r0.getPointerId(r2)
            android.util.SparseLongArray r5 = r1.A04
            int r3 = r5.indexOfKey(r6)
            if (r3 < 0) goto L_0x01a1
            long r8 = r5.valueAt(r3)
        L_0x00b6:
            float r26 = r0.getPressure(r2)
            float r4 = r0.getX(r2)
            float r3 = r0.getY(r2)
            long r3 = X.C289325dP.A00(r4, r3)
            r14 = 0
            r11 = 3
            long r38 = X.C289295dM.A03(r14, r11, r3)
            r5 = r45
            if (r2 != 0) goto L_0x018f
            float r4 = r0.getRawX()
            float r3 = r0.getRawY()
            long r6 = X.C289325dP.A00(r4, r3)
        L_0x00dc:
            long r3 = r5.EKS(r6)
        L_0x00e0:
            int r10 = r0.getToolType(r2)
            r5 = 1
            if (r10 == 0) goto L_0x00f3
            if (r10 == r5) goto L_0x018b
            r5 = 2
            if (r10 == r5) goto L_0x0187
            if (r10 == r11) goto L_0x0183
            r5 = 4
            r27 = 4
            if (r10 == r5) goto L_0x00f5
        L_0x00f3:
            r27 = 0
        L_0x00f5:
            int r5 = r0.getHistorySize()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>(r5)
            int r13 = r0.getHistorySize()
            r17 = 0
            r5 = 0
        L_0x0105:
            if (r5 >= r13) goto L_0x013e
            float r11 = r0.getHistoricalX(r2, r5)
            float r10 = r0.getHistoricalY(r2, r5)
            boolean r16 = java.lang.Float.isInfinite(r11)
            if (r16 != 0) goto L_0x013b
            boolean r16 = java.lang.Float.isNaN(r11)
            if (r16 != 0) goto L_0x013b
            boolean r16 = java.lang.Float.isInfinite(r10)
            if (r16 != 0) goto L_0x013b
            boolean r16 = java.lang.Float.isNaN(r10)
            if (r16 != 0) goto L_0x013b
            long r31 = X.C289325dP.A00(r11, r10)
            long r29 = r0.getHistoricalEventTime(r5)
            X.GQT r10 = new X.GQT
            r28 = r10
            r33 = r31
            r28.<init>(r29, r31, r33)
            r15.add(r10)
        L_0x013b:
            int r5 = r5 + 1
            goto L_0x0105
        L_0x013e:
            int r10 = r0.getActionMasked()
            r5 = r20
            if (r10 != r5) goto L_0x0180
            r5 = 10
            float r10 = r0.getAxisValue(r5)
            r5 = 9
            float r5 = r0.getAxisValue(r5)
            float r5 = -r5
            float r5 = r5 + r14
            long r36 = X.C289325dP.A00(r10, r5)
        L_0x0158:
            android.util.SparseBooleanArray r11 = r1.A03
            int r10 = r0.getPointerId(r2)
            r5 = r17
            boolean r41 = r11.get(r10, r5)
            long r30 = r0.getEventTime()
            X.GQJ r5 = new X.GQJ
            r24 = r5
            r25 = r15
            r28 = r8
            r32 = r6
            r34 = r3
            r24.<init>(r25, r26, r27, r28, r30, r32, r34, r36, r38, r40, r41)
            r3 = r42
            r3.add(r5)
            int r2 = r2 + 1
            goto L_0x0094
        L_0x0180:
            r36 = 0
            goto L_0x0158
        L_0x0183:
            r27 = 2
            goto L_0x00f5
        L_0x0187:
            r27 = 3
            goto L_0x00f5
        L_0x018b:
            r27 = 1
            goto L_0x00f5
        L_0x018f:
            int r7 = android.os.Build.VERSION.SDK_INT
            r6 = 29
            if (r7 < r6) goto L_0x019b
            long r6 = X.HRS.A00(r0, r2)
            goto L_0x00dc
        L_0x019b:
            long r6 = r5.Cga(r3)
            goto L_0x00e0
        L_0x01a1:
            long r8 = r1.A02
            long r3 = r21 + r8
            r1.A02 = r3
            r5.put(r6, r8)
            goto L_0x00b6
        L_0x01ac:
            r40 = 0
            goto L_0x00a6
        L_0x01b0:
            int r12 = r0.getActionIndex()
            goto L_0x0088
        L_0x01b6:
            r12 = 0
            goto L_0x0088
        L_0x01b9:
            int r9 = r0.getActionIndex()
            int r8 = r0.getPointerId(r9)
            android.util.SparseLongArray r4 = r1.A04
            int r2 = r4.indexOfKey(r8)
            if (r2 >= 0) goto L_0x0059
            long r6 = r1.A02
            long r2 = r21 + r6
            r1.A02 = r2
            r4.put(r8, r6)
            int r3 = r0.getToolType(r9)
            r2 = 3
            if (r3 != r2) goto L_0x0059
            android.util.SparseBooleanArray r3 = r1.A03
            r2 = 1
            r3.put(r8, r2)
            goto L_0x0059
        L_0x01e1:
            int r3 = r0.getActionMasked()
            r5 = 1
            if (r3 == r5) goto L_0x021e
            r2 = 6
            if (r3 == r2) goto L_0x021e
        L_0x01eb:
            android.util.SparseLongArray r7 = r1.A04
            int r3 = r7.size()
            int r2 = r0.getPointerCount()
            if (r3 <= r2) goto L_0x0238
            int r6 = r7.size()
            int r6 = r6 - r5
        L_0x01fc:
            r2 = -1
            if (r2 >= r6) goto L_0x0238
            int r5 = r7.keyAt(r6)
            int r4 = r0.getPointerCount()
            r3 = 0
        L_0x0208:
            if (r3 >= r4) goto L_0x0213
            int r2 = r0.getPointerId(r3)
            if (r2 == r5) goto L_0x021b
            int r3 = r3 + 1
            goto L_0x0208
        L_0x0213:
            r7.removeAt(r6)
            android.util.SparseBooleanArray r2 = r1.A03
            r2.delete(r5)
        L_0x021b:
            int r6 = r6 + -1
            goto L_0x01fc
        L_0x021e:
            int r2 = r0.getActionIndex()
            int r4 = r0.getPointerId(r2)
            android.util.SparseBooleanArray r3 = r1.A03
            r2 = 0
            boolean r2 = r3.get(r4, r2)
            if (r2 != 0) goto L_0x01eb
            android.util.SparseLongArray r2 = r1.A04
            r2.delete(r4)
            r3.delete(r4)
            goto L_0x01eb
        L_0x0238:
            r0.getEventTime()
            X.GQK r2 = new X.GQK
            r1 = r42
            r2.<init>(r0, r1)
            return r2
        L_0x0243:
            android.util.SparseLongArray r0 = r1.A04
            r0.clear()
            android.util.SparseBooleanArray r0 = r1.A03
            r0.clear()
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5T1.A00(android.view.MotionEvent, X.4cp):X.GQK");
    }
}
