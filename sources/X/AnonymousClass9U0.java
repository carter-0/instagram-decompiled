package X;

import android.graphics.Bitmap;

/* renamed from: X.9U0  reason: invalid class name */
public final class AnonymousClass9U0 implements C370288w9 {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ AnonymousClass8L8 A01;

    public AnonymousClass9U0(Bitmap bitmap, AnonymousClass8L8 r2) {
        this.A01 = r2;
        this.A00 = bitmap;
    }

    /* JADX WARNING: type inference failed for: r4v5, types: [java.lang.Object, X.A5a] */
    /* JADX WARNING: type inference failed for: r4v6, types: [java.lang.Object, X.A5a] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void DYh(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Number r8 = (java.lang.Number) r8
            r4 = 0
            X.8L8 r5 = r7.A01
            if (r8 == 0) goto L_0x0036
            android.graphics.Bitmap r2 = r7.A00
            int r0 = r8.intValue()
            if (r0 == 0) goto L_0x0036
            r6 = 2
            if (r0 < r6) goto L_0x003b
            int r1 = r2.getWidth()
            int r1 = r1 / r6
            int r0 = r2.getHeight()
            int r0 = r0 / r6
            X.9Tz r2 = r5.A00
            if (r2 == 0) goto L_0x0035
            float r1 = (float) r1
            float r0 = (float) r0
            X.A5a r4 = new X.A5a
            r4.<init>()
            r4.A00 = r1
            r4.A01 = r0
            java.util.List r0 = r2.A01
            r0.add(r4)
            java.util.List r0 = r2.A02
        L_0x0032:
            r0.add(r4)
        L_0x0035:
            return
        L_0x0036:
            X.9Tz r2 = r5.A00
            if (r2 == 0) goto L_0x0035
            goto L_0x0071
        L_0x003b:
            X.84a r3 = r5.A01
            com.instagram.ml.bodytracking.BodyTrackerJni r0 = r3.A02
            if (r0 == 0) goto L_0x0035
            int[] r0 = r0.getDetectedPeopleIds()
            if (r0 == 0) goto L_0x0035
            r2 = 0
            r1 = r0[r2]
            com.instagram.ml.bodytracking.BodyTrackerJni r0 = r3.A02
            if (r0 == 0) goto L_0x0035
            float[] r4 = r0.getBoundingBox(r1)
            if (r4 == 0) goto L_0x0035
            r3 = r4[r2]
            r0 = r4[r6]
            r2 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r2
            float r3 = r3 + r0
            r0 = 1
            r1 = r4[r0]
            r0 = 3
            r0 = r4[r0]
            float r0 = r0 / r2
            float r1 = r1 + r0
            X.9Tz r2 = r5.A00
            if (r2 == 0) goto L_0x0035
            X.A5a r4 = new X.A5a
            r4.<init>()
            r4.A00 = r3
            r4.A01 = r1
        L_0x0071:
            java.util.List r0 = r2.A01
            r0.add(r4)
            java.util.List r0 = r2.A02
            if (r4 != 0) goto L_0x0032
            X.A5a r4 = r2.A00
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9U0.DYh(java.lang.Object):void");
    }
}
