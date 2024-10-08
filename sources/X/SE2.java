package X;

import java.util.concurrent.Executor;

public final class SE2 {
    public static final int A01;
    public static final int A02;
    public static final SE2 A03 = new SE2();
    public final Executor A00 = new Object();

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        A01 = availableProcessors + 1;
        A02 = (availableProcessors * 2) + 1;
    }
}
