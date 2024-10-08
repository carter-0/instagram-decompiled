package X;

import com.instagram.common.session.UserSession;

public final class H8K extends 0ng {
    public final UserSession A00;
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02;
    public final String A03;
    public final 0sP A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public H8K(UserSession userSession, String str, 0sP r6) {
        super(560478558, 3, false, false);
        0qQ.A0B(str, 2);
        this.A00 = userSession;
        this.A03 = str;
        this.A04 = r6;
        0eO r1 = 0eO.A02;
        this.A02 = C58710IwJ.A00(this, r1, 35);
        this.A01 = C58710IwJ.A00(this, r1, 34);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:134:0x0232 */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0228 A[Catch:{ RuntimeException -> 0x0232, all -> 0x022d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r23 = this;
            android.media.MediaMetadataRetriever r6 = new android.media.MediaMetadataRetriever
            r6.<init>()
            r7 = r23
            java.lang.String r0 = r7.A03     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            r22 = r0
            r6.setDataSource(r0)     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            r5 = 1
            r4 = 0
            r1 = 0
            r0 = 9
            java.lang.String r0 = r6.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            if (r0 == 0) goto L_0x0023
            java.lang.Integer r0 = X.00y.A0l(r0)     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            if (r0 == 0) goto L_0x0023
            int r1 = r0.intValue()     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
        L_0x0023:
            X.2HY r1 = X.C229632nm.A0C(r4, r1)     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            r0 = 1000(0x3e8, float:1.401E-42)
            X.2HZ r0 = X.C229632nm.A0B(r1, r0)     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            int r3 = r0.A00     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            int r10 = r0.A01     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            int r9 = r0.A02     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            if (r9 <= 0) goto L_0x0037
            goto L_0x021d
        L_0x0037:
            if (r9 >= 0) goto L_0x021f
            if (r10 > r3) goto L_0x021f
        L_0x003b:
            r2 = 0
            r8 = 0
        L_0x003d:
            com.instagram.common.session.UserSession r13 = r7.A00     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            long r0 = (long) r3     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            r11 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r11
            r14 = 0
            r11 = 18
            java.lang.String r11 = r6.extractMetadata(r11)     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            if (r11 == 0) goto L_0x0056
            java.lang.Integer r11 = X.00y.A0l(r11)     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            if (r11 == 0) goto L_0x0056
            int r14 = r11.intValue()     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
        L_0x0056:
            r15 = 0
            r11 = 19
            java.lang.String r12 = r6.extractMetadata(r11)     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            if (r12 == 0) goto L_0x0069
            java.lang.Integer r12 = X.00y.A0l(r12)     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            if (r12 == 0) goto L_0x0069
            int r15 = r12.intValue()     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
        L_0x0069:
            r12 = r13
            r13 = r22
            r16 = r0
            android.graphics.Bitmap r17 = X.C39908AIz.A00(r12, r13, r14, r15, r16)     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            if (r17 == 0) goto L_0x0212
            java.util.concurrent.CountDownLatch r13 = new java.util.concurrent.CountDownLatch     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            r13.<init>(r5)     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            java.util.ArrayList r20 = X.AnonymousClass7TE.A1C()     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            X.0eM r0 = r7.A02     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            java.lang.Object r12 = r0.getValue()     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            X.Hls r12 = (X.C55695Hls) r12     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            X.IoC r1 = new X.IoC     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            r15 = r1
            r16 = r11
            r18 = r7
            r19 = r13
            r15.<init>(r16, r17, r18, r19, r20)     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            X.8CN r11 = r12.A02     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            X.IHU r0 = new X.IHU     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            r0.<init>(r5, r12, r1)     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            r11.AUy(r0, r5)     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            r13.await()     // Catch:{ InterruptedException -> 0x009f }
            goto L_0x00b2
        L_0x009f:
            r12 = move-exception
            X.0wj r11 = X.0wj.A01     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            r1 = 386470571(0x170912ab, float:4.429065E-25)
            java.lang.String r0 = "VideoEligibilityChecker"
            X.0f9 r11 = r11.AEf(r0, r1)     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            java.lang.String r1 = "detectFaces"
            java.lang.String r0 = "Failed to run face detection"
            X.AnonymousClass7TF.A19(r11, r1, r0, r12)     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
        L_0x00b2:
            boolean r0 = r20.isEmpty()     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            if (r0 == 0) goto L_0x00c0
            java.lang.Integer r1 = X.AnonymousClass05K.A0C     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
        L_0x00ba:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            if (r1 == r0) goto L_0x020c
            goto L_0x020a
        L_0x00c0:
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            java.util.Iterator r11 = r20.iterator()     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
        L_0x00c8:
            boolean r0 = r11.hasNext()     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            if (r0 == 0) goto L_0x00dc
            java.lang.Object r0 = r11.next()     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            X.Gja r0 = (X.C53164Gja) r0     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            float[] r0 = r0.A01     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            if (r0 == 0) goto L_0x00c8
            r1.add(r0)     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            goto L_0x00c8
        L_0x00dc:
            int r0 = r1.size()     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            if (r0 != r5) goto L_0x0206
            java.lang.Object r0 = X.00k.A0J(r1)     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            float[] r0 = (float[]) r0     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            if (r0 == 0) goto L_0x0206
            int r0 = r0.length     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            r1 = 4
            if (r0 != r1) goto L_0x0206
            java.lang.Object r0 = X.00k.A0J(r20)     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            X.Gja r0 = (X.C53164Gja) r0     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            if (r0 == 0) goto L_0x0206
            float[] r12 = r0.A01     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            if (r12 == 0) goto L_0x0206
            int r0 = r12.length     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            if (r0 < r1) goto L_0x0206
            r0 = 2
            r1 = r12[r0]     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            r0 = r12[r4]     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            float r13 = X.AnonymousClass7TE.A00(r1, r0)     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            r0 = 3
            r1 = r12[r0]     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            r0 = r12[r5]     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            float r11 = X.AnonymousClass7TE.A00(r1, r0)     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            r1 = 1115684864(0x42800000, float:64.0)
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0206
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0206
            java.lang.Object r0 = X.00k.A0J(r20)     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            X.Gja r0 = (X.C53164Gja) r0     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            if (r0 == 0) goto L_0x0206
            float[] r1 = r0.A00     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            if (r1 == 0) goto L_0x0206
            r14 = 1097859072(0x41700000, float:15.0)
            int r11 = r1.length     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            r0 = 3
            if (r11 < r0) goto L_0x0206
            r0 = r1[r4]     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            float r0 = java.lang.Math.abs(r0)     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            int r0 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r0 >= 0) goto L_0x0206
            r0 = r1[r5]     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            float r0 = java.lang.Math.abs(r0)     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            int r0 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r0 >= 0) goto L_0x0206
            r13 = 2
            r0 = r1[r13]     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            float r0 = java.lang.Math.abs(r0)     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            int r0 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r0 >= 0) goto L_0x0206
            java.util.concurrent.CountDownLatch r14 = new java.util.concurrent.CountDownLatch     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            r14.<init>(r5)     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            X.0rm r11 = X.C51965G9l.A11()     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            X.0eM r0 = r7.A01     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            java.lang.Object r1 = r0.getValue()     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            X.Hlr r1 = (X.C55694Hlr) r1     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            r16 = 7
            X.IoM r0 = new X.IoM     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            r15 = r0
            r18 = r12
            r19 = r7
            r20 = r11
            r21 = r14
            r15.<init>(r16, r17, r18, r19, r20, r21)     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            X.8CN r15 = r1.A02     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            X.IHU r12 = new X.IHU     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            r12.<init>(r4, r1, r0)     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            r15.AUy(r12, r5)     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            r14.await()     // Catch:{ InterruptedException -> 0x0179 }
            goto L_0x018c
        L_0x0179:
            r14 = move-exception
            X.0wj r12 = X.0wj.A01     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            r1 = 386470571(0x170912ab, float:4.429065E-25)
            java.lang.String r0 = "VideoEligibilityChecker"
            X.0f9 r12 = r12.AEf(r0, r1)     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            java.lang.String r1 = "detectFacialLandmarks"
            java.lang.String r0 = "Failed to run facial landmarks detection"
            X.AnonymousClass7TF.A19(r12, r1, r0, r14)     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
        L_0x018c:
            java.lang.Object r1 = r11.A00     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            X.GjZ r1 = (X.C53163GjZ) r1     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            if (r1 == 0) goto L_0x0206
            java.util.List r0 = r1.A00     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            if (r0 == 0) goto L_0x0206
            float[] r14 = r1.A01     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            if (r14 != 0) goto L_0x019c
            float[] r14 = new float[r4]     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
        L_0x019c:
            int r12 = r14.length     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            r11 = 100
            if (r12 < r11) goto L_0x0206
            java.util.ArrayList r18 = X.AnonymousClass7TE.A1C()     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            r15 = 0
            r1 = 0
        L_0x01a7:
            r17 = r14[r15]     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            int r16 = r1 + 1
            if (r13 > r1) goto L_0x01c2
            r0 = 15
            if (r1 < r0) goto L_0x01b9
            r0 = 31
            if (r0 > r1) goto L_0x01c2
            r0 = 36
            if (r1 >= r0) goto L_0x01c2
        L_0x01b9:
            java.lang.Float r1 = java.lang.Float.valueOf(r17)     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            r0 = r18
            r0.add(r1)     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
        L_0x01c2:
            int r15 = r15 + 1
            r1 = r16
            if (r15 < r12) goto L_0x01a7
            double r0 = X.00k.A00(r18)     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            float r13 = (float) r0     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            r18 = 1053609165(0x3ecccccd, float:0.4)
            int r0 = (r13 > r18 ? 1 : (r13 == r18 ? 0 : -1))
            if (r0 < 0) goto L_0x0206
            java.util.ArrayList r13 = X.AnonymousClass7TE.A1C()     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            r1 = 0
            r15 = 0
        L_0x01da:
            r17 = r14[r1]     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            int r16 = r15 + 1
            r0 = 48
            if (r0 > r15) goto L_0x01f3
            r0 = 68
            if (r15 < r0) goto L_0x01ec
            r0 = 88
            if (r0 > r15) goto L_0x01f3
            if (r15 >= r11) goto L_0x01f3
        L_0x01ec:
            java.lang.Float r0 = java.lang.Float.valueOf(r17)     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            r13.add(r0)     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
        L_0x01f3:
            int r1 = r1 + 1
            r15 = r16
            if (r1 < r12) goto L_0x01da
            double r0 = X.00k.A00(r13)     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            float r11 = (float) r0     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            int r0 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r0 < 0) goto L_0x0206
            java.lang.Integer r1 = X.AnonymousClass05K.A00     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            goto L_0x00ba
        L_0x0206:
            java.lang.Integer r1 = X.AnonymousClass05K.A01     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            goto L_0x00ba
        L_0x020a:
            int r2 = r2 + 1
        L_0x020c:
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            if (r1 != r0) goto L_0x0212
            int r8 = r8 + 1
        L_0x0212:
            if (r3 == r10) goto L_0x0217
            int r3 = r3 + r9
            goto L_0x003d
        L_0x0217:
            if (r2 == 0) goto L_0x021f
            float r3 = (float) r8     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            float r0 = (float) r2     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            float r3 = r3 / r0
            goto L_0x0220
        L_0x021d:
            if (r3 <= r10) goto L_0x003b
        L_0x021f:
            r3 = 0
        L_0x0220:
            X.0sP r1 = r7.A04     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            r0 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0229
            r5 = 0
        L_0x0229:
            X.C51968G9o.A1O(r1, r5)     // Catch:{ RuntimeException -> 0x0232, all -> 0x022d }
            goto L_0x0232
        L_0x022d:
            r0 = move-exception
            r6.release()     // Catch:{ Exception -> 0x0231 }
        L_0x0231:
            throw r0
        L_0x0232:
            r6.release()     // Catch:{ Exception -> 0x0235 }
        L_0x0235:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H8K.run():void");
    }
}
