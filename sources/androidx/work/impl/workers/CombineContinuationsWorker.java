package androidx.work.impl.workers;

import X.AnonymousClass5G1;
import X.AnonymousClass7TG;
import X.C282935Fi;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public final class CombineContinuationsWorker extends Worker {
    public final C282935Fi doWork() {
        return new AnonymousClass5G1(this.mWorkerParams.A02);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CombineContinuationsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AnonymousClass7TG.A1O(context, workerParameters);
    }
}
