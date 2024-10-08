package X;

/* renamed from: X.Pfq  reason: case insensitive filesystem */
public final class C73569Pfq extends AnonymousClass1Ek implements 0sK {
    public boolean A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73569Pfq(int i, AnonymousClass4D7 r3) {
        super(3, r3);
        this.A01 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        int i2 = this.A01;
        boolean A1a = AnonymousClass7TE.A1a(obj2);
        AnonymousClass4D7 r6 = (AnonymousClass4D7) obj3;
        if (i2 != 0) {
            i = 1;
        } else {
            i = 0;
        }
        C73569Pfq pfq = new C73569Pfq(i, r6);
        pfq.A00 = A1a;
        return pfq.invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        0eS.A00(obj);
        if (this.A00) {
            return C69260NiM.Loading;
        }
        return C69260NiM.AwaitInput;
    }
}
