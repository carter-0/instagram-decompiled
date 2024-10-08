package X;

import com.facebook.common.time.RealtimeSinceBootClock;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: X.Vrc  reason: case insensitive filesystem */
public final class C18433Vrc {
    public final AnonymousClass0JR A00;
    public final ExecutorService A01 = Executors.newFixedThreadPool(3);

    public C18433Vrc(int i) {
        RealtimeSinceBootClock realtimeSinceBootClock = RealtimeSinceBootClock.A00;
        this.A00 = realtimeSinceBootClock;
    }

    public C18433Vrc() {
        RealtimeSinceBootClock realtimeSinceBootClock = RealtimeSinceBootClock.A00;
        this.A00 = realtimeSinceBootClock;
    }
}
