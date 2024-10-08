package X;

import android.os.Handler;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.SEz  reason: case insensitive filesystem */
public final class C11199SEz {
    public static C13274TSp A03;
    public static ThreadPoolExecutor A04;
    public static final BlockingQueue A05;
    public Handler A00;
    public final Set A01 = AnonymousClass7TE.A1F();
    public final Set A02 = AnonymousClass7TE.A1F();

    static {
        C13273TSo tSo = new C13273TSo();
        A05 = tSo;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        QLw qLw = new QLw(tSo, new TOQ(10, "WhatsApp Worker"), timeUnit);
        A03 = qLw;
        qLw.setRejectedExecutionHandler(new TOB());
        A04 = new C13274TSp(1, Integer.MAX_VALUE, 120, timeUnit, new SynchronousQueue(), new TOQ(0, "High Pri Worker"));
    }
}
