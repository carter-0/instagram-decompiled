package X;

/* renamed from: X.9R9  reason: invalid class name */
public final class AnonymousClass9R9 extends 1P0 {
    public final /* synthetic */ 2Kw A00;
    public final /* synthetic */ AnonymousClass2Kv A01;
    public final /* synthetic */ C363088j4 A02;

    public AnonymousClass9R9(2Kw r1, AnonymousClass2Kv r2, C363088j4 r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onFail(C268654dm r4) {
        int A03 = AnonymousClass0fD.A03(-74527438);
        Throwable A012 = r4.A01();
        if (A012 == null || (A012 instanceof AnonymousClass7BR)) {
            A012 = new Throwable(AnonymousClass000.A00(2526));
        }
        this.A00.invoke(A012);
        AnonymousClass0fD.A0A(-929069476, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(670246121);
        int A032 = AnonymousClass0fD.A03(-2087513328);
        this.A01.invoke((AnonymousClass3JC) obj);
        AnonymousClass0fD.A0A(1754402928, A032);
        AnonymousClass0fD.A0A(-1179045004, A03);
    }
}
