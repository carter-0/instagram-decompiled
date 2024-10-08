package X;

import android.app.job.JobParameters;
import com.facebook.voltron.download.scheduledinstaller.OxygenScheduledInstallerJobService;

/* renamed from: X.TGk  reason: case insensitive filesystem */
public final class C12977TGk implements Runnable {
    public final /* synthetic */ JobParameters A00;
    public final /* synthetic */ OxygenScheduledInstallerJobService A01;

    public C12977TGk(JobParameters jobParameters, OxygenScheduledInstallerJobService oxygenScheduledInstallerJobService) {
        this.A01 = oxygenScheduledInstallerJobService;
        this.A00 = jobParameters;
    }

    /* JADX WARNING: type inference failed for: r3v4, types: [X.1Tr, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        if (r3 == false) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r11 = this;
            com.facebook.voltron.download.scheduledinstaller.OxygenScheduledInstallerJobService r9 = r11.A01
            android.app.job.JobParameters r10 = r11.A00
            X.1Uf r0 = r9.A01
            if (r0 != 0) goto L_0x0012
            java.lang.String r0 = "lightSharedPreferencesFactory"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0012:
            java.util.List r4 = r9.A00(r0)
            boolean r0 = r4.isEmpty()
            r3 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001f
            r3 = 0
        L_0x001f:
            android.content.pm.PackageManager r0 = r9.getPackageManager()
            X.0qQ.A07(r0)
            boolean r0 = X.1SD.A02(r9, r0)
            if (r0 != 0) goto L_0x002d
            r3 = 0
        L_0x002d:
            boolean r1 = r10.isOverrideDeadlineExpired()
            if (r1 == 0) goto L_0x0034
            r3 = 0
        L_0x0034:
            android.content.Context r0 = X.DbT.A05(r9)
            boolean r0 = X.C11293SKb.A01(r0)
            if (r0 == 0) goto L_0x0047
            r1 = 0
        L_0x003f:
            r9.jobFinished(r10, r1)
        L_0x0042:
            if (r2 == 0) goto L_0x00dd
            java.lang.String r5 = "OxygenScheduledInstallerJobService"
            goto L_0x004b
        L_0x0047:
            r2 = r3
            if (r3 != 0) goto L_0x0042
            goto L_0x003f
        L_0x004b:
            X.SoO r0 = new X.SoO     // Catch:{ UnsupportedOperationException -> 0x00d7, DeadObjectException -> 0x00d0, all -> 0x00cc }
            r0.<init>()     // Catch:{ UnsupportedOperationException -> 0x00d7, DeadObjectException -> 0x00d0, all -> 0x00cc }
            X.1Tr r3 = new X.1Tr     // Catch:{ UnsupportedOperationException -> 0x00d7, DeadObjectException -> 0x00d0, all -> 0x00cc }
            r3.<init>()     // Catch:{ UnsupportedOperationException -> 0x00d7, DeadObjectException -> 0x00d0, all -> 0x00cc }
            r3.A00 = r0     // Catch:{ UnsupportedOperationException -> 0x00d7, DeadObjectException -> 0x00d0, all -> 0x00cc }
            android.content.ContentResolver r2 = r9.getContentResolver()     // Catch:{ UnsupportedOperationException -> 0x00d7, DeadObjectException -> 0x00d0, all -> 0x00cc }
            monitor-enter(r9)     // Catch:{ UnsupportedOperationException -> 0x00d7, DeadObjectException -> 0x00d0, all -> 0x00cc }
            android.os.HandlerThread r0 = r9.A00     // Catch:{ all -> 0x00c9 }
            if (r0 == 0) goto L_0x0066
            android.os.Looper r0 = r0.getLooper()     // Catch:{ all -> 0x00c9 }
            if (r0 != 0) goto L_0x0071
        L_0x0066:
            java.lang.String r0 = "OxygenSessionStateThread"
            android.os.HandlerThread r0 = X.Pxf.A0I(r0)     // Catch:{ all -> 0x00c9 }
            r9.A00 = r0     // Catch:{ all -> 0x00c9 }
            r0.start()     // Catch:{ all -> 0x00c9 }
        L_0x0071:
            android.os.HandlerThread r0 = r9.A00     // Catch:{ all -> 0x00c9 }
            if (r0 != 0) goto L_0x0080
            java.lang.String r0 = "oxygenHandlerThread"
            X.0qQ.A0F(r0)     // Catch:{ all -> 0x00c9 }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ all -> 0x00c9 }
            throw r0     // Catch:{ all -> 0x00c9 }
        L_0x0080:
            monitor-exit(r9)     // Catch:{ UnsupportedOperationException -> 0x00d7, DeadObjectException -> 0x00d0, all -> 0x00cc }
            android.os.Handler r1 = X.Pxf.A0H(r0)     // Catch:{ UnsupportedOperationException -> 0x00d7, DeadObjectException -> 0x00d0, all -> 0x00cc }
            X.1SD r0 = new X.1SD     // Catch:{ UnsupportedOperationException -> 0x00d7, DeadObjectException -> 0x00d0, all -> 0x00cc }
            r0.<init>(r2, r9, r1, r3)     // Catch:{ UnsupportedOperationException -> 0x00d7, DeadObjectException -> 0x00d0, all -> 0x00cc }
            long r7 = r0.A03(r4)     // Catch:{ UnsupportedOperationException -> 0x00d7, DeadObjectException -> 0x00d0, all -> 0x00cc }
            X.SoJ r6 = r9.A02     // Catch:{ UnsupportedOperationException -> 0x00d7, DeadObjectException -> 0x00d0, all -> 0x00cc }
            if (r6 != 0) goto L_0x0099
            X.SoJ r6 = new X.SoJ     // Catch:{ UnsupportedOperationException -> 0x00d7, DeadObjectException -> 0x00d0, all -> 0x00cc }
            r6.<init>(r9, r0)     // Catch:{ UnsupportedOperationException -> 0x00d7, DeadObjectException -> 0x00d0, all -> 0x00cc }
            r9.A02 = r6     // Catch:{ UnsupportedOperationException -> 0x00d7, DeadObjectException -> 0x00d0, all -> 0x00cc }
        L_0x0099:
            r0.A04(r6)     // Catch:{ UnsupportedOperationException -> 0x00d7, DeadObjectException -> 0x00d0, all -> 0x00cc }
            X.PyE r4 = new X.PyE     // Catch:{ UnsupportedOperationException -> 0x00d7, DeadObjectException -> 0x00d0, all -> 0x00cc }
            r4.<init>()     // Catch:{ UnsupportedOperationException -> 0x00d7, DeadObjectException -> 0x00d0, all -> 0x00cc }
            X.PyF r3 = r4.A00     // Catch:{ UnsupportedOperationException -> 0x00d7, DeadObjectException -> 0x00d0, all -> 0x00cc }
            java.util.concurrent.ExecutorService r2 = r9.A03     // Catch:{ UnsupportedOperationException -> 0x00d7, DeadObjectException -> 0x00d0, all -> 0x00cc }
            if (r2 != 0) goto L_0x00b1
            java.lang.String r0 = "backgroundExecutorService"
            X.0qQ.A0F(r0)     // Catch:{ UnsupportedOperationException -> 0x00d7, DeadObjectException -> 0x00d0, all -> 0x00cc }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            goto L_0x00cb
        L_0x00b1:
            r1 = 2
            X.AVv r0 = new X.AVv     // Catch:{ UnsupportedOperationException -> 0x00d7, DeadObjectException -> 0x00d0, all -> 0x00cc }
            r0.<init>(r1, r10, r9)     // Catch:{ UnsupportedOperationException -> 0x00d7, DeadObjectException -> 0x00d0, all -> 0x00cc }
            r3.A05(r0, r2)     // Catch:{ UnsupportedOperationException -> 0x00d7, DeadObjectException -> 0x00d0, all -> 0x00cc }
            monitor-enter(r6)     // Catch:{ UnsupportedOperationException -> 0x00d7, DeadObjectException -> 0x00d0, all -> 0x00cc }
            java.util.HashMap r1 = r6.A02     // Catch:{ all -> 0x00c6 }
            java.lang.Long r0 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x00c6 }
            r1.put(r0, r4)     // Catch:{ all -> 0x00c6 }
            monitor-exit(r6)     // Catch:{ UnsupportedOperationException -> 0x00d7, DeadObjectException -> 0x00d0, all -> 0x00cc }
            return
        L_0x00c6:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ UnsupportedOperationException -> 0x00d7, DeadObjectException -> 0x00d0, all -> 0x00cc }
            goto L_0x00cb
        L_0x00c9:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ UnsupportedOperationException -> 0x00d7, DeadObjectException -> 0x00d0, all -> 0x00cc }
        L_0x00cb:
            throw r0     // Catch:{ UnsupportedOperationException -> 0x00d7, DeadObjectException -> 0x00d0, all -> 0x00cc }
        L_0x00cc:
            r1 = move-exception
            java.lang.String r0 = "Exception calling constructModulesApi - don't know specific error"
            goto L_0x00da
        L_0x00d0:
            r1 = move-exception
            java.lang.String r0 = "DeadObjectException calling constructModulesApi"
            X.0KC.A0G(r5, r0, r1)
            return
        L_0x00d7:
            r1 = move-exception
            java.lang.String r0 = "UnsupportedOperationException calling constructModulesApi - ModulesApi is probably disabled"
        L_0x00da:
            X.0KC.A0G(r5, r0, r1)
        L_0x00dd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12977TGk.run():void");
    }
}
