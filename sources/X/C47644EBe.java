package X;

/* renamed from: X.EBe  reason: case insensitive filesystem */
public final class C47644EBe extends 1P0 {
    public final /* synthetic */ AnonymousClass540 A00;
    public final /* synthetic */ C278754xT A01;

    public C47644EBe(AnonymousClass540 r1, C278754xT r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onFail(C268654dm r5) {
        int A0D = AnonymousClass7TG.A0D(r5, -2113932739);
        C278754xT r2 = this.A01;
        r2.A05.remove(C3727792j.USER_INFO);
        C278754xT.A02(this.A00, r2);
        C278754xT.A04(r2, "REST", r5.A01());
        AnonymousClass0fD.A0A(505554712, A0D);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-2077109086);
        int A032 = AnonymousClass0fD.A03(-878497428);
        C278754xT r2 = this.A01;
        1Gd.A00(1P1.A00(r2.A03).A00);
        r2.A05.remove(C3727792j.USER_INFO);
        C278754xT.A02(this.A00, r2);
        AnonymousClass0fD.A0A(666227919, A032);
        AnonymousClass0fD.A0A(-1232029575, A03);
    }
}
