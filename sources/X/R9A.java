package X;

import java.io.File;

public final class R9A extends C67620Mqs {
    public long A00;
    public LP1 A01;
    public File A02;
    public double[] A03;

    /* JADX WARNING: Can't wrap try/catch for region: R(2:36|37) */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0119, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x011a, code lost:
        if (r8 != null) goto L_0x011c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x011c, code lost:
        r8.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x011f, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x010f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object A03(java.lang.Object[] r16) {
        /*
            r15 = this;
            r14 = 0
            r8 = 0
            java.lang.String r0 = "keyframe_data_task"
            X.Q0V r8 = X.Q0V.A00(r0)     // Catch:{ IOException -> 0x010f }
            java.io.File r9 = r15.A02     // Catch:{ IOException -> 0x010f }
            java.lang.String r0 = r9.getAbsolutePath()     // Catch:{ IOException -> 0x010f }
            r8.ETt(r0)     // Catch:{ IOException -> 0x010f }
            android.media.MediaExtractor r0 = r8.A00     // Catch:{ IOException -> 0x010f }
            int r3 = r0.getTrackCount()     // Catch:{ IOException -> 0x010f }
            r2 = 0
        L_0x0018:
            if (r2 >= r3) goto L_0x0036
            android.media.MediaExtractor r0 = r8.A00     // Catch:{ IOException -> 0x010f }
            android.media.MediaFormat r1 = r0.getTrackFormat(r2)     // Catch:{ IOException -> 0x010f }
            java.lang.String r0 = "mime"
            java.lang.String r1 = r1.getString(r0)     // Catch:{ IOException -> 0x010f }
            r1.getClass()     // Catch:{ IOException -> 0x010f }
            java.lang.String r0 = "video/"
            boolean r0 = r1.startsWith(r0)     // Catch:{ IOException -> 0x010f }
            if (r0 == 0) goto L_0x003b
            r8.ELD(r2)     // Catch:{ IOException -> 0x010f }
        L_0x0036:
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException -> 0x010f }
            goto L_0x003e
        L_0x003b:
            int r2 = r2 + 1
            goto L_0x0018
        L_0x003e:
            r12 = -1
            r0 = -1
            goto L_0x0054
        L_0x0043:
            double r2 = (double) r0     // Catch:{ IOException -> 0x010f }
            double r2 = r2 / r10
            X.Pxf.A1Q(r7, r2)     // Catch:{ IOException -> 0x010f }
        L_0x0048:
            r8.AAt()     // Catch:{ IOException -> 0x010f }
            android.media.MediaExtractor r2 = r8.A00     // Catch:{ IOException -> 0x010f }
            long r2 = r2.getSampleTime()     // Catch:{ IOException -> 0x010f }
            r8.EL0(r2, r6)     // Catch:{ IOException -> 0x010f }
        L_0x0054:
            android.media.MediaExtractor r2 = r8.A00     // Catch:{ IOException -> 0x010f }
            long r3 = r2.getSampleTime()     // Catch:{ IOException -> 0x010f }
            r10 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            r6 = 1
            int r2 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r2 == 0) goto L_0x007f
            android.media.MediaExtractor r2 = r8.A00     // Catch:{ IOException -> 0x010f }
            long r3 = r2.getSampleTime()     // Catch:{ IOException -> 0x010f }
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x007f
            android.media.MediaExtractor r0 = r8.A00     // Catch:{ IOException -> 0x010f }
            long r0 = r0.getSampleTime()     // Catch:{ IOException -> 0x010f }
            android.media.MediaExtractor r2 = r8.A00     // Catch:{ IOException -> 0x010f }
            int r2 = r2.getSampleFlags()     // Catch:{ IOException -> 0x010f }
            r2 = r2 & 1
            if (r2 <= 0) goto L_0x0048
            goto L_0x0043
        L_0x007f:
            int r1 = r7.size()     // Catch:{ IOException -> 0x010f }
            r0 = 5
            if (r1 >= r0) goto L_0x00b5
            r7.clear()     // Catch:{ IOException -> 0x010f }
            r4 = 0
            r8.EL0(r4, r6)     // Catch:{ IOException -> 0x010f }
        L_0x008e:
            android.media.MediaExtractor r0 = r8.A00     // Catch:{ IOException -> 0x010f }
            long r1 = r0.getSampleTime()     // Catch:{ IOException -> 0x010f }
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x00ad
            android.media.MediaExtractor r0 = r8.A00     // Catch:{ IOException -> 0x010f }
            int r0 = r0.getSampleFlags()     // Catch:{ IOException -> 0x010f }
            r0 = r0 & 1
            if (r0 <= 0) goto L_0x00ad
            android.media.MediaExtractor r0 = r8.A00     // Catch:{ IOException -> 0x010f }
            long r2 = r0.getSampleTime()     // Catch:{ IOException -> 0x010f }
            double r0 = (double) r2     // Catch:{ IOException -> 0x010f }
            double r0 = r0 / r10
            X.Pxf.A1Q(r7, r0)     // Catch:{ IOException -> 0x010f }
        L_0x00ad:
            android.media.MediaExtractor r0 = r8.A00     // Catch:{ IOException -> 0x010f }
            boolean r0 = r0.advance()     // Catch:{ IOException -> 0x010f }
            if (r0 != 0) goto L_0x008e
        L_0x00b5:
            int r4 = r7.size()     // Catch:{ IOException -> 0x010f }
            double[] r3 = new double[r4]     // Catch:{ IOException -> 0x010f }
            r15.A03 = r3     // Catch:{ IOException -> 0x010f }
            r2 = 0
        L_0x00be:
            int r0 = r7.size()     // Catch:{ IOException -> 0x010f }
            if (r2 >= r0) goto L_0x00d3
            java.lang.Object r0 = r7.get(r2)     // Catch:{ IOException -> 0x010f }
            java.lang.Double r0 = (java.lang.Double) r0     // Catch:{ IOException -> 0x010f }
            double r0 = r0.doubleValue()     // Catch:{ IOException -> 0x010f }
            r3[r2] = r0     // Catch:{ IOException -> 0x010f }
            int r2 = r2 + 1
            goto L_0x00be
        L_0x00d3:
            if (r4 != 0) goto L_0x010a
            java.lang.String r5 = "no_sync_sample_times_for_video"
            java.lang.StringBuilder r4 = X.AnonymousClass7TE.A1A()     // Catch:{ IOException -> 0x010f }
            java.lang.String r0 = "Size: "
            r4.append(r0)     // Catch:{ IOException -> 0x010f }
            long r2 = r9.length()     // Catch:{ IOException -> 0x010f }
            r0 = 1024(0x400, double:5.06E-321)
            long r2 = r2 / r0
            r4.append(r2)     // Catch:{ IOException -> 0x010f }
            java.lang.String r0 = " KB Duration: "
            r4.append(r0)     // Catch:{ IOException -> 0x010f }
            long r0 = r15.A00     // Catch:{ IOException -> 0x010f }
            r4.append(r0)     // Catch:{ IOException -> 0x010f }
            java.lang.String r0 = " ms Path: "
            r4.append(r0)     // Catch:{ IOException -> 0x010f }
            java.lang.String r0 = r9.getAbsolutePath()     // Catch:{ IOException -> 0x010f }
            java.lang.String r0 = X.AnonymousClass7TF.A0l(r0, r4)     // Catch:{ IOException -> 0x010f }
            X.0wb.A03(r5, r0)     // Catch:{ IOException -> 0x010f }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r14)     // Catch:{ IOException -> 0x010f }
            goto L_0x0115
        L_0x010a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)     // Catch:{ IOException -> 0x010f }
            goto L_0x0115
        L_0x010f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r14)     // Catch:{ all -> 0x0119 }
            if (r8 == 0) goto L_0x0118
        L_0x0115:
            r8.release()
        L_0x0118:
            return r0
        L_0x0119:
            r0 = move-exception
            if (r8 == 0) goto L_0x011f
            r8.release()
        L_0x011f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.R9A.A03(java.lang.Object[]):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ void A05(Object obj) {
        if (AnonymousClass7TE.A1a(obj)) {
            LP1 lp1 = this.A01;
            double[] dArr = this.A03;
            dArr.getClass();
            lp1.A03 = dArr;
            MUV muv = lp1.A02;
            if (muv != null) {
                muv.Dq5(dArr);
            }
        }
    }
}
