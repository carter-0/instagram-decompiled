package X;

public final class MES extends AnonymousClass1Ek implements 0sL {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MES(Object obj, String str, String str2, AnonymousClass4D7 r5, int i) {
        super(2, r5);
        this.A00 = i;
        this.A01 = obj;
        this.A03 = str;
        this.A02 = str2;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.MES, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r8) {
        int i;
        int i2 = this.A00;
        Object obj2 = this.A01;
        String str = this.A03;
        String str2 = this.A02;
        if (i2 != 0) {
            i = 1;
        } else {
            i = 0;
        }
        return new MES(obj2, str, str2, r8, i);
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.A00;
        0eS.A00(obj);
        if (i != 0) {
            ((G85) this.A01).CJG(002.A0u("Credential manager fetch failed: errorType:", this.A03, AnonymousClass000.A00(2014), this.A02));
        } else {
            ((L87) this.A01).A00.A0L(this.A03, this.A02);
        }
        return C60340gF.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MES) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
