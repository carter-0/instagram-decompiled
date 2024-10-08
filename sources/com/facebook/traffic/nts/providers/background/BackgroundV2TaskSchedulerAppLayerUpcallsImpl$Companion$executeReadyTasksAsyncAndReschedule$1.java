package com.facebook.traffic.nts.providers.background;

import X.AnonymousClass5G1;
import X.C2379539x;

public final class BackgroundV2TaskSchedulerAppLayerUpcallsImpl$Companion$executeReadyTasksAsyncAndReschedule$1 implements Runnable {
    public final /* synthetic */ C2379539x $future;

    public BackgroundV2TaskSchedulerAppLayerUpcallsImpl$Companion$executeReadyTasksAsyncAndReschedule$1(C2379539x r1) {
        this.$future = r1;
    }

    public final void run() {
        ((BackgroundV2TaskSchedulerAppLayer) BackgroundV2TaskSchedulerAppLayerUpcallsImpl._backgroundTaskSchedulerImplFuture.get()).executeReadyTasksAndReschedule();
        this.$future.A07(new AnonymousClass5G1());
    }
}
