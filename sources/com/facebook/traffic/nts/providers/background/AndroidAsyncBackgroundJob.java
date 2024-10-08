package com.facebook.traffic.nts.providers.background;

import X.AnonymousClass7TG;
import X.C283015Ft;
import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class AndroidAsyncBackgroundJob extends C283015Ft {
    public static final Companion Companion = new Object();
    public static final String TAG = "TNTSAsyncBackgroundV2Job";

    /* JADX WARNING: type inference failed for: r1v0, types: [X.39x, com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    public ListenableFuture startWork() {
        ? obj = new Object();
        BackgroundV2TaskSchedulerAppLayerUpcallsImpl.Companion.executeReadyTasksAsyncAndReschedule(obj);
        return obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidAsyncBackgroundJob(Context context, WorkerParameters workerParameters) {
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
