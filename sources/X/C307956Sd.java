package X;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.6Sd  reason: invalid class name and case insensitive filesystem */
public final class C307956Sd implements AnonymousClass0lh {
    public final Set A00 = new HashSet();
    public final AtomicBoolean A01 = new AtomicBoolean(false);

    public final void onSessionWillEnd() {
        this.A00.clear();
        this.A01.set(false);
    }
}
