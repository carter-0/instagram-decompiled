package X;

/* renamed from: X.Qx0  reason: case insensitive filesystem */
public abstract class C8562Qx0 extends C12587Sym {
    public C8563Qx1 A00;
    public final C8563Qx1 A01;

    public final /* bridge */ /* synthetic */ C13957TmK FPi() {
        throw AnonymousClass00P.createAndThrow();
    }

    /* renamed from: A00 */
    public final C8562Qx0 clone() {
        C8562Qx0 qx0 = (C8562Qx0) this.A01.A0N(5, (Object) null, (Object) null);
        qx0.A00 = A03();
        return qx0;
    }

    /* renamed from: A02 */
    public final C8563Qx1 A03() {
        C8563Qx1 qx1 = this.A00;
        if (qx1.A0S()) {
            qx1.A0O();
        }
        return this.A00;
    }

    public final void A04() {
        if (!this.A00.A0S()) {
            A05();
        }
    }

    public final void A05() {
        C8563Qx1 A0M = this.A01.A0M();
        Pxg.A0S(A0M).FPr(A0M, this.A00);
        this.A00 = A0M;
    }

    public C8562Qx0(C8563Qx1 qx1) {
        this.A01 = qx1;
        if (!qx1.A0S()) {
            this.A00 = qx1.A0M();
            return;
        }
        throw AnonymousClass7TE.A0w("Default instance must be immutable.");
    }

    public final C8563Qx1 A01() {
        C8563Qx1 A02 = A03();
        if (A02.A0R()) {
            return A02;
        }
        throw new C13217TQi();
    }
}
