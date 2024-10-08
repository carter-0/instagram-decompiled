package X;

/* renamed from: X.8O2  reason: invalid class name */
public final class AnonymousClass8O2 implements AnonymousClass8O3 {
    public final /* synthetic */ AnonymousClass8BA A00;

    public AnonymousClass8O2(AnonymousClass8BA r1) {
        this.A00 = r1;
    }

    public final boolean Etk() {
        boolean z;
        C3499482o r1 = this.A00.A14;
        if (r1.A0I()) {
            return false;
        }
        AnonymousClass82Y r12 = r1.A01;
        C352218Cl A03 = r12.A03();
        if (A03 != null) {
            z = A03.A19;
        } else {
            C349307zv A04 = r12.A04();
            if (A04 == null) {
                return true;
            }
            z = A04.A1K;
        }
        if (!z) {
            return true;
        }
        return false;
    }
}
