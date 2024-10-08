package X;

import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.DeadObjectException;
import com.facebook.common.zopt.ZOpt;
import com.facebook.common.zopt.ZOptBackgroundService;

public final class TR9 extends Thread {
    public final /* synthetic */ JobParameters A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ ZOptBackgroundService A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TR9(JobParameters jobParameters, Context context, ZOptBackgroundService zOptBackgroundService) {
        super("ZOptBackgroundService_optimize");
        this.A02 = zOptBackgroundService;
        this.A01 = context;
        this.A00 = jobParameters;
    }

    public final void run() {
        Context context = this.A01;
        ZOpt zOpt = ZOpt.$redex_init_class;
        synchronized (RV6.class) {
        }
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            try {
                jobScheduler.cancel(-87105848);
            } catch (SecurityException e) {
                0KC.A0H("ZOptBackgroundService", "Failure to cancel ZOptBackgroundService", e);
            } catch (RuntimeException e2) {
                if (e2.getCause() instanceof DeadObjectException) {
                    0KC.A0H("ZOptBackgroundService", "Failure to cancel ZOptBackgroundService", e2);
                } else {
                    throw e2;
                }
            }
        }
        0fR.A02(this.A00, this.A02, false);
    }
}
