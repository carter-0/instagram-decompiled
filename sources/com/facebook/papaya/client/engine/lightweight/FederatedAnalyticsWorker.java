package com.facebook.papaya.client.engine.lightweight;

import X.0KC;
import X.0qQ;
import X.0xY;
import X.0xa;
import X.AnonymousClass385;
import X.AnonymousClass5G1;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C11172SDq;
import X.C282925Fh;
import X.C282935Fi;
import X.DbT;
import X.DbX;
import X.Pxe;
import X.Pxf;
import X.RFG;
import X.RW8;
import X.RW9;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.facebook.papaya.client.model_loader.IModelLoader;
import com.facebook.papaya.client.transport.ITransport;
import com.facebook.papaya.fb.instagram.lightweight.IgPapayaFederatedAnalyticsWorker;
import com.facebook.papaya.log.Log;
import com.facebook.papaya.log.LogSink;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public abstract class FederatedAnalyticsWorker extends Worker {
    public static final RW9 Companion = new Object();
    public static final long DEFAULT_FREQUENCY_IN_HOURS = 0;
    public static final String FEDERATED_ANALYTICS_JOB_FREQUENCY_KEY = "background_job_frequency";
    public static final String FEDERATED_ANALYTICS_JOB_SCHEDULED_KEY = "background_job_scheduled";
    public static final Object LOCK = Pxe.A0p();
    public static final String TAG = "FederatedAnalyticsWorker";
    public static final String WORK_NAME = "federated_analytics_background_work";

    public abstract ImmutableSet getClientTags();

    public abstract ImmutableMap getExecutorFactories();

    public abstract String getLocalDataDirectoryPath();

    public abstract ImmutableMap getLogSinks();

    public abstract IModelLoader getModelLoader();

    public abstract String getPopulationName();

    public abstract ScheduledExecutorService getScheduledExecutorService();

    public abstract String getSharedDataDirectoryPath();

    public abstract C11172SDq getSharedPreferences();

    public abstract ITransport getTransport();

    public abstract boolean isFederatedAnalyticsEnabled();

    public abstract void onWorkComplete(boolean z, Throwable th);

    public abstract void onWorkStart();

    private final void addLogSinks(ImmutableMap immutableMap) {
        if (immutableMap != null) {
            Iterator it = immutableMap.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(it);
                Log.nativeAddLogSink(DbT.A13(A1J), RFG.VERBOSE.A00, (LogSink) A1J.getValue());
            }
        }
    }

    private final void cancelWork() {
        synchronized (LOCK) {
            AnonymousClass385.A00(this.mAppContext).A05(WORK_NAME);
            0xa r0 = C11172SDq.A01.A00;
            DbX.A1V(r0, FEDERATED_ANALYTICS_JOB_SCHEDULED_KEY, false);
            0xY AR4 = r0.AR4();
            AR4.E5c(FEDERATED_ANALYTICS_JOB_FREQUENCY_KEY, 0);
            AR4.apply();
        }
    }

    private final void removeLogSinks(ImmutableMap immutableMap) {
        if (immutableMap != null) {
            Iterator it = immutableMap.entrySet().iterator();
            while (it.hasNext()) {
                Log.nativeRemoveLogSink(DbT.A13(AnonymousClass7TE.A1J(it)));
            }
        }
    }

    public C282935Fi doWork() {
        onWorkStart();
        IgPapayaFederatedAnalyticsWorker igPapayaFederatedAnalyticsWorker = (IgPapayaFederatedAnalyticsWorker) this;
        if (!igPapayaFederatedAnalyticsWorker.A02) {
            cancelWork();
        } else {
            try {
                RW8 rw8 = Engine.Companion;
                ScheduledThreadPoolExecutor A0z = Pxf.A0z();
                ImmutableMap executorFactories = getExecutorFactories();
                ITransport transport = getTransport();
                Context context = this.mAppContext;
                0qQ.A07(context);
                new Engine(A0z, "ig4a", executorFactories, transport, context, igPapayaFederatedAnalyticsWorker.A00, igPapayaFederatedAnalyticsWorker.A01, (IModelLoader) null, getClientTags()).run().get();
            } catch (Exception e) {
                0KC.A0F(TAG, "Failed to run Federated Analytics background worker", e);
                return new C282925Fh();
            }
        }
        return new AnonymousClass5G1();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FederatedAnalyticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AnonymousClass7TG.A1O(context, workerParameters);
    }
}
