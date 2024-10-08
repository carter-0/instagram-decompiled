package X;

import java.util.Comparator;
import java.util.TreeSet;

/* renamed from: X.5TP  reason: invalid class name */
public final class AnonymousClass5TP {
    public final AnonymousClass5TS A00;
    public final AnonymousClass0eM A01 = AnonymousClass0eN.A00(0eO.A02, AnonymousClass5TQ.A00);
    public final Comparator A02;

    public final void A00(AnonymousClass5R6 r2) {
        if (r2.A0A != null) {
            this.A00.remove(r2);
        } else {
            I2E.A01("DepthSortedSet.remove called on an unattached node");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final String toString() {
        return this.A00.toString();
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.5TS, java.util.TreeSet] */
    public AnonymousClass5TP() {
        AnonymousClass5TR r1 = new AnonymousClass5TR();
        this.A02 = r1;
        this.A00 = new TreeSet(r1);
    }
}
