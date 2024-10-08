package X;

/* renamed from: X.5TO  reason: invalid class name */
public final class AnonymousClass5TO {
    public final AnonymousClass5TP A00 = new AnonymousClass5TP();
    public final AnonymousClass5TP A01 = new AnonymousClass5TP();

    public final void A00(AnonymousClass5R6 r3, boolean z) {
        AnonymousClass5TP r1 = this.A00;
        if (z) {
            if (r3.A0A != null) {
                r1.A00.add(r3);
            }
            I2E.A01("DepthSortedSet.add called on an unattached node");
            throw AnonymousClass00P.createAndThrow();
        } else if (r1.A00.contains(r3)) {
            return;
        }
        AnonymousClass5TP r12 = this.A01;
        if (r3.A0A != null) {
            r12.A00.add(r3);
            return;
        }
        I2E.A01("DepthSortedSet.add called on an unattached node");
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean A01() {
        if (!this.A01.A00.isEmpty() || !this.A00.A00.isEmpty()) {
            return false;
        }
        return true;
    }
}
