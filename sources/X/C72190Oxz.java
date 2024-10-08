package X;

import java.util.HashSet;
import java.util.Set;

/* renamed from: X.Oxz  reason: case insensitive filesystem */
public final class C72190Oxz implements AnonymousClass0lh {
    public final C70749OJv A00;
    public final Set A01;

    public final void onSessionWillEnd() {
        this.A01.clear();
    }

    public C72190Oxz(C70749OJv oJv) {
        Set stringSet;
        this.A00 = oJv;
        HashSet A1F = AnonymousClass7TE.A1F();
        this.A01 = A1F;
        synchronized (oJv) {
            stringSet = oJv.A00.getStringSet("thread_blocks_warned_on", (Set) null);
        }
        if (stringSet != null) {
            A1F.addAll(stringSet);
        }
    }
}
