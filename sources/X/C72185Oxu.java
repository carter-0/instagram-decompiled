package X;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Oxu  reason: case insensitive filesystem */
public final class C72185Oxu implements AnonymousClass0lh {
    public final Set A00;

    public final synchronized void onSessionWillEnd() {
        this.A00.clear();
    }

    public C72185Oxu() {
        Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        0qQ.A07(newSetFromMap);
        this.A00 = newSetFromMap;
    }
}
