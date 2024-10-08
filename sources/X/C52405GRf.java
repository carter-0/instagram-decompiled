package X;

import java.util.List;

/* renamed from: X.GRf  reason: case insensitive filesystem */
public final class C52405GRf extends 0Yg implements 0sP {
    public final float A00;
    public final int A01;
    public final int A02;
    public final Object A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52405GRf(Object obj, float f, int i, int i2) {
        super(1);
        this.A01 = i2;
        this.A00 = f;
        this.A03 = obj;
        this.A02 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (this.A01 != 0) {
            C55435Hhf hhf = (C55435Hhf) obj;
            0qQ.A0B(hhf, 0);
            C53418GoA goA = (C53418GoA) this.A03;
            0qQ.A0B(goA, 0);
            ((List) hhf.A00.A01).add(new C53408Go0((C52710GbN) null, new C53417Go9(this.A02), goA, (float[]) null, this.A00, 4.0f, 0.0f, 3, 1, 0));
        } else {
            AnonymousClass6JX r0 = AnonymousClass6JX.A03;
            Float valueOf = Float.valueOf(this.A00);
            C74589Pxc pxc = (C74589Pxc) this.A03;
            ((AnonymousClass5SW) obj).ENH(AnonymousClass5SZ.A0L, new AnonymousClass6JX(pxc, AnonymousClass7TE.A04(C229632nm.A09(valueOf, pxc)), this.A02));
        }
        return C60340gF.A00;
    }
}
