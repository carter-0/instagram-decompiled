package X;

import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.7nf  reason: invalid class name and case insensitive filesystem */
public final class C341877nf {
    public CopyOnWriteArraySet A00 = new CopyOnWriteArraySet();

    public final void A00() {
        if (!this.A00.isEmpty()) {
            C342057ny.A00(new C348877zA(this));
        }
    }

    public final Object clone() {
        throw new CloneNotSupportedException("CameraLifecycleNotifier is a singleton and cannot be cloned!");
    }
}
