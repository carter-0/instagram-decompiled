package X;

/* renamed from: X.ImZ  reason: case insensitive filesystem */
public final class C58110ImZ extends AnonymousClass1Ek implements 0sK {
    public long A00;
    public Object A01;
    public final int A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58110ImZ(Object obj, AnonymousClass4D7 r3, int i) {
        super(3, r3);
        this.A02 = i;
        this.A01 = obj;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        long j;
        C58110ImZ imZ;
        switch (this.A02) {
            case 0:
                j = ((C289295dM) obj2).A00;
                imZ = new C58110ImZ(this.A01, (AnonymousClass4D7) obj3, 0);
                break;
            case 1:
                j = ((C288025bF) obj2).A00;
                imZ = new C58110ImZ((AnonymousClass4D7) obj3);
                imZ.A01 = obj;
                break;
            default:
                long j2 = ((C289295dM) obj2).A00;
                imZ = new C58110ImZ(this.A01, (AnonymousClass4D7) obj3, 2);
                imZ.A00 = j2;
                break;
        }
        imZ.A00 = j;
        return imZ.invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.A02) {
            case 0:
                0eS.A00(obj);
                C51967G9n.A14((C284945Oz) this.A01, C289295dM.A01(this.A00));
                break;
            case 1:
                0eS.A00(obj);
                AnonymousClass5VN r1 = (AnonymousClass5VN) this.A01;
                long j = this.A00;
                return new AnonymousClass5VN(r1.A01 / C288025bF.A02(j), r1.A03 / C288025bF.A00(j), r1.A02 / C288025bF.A02(j), r1.A00 / C288025bF.A00(j));
            default:
                0eS.A00(obj);
                C51971G9r.A1N(this.A01, this.A00);
                break;
        }
        return C60340gF.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58110ImZ(AnonymousClass4D7 r2) {
        super(3, r2);
        this.A02 = 1;
    }
}
