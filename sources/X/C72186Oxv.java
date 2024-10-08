package X;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Oxv  reason: case insensitive filesystem */
public final class C72186Oxv implements AnonymousClass0lh {
    public final ConcurrentHashMap A00 = new ConcurrentHashMap();

    public final void onSessionWillEnd() {
        this.A00.clear();
    }
}
