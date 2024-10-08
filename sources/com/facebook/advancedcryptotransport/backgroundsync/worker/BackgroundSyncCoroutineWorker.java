package com.facebook.advancedcryptotransport.backgroundsync.worker;

import X.AnonymousClass7TG;
import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.multiprocess.RemoteCoroutineWorker;

public final class BackgroundSyncCoroutineWorker extends RemoteCoroutineWorker {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackgroundSyncCoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AnonymousClass7TG.A1O(context, workerParameters);
    }
}
