package com.facebook.traffic.nts.providers.background;

import X.AnonymousClass5G1;
import X.AnonymousClass7TG;
import X.C282935Fi;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class AndroidBackgroundJob extends Worker {
    public static final Companion Companion = new Object();
    public static final String TAG = "TNTSBackgroundV2Job";

    public C282935Fi doWork() {
        BackgroundV2TaskSchedulerAppLayerUpcallsImpl.Companion.executeReadyTasksAndReschedule();
        return new AnonymousClass5G1();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidBackgroundJob(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AnonymousClass7TG.A1O(context, workerParameters);
    }

    public final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }
}
