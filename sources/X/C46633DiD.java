package X;

import java.util.concurrent.Callable;

/* renamed from: X.DiD  reason: case insensitive filesystem */
public final class C46633DiD implements Callable {
    public final /* bridge */ /* synthetic */ Object call() {
        1WP instance = 1WP.getInstance();
        if (instance != null) {
            return instance;
        }
        throw AnonymousClass7TE.A0z("Unable to initialize SmartLockPlugin!");
    }
}
