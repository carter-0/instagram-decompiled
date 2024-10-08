package X;

import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.Executors;

/* renamed from: X.A2m  reason: case insensitive filesystem */
public abstract class C39622A2m {
    public static final C258483z9 A00;
    public static final 1a8 A01 = new 1a8(C318146oT.A01);
    public static final AGu A02 = new Object();

    /* JADX WARNING: type inference failed for: r0v0, types: [X.AGu, java.lang.Object] */
    static {
        C258483z9 listeningDecorator = MoreExecutors.listeningDecorator(Executors.newSingleThreadExecutor());
        0qQ.A07(listeningDecorator);
        A00 = listeningDecorator;
    }
}
