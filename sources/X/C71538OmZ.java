package X;

/* renamed from: X.OmZ  reason: case insensitive filesystem */
public final class C71538OmZ implements C74292PsK {
    public final /* synthetic */ C70969OTq A00;
    public final /* synthetic */ C62320sa A01;

    public C71538OmZ(C70969OTq oTq, C62320sa r2) {
        this.A00 = oTq;
        this.A01 = r2;
    }

    public final void cancel() {
        C70969OTq oTq = this.A00;
        JTO.A0E(oTq.A05).post(new C73159PXu(oTq, this.A01));
    }
}
