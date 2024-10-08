package com.instagram.jobscheduler.bgfetch.scheduler;

import X.09i;
import X.AnonymousClass5G1;
import X.AnonymousClass7TG;
import X.C282935Fi;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public final class IgBgFetchSchedulerWorker extends Worker {
    public final WorkerParameters A00;

    public final C282935Fi doWork() {
        09i.A0A.A08(this);
        this.A00.A02.A02("job_id_key", -1);
        return new AnonymousClass5G1();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgBgFetchSchedulerWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AnonymousClass7TG.A1O(context, workerParameters);
        this.A00 = workerParameters;
    }
}
