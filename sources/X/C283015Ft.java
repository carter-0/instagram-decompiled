package X;

import android.content.Context;
import android.net.Network;
import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* renamed from: X.5Ft  reason: invalid class name and case insensitive filesystem */
public abstract class C283015Ft {
    public Context mAppContext;
    public volatile int mStopReason = -256;
    public boolean mUsed;
    public WorkerParameters mWorkerParams;

    public void onStopped() {
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract ListenableFuture startWork();

    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.A0A;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.39y, com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    public ListenableFuture getForegroundInfoAsync() {
        ? obj = new Object();
        obj.A08(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return obj;
    }

    public final UUID getId() {
        return this.mWorkerParams.A09;
    }

    public final C255323tw getInputData() {
        return this.mWorkerParams.A02;
    }

    public final Network getNetwork() {
        return this.mWorkerParams.A06.A00;
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.A01;
    }

    public final int getStopReason() {
        return this.mStopReason;
    }

    public final Set getTags() {
        return this.mWorkerParams.A08;
    }

    public AnonymousClass38N getTaskExecutor() {
        return this.mWorkerParams.A07;
    }

    public final List getTriggeredContentAuthorities() {
        return this.mWorkerParams.A06.A01;
    }

    public final List getTriggeredContentUris() {
        return this.mWorkerParams.A06.A02;
    }

    public AnonymousClass38I getWorkerFactory() {
        return this.mWorkerParams.A05;
    }

    public final boolean isStopped() {
        if (this.mStopReason != -256) {
            return true;
        }
        return false;
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    public final ListenableFuture setForegroundAsync(C7325Q4b q4b) {
        WorkerParameters workerParameters = this.mWorkerParams;
        return workerParameters.A03.EX9(this.mAppContext, q4b, workerParameters.A09);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.39x, com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    public ListenableFuture setProgressAsync(C255323tw r6) {
        WorkerParameters workerParameters = this.mWorkerParams;
        C282985Fn r4 = workerParameters.A04;
        UUID uuid = workerParameters.A09;
        C282975Fm r42 = (C282975Fm) r4;
        ? obj = new Object();
        r42.A01.ATP(new TJR(r6, r42, obj, uuid));
        return obj;
    }

    public final void stop(int i) {
        this.mStopReason = i;
        onStopped();
    }

    public C283015Ft(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        } else if (workerParameters != null) {
            this.mAppContext = context;
            this.mWorkerParams = workerParameters;
        } else {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
    }
}
