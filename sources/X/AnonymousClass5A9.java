package X;

import java.util.Observable;
import java.util.Observer;

/* renamed from: X.5A9  reason: invalid class name */
public final class AnonymousClass5A9 implements Observer {
    public AnonymousClass5A7 A00;

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass5A9) || !this.A00.equals(((AnonymousClass5A9) obj).A00)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final void update(Observable observable, Object obj) {
        this.A00.DvN(obj);
    }
}
