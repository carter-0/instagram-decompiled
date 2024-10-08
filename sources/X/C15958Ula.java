package X;

/* renamed from: X.Ula  reason: case insensitive filesystem */
public final class C15958Ula extends C324596za {
    public final VW3 A00;
    public final /* synthetic */ C17658Vbo A01;

    public C15958Ula(C17658Vbo vbo, VW3 vw3) {
        this.A01 = vbo;
        this.A00 = vw3;
    }

    public final void onFail(C268654dm r3) {
        int A03 = AnonymousClass0fD.A03(-89215242);
        this.A00.A02.A05.DED();
        AnonymousClass0fD.A0A(-1513950945, A03);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(-634024537);
        this.A00.A02.A05.DQ5();
        AnonymousClass0fD.A0A(1779405374, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(-864113750);
        this.A00.A02.A05.DQ8();
        AnonymousClass0fD.A0A(-712064630, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-887818242);
        UY5 uy5 = (UY5) obj;
        int A032 = AnonymousClass0fD.A03(-526134979);
        this.A01.A00 = new VW4(uy5.A01, uy5.A02, uy5.A05);
        VW3 vw3 = this.A00;
        vw3.A02.A05.DF4(vw3.A00, uy5, vw3.A01);
        AnonymousClass0fD.A0A(-229800454, A032);
        AnonymousClass0fD.A0A(-1073959037, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = AnonymousClass0fD.A03(1863688116);
        AnonymousClass0fD.A0A(-253792996, AnonymousClass0fD.A03(-1220847876));
        AnonymousClass0fD.A0A(-356201160, A03);
    }
}
