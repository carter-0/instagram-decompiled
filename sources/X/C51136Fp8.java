package X;

/* renamed from: X.Fp8  reason: case insensitive filesystem */
public final class C51136Fp8 implements 1aV {
    public final int A00;
    public final Object A01;

    public C51136Fp8(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C71087ObS obS;
        Object obj2;
        int i;
        switch (this.A00) {
            case 0:
                obS = (C71087ObS) obj;
                obj2 = this.A01;
                i = 2;
                break;
            case 1:
                obS = (C71087ObS) obj;
                obj2 = this.A01;
                i = 3;
                break;
            default:
                C257443xP r4 = (C257443xP) obj;
                if (r4.A06() && ((1XQ) r4.A03()).isOk()) {
                    AnonymousClass2Fj r2 = ((C46771Dky) this.A01).A01;
                    Object A02 = r2.A02();
                    if (A02 != null) {
                        C47158DrZ drZ = (C47158DrZ) A02;
                        drZ.A04 = false;
                        drZ.A06 = true;
                        drZ.A00 = ((Dw5) r4.A03()).A00;
                        drZ.A05 = ((Dw5) r4.A03()).A03;
                        drZ.A01 = ((Dw5) r4.A03()).A01;
                        drZ.A02 = ((Dw5) r4.A03()).A02;
                        r2.A0A(drZ);
                        return;
                    }
                    throw AnonymousClass7TE.A0y();
                }
                return;
        }
        obS.A04(new C56912IHh(obj2, i));
    }
}
