package X;

import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* renamed from: X.T0a  reason: case insensitive filesystem */
public final /* synthetic */ class C12616T0a implements C3734795q {
    public static final /* synthetic */ C12616T0a A00 = new Object();

    public final Object ALH(C3734995s r6) {
        C10477Rss rss = new C10477Rss();
        C13090TKx tKx = C13090TKx.A00;
        ReferenceQueue referenceQueue = rss.A00;
        Set set = rss.A01;
        set.add(new TRU(rss, tKx, referenceQueue, set));
        Thread thread = new Thread(new THK(referenceQueue, set), "MlKitCleaner");
        thread.setDaemon(true);
        thread.start();
        return rss;
    }
}
