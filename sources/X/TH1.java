package X;

import android.app.job.JobParameters;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;

public final /* synthetic */ class TH1 implements Runnable {
    public final /* synthetic */ JobParameters A00;
    public final /* synthetic */ JobInfoSchedulerService A01;

    public /* synthetic */ TH1(JobParameters jobParameters, JobInfoSchedulerService jobInfoSchedulerService) {
        this.A01 = jobInfoSchedulerService;
        this.A00 = jobParameters;
    }

    public final void run() {
        this.A01.jobFinished(this.A00, false);
    }
}
