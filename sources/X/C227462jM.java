package X;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.2jM  reason: invalid class name and case insensitive filesystem */
public abstract class C227462jM {
    public static C227462jM A00;

    public static synchronized C227462jM A00(Context context, 0lg r5) {
        C227462jM r0;
        synchronized (C227462jM.class) {
            r0 = A00;
            if (r0 == null) {
                if (r5 == null || !182.A06(0Tu.A05, r5, 36321168327713931L)) {
                    r0 = new C227482jO(context);
                } else {
                    r0 = new C227472jN(context);
                }
                A00 = r0;
            }
        }
        return r0;
    }

    public final C227512jS A01() {
        if (this instanceof C227482jO) {
            Object systemService = ((C227482jO) this).A00.getSystemService("jobscheduler");
            if (systemService != null) {
                JobInfo pendingJob = ((JobScheduler) systemService).getPendingJob(R.id.background_sync_scheduler_job_id);
                if (pendingJob == null) {
                    return null;
                }
                int id = pendingJob.getId();
                String className = pendingJob.getService().getClassName();
                0qQ.A07(className);
                try {
                    Class<? extends U> asSubclass = Class.forName(className).asSubclass(Service.class);
                    0qQ.A0A(asSubclass);
                    C227502jR r5 = new C227502jR(asSubclass, id);
                    r5.A00 = pendingJob.getNetworkType();
                    r5.A05 = pendingJob.isPersisted();
                    r5.A08 = pendingJob.isRequireCharging();
                    r5.A09 = pendingJob.isRequireDeviceIdle();
                    r5.A04 = pendingJob.getExtras();
                    r5.A07 = pendingJob.isRequireBatteryNotLow();
                    r5.A0A = pendingJob.isRequireStorageNotLow();
                    if (pendingJob.getMaxExecutionDelayMillis() > 0) {
                        r5.A01 = pendingJob.getMaxExecutionDelayMillis();
                    }
                    if (pendingJob.getMinLatencyMillis() > 0) {
                        r5.A01 = pendingJob.getMinLatencyMillis();
                    }
                    if (pendingJob.getIntervalMillis() > 0) {
                        r5.A03 = pendingJob.getIntervalMillis();
                    }
                    return new C227512jS(r5);
                } catch (ClassCastException | ClassNotFoundException e) {
                    0wb.A02(0kg.A09, "NativeJobSchedulerWrapper", "Service class exception while converting to JobInfo", e);
                    return null;
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            try {
                return ((C227472jN) this).A00.A01();
            } catch (Exception e2) {
                0wb.A02(0kg.A09, "NonThrowingNativeJobSchedulerWrapper", "Getting pending job has failed.", e2);
                return null;
            }
        }
    }

    public final void A02(int i) {
        if (this instanceof C227482jO) {
            Object systemService = ((C227482jO) this).A00.getSystemService("jobscheduler");
            if (systemService != null) {
                ((JobScheduler) systemService).cancel(i);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        try {
            ((C227472jN) this).A00.A02(R.id.background_sync_scheduler_job_id);
        } catch (Exception e) {
            0wb.A02(0kg.A09, "NonThrowingNativeJobSchedulerWrapper", "Canceling of the job failed.", e);
        }
    }

    public final void A04(C227512jS r5) {
        if (this instanceof C227482jO) {
            A02(r5.A00);
            return;
        }
        try {
            ((C227472jN) this).A00.A04(r5);
        } catch (Exception e) {
            0wb.A02(0kg.A09, "NonThrowingNativeJobSchedulerWrapper", "Canceling of the job failed.", e);
        }
    }

    public final void A05(C227512jS r8, Class cls) {
        if (this instanceof C227472jN) {
            try {
                ((C227472jN) this).A00.A05(r8, cls);
            } catch (Exception e) {
                0wb.A02(0kg.A09, "NonThrowingNativeJobSchedulerWrapper", "Scheduling of the job failed.", e);
            }
        } else {
            Context context = ((C227482jO) this).A00;
            Object systemService = context.getSystemService("jobscheduler");
            if (systemService != null) {
                JobScheduler jobScheduler = (JobScheduler) systemService;
                JobInfo.Builder builder = new JobInfo.Builder(r8.A00, new ComponentName(context, cls));
                builder.setRequiredNetworkType(r8.A01);
                builder.setPersisted(r8.A07);
                builder.setRequiresCharging(r8.A0A);
                builder.setRequiresDeviceIdle(r8.A0B);
                builder.setRequiresBatteryNotLow(r8.A09);
                builder.setRequiresStorageNotLow(r8.A0C);
                long j = r8.A02;
                if (j > 0) {
                    builder.setOverrideDeadline(j);
                }
                long j2 = r8.A03;
                if (j2 > 0) {
                    builder.setMinimumLatency(j2);
                }
                long j3 = r8.A04;
                if (j3 > 0) {
                    builder.setPeriodic(j3);
                }
                builder.setPrefetch(r8.A08);
                PersistableBundle persistableBundle = r8.A05;
                if (persistableBundle != null) {
                    builder.setExtras(persistableBundle);
                }
                JobInfo build = builder.build();
                0qQ.A07(build);
                jobScheduler.schedule(build);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void A03(Context context, UserSession userSession, C227512jS r6) {
        T7D A002 = 2IT.A00(context, userSession);
        if (A002 != null) {
            Class cls = r6.A06;
            for (C10493Rt8 rt8 : A002.A05) {
                if (0qQ.A0K(rt8.A01, cls)) {
                    return;
                }
            }
        }
        A05(r6, r6.A06);
    }
}
