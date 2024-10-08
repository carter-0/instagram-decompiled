package X;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;

/* renamed from: X.39O  reason: invalid class name */
public final class AnonymousClass39O implements AnonymousClass39P {
    public static final String A05 = AnonymousClass389.A01("SystemJobScheduler");
    public final JobScheduler A00;
    public final Context A01;
    public final AnonymousClass38C A02;
    public final WorkDatabase A03;
    public final AnonymousClass39Q A04;

    public static ArrayList A00(JobScheduler jobScheduler, Context context) {
        List<JobInfo> list;
        ArrayList arrayList = null;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            AnonymousClass389.A00();
            Log.e(A05, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list != null) {
            arrayList = new ArrayList(list.size());
            ComponentName componentName = new ComponentName(context, SystemJobService.class);
            for (JobInfo next : list) {
                if (componentName.equals(next.getService())) {
                    arrayList.add(next);
                }
            }
        }
        return arrayList;
    }

    public final boolean CK1() {
        return true;
    }

    public AnonymousClass39O(Context context, AnonymousClass38C r5, WorkDatabase workDatabase) {
        AnonymousClass39Q r0 = new AnonymousClass39Q(context, r5.A00);
        this.A01 = context;
        this.A00 = (JobScheduler) context.getSystemService("jobscheduler");
        this.A04 = r0;
        this.A03 = workDatabase;
        this.A02 = r5;
    }

    public final void A02(AnonymousClass3DG r7, int i) {
        int i2;
        JobInfo A002 = this.A04.A00(r7, i);
        AnonymousClass389.A00();
        String str = A05;
        String str2 = r7.A0M;
        try {
            if (this.A00.schedule(A002) == 0) {
                AnonymousClass389.A00();
                Log.w(str, 002.A0R("Unable to schedule work ID ", str2));
                if (r7.A0J && r7.A0G == AnonymousClass05K.A00) {
                    r7.A0J = false;
                    String.format("Scheduling a non-expedited job (work ID %s)", new Object[]{str2});
                    AnonymousClass389.A00();
                    A02(r7, i);
                }
            }
        } catch (IllegalStateException e) {
            ArrayList A003 = A00(this.A00, this.A01);
            if (A003 != null) {
                i2 = A003.size();
            } else {
                i2 = 0;
            }
            String format = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", new Object[]{Integer.valueOf(i2), Integer.valueOf(this.A03.A05().Bpe().size()), 20});
            AnonymousClass389.A00();
            Log.e(str, format);
            throw new IllegalStateException(format, e);
        } catch (Throwable th) {
            AnonymousClass389.A00();
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to schedule ");
            sb.append(r7);
            Log.e(str, sb.toString(), th);
        }
    }

    public final void AG6(String str) {
        Context context = this.A01;
        JobScheduler jobScheduler = this.A00;
        ArrayList A002 = A00(jobScheduler, context);
        if (A002 != null) {
            ArrayList arrayList = new ArrayList(2);
            Iterator it = A002.iterator();
            while (it.hasNext()) {
                JobInfo jobInfo = (JobInfo) it.next();
                PersistableBundle extras = jobInfo.getExtras();
                if (extras != null) {
                    try {
                        if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                            extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0);
                            String string = extras.getString("EXTRA_WORK_SPEC_ID");
                            0qQ.A0B(string, 1);
                            if (str.equals(string)) {
                                arrayList.add(Integer.valueOf(jobInfo.getId()));
                            }
                        }
                    } catch (NullPointerException unused) {
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    A01(jobScheduler, ((Number) it2.next()).intValue());
                }
                AnonymousClass3A6 r0 = (AnonymousClass3A6) this.A03.A02();
                C251983oI r3 = r0.A00;
                r3.assertNotSuspendingTransaction();
                1Vg r2 = r0.A02;
                AnonymousClass1WV acquire = r2.acquire();
                if (str == null) {
                    acquire.ADb(1);
                } else {
                    acquire.ADh(1, str);
                }
                r3.beginTransaction();
                try {
                    acquire.ATQ();
                    r3.setTransactionSuccessful();
                } finally {
                    r3.endTransaction();
                    r2.release(acquire);
                }
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final void EKN(AnonymousClass3DG... r11) {
        int intValue;
        WorkDatabase workDatabase = this.A03;
        C255353tz r7 = new C255353tz(workDatabase);
        int length = r11.length;
        int i = 0;
        while (i < length) {
            AnonymousClass3DG r8 = r11[i];
            workDatabase.beginTransaction();
            try {
                C2377438z A052 = workDatabase.A05();
                String str = r8.A0M;
                AnonymousClass3DG CGi = A052.CGi(str);
                if (CGi == null) {
                    AnonymousClass389.A00();
                    Log.w(A05, 002.A0g("Skipping scheduling ", str, Pxd.A00(297)));
                } else if (CGi.A0E != C2379139t.ENQUEUED) {
                    AnonymousClass389.A00();
                    Log.w(A05, 002.A0g("Skipping scheduling ", str, " because it is no longer enqueued"));
                } else {
                    C255373u1 A002 = C255363u0.A00(r8);
                    C255383u2 C3e = workDatabase.A02().C3e(A002);
                    if (C3e != null) {
                        intValue = C3e.A01;
                    } else {
                        Object runInTransaction = r7.A00.runInTransaction((Callable) new AnonymousClass5G4(r7));
                        0qQ.A07(runInTransaction);
                        intValue = ((Number) runInTransaction).intValue();
                        workDatabase.A02().CNX(new C255383u2(A002.A01, A002.A00, intValue));
                    }
                    A02(r8, intValue);
                }
                workDatabase.setTransactionSuccessful();
                workDatabase.endTransaction();
                i++;
            } catch (Throwable th) {
                workDatabase.endTransaction();
                throw th;
            }
        }
    }

    public static void A01(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            AnonymousClass389.A00();
            Log.e(A05, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", new Object[]{Integer.valueOf(i)}), th);
        }
    }
}
