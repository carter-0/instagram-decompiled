package X;

/* renamed from: X.9DC  reason: invalid class name */
public final class AnonymousClass9DC {
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(android.content.Context r13) {
        /*
            r12 = this;
            r3 = 0
            r1 = 0
            r7 = 0
            X.0qQ.A0B(r13, r7)
            com.facebook.quicklog.QuickPerformanceLogger r9 = com.facebook.quicklog.QuickPerformanceLoggerProvider.getQPLInstance()
            if (r9 != 0) goto L_0x0010
            X.0eg r9 = com.facebook.quicklog.QuickPerformanceLoggerProvider.A01
        L_0x0010:
            r8 = 813768254(0x30811e3e, float:9.394581E-10)
            r9.markerStart(r8)
            X.0eM r6 = X.AnonymousClass9D9.A00
            java.lang.Object r5 = r6.getValue()
            X.0xa r5 = (X.0xa) r5
            r0 = 1003(0x3eb, float:1.406E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r5.getBoolean(r0, r7)
            if (r0 == 0) goto L_0x0109
            java.lang.Object r5 = r6.getValue()
            X.0xa r5 = (X.0xa) r5
            r0 = 1002(0x3ea, float:1.404E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            long r10 = r5.getLong(r0, r3)
            java.lang.Object r5 = r6.getValue()
            X.0xa r5 = (X.0xa) r5
            r0 = 1001(0x3e9, float:1.403E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            long r5 = r5.getLong(r0, r3)
            int r0 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0109
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0109
            r3 = r5
            r1 = r10
            java.lang.String r0 = "jobscheduler"
            java.lang.Object r5 = r13.getSystemService(r0)
            boolean r0 = r5 instanceof android.app.job.JobScheduler
            if (r0 == 0) goto L_0x0073
            android.app.job.JobScheduler r5 = (android.app.job.JobScheduler) r5
            r7 = 1
            if (r5 == 0) goto L_0x0073
            java.util.List r5 = r5.getAllPendingJobs()
            if (r5 == 0) goto L_0x0073
            boolean r0 = r5 instanceof java.util.Collection
            if (r0 == 0) goto L_0x00eb
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x00eb
        L_0x0073:
            r5 = 1
        L_0x0074:
            java.lang.String r0 = "has_experiment_params"
            r9.markerAnnotate(r8, r0, r5)
            r6 = 2
            if (r5 == 0) goto L_0x00dc
            java.lang.String r0 = "jobscheduler"
            java.lang.Object r5 = r13.getSystemService(r0)
            boolean r0 = r5 instanceof android.app.job.JobScheduler
            if (r0 == 0) goto L_0x00e0
            android.app.job.JobScheduler r5 = (android.app.job.JobScheduler) r5
            if (r5 == 0) goto L_0x00e0
            java.lang.String r0 = "schedule_job_start"
            r9.markerPoint(r8, r0)
            android.os.PersistableBundle r7 = new android.os.PersistableBundle
            r7.<init>()
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.SECONDS
            long r0 = r10.toMillis(r1)
            r2 = 1749(0x6d5, float:2.451E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            r7.putLong(r2, r0)
            java.lang.Class<com.instagram.push.RefreshPushTokenJobService> r0 = com.instagram.push.RefreshPushTokenJobService.class
            android.content.ComponentName r1 = new android.content.ComponentName
            r1.<init>(r13, r0)
            r0 = 1560068420(0x5cfcc144, float:5.69153535E17)
            android.app.job.JobInfo$Builder r2 = new android.app.job.JobInfo$Builder
            r2.<init>(r0, r1)
            long r0 = X.AnonymousClass9DB.A00
            r11 = 1
            android.app.job.JobInfo$Builder r2 = r2.setBackoffCriteria(r0, r11)
            long r0 = r10.toMillis(r3)
            android.app.job.JobInfo$Builder r0 = r2.setPeriodic(r0)
            android.app.job.JobInfo$Builder r0 = r0.setPersisted(r11)
            android.app.job.JobInfo$Builder r0 = r0.setRequiredNetworkType(r11)
            android.app.job.JobInfo$Builder r0 = r0.setExtras(r7)
            android.app.job.JobInfo r0 = r0.build()
            X.0qQ.A07(r0)
            r5.schedule(r0)
            java.lang.String r0 = "schedule_job_end"
            r9.markerPoint(r8, r0)
        L_0x00dc:
            r9.markerEnd(r8, r6)
            return
        L_0x00e0:
            r1 = 1
            java.lang.String r0 = "no_job_scheduler"
            r9.markerAnnotate(r8, r0, r1)
            r0 = 3
            r9.markerEnd(r8, r0)
            goto L_0x00dc
        L_0x00eb:
            java.util.Iterator r6 = r5.iterator()
        L_0x00ef:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0073
            java.lang.Object r0 = r6.next()
            android.app.job.JobInfo r0 = (android.app.job.JobInfo) r0
            int r5 = r0.getId()
            r0 = 1560068420(0x5cfcc144, float:5.69153535E17)
            if (r5 != r0) goto L_0x00ef
            java.lang.String r0 = "skipped_due_to_existing_job"
            r9.markerAnnotate(r8, r0, r7)
        L_0x0109:
            r5 = 0
            goto L_0x0074
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9DC.A00(android.content.Context):void");
    }
}
