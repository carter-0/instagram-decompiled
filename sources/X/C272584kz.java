package X;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import androidx.fragment.app.Fragment;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.lang.ref.WeakReference;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.4kz  reason: invalid class name and case insensitive filesystem */
public final class C272584kz {
    public int A00 = 0;
    public boolean A01;
    public int A02 = 1;
    public int A03 = 21371299;
    public String A04;
    public WeakReference A05;
    public final long A06;
    public final QuickPerformanceLogger A07;
    public final Set A08;
    public final boolean A09;
    public final long A0A;
    public final Handler A0B;
    public final C272564kx A0C;
    public final boolean A0D;
    public final boolean A0E;

    public final synchronized void A02(String str, String str2) {
        this.A07.markerAnnotate(this.A03, this.A02, str, str2);
    }

    public static long A00(WeakReference weakReference) {
        long j;
        long j2;
        if (weakReference == null) {
            return 0;
        }
        Object obj = weakReference.get();
        if (obj == null) {
            return 1;
        }
        if (obj instanceof Fragment) {
            Fragment fragment = (Fragment) obj;
            j = 3 | ((long) ((fragment.isAdded() ? 1 : 0) << true)) | ((long) ((fragment.mDetached ? 1 : 0) << true)) | ((long) ((fragment.isHidden() ? 1 : 0) << true)) | ((long) ((fragment.mInLayout ? 1 : 0) << true)) | ((long) ((fragment.mRemoving ? 1 : 0) << true)) | ((long) ((fragment.isResumed() ? 1 : 0) << true));
            try {
                j2 = (long) ((fragment.isVisible() ? 1 : 0) << true);
            } catch (NullPointerException unused) {
                return j;
            }
        } else if (!(obj instanceof Activity)) {
            return 15;
        } else {
            Activity activity = (Activity) obj;
            j = 7 | ((long) ((activity.isTaskRoot() ? 1 : 0) << true)) | ((long) ((activity.isChild() ? 1 : 0) << true)) | ((long) ((activity.isFinishing() ? 1 : 0) << true)) | ((long) ((activity.isChangingConfigurations() ? 1 : 0) << true)) | ((long) ((activity.isDestroyed() ? 1 : 0) << true));
            if (Build.VERSION.SDK_INT < 31) {
                return j;
            }
            j2 = C9252RVd.A00(activity) << 9;
        }
        return j | j2;
    }

