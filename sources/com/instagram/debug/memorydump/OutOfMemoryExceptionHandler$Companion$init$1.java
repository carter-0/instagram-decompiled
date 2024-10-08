package com.instagram.debug.memorydump;

import X.0Gu;
import X.0qQ;
import X.AnonymousClass0Gj;

public final class OutOfMemoryExceptionHandler$Companion$init$1 implements 0Gu {
    public int getId() {
        return 5;
    }

    public int handleUncaughtException(Thread thread, Throwable th, AnonymousClass0Gj r4) {
        0qQ.A0B(th, 1);
        OutOfMemoryExceptionHandler outOfMemoryExceptionHandler = OutOfMemoryExceptionHandler.handler;
        0qQ.A0A(outOfMemoryExceptionHandler);
        return outOfMemoryExceptionHandler.handleUncaughtException(th);
    }

    public /* synthetic */ int getFlags() {
        return 0;
    }
}
