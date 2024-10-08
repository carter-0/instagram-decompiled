package com.facebook.commonavatarliveediting.prefetch;

import X.0KC;
import X.1IX;
import X.C2375037z;
import X.C262074Ca;
import X.C262094Cc;
import X.JTU;
import kotlinx.coroutines.CoroutineExceptionHandler;

public final class CommonBloksActionHelper$initPrefetch$lambda$12$$inlined$CoroutineExceptionHandler$1 extends C262074Ca implements CoroutineExceptionHandler {
    public final /* synthetic */ 1IX $continuation$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommonBloksActionHelper$initPrefetch$lambda$12$$inlined$CoroutineExceptionHandler$1(C2375037z r1, 1IX r2) {
        super(r1);
        this.$continuation$inlined = r2;
    }

    public void handleException(C262094Cc r3, Throwable th) {
        0KC.A0F("CommonBloksActionHelper", "initPrefetch failed", th);
        this.$continuation$inlined.resumeWith(JTU.A0c(th));
    }
}
