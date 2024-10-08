package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.HrW  reason: case insensitive filesystem */
public final class C56024HrW {
    public final ArrayList A00 = AnonymousClass7TE.A1C();

    public final void A00() {
        Iterator A1G = AnonymousClass7TE.A1G(this.A00);
        while (A1G.hasNext()) {
            ((HQV) AnonymousClass7TF.A0a(A1G)).A00.setHasTransientState(false);
        }
    }

    public final void A01() {
        Iterator A1G = AnonymousClass7TE.A1G(this.A00);
        while (A1G.hasNext()) {
            ((HQV) AnonymousClass7TF.A0a(A1G)).A00.setHasTransientState(true);
        }
    }
}
