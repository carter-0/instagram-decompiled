package X;

import java.util.concurrent.CancellationException;

public abstract class RSG {
    public static final void A00(Throwable th) {
        if ((th instanceof VirtualMachineError) || (th instanceof ThreadDeath) || (th instanceof InterruptedException) || (th instanceof LinkageError) || !(!(th instanceof CancellationException))) {
            throw th;
        }
    }
}
