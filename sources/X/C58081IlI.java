package X;

/* renamed from: X.IlI  reason: case insensitive filesystem */
public final class C58081IlI extends AnonymousClass1Ek implements 0sP {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58081IlI(Object obj, AnonymousClass4D7 r3, int i) {
        super(1, r3);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.4D7, X.IlI] */
    public final AnonymousClass4D7 create(AnonymousClass4D7 r4) {
        int i;
        int i2 = this.A00;
        Object obj = this.A01;
        switch (i2) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 1;
                break;
            default:
                i = 2;
                break;
        }
        return new C58081IlI(obj, r4, i);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((C58081IlI) create((AnonymousClass4D7) obj)).invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.A00;
        0eS.A00(obj);
        switch (i) {
            case 0:
                AnonymousClass5b4.A01((AnonymousClass5b4) this.A01);
                break;
            case 1:
                return DbT.A0r(this.A01);
            default:
                H11.A01((H11) this.A01);
                break;
        }
        return C60340gF.A00;
    }
}
