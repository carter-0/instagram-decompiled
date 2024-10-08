package X;

import java.util.concurrent.Executor;

public final class TO3 implements Executor {
    public ThreadLocal A00 = new ThreadLocal();

    private void A00() {
        ThreadLocal threadLocal = this.A00;
        Number number = (Number) threadLocal.get();
        if (number == null) {
            number = C51967G9n.A0k();
        }
        int intValue = number.intValue() - 1;
        if (intValue == 0) {
            threadLocal.remove();
        } else {
            threadLocal.set(Integer.valueOf(intValue));
        }
    }

    public final void execute(Runnable runnable) {
        ThreadLocal threadLocal = this.A00;
        Number number = (Number) threadLocal.get();
        if (number == null) {
            number = C51967G9n.A0k();
        }
        int intValue = number.intValue() + 1;
        threadLocal.set(Integer.valueOf(intValue));
        if (intValue <= 15) {
            try {
                runnable.run();
            } catch (Throwable th) {
                A00();
                throw th;
            }
        } else {
            C11191SEr.A03.A01.execute(runnable);
        }
        A00();
    }
}
