package X;

/* renamed from: X.H4c  reason: case insensitive filesystem */
public final class C54233H4c extends 1P0 {
    public 1Xj A00;
    public AnonymousClass3W1 A01;
    public final AnonymousClass34A A02;
    public final /* synthetic */ AnonymousClass348 A03;

    public C54233H4c(1Xj r1, AnonymousClass348 r2, AnonymousClass3W1 r3, AnonymousClass34A r4) {
        this.A03 = r2;
        this.A01 = r3;
        this.A00 = r1;
        this.A02 = r4;
    }

    public final void onFail(C268654dm r5) {
        int A032 = AnonymousClass0fD.A03(753005706);
        C59689JTv.A0F(this.A03.A00.getContext(), "translation_fail", 2131975513);
        this.A02.Dty(this.A00, AnonymousClass3W9.Original);
        AnonymousClass0fD.A0A(647067302, A032);
    }

    public final void onStart() {
        int A032 = AnonymousClass0fD.A03(-594901936);
        AnonymousClass3W1 r2 = this.A01;
        AnonymousClass3W9 r1 = AnonymousClass3W9.Loading;
        0qQ.A0B(r1, 0);
        r2.A3b.A00(r2, r1);
        this.A03.A04.Cs9(this.A00);
        AnonymousClass0fD.A0A(194876545, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(1850652793);
        int A033 = AnonymousClass0fD.A03(1302799621);
        C55006Had.A00(this.A03.A05, ((C54067Gyq) obj).A01);
        this.A02.Dty(this.A00, AnonymousClass3W9.Translated);
        AnonymousClass0fD.A0A(-253172578, A033);
        AnonymousClass0fD.A0A(228071175, A032);
    }
}
