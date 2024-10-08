package com.facebook.papaya.client.platform;

import X.AnonymousClass7TF;
import X.TOJ;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class PlatformThreadUtil {
    public static ScheduledExecutorService createExecutor(String str) {
        if (str.equals("scheduling_thread")) {
            return Executors.newSingleThreadScheduledExecutor(new TOJ(1));
        }
        if (str.equals("random_thread")) {
            return Executors.newScheduledThreadPool(5, new TOJ(2));
        }
        throw AnonymousClass7TF.A0W("No executor for type ", str);
    }
}
