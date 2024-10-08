package X;

import java.io.Serializable;

/* renamed from: X.Qm3  reason: case insensitive filesystem */
public final class C8254Qm3 extends SGT implements Serializable {
    public final SGT A00;
    public final SGT A01;

    public C8254Qm3(SGT sgt, SGT sgt2) {
        this.A00 = sgt;
        this.A01 = sgt2;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("[ChainedTransformer(");
        A1A.append(this.A00);
        Pxe.A1Y(A1A);
        A1A.append(this.A01);
        return AnonymousClass7TF.A0l(")]", A1A);
    }
}
