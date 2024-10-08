package X;

/* renamed from: X.Lb1  reason: case insensitive filesystem */
public final class C64384Lb1 implements C13816Thj {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public final void D5G(C11286SJe sJe) {
        0qQ.A0B(sJe, 0);
        ((AnonymousClass4D7) this.A01).resumeWith(sJe);
    }

    public final void DEX(C8989RKf rKf) {
        0qQ.A0B(rKf, 0);
        ((AnonymousClass4D7) this.A01).resumeWith(JTO.A1B(rKf));
    }

    public C64384Lb1(C66498MUb mUb, 0rm r2, 1IX r3, int i) {
        this.A00 = i;
        this.A01 = r3;
        this.A03 = mUb;
        this.A02 = r2;
    }

    public final void D0e() {
        C11286SJe sJe;
        C11286SJe sJe2;
        int i = this.A00;
        AnonymousClass4D7 r2 = (AnonymousClass4D7) this.A01;
        C66498MUb mUb = (C66498MUb) this.A03;
        0rm r0 = (0rm) this.A02;
        if (i != 0) {
            try {
                Object obj = r0.A00;
                if (obj != null) {
                    sJe2 = mUb.FNE((C66373MPe) obj);
                    r2.resumeWith(sJe2);
                    return;
                }
                throw AnonymousClass7TE.A0y();
            } catch (Throwable th) {
                sJe2 = JTO.A1B(th);
            }
        } else {
            try {
                Object obj2 = r0.A00;
                if (obj2 != null) {
                    sJe = mUb.FNE((C66373MPe) obj2);
                    r2.resumeWith(sJe);
                    return;
                }
                throw AnonymousClass7TE.A0y();
            } catch (Throwable th2) {
                sJe = JTO.A1B(th2);
            }
        }
    }

    public final void onStart() {
    }

    public final void DaE(float f) {
    }
}
