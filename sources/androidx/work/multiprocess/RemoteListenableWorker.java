package androidx.work.multiprocess;

import X.AnonymousClass385;
import X.AnonymousClass389;
import X.AnonymousClass7TE;
import X.C11766SgC;
import X.C2379539x;
import X.C255323tw;
import X.C283015Ft;
import X.SHS;
import X.Sd0;
import X.SgB;
import X.TI4;
import android.content.ComponentName;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

public abstract class RemoteListenableWorker extends C283015Ft {
    public static final String A03 = AnonymousClass389.A01("RemoteListenableWorker");
    public ComponentName A00;
    public final WorkerParameters A01;
    public final SHS A02;

    /* JADX WARNING: type inference failed for: r3v0, types: [X.39y, com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v3, types: [X.39x, com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    public final ListenableFuture startWork() {
        ? obj = new Object();
        C255323tw r1 = this.mWorkerParams.A02;
        String obj2 = this.A01.A09.toString();
        String A032 = r1.A03("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME");
        String A033 = r1.A03("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME");
        if (TextUtils.isEmpty(A032)) {
            AnonymousClass389.A00();
            Log.e(A03, "Need to specify a package name for the Remote Service.");
            obj.A08(AnonymousClass7TE.A0w("Need to specify a package name for the Remote Service."));
            return obj;
        } else if (TextUtils.isEmpty(A033)) {
            AnonymousClass389.A00();
            Log.e(A03, "Need to specify a class name for the Remote Service.");
            obj.A08(AnonymousClass7TE.A0w("Need to specify a class name for the Remote Service."));
            return obj;
        } else {
            this.A00 = new ComponentName(A032, A033);
            C2379539x A002 = this.A02.A00(this.A00, new C11766SgC(AnonymousClass385.A00(this.mAppContext), this, obj2));
            Sd0 sd0 = new Sd0((Object) this, 0);
            Executor executor = this.mWorkerParams.A0A;
            ? obj3 = new Object();
            A002.addListener(new TI4(sd0, obj3, A002), executor);
            return obj3;
        }
    }

    public RemoteListenableWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.A01 = workerParameters;
        this.A02 = new SHS(context, this.mWorkerParams.A0A);
    }

    public void onStopped() {
        int stopReason = getStopReason();
        ComponentName componentName = this.A00;
        if (componentName != null) {
            this.A02.A00(componentName, new SgB(this, stopReason));
        }
    }
}
