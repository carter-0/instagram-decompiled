package X;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.96M  reason: invalid class name */
public final class AnonymousClass96M implements C3734495k {
    public volatile Set A00;
    public volatile Set A01;

    public final /* bridge */ /* synthetic */ Object get() {
        if (this.A00 == null) {
            synchronized (this) {
                if (this.A00 == null) {
                    this.A00 = Collections.newSetFromMap(new ConcurrentHashMap());
                    for (C3734495k r0 : this.A01) {
                        this.A00.add(r0.get());
                    }
                    this.A01 = null;
                }
            }
        }
        return Collections.unmodifiableSet(this.A00);
    }
}
