package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.P9b  reason: case insensitive filesystem */
public final class C72518P9b implements AnonymousClass7XA {
    public final int A00;
    public final Object A01;

    public C72518P9b(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final boolean isResumed() {
        return ((Fragment) this.A01).isResumed();
    }
}
