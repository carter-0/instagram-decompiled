package X;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class TO9 implements Future {
    public Exception A00;
    public Object A01;
    public final CountDownLatch A02 = Pxf.A0y();

    public final Object get(long j, TimeUnit timeUnit) {
        0qQ.A0B(timeUnit, 1);
        if (this.A02.await(j, timeUnit)) {
            Exception exc = this.A00;
            if (exc == null) {
                return this.A01;
            }
            throw new ExecutionException(exc);
        }
        throw new TimeoutException("Timed out waiting for result");
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return AnonymousClass7TF.A1Q((this.A02.getCount() > 0 ? 1 : (this.A02.getCount() == 0 ? 0 : -1)));
    }

    public final boolean cancel(boolean z) {
        throw C66580MXl.A11();
    }

    public final Object get() {
        this.A02.await();
        Exception exc = this.A00;
        if (exc == null) {
            return this.A01;
        }
        throw new ExecutionException(exc);
    }
}
