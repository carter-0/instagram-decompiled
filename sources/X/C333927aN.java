package X;

import java.lang.ref.WeakReference;

/* renamed from: X.7aN  reason: invalid class name and case insensitive filesystem */
public final class C333927aN implements AnonymousClass0lh {
    public final WeakReference A00;

    public final void onSessionWillEnd() {
        this.A00.clear();
    }

    public C333927aN(C333937aO r2) {
        this.A00 = new WeakReference(r2);
    }
}
