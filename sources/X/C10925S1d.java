package X;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: X.S1d  reason: case insensitive filesystem */
public final class C10925S1d {
    public boolean A00;
    public final Set A01 = AnonymousClass7TE.A1F();
    public final Set A02 = Collections.newSetFromMap(new WeakHashMap());

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append(super.toString());
        A1A.append("{numRequests=");
        A1A.append(this.A02.size());
        A1A.append(", isPaused=");
        return C66584MXp.A0b(A1A, this.A00);
    }
}
