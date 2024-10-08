package com.facebook.tigon.tigonhuc;

import X.0qQ;
import java.util.concurrent.Future;

public final class HucRequestToken {
    public final Future future;

    public HucRequestToken(Future future2) {
        0qQ.A0B(future2, 1);
        this.future = future2;
    }

    public final void cancel() {
        this.future.cancel(true);
    }
}
