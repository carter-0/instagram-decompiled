package com.facebook.react.bridge.queue;

import X.C9533RcW;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

public interface MessageQueueThread {
    void assertIsOnThread();

    void assertIsOnThread(String str);

    Future callOnQueue(Callable callable);

    C9533RcW getPerfStats();

    boolean isIdle();

    boolean isOnThread();

    void quitSynchronous();

    void resetPerfStats();

    boolean runOnQueue(Runnable runnable);
}
