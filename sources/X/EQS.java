package X;

public final class EQS extends H4J {
    public final /* synthetic */ E5C A00;
    public final /* synthetic */ boolean A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EQS(0hq r1, E5C e5c, boolean z) {
        super(r1);
        this.A00 = e5c;
        this.A01 = z;
    }

    public final void onFail(C268654dm r5) {
        int A03 = AnonymousClass0fD.A03(1755696103);
        E5C e5c = this.A00;
        String str = E5C.__redex_internal_original_name;
        e5c.A04.setChecked(!this.A01);
        C49952FGh.A02(e5c.requireActivity(), r5);
        AnonymousClass0fD.A0A(-1584987484, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(1969305173);
        int A032 = AnonymousClass0fD.A03(499403078);
        E5C e5c = this.A00;
        String str = E5C.__redex_internal_original_name;
        e5c.A04.setChecked(this.A01);
        AnonymousClass0fD.A0A(-2096988267, A032);
        AnonymousClass0fD.A0A(1134065829, A03);
    }
}
