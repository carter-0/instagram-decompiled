package X;

/* renamed from: X.9Jn  reason: invalid class name and case insensitive filesystem */
public final class C376839Jn extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C376839Jn(int i, AnonymousClass4D7 r3) {
        super(2, r3);
        this.A01 = i;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.9Jn, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r4) {
        int i;
        switch (this.A01) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            default:
                i = 3;
                break;
        }
        return new C376839Jn(i, r4);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C376839Jn) create(obj, (AnonymousClass4D7) obj2)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.9Jn, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        int i = this.A01;
        1Hj r4 = 1Hj.A02;
        int i2 = this.A00;
        switch (i) {
            case 0:
                if (i2 != 0) {
                    0eS.A00(obj);
                } else {
                    0eS.A00(obj);
                    2Vg r0 = 2Vg.A00;
                    this.A00 = 1;
                    if (((C61770pa) C70712Um.A02.getValue()).collect(r0, this) == r4) {
                        return r4;
                    }
                }
                throw new RuntimeException();
            case 1:
                if (i2 != 0) {
                    0eS.A00(obj);
                } else {
                    0eS.A00(obj);
                    2WR r02 = 2WR.A00;
                    this.A00 = 1;
                    if (((C61770pa) 2Vo.A01.getValue()).collect(r02, this) == r4) {
                        return r4;
                    }
                }
                throw new RuntimeException();
            case 2:
                if (i2 != 0) {
                    0eS.A00(obj);
                } else {
                    0eS.A00(obj);
                    C2593941n r03 = C2593941n.A00;
                    this.A00 = 1;
                    if (((C61770pa) 1Jk.A0A.getValue()).collect(r03, this) == r4) {
                        return r4;
                    }
                }
                throw new RuntimeException();
            default:
                if (i2 != 0) {
                    0eS.A00(obj);
                } else {
                    0eS.A00(obj);
                    C51629FxN fxN = new C51629FxN((Object) new C2594041o(), 25);
                    this.A00 = 1;
                    if (((C61770pa) C70712Um.A02.getValue()).collect(fxN, this) == r4) {
                        return r4;
                    }
                }
                throw new RuntimeException();
        }
    }
}
