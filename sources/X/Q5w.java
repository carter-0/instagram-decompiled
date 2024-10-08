package X;

import android.content.BroadcastReceiver;

public final class Q5w extends BroadcastReceiver {
    public final /* synthetic */ C12011SkV A00;

    public Q5w(C12011SkV skV) {
        this.A00 = skV;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b7, code lost:
        if (r0.compareTo(r1) > 0) goto L_0x00b9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onReceive(android.content.Context r10, android.content.Intent r11) {
        /*
            r9 = this;
            r0 = 953715279(0x38d88a4f, float:1.03254446E-4)
            int r3 = X.C66580MXl.A03(r9, r10, r11, r0)
            if (r11 != 0) goto L_0x0010
            r0 = -1215372482(0xffffffffb78ee33e, float:-1.7033537E-5)
        L_0x000c:
            X.AnonymousClass0fD.A0E(r0, r3, r11)
            return
        L_0x0010:
            java.lang.String r0 = "uploader_service_broadcast_auth_token"
            android.os.Parcelable r0 = r11.getParcelableExtra(r0)
            if (r0 == 0) goto L_0x00f6
            android.app.PendingIntent r0 = (android.app.PendingIntent) r0
            java.lang.String r1 = r0.getCreatorPackage()
            java.lang.String r0 = r10.getPackageName()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00f6
            android.os.Bundle r5 = r11.getExtras()
            java.lang.String r0 = "job_id"
            r2 = -1
            int r4 = r5.getInt(r0, r2)
            java.lang.String r0 = "hack_action"
            java.lang.String r7 = r5.getString(r0)
            java.lang.String r0 = "will_retry"
            boolean r8 = r5.getBoolean(r0)
            java.lang.String r0 = "successful_processes"
            java.util.ArrayList r1 = r5.getStringArrayList(r0)
            java.lang.String r0 = "newest_files_uploaded"
            java.util.ArrayList r0 = r5.getStringArrayList(r0)
            X.01r r6 = X.C253773rO.A00(r1, r0)
            if (r4 == r2) goto L_0x0105
            X.SkV r2 = r9.A00
            int r0 = r2.A08
            if (r4 == r0) goto L_0x005f
            r0 = 1548969024(0x5c536440, float:2.38005785E17)
            goto L_0x000c
        L_0x005f:
            java.lang.String r4 = "UploadManager"
            if (r7 == 0) goto L_0x0092
            monitor-enter(r2)
            boolean r0 = r2.A07     // Catch:{ all -> 0x00fb }
            if (r0 == 0) goto L_0x007f
            r0 = 1189(0x4a5, float:1.666E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x00fb }
            boolean r0 = r0.equals(r7)     // Catch:{ all -> 0x00fb }
            if (r0 == 0) goto L_0x007f
            X.3n5 r5 = X.C251423n5.A01()     // Catch:{ all -> 0x00fb }
            android.content.Context r1 = r2.A09     // Catch:{ all -> 0x00fb }
            boolean r0 = r2.A0E     // Catch:{ all -> 0x00fb }
            r5.A04(r1, r0)     // Catch:{ all -> 0x00fb }
        L_0x007f:
            monitor-exit(r2)
            if (r8 != 0) goto L_0x00f1
            monitor-enter(r2)
            java.lang.String r0 = r2.A04     // Catch:{ all -> 0x00fb }
            if (r0 == 0) goto L_0x0090
            boolean r0 = r0.equals(r7)     // Catch:{ all -> 0x00fb }
            if (r0 == 0) goto L_0x0090
            r0 = 0
            r2.A04 = r0     // Catch:{ all -> 0x00fb }
        L_0x0090:
            monitor-exit(r2)
            goto L_0x0097
        L_0x0092:
            if (r8 != 0) goto L_0x00f1
            X.C12011SkV.A01(r2)
        L_0x0097:
            java.lang.String r0 = X.AnonymousClass1Uu.A00()
            if (r0 == 0) goto L_0x00f1
            int r0 = r6.A03(r0)
            if (r0 < 0) goto L_0x00f1
            java.lang.Object r1 = r6.A06(r0)
            java.io.File r1 = (java.io.File) r1
            monitor-enter(r2)     // Catch:{ NullPointerException -> 0x00de }
            java.io.File r0 = r2.A02     // Catch:{ all -> 0x00db }
            if (r1 != 0) goto L_0x00b1
            if (r0 != 0) goto L_0x00b9
            goto L_0x00bd
        L_0x00b1:
            if (r0 == 0) goto L_0x00bd
            int r0 = r0.compareTo(r1)     // Catch:{ all -> 0x00db }
            if (r0 <= 0) goto L_0x00bd
        L_0x00b9:
            r2.Crk()     // Catch:{ all -> 0x00db }
            goto L_0x00c7
        L_0x00bd:
            java.io.File r0 = r2.A03     // Catch:{ all -> 0x00db }
            if (r1 != 0) goto L_0x00c2
            goto L_0x00c5
        L_0x00c2:
            if (r0 == 0) goto L_0x00c7
            goto L_0x00c9
        L_0x00c5:
            if (r0 != 0) goto L_0x00cf
        L_0x00c7:
            r0 = 0
            goto L_0x00d3
        L_0x00c9:
            int r0 = r0.compareTo(r1)     // Catch:{ all -> 0x00db }
            if (r0 <= 0) goto L_0x00c7
        L_0x00cf:
            r2.Cro()     // Catch:{ all -> 0x00db }
            goto L_0x00c7
        L_0x00d3:
            r2.A02 = r0     // Catch:{ all -> 0x00d9 }
            r2.A03 = r0     // Catch:{ all -> 0x00d9 }
            monitor-exit(r2)     // Catch:{ NullPointerException -> 0x00de }
            goto L_0x00f1
        L_0x00d9:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00db }
        L_0x00db:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ NullPointerException -> 0x00de }
            throw r0     // Catch:{ NullPointerException -> 0x00de }
        L_0x00de:
            r2 = move-exception
            java.lang.String r1 = r2.getMessage()
            java.lang.String r0 = "Attempt to invoke virtual method 'int com.android.server.job.controllers.JobStatus.getUid()' on a null object reference"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x00fe
            java.lang.String r0 = "system error while performing catch-up scheduling"
            X.0KC.A0K(r4, r0, r2)
        L_0x00f1:
            r0 = 141017543(0x867c1c7, float:6.974182E-34)
            goto L_0x000c
        L_0x00f6:
            r0 = -1536705155(0xffffffffa467bd7d, float:-5.0250643E-17)
            goto L_0x000c
        L_0x00fb:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x00fe:
            r0 = 1945895144(0x73fc00e8, float:3.9931555E31)
            X.AnonymousClass0fD.A0E(r0, r3, r11)
            throw r2
        L_0x0105:
            java.lang.String r0 = "jobId = -1"
            java.lang.IllegalArgumentException r2 = X.AnonymousClass7TE.A0w(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q5w.onReceive(android.content.Context, android.content.Intent):void");
    }
}
