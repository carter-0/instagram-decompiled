package X;

public final class GQW extends AnonymousClass1Ek implements 0sK {
    public final int A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GQW(int i, AnonymousClass4D7 r3) {
        super(3, r3);
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        AnonymousClass4D7 r5;
        int i;
        switch (this.A00) {
            case 0:
                r5 = (AnonymousClass4D7) obj3;
                i = 0;
                break;
            case 1:
                ((Number) obj2).floatValue();
                r5 = (AnonymousClass4D7) obj3;
                i = 1;
                break;
            case 2:
                r5 = (AnonymousClass4D7) obj3;
                i = 2;
                break;
            case 3:
                C51965G9l.A1U(obj);
                r5 = (AnonymousClass4D7) obj3;
                i = 3;
                break;
            default:
                r5 = (AnonymousClass4D7) obj3;
                i = 4;
                break;
        }
        return new GQW(i, r5).invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (3 - this.A00 != 0) {
            0eS.A00(obj);
            return C60340gF.A00;
        }
        0eS.A00(obj);
        return AnonymousClass7TE.A0u();
    }
}
