package androidx.work.impl.background.systemjob;

import X.AnonymousClass0fD;
import X.AnonymousClass385;
import X.AnonymousClass389;
import X.AnonymousClass39K;
import X.AnonymousClass39S;
import X.AnonymousClass39Y;
import X.AnonymousClass39Z;
import X.AnonymousClass39d;
import X.C255373u1;
import X.C271004hk;
import X.C2805352f;
import X.RSD;
import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;

public class SystemJobService extends JobService implements AnonymousClass39S {
    public static final String A04 = AnonymousClass389.A01("SystemJobService");
    public AnonymousClass39Z A00;
    public AnonymousClass385 A01;
    public final AnonymousClass39d A02 = new AnonymousClass39d();
    public final Map A03 = new HashMap();

    public final boolean onStopJob(JobParameters jobParameters) {
        boolean contains;
        int i;
        C271004hk.A01(jobParameters, this, true);
        if (this.A01 == null) {
            AnonymousClass389.A00();
            return true;
        }
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras != null && extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                C255373u1 r3 = new C255373u1(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
                AnonymousClass389.A00();
                Map map = this.A03;
                synchronized (map) {
                    map.remove(r3);
                }
                C2805352f A002 = this.A02.A00(r3);
                if (A002 != null) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        i = RSD.A00(jobParameters);
                    } else {
                        i = -512;
                    }
                    this.A00.EyV(A002, i);
                }
                AnonymousClass39K r0 = this.A01.A03;
                String str = r3.A01;
                synchronized (r0.A09) {
                    contains = r0.A07.contains(str);
                }
                return !contains;
            }
        } catch (NullPointerException unused) {
        }
        AnonymousClass389.A00();
        Log.e(A04, "WorkSpec id not found!");
        return false;
    }

    public final void DDI(C255373u1 r4, boolean z) {
        JobParameters jobParameters;
        AnonymousClass389.A00();
        Map map = this.A03;
        synchronized (map) {
            jobParameters = (JobParameters) map.remove(r4);
        }
        this.A02.A00(r4);
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    public final void onCreate() {
        int A042 = AnonymousClass0fD.A04(314533705);
        super.onCreate();
        try {
            AnonymousClass385 A002 = AnonymousClass385.A00(getApplicationContext());
            this.A01 = A002;
            AnonymousClass39K r2 = A002.A03;
            this.A00 = new AnonymousClass39Y(r2, A002.A06);
            r2.A02(this);
        } catch (IllegalStateException e) {
            if (Application.class.equals(getApplication().getClass())) {
                AnonymousClass389.A00();
                Log.w(A04, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
                AnonymousClass0fD.A0B(798936809, A042);
                throw illegalStateException;
            }
        }
        AnonymousClass0fD.A0B(-1228448829, A042);
    }

    public final void onDestroy() {
        int A042 = AnonymousClass0fD.A04(-1556002774);
        super.onDestroy();
        AnonymousClass385 r0 = this.A01;
        if (r0 != null) {
            r0.A03.A03(this);
        }
        AnonymousClass0fD.A0B(2143181020, A042);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0042, code lost:
        r5 = new X.C282915Fg();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004b, code lost:
        if (r7.getTriggeredContentUris() == null) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004d, code lost:
        r5.A02 = java.util.Arrays.asList(r7.getTriggeredContentUris());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005b, code lost:
        if (r7.getTriggeredContentAuthorities() == null) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005d, code lost:
        r5.A01 = java.util.Arrays.asList(r7.getTriggeredContentAuthorities());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0067, code lost:
        r5.A00 = r7.getNetwork();
        r3 = r6.A00;
        r2 = r6.A02.A01(r2);
        r3 = (X.AnonymousClass39Y) r3;
        X.0qQ.A0B(r2, 0);
        r3.A01.ATP(new X.C282855Fa(r5, r3.A00, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0086, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onStartJob(android.app.job.JobParameters r7) {
        /*
            r6 = this;
            X.C271004hk.A00(r7, r6)
            X.385 r0 = r6.A01
            r4 = 1
            r1 = 0
            if (r0 != 0) goto L_0x0010
            X.AnonymousClass389.A00()
            r6.jobFinished(r7, r4)
            return r1
        L_0x0010:
            java.lang.String r3 = "EXTRA_WORK_SPEC_ID"
            android.os.PersistableBundle r2 = r7.getExtras()     // Catch:{ NullPointerException -> 0x008a }
            if (r2 == 0) goto L_0x008a
            boolean r0 = r2.containsKey(r3)     // Catch:{ NullPointerException -> 0x008a }
            if (r0 == 0) goto L_0x008a
            java.lang.String r3 = r2.getString(r3)     // Catch:{ NullPointerException -> 0x008a }
            java.lang.String r0 = "EXTRA_WORK_SPEC_GENERATION"
            int r0 = r2.getInt(r0)     // Catch:{ NullPointerException -> 0x008a }
            X.3u1 r2 = new X.3u1     // Catch:{ NullPointerException -> 0x008a }
            r2.<init>(r3, r0)     // Catch:{ NullPointerException -> 0x008a }
            java.util.Map r3 = r6.A03
            monitor-enter(r3)
            boolean r0 = r3.containsKey(r2)     // Catch:{ all -> 0x0087 }
            if (r0 == 0) goto L_0x003b
            X.AnonymousClass389.A00()     // Catch:{ all -> 0x0087 }
            monitor-exit(r3)     // Catch:{ all -> 0x0087 }
            return r1
        L_0x003b:
            X.AnonymousClass389.A00()     // Catch:{ all -> 0x0087 }
            r3.put(r2, r7)     // Catch:{ all -> 0x0087 }
            monitor-exit(r3)     // Catch:{ all -> 0x0087 }
            X.5Fg r5 = new X.5Fg
            r5.<init>()
            android.net.Uri[] r0 = r7.getTriggeredContentUris()
            if (r0 == 0) goto L_0x0057
            android.net.Uri[] r0 = r7.getTriggeredContentUris()
            java.util.List r0 = java.util.Arrays.asList(r0)
            r5.A02 = r0
        L_0x0057:
            java.lang.String[] r0 = r7.getTriggeredContentAuthorities()
            if (r0 == 0) goto L_0x0067
            java.lang.String[] r0 = r7.getTriggeredContentAuthorities()
            java.util.List r0 = java.util.Arrays.asList(r0)
            r5.A01 = r0
        L_0x0067:
            android.net.Network r0 = r7.getNetwork()
            r5.A00 = r0
            X.39Z r3 = r6.A00
            X.39d r0 = r6.A02
            X.52f r2 = r0.A01(r2)
            X.39Y r3 = (X.AnonymousClass39Y) r3
            X.0qQ.A0B(r2, r1)
            X.39K r0 = r3.A00
            X.5Fa r1 = new X.5Fa
            r1.<init>(r5, r0, r2)
            X.38N r0 = r3.A01
            r0.ATP(r1)
            return r4
        L_0x0087:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0087 }
            throw r0
        L_0x008a:
            X.AnonymousClass389.A00()
            java.lang.String r2 = A04
            java.lang.String r0 = "WorkSpec id not found!"
            android.util.Log.e(r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.SystemJobService.onStartJob(android.app.job.JobParameters):boolean");
    }
}
