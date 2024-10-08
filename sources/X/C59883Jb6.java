package X;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;

/* renamed from: X.Jb6  reason: case insensitive filesystem */
public final class C59883Jb6 implements SensorEventListener {
    public final /* synthetic */ C59863Jag A00;

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0073, code lost:
        if (java.lang.Math.min(r1, 360 - r1) >= 50) goto L_0x0075;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onSensorChanged(android.hardware.SensorEvent r8) {
        /*
            r7 = this;
            r0 = 0
            X.0qQ.A0B(r8, r0)
            float[] r1 = r8.values
            r0 = r1[r0]
            float r4 = -r0
            r0 = 1
            r0 = r1[r0]
            float r3 = -r0
            r0 = 2
            r0 = r1[r0]
            float r2 = -r0
            float r1 = r4 * r4
            float r0 = r3 * r3
            float r1 = r1 + r0
            r0 = 1082130432(0x40800000, float:4.0)
            float r1 = r1 * r0
            float r2 = r2 * r2
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x003b
            double r0 = (double) r3
            double r2 = -r0
            double r0 = (double) r4
            double r2 = java.lang.Math.atan2(r2, r0)
            float r1 = (float) r2
            r0 = 1113927393(0x42652ee1, float:57.29578)
            float r1 = r1 * r0
            r5 = 1119092736(0x42b40000, float:90.0)
        L_0x002c:
            float r5 = r5 - r1
            r1 = 1135869952(0x43b40000, float:360.0)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0034
            goto L_0x002c
        L_0x0034:
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x003d
            float r5 = r5 + r1
            goto L_0x0034
        L_0x003b:
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x003d:
            X.Jag r4 = r7.A00
            float r0 = r4.A00
            float r1 = X.AnonymousClass7TE.A00(r5, r0)
            r0 = 1008981770(0x3c23d70a, float:0.01)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ad
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0098
            com.instagram.creation.capture.MediaCaptureFragment r0 = r4.A09
            androidx.fragment.app.FragmentActivity r3 = r0.getActivity()
            if (r3 == 0) goto L_0x0098
            int r6 = java.lang.Math.round(r5)
            int r2 = r4.A02
            X.0vF r0 = X.C363878kU.A00
            r0 = -1
            if (r2 == r0) goto L_0x0075
            int r0 = r6 - r2
            int r1 = java.lang.Math.abs(r0)
            int r0 = 360 - r1
            int r1 = java.lang.Math.min(r1, r0)
            r0 = 50
            if (r1 < r0) goto L_0x007d
        L_0x0075:
            int r0 = r6 + 45
            int r0 = r0 / 90
            int r0 = r0 * 90
            int r2 = r0 % 360
        L_0x007d:
            r4.A02 = r2
            float r0 = (float) r2
            float r2 = r5 - r0
        L_0x0082:
            r4.A01 = r2
            r0 = 1127481344(0x43340000, float:180.0)
            r1 = 1135869952(0x43b40000, float:360.0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x008e
            float r2 = r2 - r1
            goto L_0x0082
        L_0x008e:
            r0 = -1020002304(0xffffffffc3340000, float:-180.0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x009c
            float r2 = r2 + r1
            r4.A01 = r2
            goto L_0x008e
        L_0x0098:
            r0 = 0
            r4.A01 = r0
            goto L_0x00ab
        L_0x009c:
            X.JbQ r2 = new X.JbQ
            r2.<init>(r4)
            X.0vF r1 = X.C363878kU.A00
            X.JbP r0 = new X.JbP
            r0.<init>(r3, r2)
            r1.ATE(r0)
        L_0x00ab:
            r4.A00 = r5
        L_0x00ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59883Jb6.onSensorChanged(android.hardware.SensorEvent):void");
    }

    public C59883Jb6(C59863Jag jag) {
        this.A00 = jag;
    }
}