    public final synchronized void A01() {
        synchronized (this) {
            int i = this.A03;
            int i2 = this.A02;
            long A002 = A00(this.A05);
            QuickPerformanceLogger quickPerformanceLogger = this.A07;
            quickPerformanceLogger.markerAnnotate(i, this.A02, "surface_state_on_end", A002);
            quickPerformanceLogger.markerPoint(i, i2, "surface_exit", (String) null, -1, TimeUnit.NANOSECONDS, 1);
            for (C272404ke ATb : this.A08) {
                ATb.ATb(this.A02);
            }
            this.A01 = false;
            System.gc();
            this.A0B.postDelayed(new C46348Dcr(this, this.A04, this.A05, i, i2), this.A06);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        if (X.C59470Vi.A01(21371299) == false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0027, code lost:
        if (r3.A02() == false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A03(java.lang.String r22, java.lang.ref.WeakReference r23, boolean r24) {
        /*
            r21 = this;
            r0 = r21
            monitor-enter(r0)
            java.lang.ref.WeakReference r1 = r0.A05     // Catch:{ all -> 0x0124 }
            long r17 = A00(r1)     // Catch:{ all -> 0x0124 }
            X.4kx r3 = r0.A0C     // Catch:{ all -> 0x0124 }
            java.util.Random r2 = r3.A00     // Catch:{ all -> 0x0124 }
            r8 = r22
            int r1 = r3.A00(r8)     // Catch:{ all -> 0x0124 }
            int r1 = r2.nextInt(r1)     // Catch:{ all -> 0x0124 }
            r4 = 0
            if (r1 != 0) goto L_0x001b
            r4 = 1
        L_0x001b:
            r6 = 21371299(0x14619a3, float:3.638525E-38)
            if (r4 != 0) goto L_0x0029
            boolean r1 = r3.A02()     // Catch:{ all -> 0x0124 }
            r14 = 21367723(0x1460bab, float:3.6375228E-38)
            if (r1 != 0) goto L_0x002c
        L_0x0029:
            r14 = 21371299(0x14619a3, float:3.638525E-38)
        L_0x002c:
            r7 = 0
            r5 = 1
            if (r14 != r6) goto L_0x0037
            boolean r1 = X.C59470Vi.A01(r6)     // Catch:{ all -> 0x0124 }
            r12 = 1
            if (r1 != 0) goto L_0x0038
        L_0x0037:
            r12 = 0
        L_0x0038:
            r0.A03 = r14     // Catch:{ all -> 0x0124 }
            int r1 = r0.A02     // Catch:{ all -> 0x0124 }
            int r2 = r1 + 1
            r0.A02 = r2     // Catch:{ all -> 0x0124 }
            com.facebook.quicklog.QuickPerformanceLogger r13 = r0.A07     // Catch:{ all -> 0x0124 }
            boolean r1 = r0.A0D     // Catch:{ all -> 0x0124 }
            if (r1 != 0) goto L_0x004b
            boolean r1 = r0.A0E     // Catch:{ all -> 0x0124 }
            if (r1 != 0) goto L_0x004b
            r7 = 1
        L_0x004b:
            r13.markerStart(r14, r2, r7)     // Catch:{ all -> 0x0124 }
            r0.A04 = r8     // Catch:{ all -> 0x0124 }
            r1 = r23
            r0.A05 = r1     // Catch:{ all -> 0x0124 }
            int r7 = r0.A02     // Catch:{ all -> 0x0124 }
            java.lang.String r2 = "endpoint_sampling_rate"
            int r1 = r3.A00(r8)     // Catch:{ all -> 0x0124 }
            r13.markerAnnotate(r14, r7, r2, r1)     // Catch:{ all -> 0x0124 }
            int r7 = r0.A02     // Catch:{ all -> 0x0124 }
            java.lang.String r2 = "track_visits_through_global_app_state"
            boolean r1 = r0.A0E     // Catch:{ all -> 0x0124 }
            r13.markerAnnotate(r14, r7, r2, r1)     // Catch:{ all -> 0x0124 }
            int r15 = r0.A02     // Catch:{ all -> 0x0124 }
            java.lang.String r16 = "previous_surface_state"
            r13.markerAnnotate(r14, r15, r16, r17)     // Catch:{ all -> 0x0124 }
            int r2 = r0.A03     // Catch:{ all -> 0x0124 }
            int r1 = r0.A02     // Catch:{ all -> 0x0124 }
            boolean r7 = r13.isMarkerOn(r2, r1)     // Catch:{ all -> 0x0124 }
            if (r4 == 0) goto L_0x00a7
            boolean r1 = r3.A01()     // Catch:{ all -> 0x0124 }
            if (r1 == 0) goto L_0x0086
            int r2 = r0.A02     // Catch:{ all -> 0x0124 }
            java.lang.String r1 = "allow_trace_collection"
            r13.markerAnnotate(r14, r2, r1, r5)     // Catch:{ all -> 0x0124 }
        L_0x0086:
            int r2 = r0.A02     // Catch:{ all -> 0x0124 }
            java.lang.String r1 = "first_visit"
            r3 = r24
            r13.markerAnnotate(r14, r2, r1, r3)     // Catch:{ all -> 0x0124 }
            long r19 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0124 }
            long r1 = r0.A0A     // Catch:{ all -> 0x0124 }
            r10 = 0
            int r3 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r3 <= 0) goto L_0x00a4
            int r15 = r0.A02     // Catch:{ all -> 0x0124 }
            java.lang.String r16 = "start_process_uptime_ms"
            long r17 = r19 - r1
            r13.markerAnnotate(r14, r15, r16, r17)     // Catch:{ all -> 0x0124 }
        L_0x00a4:
            X.0UO r1 = X.0LA.A04     // Catch:{ all -> 0x0124 }
            goto L_0x00b5
        L_0x00a7:
            boolean r1 = r3.A03()     // Catch:{ all -> 0x0124 }
            if (r1 == 0) goto L_0x0086
            int r2 = r0.A02     // Catch:{ all -> 0x0124 }
            java.lang.String r1 = "forbid_trace_collection"
            r13.markerAnnotate(r14, r2, r1, r5)     // Catch:{ all -> 0x0124 }
            goto L_0x0086
        L_0x00b5:
            if (r1 == 0) goto L_0x00f6
            X.0Ky r3 = r1.A01     // Catch:{ all -> 0x0124 }
            int r15 = r0.A02     // Catch:{ all -> 0x0124 }
            java.lang.String r16 = "start_total_fg_time_ms"
            monitor-enter(r3)     // Catch:{ all -> 0x0124 }
            long r1 = r3.A05     // Catch:{ all -> 0x00e5 }
            long r8 = r3.A00()     // Catch:{ all -> 0x00e5 }
            long r1 = r1 + r8
            monitor-exit(r3)     // Catch:{ all -> 0x0124 }
            r17 = r1
            r13.markerAnnotate(r14, r15, r16, r17)     // Catch:{ all -> 0x0124 }
            monitor-enter(r3)     // Catch:{ all -> 0x0124 }
            long r1 = r3.A04     // Catch:{ all -> 0x00e5 }
            monitor-exit(r3)     // Catch:{ all -> 0x0124 }
            int r8 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r8 <= 0) goto L_0x00dc
            int r15 = r0.A02     // Catch:{ all -> 0x0124 }
            java.lang.String r16 = "start_uptime_since_first_fg_ms"
            long r17 = r19 - r1
            r13.markerAnnotate(r14, r15, r16, r17)     // Catch:{ all -> 0x0124 }
        L_0x00dc:
            monitor-enter(r3)     // Catch:{ all -> 0x0124 }
            long r1 = r3.A01     // Catch:{ all -> 0x00e5 }
            monitor-exit(r3)     // Catch:{ all -> 0x0124 }
            int r3 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r3 <= 0) goto L_0x00f6
            goto L_0x00e8
        L_0x00e5:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0124 }
            throw r1     // Catch:{ all -> 0x0124 }
        L_0x00e8:
            int r3 = r0.A02     // Catch:{ all -> 0x0124 }
            java.lang.String r18 = "start_uptime_since_last_fg_ms"
            long r19 = r19 - r1
            r15 = r13
            r16 = r14
            r17 = r3
            r15.markerAnnotate(r16, r17, r18, r19)     // Catch:{ all -> 0x0124 }
        L_0x00f6:
            boolean r8 = X.C59470Vi.A01(r6)     // Catch:{ all -> 0x0124 }
            if (r14 != r6) goto L_0x0108
            boolean r1 = r0.A09     // Catch:{ all -> 0x0124 }
            if (r1 == 0) goto L_0x0108
            if (r8 == 0) goto L_0x0108
            if (r12 != 0) goto L_0x0108
            int r1 = r0.A02     // Catch:{ all -> 0x0124 }
            r0.A00 = r1     // Catch:{ all -> 0x0124 }
        L_0x0108:
            java.util.Set r1 = r0.A08     // Catch:{ all -> 0x0124 }
            java.util.Iterator r3 = r1.iterator()     // Catch:{ all -> 0x0124 }
        L_0x010e:
            boolean r1 = r3.hasNext()     // Catch:{ all -> 0x0124 }
            if (r1 == 0) goto L_0x0120
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x0124 }
            X.4ke r2 = (X.C272404ke) r2     // Catch:{ all -> 0x0124 }
            int r1 = r0.A02     // Catch:{ all -> 0x0124 }
            r2.ASl(r1, r4, r7, r8)     // Catch:{ all -> 0x0124 }
            goto L_0x010e
        L_0x0120:
            r0.A01 = r5     // Catch:{ all -> 0x0124 }
            monitor-exit(r0)
            return
        L_0x0124:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C272584kz.A03(java.lang.String, java.lang.ref.WeakReference, boolean):void");
    }

    public C272584kz(Handler handler, C272564kx r3, QuickPerformanceLogger quickPerformanceLogger, Set set, long j, long j2, boolean z, boolean z2, boolean z3) {
        r3 = r3 == null ? new C272564kx() : r3;
        this.A07 = quickPerformanceLogger;
        this.A0B = handler;
        this.A0C = r3;
        this.A06 = j;
        this.A08 = set;
        this.A0A = j2;
        this.A0E = z;
        this.A0D = z2;
        this.A09 = z3;
    }
}
