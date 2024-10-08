package X;

/* renamed from: X.9Bf  reason: invalid class name and case insensitive filesystem */
public final class C374889Bf implements AnonymousClass9Bd {
    public AnonymousClass9Bd[] A00;

    public final boolean Ccs(Class cls) {
        for (AnonymousClass9Bd Ccs : this.A00) {
            if (Ccs.Ccs(cls)) {
                return true;
            }
        }
        return false;
    }

    public final AnonymousClass9C1 CoG(Class cls) {
        for (AnonymousClass9Bd r1 : this.A00) {
            if (r1.Ccs(cls)) {
                return r1.CoG(cls);
            }
        }
        throw new UnsupportedOperationException(002.A0R(Pxd.A00(158), cls.getName()));
    }
}
