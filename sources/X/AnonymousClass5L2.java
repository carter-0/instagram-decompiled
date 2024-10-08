package X;

/* renamed from: X.5L2  reason: invalid class name */
public final class AnonymousClass5L2 implements AnonymousClass5L0 {
    public AnonymousClass5L0[] A00;

    public final boolean Ccs(Class cls) {
        for (AnonymousClass5L0 Ccs : this.A00) {
            if (Ccs.Ccs(cls)) {
                return true;
            }
        }
        return false;
    }

    public final AnonymousClass5LN CoF(Class cls) {
        for (AnonymousClass5L0 r1 : this.A00) {
            if (r1.Ccs(cls)) {
                return r1.CoF(cls);
            }
        }
        throw new UnsupportedOperationException(002.A0R(Pxd.A00(158), cls.getName()));
    }
}
