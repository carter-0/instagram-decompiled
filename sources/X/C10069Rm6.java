package X;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: X.Rm6  reason: case insensitive filesystem */
public abstract class C10069Rm6 {
    public static final ExecutorService A00;
    public static final ThreadFactory A01;

    static {
        TOS tos = TOS.A00;
        A01 = tos;
        A00 = Executors.newCachedThreadPool(tos);
    }
}
