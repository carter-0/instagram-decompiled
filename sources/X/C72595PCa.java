package X;

/* renamed from: X.PCa  reason: case insensitive filesystem */
public final class C72595PCa implements C74408PuO {
    public final /* synthetic */ AnonymousClass61G A00;
    public final /* synthetic */ AnonymousClass61F A01;

    public C72595PCa(AnonymousClass61G r1, AnonymousClass61F r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onFailure() {
        this.A00.A00();
    }

    public final void onSuccess() {
        AnonymousClass61F r5 = this.A01;
        r5.A00.A02(C70112NxS.A00(r5.A01).A00(), new PSR(this.A00, r5, false));
    }
}
