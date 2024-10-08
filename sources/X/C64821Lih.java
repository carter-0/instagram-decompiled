package X;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Lih  reason: case insensitive filesystem */
public final class C64821Lih implements AnonymousClass0lh {
    public final Map A00 = new ConcurrentHashMap();

    public final synchronized void onSessionWillEnd() {
        this.A00.clear();
    }
}
