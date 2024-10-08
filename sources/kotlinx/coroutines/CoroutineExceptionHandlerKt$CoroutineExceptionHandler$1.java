package kotlinx.coroutines;

import X.0sL;
import X.C2375037z;
import X.C262074Ca;
import X.C262094Cc;

public final class CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1 extends C262074Ca implements CoroutineExceptionHandler {
    public final /* synthetic */ 0sL $handler;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1(0sL r1, C2375037z r2) {
        super(r2);
        this.$handler = r1;
    }

    public void handleException(C262094Cc r2, Throwable th) {
        this.$handler.invoke(r2, th);
    }
}
