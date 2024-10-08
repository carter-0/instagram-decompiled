package com.instagram.pendingmedia.service.impl;

import X.0sL;
import X.AnonymousClass1Ek;
import X.AnonymousClass3Q2;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C2373837k;
import X.C60340gF;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.store.PendingMediaStore;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.pendingmedia.service.impl.PendingMediaTaskKt$uploadPendingMedia$2", f = "PendingMediaTask.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
public final class PendingMediaTaskKt$uploadPendingMedia$2 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ Context A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ AnonymousClass3Q2 A05;
    public final /* synthetic */ C2373837k A06;
    public final /* synthetic */ MediaUploader A07;
    public final /* synthetic */ PendingMediaStore A08;
    public final /* synthetic */ String A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PendingMediaTaskKt$uploadPendingMedia$2(Context context, UserSession userSession, AnonymousClass3Q2 r4, C2373837k r5, MediaUploader mediaUploader, PendingMediaStore pendingMediaStore, String str, AnonymousClass4D7 r9, int i, int i2) {
        super(2, r9);
        this.A03 = context;
        this.A04 = userSession;
        this.A01 = i;
        this.A08 = pendingMediaStore;
        this.A05 = r4;
        this.A06 = r5;
        this.A02 = i2;
        this.A07 = mediaUploader;
        this.A09 = str;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.pendingmedia.service.impl.PendingMediaTaskKt$uploadPendingMedia$2, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r13) {
        Context context = this.A03;
        UserSession userSession = this.A04;
        int i = this.A01;
        PendingMediaStore pendingMediaStore = this.A08;
        return new PendingMediaTaskKt$uploadPendingMedia$2(context, userSession, this.A05, this.A06, this.A07, pendingMediaStore, this.A09, r13, i, this.A02);
    }

    /* JADX WARNING: type inference failed for: r0v58, types: [java.lang.Object, X.L9w] */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01bf, code lost:
        if (r3 > ((long) (r7.A0D + r7.A0E))) goto L_0x01c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0263, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0264, code lost:
        r15.A05.A0O();
        r15.A08.A0A();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x026e, code lost:
        throw r1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0237 A[Catch:{ all -> 0x0263 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            r1 = r16
            X.1Hj r6 = X.1Hj.A02
            int r0 = r15.A00
            r11 = 0
            r5 = 1
            if (r0 == 0) goto L_0x000c
            goto L_0x017f
        L_0x000c:
            X.0eS.A00(r1)
            android.content.Context r4 = r15.A03
            com.instagram.common.session.UserSession r3 = r15.A04
            X.0Tu r2 = X.0Tu.A05
            r0 = 36326378123179762(0x810ea6000236f2, double:3.036286027458213E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0065
            r0 = 36607853100013188(0x820ea600041684, double:3.2142919362164294E-306)
            long r13 = X.JTS.A05(r2, r3, r0)
            r8 = 0
            X.0qQ.A0B(r4, r8)
            android.content.Context r1 = r4.getApplicationContext()
            java.lang.String r0 = "wifi"
            java.lang.Object r7 = r1.getSystemService(r0)
            boolean r0 = r7 instanceof android.net.wifi.WifiManager
            if (r0 == 0) goto L_0x0065
            android.net.wifi.WifiManager r7 = (android.net.wifi.WifiManager) r7
            if (r7 == 0) goto L_0x0065
            boolean r0 = r7.isWifiEnabled()
            if (r0 == 0) goto L_0x0065
            r1 = 3
            java.lang.String r0 = "PendingMediaTask"
            android.net.wifi.WifiManager$WifiLock r10 = r7.createWifiLock(r1, r0)
            if (r10 == 0) goto L_0x0065
            r10.setReferenceCounted(r8)
            r10.acquire()
            r0 = 33535417(0x1ffb5b9, float:9.3932965E-38)
            X.19S r0 = X.AnonymousClass1HX.A01(r0, r1)
            r12 = 23
            X.MGA r9 = new X.MGA
            r9.<init>((java.lang.Object) r10, (X.AnonymousClass4D7) r11, (int) r12, (long) r13)
            X.AnonymousClass7TE.A1Z(r9, r0)
        L_0x0065:
            r0 = 36326378123245299(0x810ea6000336f3, double:3.036286027499659E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x00a9
            r0 = 36607853100078725(0x820ea600051685, double:3.214291936257875E-306)
            long r0 = X.JTS.A05(r2, r3, r0)
            r7 = 0
            X.0qQ.A0B(r4, r7)
            android.content.Context r8 = r4.getApplicationContext()
            java.lang.String r7 = "power"
            java.lang.Object r9 = r8.getSystemService(r7)
            boolean r7 = r9 instanceof android.os.PowerManager
            if (r7 == 0) goto L_0x00a9
            android.os.PowerManager r9 = (android.os.PowerManager) r9
            if (r9 == 0) goto L_0x00a9
            java.lang.String r8 = "PendingMediaService:"
            java.lang.String r7 = "WakeLockUtil"
            java.lang.String r8 = X.002.A0R(r8, r7)
            android.os.PowerManager$WakeLock r7 = r9.newWakeLock(r5, r8)
            X.0BX.A02(r7, r8)
            if (r7 == 0) goto L_0x00a9
            X.C60270fk.A02(r7)
            r7.acquire(r0)
            X.0BX.A01(r7, r0)
        L_0x00a9:
            int r1 = r15.A01     // Catch:{ all -> 0x0263 }
            if (r1 != r5) goto L_0x00ba
            com.instagram.pendingmedia.store.PendingMediaStore r2 = r15.A08     // Catch:{ all -> 0x0263 }
            X.3Q2 r7 = r15.A05     // Catch:{ all -> 0x0263 }
            java.lang.String r1 = r7.A35     // Catch:{ all -> 0x0263 }
            java.lang.String r0 = "PERFORM_ACTION_CANCEL"
            r2.A04(r1, r0)     // Catch:{ all -> 0x0263 }
            goto L_0x025a
        L_0x00ba:
            X.3Q2 r7 = r15.A05     // Catch:{ all -> 0x0263 }
            boolean r0 = r7.A14()     // Catch:{ all -> 0x0263 }
            if (r0 == 0) goto L_0x025a
            r0 = 2
            if (r1 != r0) goto L_0x00f8
            X.37k r9 = r15.A06     // Catch:{ all -> 0x0263 }
            java.lang.String r8 = "work manager"
            X.37j r9 = (X.C2373737j) r9     // Catch:{ all -> 0x0263 }
            java.lang.String r1 = "pending_media_auto_retry"
            X.Kvy r0 = new X.Kvy     // Catch:{ all -> 0x0263 }
            r0.<init>()     // Catch:{ all -> 0x0263 }
            X.0xI r1 = X.C2373737j.A00(r11, r7, r9, r1)     // Catch:{ all -> 0x0263 }
            X.L9w r0 = new X.L9w     // Catch:{ all -> 0x0263 }
            r0.<init>()     // Catch:{ all -> 0x0263 }
            X.C2373737j.A05(r1, r7, r0)     // Catch:{ all -> 0x0263 }
            java.lang.String r0 = "attempt_source"
            r1.A0C(r0, r8)     // Catch:{ all -> 0x0263 }
            java.lang.String r0 = "reason"
            r1.A0C(r0, r8)     // Catch:{ all -> 0x0263 }
            X.3QD r0 = r7.A6J     // Catch:{ all -> 0x0263 }
            X.C2373737j.A06(r1, r0, r9)     // Catch:{ all -> 0x0263 }
            java.lang.String r1 = r7.A3t     // Catch:{ all -> 0x0263 }
            X.3QF r0 = r7.A1T     // Catch:{ all -> 0x0263 }
            int r0 = r0.A00()     // Catch:{ all -> 0x0263 }
            r9.A0F(r7, r1, r8, r0)     // Catch:{ all -> 0x0263 }
        L_0x00f8:
            X.37k r1 = r15.A06     // Catch:{ all -> 0x0263 }
            java.lang.String r0 = "pending_media_task_start"
            r1.Cjm(r7, r0, r11)     // Catch:{ all -> 0x0263 }
            java.util.concurrent.atomic.AtomicInteger r0 = X.1ua.A0J     // Catch:{ all -> 0x0263 }
            int r0 = r0.getAndIncrement()     // Catch:{ all -> 0x0263 }
            r1.ABU(r7, r0)     // Catch:{ all -> 0x0263 }
            int r0 = r15.A02     // Catch:{ all -> 0x0263 }
            r1.ABV(r7, r0)     // Catch:{ all -> 0x0263 }
            com.instagram.pendingmedia.model.constants.ShareType r1 = r7.A0E()     // Catch:{ all -> 0x0263 }
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.DIRECT_SHARE     // Catch:{ all -> 0x0263 }
            if (r1 != r0) goto L_0x016d
            X.1iA r1 = r7.A1G     // Catch:{ all -> 0x0263 }
            X.1iA r0 = X.1iA.A0Q     // Catch:{ all -> 0x0263 }
            if (r1 != r0) goto L_0x016d
            r0 = 2342173274282148392(0x2081122f00004228, double:4.0742897875254256E-152)
            boolean r0 = X.182.A06(r2, r3, r0)     // Catch:{ all -> 0x0263 }
            if (r0 == 0) goto L_0x016d
            java.lang.Class<com.instagram.publisher.HeartbeatJobService> r0 = com.instagram.publisher.HeartbeatJobService.class
            android.content.ComponentName r1 = new android.content.ComponentName     // Catch:{ all -> 0x0263 }
            r1.<init>(r4, r0)     // Catch:{ all -> 0x0263 }
            r0 = 51400(0xc8c8, float:7.2027E-41)
            android.app.job.JobInfo$Builder r8 = new android.app.job.JobInfo$Builder     // Catch:{ all -> 0x0263 }
            r8.<init>(r0, r1)     // Catch:{ all -> 0x0263 }
            long r0 = com.instagram.publisher.HeartbeatJobService.A00     // Catch:{ all -> 0x0263 }
            android.app.job.JobInfo$Builder r8 = r8.setPeriodic(r0)     // Catch:{ all -> 0x0263 }
            r0 = 36330265068585513(0x81122f00024229, double:3.038744147384283E-306)
            boolean r0 = X.182.A06(r2, r3, r0)     // Catch:{ all -> 0x0263 }
            if (r0 == 0) goto L_0x0151
            android.os.PersistableBundle r0 = new android.os.PersistableBundle     // Catch:{ all -> 0x0263 }
            r0.<init>()     // Catch:{ all -> 0x0263 }
            X.DbU.A1D(r0, r3)     // Catch:{ all -> 0x0263 }
            r8.setExtras(r0)     // Catch:{ all -> 0x0263 }
        L_0x0151:
            r0 = 4987(0x137b, float:6.988E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x0263 }
            java.lang.Object r1 = r4.getSystemService(r0)     // Catch:{ all -> 0x0263 }
            r0 = 3644(0xe3c, float:5.106E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x0263 }
            X.0qQ.A0C(r1, r0)     // Catch:{ all -> 0x0263 }
            android.app.job.JobScheduler r1 = (android.app.job.JobScheduler) r1     // Catch:{ all -> 0x0263 }
            android.app.job.JobInfo r0 = r8.build()     // Catch:{ all -> 0x0263 }
            r1.schedule(r0)     // Catch:{ all -> 0x0263 }
        L_0x016d:
            X.1Cn r2 = new X.1Cn     // Catch:{ all -> 0x0263 }
            r2.<init>(r4)     // Catch:{ all -> 0x0263 }
            com.instagram.pendingmedia.service.impl.MediaUploader r1 = r15.A07     // Catch:{ all -> 0x0263 }
            java.lang.String r0 = r15.A09     // Catch:{ all -> 0x0263 }
            r15.A00 = r5     // Catch:{ all -> 0x0263 }
            java.lang.Object r1 = r1.A01(r7, r2, r0, r15)     // Catch:{ all -> 0x0263 }
            if (r1 != r6) goto L_0x0182
            return r6
        L_0x017f:
            X.0eS.A00(r1)     // Catch:{ all -> 0x0263 }
        L_0x0182:
            r11 = r1
            X.55U r11 = (X.AnonymousClass55U) r11     // Catch:{ all -> 0x0263 }
            X.3Q2 r7 = r15.A05     // Catch:{ all -> 0x0263 }
            X.3QB r0 = r7.A6G     // Catch:{ all -> 0x0263 }
            java.lang.Object r1 = r0.A03     // Catch:{ all -> 0x0263 }
            monitor-enter(r1)     // Catch:{ all -> 0x0263 }
            r0.A01 = r5     // Catch:{ all -> 0x0257 }
            monitor-exit(r1)     // Catch:{ all -> 0x0263 }
            r7.A6I = r11     // Catch:{ all -> 0x0263 }
            r8 = 0
            if (r11 == 0) goto L_0x01ae
            X.55S r6 = r11.A01     // Catch:{ all -> 0x0263 }
            X.55S r0 = X.AnonymousClass55S.A0T     // Catch:{ all -> 0x0263 }
            if (r6 == r0) goto L_0x01c1
            X.55S r0 = X.AnonymousClass55S.A08     // Catch:{ all -> 0x0263 }
            if (r6 == r0) goto L_0x01c1
            boolean r0 = r6.A01     // Catch:{ all -> 0x0263 }
            if (r0 == 0) goto L_0x01af
            java.lang.Integer r1 = r6.A00     // Catch:{ all -> 0x0263 }
            java.lang.Integer r0 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x0263 }
            if (r1 != r0) goto L_0x01ab
            r3 = 300(0x12c, double:1.48E-321)
            goto L_0x01b7
        L_0x01ab:
            r3 = 30
            goto L_0x01b7
        L_0x01ae:
            r6 = r8
        L_0x01af:
            r0 = 0
            r7.A0R(r0)     // Catch:{ all -> 0x0263 }
            if (r11 == 0) goto L_0x025a
            goto L_0x020f
        L_0x01b7:
            int r1 = r7.A0D     // Catch:{ all -> 0x0263 }
            int r0 = r7.A0E     // Catch:{ all -> 0x0263 }
            int r1 = r1 + r0
            long r0 = (long) r1     // Catch:{ all -> 0x0263 }
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x01af
        L_0x01c1:
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0263 }
            int r1 = r7.A0D     // Catch:{ all -> 0x0263 }
            r0 = 8
            int r0 = java.lang.Math.min(r1, r0)     // Catch:{ all -> 0x0263 }
            double r2 = (double) r0     // Catch:{ all -> 0x0263 }
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r9 = java.lang.Math.pow(r0, r2)     // Catch:{ all -> 0x0263 }
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r9 = r9 - r2
            double r9 = r9 / r0
            double r2 = java.lang.Math.floor(r9)     // Catch:{ all -> 0x0263 }
            long r0 = (long) r2     // Catch:{ all -> 0x0263 }
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            long r4 = r4 + r0
            r7.A0R(r4)     // Catch:{ all -> 0x0263 }
            int r0 = r7.A0D     // Catch:{ all -> 0x0263 }
            int r0 = r0 + 1
            r7.A0D = r0     // Catch:{ all -> 0x0263 }
            X.3QQ r3 = r7.A1d     // Catch:{ all -> 0x0263 }
            X.3QD r2 = r7.A1f     // Catch:{ all -> 0x0263 }
            boolean r1 = r7.A12()     // Catch:{ all -> 0x0263 }
            r0 = 0
            X.0qQ.A0B(r2, r0)     // Catch:{ all -> 0x0263 }
            java.lang.Integer r1 = X.C63370Kvr.A00(r2, r1)     // Catch:{ all -> 0x0263 }
            java.util.List r0 = r3.A01     // Catch:{ all -> 0x0263 }
            int r2 = r1.intValue()     // Catch:{ all -> 0x0263 }
            int r0 = X.C51971G9r.A0I(r0, r2)     // Catch:{ all -> 0x0263 }
            java.util.List r1 = r3.A01     // Catch:{ all -> 0x0263 }
            int r0 = r0 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0263 }
            r1.set(r2, r0)     // Catch:{ all -> 0x0263 }
        L_0x020f:
            long r2 = r7.A05()     // Catch:{ all -> 0x0263 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0263 }
            long r2 = r2 - r0
            long r2 = X.AnonymousClass7TE.A0P(r2)     // Catch:{ all -> 0x0263 }
            r0 = -1
            long r0 = java.lang.Math.max(r2, r0)     // Catch:{ all -> 0x0263 }
            java.lang.StringBuilder r3 = X.AnonymousClass7TE.A1A()     // Catch:{ all -> 0x0263 }
            java.lang.String r2 = "Upload failed pendingMediaKey: "
            r3.append(r2)     // Catch:{ all -> 0x0263 }
            java.lang.String r2 = r7.A35     // Catch:{ all -> 0x0263 }
            r3.append(r2)     // Catch:{ all -> 0x0263 }
            java.lang.String r2 = ", errorType: "
            r3.append(r2)     // Catch:{ all -> 0x0263 }
            if (r6 == 0) goto L_0x023b
            java.lang.String r8 = r6.name()     // Catch:{ all -> 0x0263 }
        L_0x023b:
            r3.append(r8)     // Catch:{ all -> 0x0263 }
            java.lang.String r2 = ", retry in "
            r3.append(r2)     // Catch:{ all -> 0x0263 }
            r3.append(r0)     // Catch:{ all -> 0x0263 }
            java.lang.String r0 = "'s, description:"
            r3.append(r0)     // Catch:{ all -> 0x0263 }
            java.lang.String r0 = r11.A02     // Catch:{ all -> 0x0263 }
            java.lang.String r1 = X.AnonymousClass7TF.A0l(r0, r3)     // Catch:{ all -> 0x0263 }
            java.lang.String r0 = "MediaUploader"
            X.0KC.A0C(r0, r1)     // Catch:{ all -> 0x0263 }
            goto L_0x025a
        L_0x0257:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0263 }
            throw r0     // Catch:{ all -> 0x0263 }
        L_0x025a:
            r7.A0O()
            com.instagram.pendingmedia.store.PendingMediaStore r0 = r15.A08
            r0.A0A()
            return r11
        L_0x0263:
            r1 = move-exception
            X.3Q2 r0 = r15.A05
            r0.A0O()
            com.instagram.pendingmedia.store.PendingMediaStore r0 = r15.A08
            r0.A0A()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.pendingmedia.service.impl.PendingMediaTaskKt$uploadPendingMedia$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PendingMediaTaskKt$uploadPendingMedia$2) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
