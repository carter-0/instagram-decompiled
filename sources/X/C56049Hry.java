package X;

import android.view.KeyEvent;

/* renamed from: X.Hry  reason: case insensitive filesystem */
public final class C56049Hry {
    public final KeyEvent A00;

    public final boolean equals(Object obj) {
        KeyEvent keyEvent = this.A00;
        if (!(obj instanceof C56049Hry) || !0qQ.A0K(keyEvent, ((C56049Hry) obj).A00)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        KeyEvent keyEvent = this.A00;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("KeyEvent(nativeKeyEvent=");
        return AnonymousClass7TG.A0n(keyEvent, A1A);
    }

    public /* synthetic */ C56049Hry(KeyEvent keyEvent) {
        this.A00 = keyEvent;
    }
}
