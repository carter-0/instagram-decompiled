package com.instagram.direct.perf.navigation;

import X.0qQ;
import X.1aF;
import X.1aU;
import X.AnonymousClass1aS;

public final class MPLTamSyncGroupStateNotifyOnCompletionCallback {
    public static final MPLTamSyncGroupStateNotifyOnCompletionCallback INSTANCE = new Object();
    public static final AnonymousClass1aS isCompleted = 1aF.A01(false);

    public static final 1aU getIsCompleted() {
        return isCompleted;
    }

    public static final boolean getIsCompletedValue() {
        return 0qQ.A0K(isCompleted.A0X(), true);
    }

    public static final void success() {
        isCompleted.accept(true);
    }
}
