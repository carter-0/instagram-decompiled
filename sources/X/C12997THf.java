package X;

/* renamed from: X.THf  reason: case insensitive filesystem */
public final class C12997THf implements Runnable {
    public final /* synthetic */ C10313RqB A00;
    public final /* synthetic */ SOU A01;

    public C12997THf(C10313RqB rqB, SOU sou) {
        this.A01 = sou;
        this.A00 = rqB;
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [X.S2B, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v5, types: [X.S2B, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v5, types: [android.app.job.JobService] */
    /* JADX WARNING: type inference failed for: r2v7, types: [X.S2B, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v6, types: [android.app.job.JobService] */
    /* JADX WARNING: type inference failed for: r2v8, types: [X.S2B, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v8, types: [android.app.job.JobService] */
    /* JADX WARNING: type inference failed for: r2v9, types: [X.S2B, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r9 = this;
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            X.SOU r4 = r9.A01
            java.util.List r0 = r4.A0D
            java.util.Iterator r8 = r0.iterator()
        L_0x000c:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00e7
            int r3 = X.AnonymousClass7TG.A0F(r8)
            java.lang.String r0 = "IgBgFetchServiceStatic-"
            java.lang.String r2 = X.002.A0O(r0, r3)
            X.RqB r1 = r9.A00
            r0 = 783382999(0x2eb179d7, float:8.070671E-11)
            X.0fh.A01(r2, r0)
            android.content.Context r7 = r4.A05     // Catch:{ all -> 0x00df }
            com.instagram.common.session.UserSession r6 = r4.A07     // Catch:{ all -> 0x00df }
            if (r3 == 0) goto L_0x0085
            r0 = 1
            if (r3 == r0) goto L_0x0065
            r0 = 2
            if (r3 == r0) goto L_0x004e
            r0 = 3
            if (r3 == r0) goto L_0x0037
            r0 = 4
            if (r3 != r0) goto L_0x00cc
            goto L_0x00a6
        L_0x0037:
            r0 = 2131432736(0x7f0b1520, float:1.8487238E38)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00df }
            com.instagram.util.offline.MainFeedBackgroundPrefetchJobService r1 = new com.instagram.util.offline.MainFeedBackgroundPrefetchJobService     // Catch:{ all -> 0x00df }
            r1.<init>()     // Catch:{ all -> 0x00df }
            X.S2B r2 = new X.S2B     // Catch:{ all -> 0x00df }
            r2.<init>()     // Catch:{ all -> 0x00df }
            X.T8O r0 = new X.T8O     // Catch:{ all -> 0x00df }
            r0.<init>(r2)     // Catch:{ all -> 0x00df }
            goto L_0x00bc
        L_0x004e:
            r0 = 2131428556(0x7f0b04cc, float:1.847876E38)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00df }
            com.instagram.util.offline.BackgroundPrefetchJobService r1 = new com.instagram.util.offline.BackgroundPrefetchJobService     // Catch:{ all -> 0x00df }
            r1.<init>()     // Catch:{ all -> 0x00df }
            X.S2B r2 = new X.S2B     // Catch:{ all -> 0x00df }
            r2.<init>()     // Catch:{ all -> 0x00df }
            X.T8O r0 = new X.T8O     // Catch:{ all -> 0x00df }
            r0.<init>(r2)     // Catch:{ all -> 0x00df }
            goto L_0x00bc
        L_0x0065:
            X.5EZ r0 = X.C10035RlX.A00     // Catch:{ all -> 0x00df }
            com.instagram.jobscheduler.bgfetch.IgBgFetchMetadata r0 = r1.A00     // Catch:{ all -> 0x00df }
            java.util.List r0 = r0.A01     // Catch:{ all -> 0x00df }
            boolean r0 = X.AnonymousClass7TE.A1b(r0)     // Catch:{ all -> 0x00df }
            if (r0 != 0) goto L_0x009d
            X.S2B r2 = new X.S2B     // Catch:{ all -> 0x00df }
            r2.<init>()     // Catch:{ all -> 0x00df }
            X.5EZ r1 = X.C10035RlX.A00     // Catch:{ all -> 0x00df }
            X.T7o r0 = new X.T7o     // Catch:{ all -> 0x00df }
            r0.<init>(r2)     // Catch:{ all -> 0x00df }
            r1.A00(r0)     // Catch:{ all -> 0x00df }
            X.TVc r0 = X.C13329TVc.A00     // Catch:{ all -> 0x00df }
            r2.A01 = r0     // Catch:{ all -> 0x00df }
            goto L_0x00bf
        L_0x0085:
            com.instagram.jobscheduler.bgfetch.IgBgFetchMetadata r0 = r1.A00     // Catch:{ all -> 0x00df }
            java.util.List r0 = r0.A01     // Catch:{ all -> 0x00df }
            boolean r0 = X.AnonymousClass7TE.A1b(r0)     // Catch:{ all -> 0x00df }
            if (r0 != 0) goto L_0x009d
            java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00df }
            X.0xa r3 = X.AnonymousClass7TE.A0q(r6)     // Catch:{ all -> 0x00df }
            java.lang.String r2 = "last_ccu_timestamp_with_jobscheduler"
            r0 = 0
            r3.getLong(r2, r0)     // Catch:{ all -> 0x00df }
        L_0x009d:
            X.S2B r2 = new X.S2B     // Catch:{ all -> 0x00df }
            r2.<init>()     // Catch:{ all -> 0x00df }
            r2.A00()     // Catch:{ all -> 0x00df }
            goto L_0x00bf
        L_0x00a6:
            r0 = 2131441872(0x7f0b38d0, float:1.8505768E38)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00df }
            com.instagram.util.offline.StoryBackgroundPrefetchJobService r1 = new com.instagram.util.offline.StoryBackgroundPrefetchJobService     // Catch:{ all -> 0x00df }
            r1.<init>()     // Catch:{ all -> 0x00df }
            X.S2B r2 = new X.S2B     // Catch:{ all -> 0x00df }
            r2.<init>()     // Catch:{ all -> 0x00df }
            X.T8O r0 = new X.T8O     // Catch:{ all -> 0x00df }
            r0.<init>(r2)     // Catch:{ all -> 0x00df }
        L_0x00bc:
            com.instagram.util.offline.BackgroundPrefetchJobService.A00(r7, r6, r0, r1, r3)     // Catch:{ all -> 0x00df }
        L_0x00bf:
            r2.A00 = r4     // Catch:{ all -> 0x00df }
            r5.add(r2)     // Catch:{ all -> 0x00df }
            r0 = -1681129606(0xffffffff9bcbff7a, float:-3.374863E-22)
            X.0fh.A00(r0)
            goto L_0x000c
        L_0x00cc:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x00df }
            java.lang.Object[] r1 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x00df }
            r0 = 2383(0x94f, float:3.339E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x00df }
            java.lang.IllegalArgumentException r0 = X.Pxf.A0X(r0, r1)     // Catch:{ all -> 0x00df }
            throw r0     // Catch:{ all -> 0x00df }
        L_0x00df:
            r1 = move-exception
            r0 = -843407931(0xffffffffcdba9dc5, float:-3.9136272E8)
            X.0fh.A00(r0)
            throw r1
        L_0x00e7:
            X.4Cq r3 = r4.A0E
            r2 = 0
            r1 = 0
            X.WvV r0 = new X.WvV
            r0.<init>(r4, r5, r2, r1)
            X.AnonymousClass7TE.A1Z(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12997THf.run():void");
    }
}
