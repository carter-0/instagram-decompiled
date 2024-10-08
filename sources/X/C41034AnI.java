package X;

/* renamed from: X.AnI  reason: case insensitive filesystem */
public final class C41034AnI implements Runnable {
    public final /* synthetic */ C65012Llp A00;
    public final /* synthetic */ C352218Cl A01;

    public C41034AnI(C65012Llp llp, C352218Cl r2) {
        this.A00 = llp;
        this.A01 = r2;
    }

    public final void run() {
        C65012Llp llp = this.A00;
        llp.A09.A02.A08(AnonymousClass05K.A01);
        C352218Cl r3 = this.A01;
        r3.A12 = true;
        boolean CZU = llp.A0D.CZU();
        AnonymousClass8W6 r2 = llp.A08;
        if (CZU) {
            r2.A0D.A02.A09(AnonymousClass7TE.A1I(new C365798nh(r3)));
            AnonymousClass7TF.A0D().post(new C40795AjR(r2));
        } else {
            r2.A04(r3);
        }
        C65012Llp.A00(llp);
    }
}
