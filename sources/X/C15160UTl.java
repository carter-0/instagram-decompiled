package X;

import com.instagram.quicksnap.emitter.QuickSnapReactionEmitterView;

/* renamed from: X.UTl  reason: case insensitive filesystem */
public final class C15160UTl extends C330607Nm {
    public final /* synthetic */ QuickSnapReactionEmitterView A00;

    public C15160UTl(QuickSnapReactionEmitterView quickSnapReactionEmitterView) {
        this.A00 = quickSnapReactionEmitterView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0139, code lost:
        if ((r1 + ((float) r0)) < 0.0f) goto L_0x013b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x015c, code lost:
        if ((r1 - ((float) r0)) > ((float) r3.getHeight())) goto L_0x013b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0148 A[LOOP:1: B:17:0x0075->B:40:0x0148, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x016b A[EDGE_INSN: B:61:0x016b->B:48:0x016b ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(long r14) {
        /*
            r13 = this;
            com.instagram.quicksnap.emitter.QuickSnapReactionEmitterView r3 = r13.A00
            long r4 = r3.A01
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x000c
            r3.A01 = r14
        L_0x000c:
            java.util.List r8 = r3.A06
            boolean r0 = X.AnonymousClass7TE.A1b(r8)
            if (r0 == 0) goto L_0x006d
            long r1 = r3.A01
            int r0 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x006d
            r0 = 0
            java.lang.Object r2 = r8.remove(r0)
            X.VT6 r2 = (X.VT6) r2
            java.util.List r4 = r3.A04
            boolean r0 = X.AnonymousClass7TE.A1b(r4)
            if (r0 == 0) goto L_0x0067
            int r0 = X.C51966G9m.A06(r4)
            java.lang.Object r7 = r4.remove(r0)
            X.Vcv r7 = (X.C17726Vcv) r7
            r0 = 0
            r7.A08 = r0
            r0 = 0
            r7.A00 = r0
        L_0x003a:
            java.util.List r5 = r3.A05
            r5.add(r7)
            X.X4M r6 = r2.A01
            int r8 = r3.getWidth()
            int r9 = r3.getHeight()
            long r10 = r3.A01
            r6.AJ7(r7, r8, r9, r10)
            long r0 = r3.A01
            r7.A08 = r0
            android.graphics.Bitmap r0 = r7.A09
            if (r0 != 0) goto L_0x005f
            r0 = 0
            r7.A09 = r0
            r5.remove(r7)
            r4.add(r7)
        L_0x005f:
            long r4 = r3.A01
            long r0 = r2.A00
            long r4 = r4 + r0
            r3.A01 = r4
            goto L_0x000c
        L_0x0067:
            X.Vcv r7 = new X.Vcv
            r7.<init>(r3)
            goto L_0x003a
        L_0x006d:
            java.util.List r7 = r3.A05
            int r0 = X.C51966G9m.A06(r7)
            if (r0 < 0) goto L_0x016b
        L_0x0075:
            int r12 = r0 + -1
            java.lang.Object r6 = r7.get(r0)
            X.Vcv r6 = (X.C17726Vcv) r6
            long r4 = r6.A08
            long r0 = r14 - r4
            float r5 = (float) r0
            r0 = 814313567(0x3089705f, float:1.0E-9)
            float r5 = r5 * r0
            android.graphics.PointF r10 = r6.A0D
            float r1 = r10.y
            r9 = 0
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x0161
            float r0 = r6.A04
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x0161
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            float r0 = r0.floatValue()
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            r2 = 1
            if (r0 >= 0) goto L_0x00a3
            r2 = -1
        L_0x00a3:
            float r0 = r6.A04
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            float r0 = r0.floatValue()
            int r1 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            r0 = 1
            if (r1 >= 0) goto L_0x00b3
            r0 = -1
        L_0x00b3:
            if (r2 == r0) goto L_0x0161
            float r11 = r6.A04
            r2 = 1084227584(0x40a00000, float:5.0)
            r1 = 1097859072(0x41700000, float:15.0)
            float r4 = r10.y
            float r0 = -r4
            float r0 = r0 * r1
            float r0 = r0 / r11
            float r0 = r0 + r2
            float r11 = r11 * r0
            float r11 = r11 * r5
            float r4 = r4 + r11
            r10.y = r4
            float r2 = r10.x
            r1 = 1065353216(0x3f800000, float:1.0)
            r0 = 1092616192(0x41200000, float:10.0)
            float r0 = r0 * r5
            float r1 = r1 - r0
            float r0 = java.lang.Math.max(r9, r1)
            float r2 = r2 * r0
            r10.x = r2
        L_0x00d5:
            android.graphics.PointF r1 = r6.A0C
            float r11 = r1.x
            float r0 = r10.x
            float r0 = r0 * r5
            float r11 = r11 + r0
            r1.x = r11
            float r2 = r1.y
            float r4 = r4 * r5
            float r2 = r2 + r4
            r1.y = r2
            android.graphics.PointF r10 = r6.A0B
            android.graphics.PointF r1 = r6.A0A
            float r0 = r1.x
            float r4 = r6.A00
            float r11 = r11 - r0
            float r11 = r11 * r4
            float r0 = r0 + r11
            r10.x = r0
            float r0 = r1.y
            float r2 = r2 - r0
            float r2 = r2 * r4
            float r0 = r0 + r2
            r10.y = r0
            float r0 = r6.A06
            float r0 = r0 * r4
            r6.A02 = r0
            float r2 = r6.A07
            float r1 = r6.A03
            android.view.animation.AccelerateInterpolator r0 = r3.A02
            float r0 = r0.getInterpolation(r4)
            float r1 = r1 - r2
            float r1 = r1 * r0
            float r2 = r2 + r1
            r6.A01 = r2
            float r4 = r6.A00
            r0 = 1077936128(0x40400000, float:3.0)
            float r5 = r5 * r0
            r2 = 1065353216(0x3f800000, float:1.0)
            float r0 = r2 - r4
            float r0 = r0 * r5
            float r4 = r4 + r0
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x011f
            r1 = r4
        L_0x011f:
            r6.A00 = r1
            r6.A08 = r14
            float r0 = r6.A04
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            android.graphics.PointF r0 = r6.A0B
            float r1 = r0.y
            android.graphics.Bitmap r0 = r6.A09
            if (r2 >= 0) goto L_0x014d
            if (r0 == 0) goto L_0x014b
            int r0 = r0.getHeight()
        L_0x0135:
            float r0 = (float) r0
            float r1 = r1 + r0
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x0146
        L_0x013b:
            r0 = 0
            r6.A09 = r0
            r7.remove(r6)
            java.util.List r0 = r3.A04
            r0.add(r6)
        L_0x0146:
            if (r12 < 0) goto L_0x016b
            r0 = r12
            goto L_0x0075
        L_0x014b:
            r0 = 0
            goto L_0x0135
        L_0x014d:
            if (r0 == 0) goto L_0x015f
            int r0 = r0.getHeight()
        L_0x0153:
            float r0 = (float) r0
            float r1 = r1 - r0
            int r0 = r3.getHeight()
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0146
            goto L_0x013b
        L_0x015f:
            r0 = 0
            goto L_0x0153
        L_0x0161:
            float r4 = r10.y
            float r0 = r6.A04
            float r0 = r0 * r5
            float r4 = r4 + r0
            r10.y = r4
            goto L_0x00d5
        L_0x016b:
            r3.invalidate()
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x017e
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x017e
            r3.A01()
            return
        L_0x017e:
            X.Tpc r0 = X.C14086Tpc.A01
            r0.A00(r13)
            r3.A00 = r14
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15160UTl.A00(long):void");
    }
}
