package X;

import java.util.concurrent.Callable;

/* renamed from: X.6oW  reason: invalid class name and case insensitive filesystem */
public abstract class C318176oW {
    public static void A01(Throwable th) {
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!(th instanceof Y5G) && !(th instanceof IllegalStateException) && !(th instanceof NullPointerException) && !(th instanceof IllegalArgumentException) && !(th instanceof C13225TQr)) {
            StringBuilder sb = new StringBuilder();
            sb.append("The exception could not be delivered to the consumer because it has already canceled/disposed the flow or the exception has nowhere to go to begin with. Further reading: https://github.com/ReactiveX/RxJava/wiki/What's-different-in-2.0#error-handling | ");
            sb.append(th);
            th = new IllegalStateException(sb.toString(), th);
        }
        th.printStackTrace();
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }

    public static C318206oZ A00(Callable callable) {
        try {
            Object call = callable.call();
            1aP.A01(call, "Scheduler Callable result can't be null");
            return (C318206oZ) call;
        } catch (Throwable th) {
            throw C22013Xr3.A00(th);
        }
    }
}
