package X;

import java.util.HashMap;

public final class MA8 implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C66371MPc A01;
    public final /* synthetic */ C66497MUa A02;
    public final /* synthetic */ C64103LMx A03;
    public final /* synthetic */ C63573KzM A04;
    public final /* synthetic */ C63875LAe A05;
    public final /* synthetic */ HashMap A06;

    public MA8(C66371MPc mPc, C66497MUa mUa, C64103LMx lMx, C63573KzM kzM, C63875LAe lAe, HashMap hashMap, long j) {
        this.A03 = lMx;
        this.A06 = hashMap;
        this.A02 = mUa;
        this.A01 = mPc;
        this.A05 = lAe;
        this.A04 = kzM;
        this.A00 = j;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Exception} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: X.Kkg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: X.Kkg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v7, resolved type: X.Kkg} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r25 = this;
            java.lang.String r12 = "processing_time"
            r13 = r25
            X.LMx r11 = r13.A03     // Catch:{ all -> 0x00c1 }
            X.L3A r3 = r11.A00     // Catch:{ all -> 0x00c1 }
            java.util.HashMap r10 = r13.A06     // Catch:{ all -> 0x00c1 }
            X.MPc r1 = r13.A01     // Catch:{ all -> 0x00c1 }
            java.lang.String r9 = "extra_info"
            java.lang.String r0 = ""
            r10.put(r9, r0)     // Catch:{ all -> 0x00c1 }
            java.lang.String r8 = "waterfall_id"
            java.lang.String r7 = "type_name"
            java.lang.String r6 = "integration_point"
            java.lang.String r5 = "null"
            java.util.HashMap r2 = X.Dba.A0f(r9, r5)     // Catch:{ all -> 0x00c1 }
            java.lang.String r0 = "input_media_info"
            r2.put(r0, r5)     // Catch:{ all -> 0x00c1 }
            r2.put(r6, r5)     // Catch:{ all -> 0x00c1 }
            r2.put(r7, r5)     // Catch:{ all -> 0x00c1 }
            r2.put(r8, r5)     // Catch:{ all -> 0x00c1 }
            java.util.HashMap r4 = r3.A01     // Catch:{ all -> 0x00c1 }
            r2.putAll(r4)     // Catch:{ all -> 0x00c1 }
            r2.putAll(r10)     // Catch:{ all -> 0x00c1 }
            X.Tj9 r3 = r3.A00     // Catch:{ all -> 0x00c1 }
            if (r3 == 0) goto L_0x003e
            java.lang.String r0 = "cvat_smartsdk_detection_started"
            r3.logEvent(r0, r2)     // Catch:{ all -> 0x00c1 }
        L_0x003e:
            X.MUa r0 = r13.A02     // Catch:{ all -> 0x00c1 }
            X.LAe r2 = r13.A05     // Catch:{ all -> 0x00c1 }
            X.MPd r17 = r0.detectMediaEvents(r1, r2)     // Catch:{ all -> 0x00c1 }
            java.util.Map r0 = r0.getLoggingParams()     // Catch:{ all -> 0x00c1 }
            r10.putAll(r0)     // Catch:{ all -> 0x00c1 }
            long r14 = r13.A00     // Catch:{ all -> 0x00c1 }
            java.util.concurrent.TimeUnit r16 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ all -> 0x00c1 }
            long r0 = java.lang.System.nanoTime()     // Catch:{ all -> 0x00c1 }
            long r0 = r0 - r14
            r14 = r16
            long r0 = r14.toMillis(r0)     // Catch:{ all -> 0x00c1 }
            int r14 = (int) r0     // Catch:{ all -> 0x00c1 }
            java.lang.String r0 = java.lang.String.valueOf(r14)     // Catch:{ all -> 0x00c1 }
            r10.put(r12, r0)     // Catch:{ all -> 0x00c1 }
            java.lang.String r15 = "video_duration"
            java.lang.String r14 = "error_code"
            java.lang.String r1 = "0"
            java.util.HashMap r0 = X.Dba.A0f(r12, r1)     // Catch:{ all -> 0x00c1 }
            r0.put(r15, r1)     // Catch:{ all -> 0x00c1 }
            r0.put(r14, r5)     // Catch:{ all -> 0x00c1 }
            r0.put(r6, r5)     // Catch:{ all -> 0x00c1 }
            r0.put(r9, r5)     // Catch:{ all -> 0x00c1 }
            r0.put(r7, r5)     // Catch:{ all -> 0x00c1 }
            r0.put(r8, r5)     // Catch:{ all -> 0x00c1 }
            r0.putAll(r4)     // Catch:{ all -> 0x00c1 }
            r0.putAll(r10)     // Catch:{ all -> 0x00c1 }
            if (r3 == 0) goto L_0x008d
            java.lang.String r1 = "cvat_smartsdk_detection_finished"
            r3.logEvent(r1, r0)     // Catch:{ all -> 0x00c1 }
        L_0x008d:
            java.util.concurrent.ConcurrentHashMap r1 = r11.A02     // Catch:{ all -> 0x00c1 }
            X.KzM r0 = r13.A04     // Catch:{ all -> 0x00c1 }
            r1.remove(r0)     // Catch:{ all -> 0x00c1 }
            X.Jfn r9 = r2.A04     // Catch:{ all -> 0x00c1 }
            X.0eM r0 = r9.A06     // Catch:{ all -> 0x00c1 }
            android.os.Handler r8 = X.JTO.A0E(r0)     // Catch:{ all -> 0x00c1 }
            X.0sP r7 = r2.A06     // Catch:{ all -> 0x00c1 }
            int r6 = r2.A01     // Catch:{ all -> 0x00c1 }
            X.0sL r5 = r2.A07     // Catch:{ all -> 0x00c1 }
            float r4 = r2.A00     // Catch:{ all -> 0x00c1 }
            int r3 = r2.A03     // Catch:{ all -> 0x00c1 }
            int r1 = r2.A02     // Catch:{ all -> 0x00c1 }
            X.MAE r0 = new X.MAE     // Catch:{ all -> 0x00c1 }
            r18 = r9
            r19 = r7
            r20 = r5
            r21 = r4
            r22 = r6
            r23 = r3
            r24 = r1
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x00c1 }
            r8.post(r0)     // Catch:{ all -> 0x00c1 }
            return
        L_0x00c1:
            r14 = move-exception
            boolean r0 = r14 instanceof X.C62680Kkg
            if (r0 == 0) goto L_0x0167
            X.Kkg r14 = (X.C62680Kkg) r14
        L_0x00c8:
            X.LMx r4 = r13.A03
            X.L3A r6 = r4.A00
            java.util.HashMap r5 = r13.A06
            X.MUa r0 = r13.A02
            long r2 = r13.A00
            java.util.Map r0 = r0.getLoggingParams()
            r5.putAll(r0)
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r0 = java.lang.System.nanoTime()
            long r0 = r0 - r2
            long r0 = r7.toMillis(r0)
            int r2 = (int) r0
            java.lang.String r0 = java.lang.String.valueOf(r2)
            r5.put(r12, r0)
            java.lang.String r0 = r14.getMessage()
            if (r0 != 0) goto L_0x00f4
            java.lang.String r0 = ""
        L_0x00f4:
            java.lang.String r11 = "error_code"
            r5.put(r11, r0)
            java.lang.String r1 = X.JTS.A0l(r14)
            X.0qQ.A07(r1)
            r0 = 85
            java.lang.String r10 = X.Pxd.A00(r0)
            r5.put(r10, r1)
            java.lang.String r2 = "video_duration"
            java.lang.String r9 = "waterfall_id"
            java.lang.String r8 = "extra_info"
            java.lang.String r7 = "type_name"
            java.lang.String r3 = "integration_point"
            java.lang.String r1 = "0"
            java.lang.String r0 = "null"
            java.util.HashMap r2 = X.Dba.A0f(r2, r1)
            r2.put(r12, r1)
            r2.put(r11, r0)
            r2.put(r10, r0)
            r2.put(r3, r0)
            r2.put(r8, r0)
            r2.put(r7, r0)
            r2.put(r9, r0)
            java.util.HashMap r0 = r6.A01
            r2.putAll(r0)
            r2.putAll(r5)
            X.Tj9 r1 = r6.A00
            if (r1 == 0) goto L_0x0141
            java.lang.String r0 = "cvat_smartsdk_detection_failed"
            r1.logEvent(r0, r2)
        L_0x0141:
            java.util.concurrent.ConcurrentHashMap r1 = r4.A02
            X.KzM r0 = r13.A04
            r1.remove(r0)
            X.LAe r4 = r13.A05
            X.Jfn r15 = r4.A04
            X.0eM r0 = r15.A06
            android.os.Handler r3 = X.JTO.A0E(r0)
            X.0sP r2 = r4.A05
            int r1 = r4.A01
            X.0sP r0 = r4.A06
            X.M9s r13 = new X.M9s
            r17 = r0
            r18 = r1
            r16 = r2
            r13.<init>(r14, r15, r16, r17, r18)
            r3.post(r13)
            return
        L_0x0167:
            java.lang.String r1 = "Runtime Error: "
            java.lang.String r0 = r14.getMessage()
            if (r0 != 0) goto L_0x0171
            java.lang.String r0 = ""
        L_0x0171:
            java.lang.String r1 = X.002.A0R(r1, r0)
            X.Kkg r0 = new X.Kkg
            r0.<init>(r1, r14)
            r14 = r0
            goto L_0x00c8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MA8.run():void");
    }
}
