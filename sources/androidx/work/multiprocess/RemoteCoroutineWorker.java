package androidx.work.multiprocess;

import X.AnonymousClass19G;
import X.AnonymousClass38M;
import X.AnonymousClass7TG;
import X.C12852TAr;
import X.C2379539x;
import X.C262204Co;
import android.content.Context;
import androidx.work.WorkerParameters;

public abstract class RemoteCoroutineWorker extends RemoteListenableWorker {
    public final C2379539x A00;
    public final AnonymousClass19G A01 = new AnonymousClass19G((C262204Co) null);

    /* JADX WARNING: type inference failed for: r2v0, types: [X.39y, X.39x, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RemoteCoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AnonymousClass7TG.A1O(context, workerParameters);
        ? obj = new Object();
        this.A00 = obj;
        obj.addListener(new C12852TAr(this), ((AnonymousClass38M) this.mWorkerParams.A07).A01);
    }

    public final void onStopped() {
        super.onStopped();
        this.A00.cancel(true);
    }
}
