package X;

import java.util.concurrent.Future;

/* renamed from: X.Ayl  reason: case insensitive filesystem */
public final class C41694Ayl extends 0Yg implements 0sP {
    public static final C41694Ayl A00 = new C41694Ayl();

    public C41694Ayl() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Future future = (Future) obj;
        0qQ.A0B(future, 0);
        Object obj2 = future.get();
        0qQ.A07(obj2);
        return obj2;
    }
}
