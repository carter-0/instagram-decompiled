package X;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.968  reason: invalid class name */
public final class AnonymousClass968 {
    public static final ThreadFactory A03 = C41376Asx.A00;
    public C3734495k A00;
    public final Set A01;
    public final Executor A02;

    public AnonymousClass968(Context context, Set set) {
        AnonymousClass96L r0 = new AnonymousClass96L(new AX7(context));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), A03);
        this.A00 = r0;
        this.A01 = set;
        this.A02 = threadPoolExecutor;
    }
}
