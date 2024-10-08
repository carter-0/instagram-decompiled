package X;

/* renamed from: X.Pbj  reason: case insensitive filesystem */
public final class C73386Pbj implements Runnable {
    public final /* synthetic */ AnonymousClass77K A00;
    public final /* synthetic */ C66775McL A01;
    public final /* synthetic */ C66819MdB A02;
    public final /* synthetic */ C66809Mcv A03;
    public final /* synthetic */ C66809Mcv A04;

    public C73386Pbj(AnonymousClass77K r1, C66775McL mcL, C66819MdB mdB, C66809Mcv mcv, C66809Mcv mcv2) {
        this.A00 = r1;
        this.A01 = mcL;
        this.A04 = mcv;
        this.A02 = mdB;
        this.A03 = mcv2;
    }

    public final void run() {
        AnonymousClass77K r6 = this.A00;
        C66775McL mcL = this.A01;
        C66809Mcv mcv = this.A04;
        ((C66811Mcx) r6.A0A.getValue()).A01(mcL, this.A02, mcv, new PG8(r6, mcL, this.A03));
        AnonymousClass7DZ r0 = r6.A09;
        if (r0 != null) {
            r0.A02(mcL, mcv);
        }
    }
}
