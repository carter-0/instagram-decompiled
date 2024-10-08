package X;

import java.util.concurrent.Future;

/* renamed from: X.Ayk  reason: case insensitive filesystem */
public final class C41693Ayk extends 0Yg implements 0sP {
    public static final C41693Ayk A00 = new C41693Ayk();

    public C41693Ayk() {
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
