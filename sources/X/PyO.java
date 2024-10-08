package X;

import android.content.Context;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public final class PyO {
    public static PyO A04;
    public int A00 = 1;
    public PyP A01 = new PyP(this);
    public final Context A02;
    public final ScheduledExecutorService A03;

    public static final synchronized AnonymousClass9GD A00(PyO pyO, PyR pyR) {
        AnonymousClass9GD r0;
        synchronized (pyO) {
            Pxg.A1N("MessengerIpcClient", pyR);
            if (!pyO.A01.A02(pyR)) {
                PyP pyP = new PyP(pyO);
                pyO.A01 = pyP;
                pyP.A02(pyR);
            }
            r0 = pyR.A03.A00;
        }
        return r0;
    }

    public static synchronized PyO A01(Context context) {
        PyO pyO;
        synchronized (PyO.class) {
            pyO = A04;
            if (pyO == null) {
                pyO = new PyO(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new PyM("MessengerIpcClient"))));
                A04 = pyO;
            }
        }
        return pyO;
    }

    public PyO(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.A03 = scheduledExecutorService;
        this.A02 = context.getApplicationContext();
    }
}
