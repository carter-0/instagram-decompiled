package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.TyD  reason: case insensitive filesystem */
public final class C14548TyD implements 2ej {
    public final ArrayList A00 = new ArrayList();

    public final void A7c(AnonymousClass2eo r2) {
        0qQ.A0B(r2, 0);
        this.A00.add(r2);
    }

    public final AnonymousClass2eo AX9(int i) {
        return (AnonymousClass2eo) DbZ.A0g(this.A00, i);
    }

    public final void clear() {
        this.A00.clear();
    }

    public final Iterator iterator() {
        return AnonymousClass7TE.A1G(this.A00);
    }

    public final int size() {
        return this.A00.size();
    }
}
