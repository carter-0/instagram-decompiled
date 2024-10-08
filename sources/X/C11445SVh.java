package X;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/* renamed from: X.SVh  reason: case insensitive filesystem */
public final class C11445SVh implements SensorEventListener {
    public Sensor A00;
    public SensorManager A01;
    public final C10959S2r A02 = new C10959S2r();
    public final QCC A03;

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: X.Rvc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: X.Rvc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: X.Rvc} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onSensorChanged(android.hardware.SensorEvent r16) {
        /*
            r15 = this;
            r6 = r16
            float[] r0 = r6.values
            r8 = 0
            r2 = r0[r8]
            r9 = 1
            r1 = r0[r9]
            r5 = 2
            r0 = r0[r5]
            float r2 = r2 * r2
            float r1 = r1 * r1
            float r2 = r2 + r1
            float r0 = r0 * r0
            float r2 = r2 + r0
            double r1 = (double) r2
            r3 = 4640150175447252992(0x4065200000000000, double:169.0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x001d
            r8 = 1
        L_0x001d:
            long r1 = r6.timestamp
            X.S2r r6 = r15.A02
            r3 = 500000000(0x1dcd6500, double:2.47032823E-315)
            long r13 = r1 - r3
        L_0x0026:
            int r7 = r6.A01
            r0 = 4
            if (r7 < r0) goto L_0x0059
            X.Rvc r10 = r6.A03
            if (r10 == 0) goto L_0x0059
            long r3 = r10.A00
            long r11 = r13 - r3
            r3 = 0
            int r0 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0059
            boolean r0 = r10.A02
            if (r0 == 0) goto L_0x0043
            int r0 = r6.A00
            int r0 = r0 + -1
            r6.A00 = r0
        L_0x0043:
            int r0 = r7 + -1
            r6.A01 = r0
            X.Rvc r0 = r10.A01
            r6.A03 = r0
            if (r0 != 0) goto L_0x0050
            r0 = 0
            r6.A02 = r0
        L_0x0050:
            X.RqU r3 = r6.A04
            X.Rvc r0 = r3.A00
            r10.A01 = r0
            r3.A00 = r10
            goto L_0x0026
        L_0x0059:
            X.RqU r3 = r6.A04
            X.Rvc r4 = r3.A00
            if (r4 != 0) goto L_0x00ee
            X.Rvc r4 = new X.Rvc
            r4.<init>()
        L_0x0064:
            r4.A00 = r1
            r4.A02 = r8
            r0 = 0
            r4.A01 = r0
            X.Rvc r0 = r6.A02
            if (r0 == 0) goto L_0x0071
            r0.A01 = r4
        L_0x0071:
            r6.A02 = r4
            X.Rvc r3 = r6.A03
            if (r3 != 0) goto L_0x007a
            r6.A03 = r4
            r3 = r4
        L_0x007a:
            int r7 = r7 + 1
            r6.A01 = r7
            if (r8 == 0) goto L_0x0086
            int r0 = r6.A00
            int r0 = r0 + 1
            r6.A00 = r0
        L_0x0086:
            if (r3 == 0) goto L_0x00e9
            long r3 = r3.A00
            long r1 = r1 - r3
            r3 = 250000000(0xee6b280, double:1.235164115E-315)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x00e9
            int r2 = r6.A00
            int r1 = r7 >> 1
            int r0 = r7 >> 2
            int r1 = r1 + r0
            if (r2 < r1) goto L_0x00e9
            r6.A00()
            X.QCC r6 = r15.A03
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r3 = r6.A01
            long r7 = r1 - r3
            r3 = 500(0x1f4, double:2.47E-321)
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x00ea
            int r0 = r6.A00
            int r0 = r0 + 1
            r6.A00 = r0
        L_0x00b4:
            r6.A01 = r1
            if (r0 < r5) goto L_0x00e9
            X.0hq r0 = r6.getParentFragmentManager()
            java.lang.String r5 = "dump_debug_info_dialog_fragment"
            androidx.fragment.app.Fragment r0 = r0.A0R(r5)
            if (r0 != 0) goto L_0x00e9
            long r3 = r6.A01
            long r0 = r6.A02
            long r3 = r3 - r0
            r1 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x00f4
            X.SVh r2 = r6.A04
            android.hardware.Sensor r1 = r2.A00
            if (r1 == 0) goto L_0x00e9
            X.S2r r0 = r2.A02
            r0.A00()
            android.hardware.SensorManager r0 = r2.A01
            r0.unregisterListener(r2, r1)
            X.0Te r0 = X.AnonymousClass0BW.A00
            r0.A06(r2, r1)
            r0 = 0
            r2.A01 = r0
            r2.A00 = r0
        L_0x00e9:
            return
        L_0x00ea:
            r6.A00 = r9
            r0 = 1
            goto L_0x00b4
        L_0x00ee:
            X.Rvc r0 = r4.A01
            r3.A00 = r0
            goto L_0x0064
        L_0x00f4:
            X.QC3 r1 = r6.A03
            X.0hq r0 = r6.getParentFragmentManager()
            r1.A0B(r0, r5)
            X.TBF r1 = new X.TBF
            r1.<init>(r6)
            java.lang.Thread r0 = new java.lang.Thread
            r0.<init>(r1)
            r0.start()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11445SVh.onSensorChanged(android.hardware.SensorEvent):void");
    }

    public C11445SVh(QCC qcc) {
        this.A03 = qcc;
    }
}
