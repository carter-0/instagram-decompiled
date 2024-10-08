package X;

/* renamed from: X.AaX  reason: case insensitive filesystem */
public final class C40338AaX implements AnonymousClass8Fi {
    public final /* synthetic */ AnonymousClass889 A00;

    public final void Doa(C352218Cl r6) {
        AnonymousClass8Zl A002;
        0qQ.A0B(r6, 0);
        AnonymousClass889 r3 = this.A00;
        28D r2 = r3.A06;
        AnonymousClass80D r1 = r3.A0B;
        AnonymousClass9TT.A01(r1, r6, AnonymousClass9TT.A00(r2, r1, r3.A04));
        AnonymousClass8E5 r0 = r3.A03;
        if (!(r0 == null || (A002 = r0.A00()) == null)) {
            A002.Cme(r6);
        }
        AnonymousClass8VZ r02 = r3.A01;
        if (r02 != null) {
            r02.A03(r6, false);
        } else {
            0qQ.A0F("capturedMediaProcessor");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void onFailure(Exception exc) {
        0qQ.A0B(exc, 0);
        AnonymousClass889 r3 = this.A00;
        0kD.A07(r3.A07.getModuleName(), 002.A0R("Error importing photo: ", exc.getLocalizedMessage()), (Throwable) null);
        AnonymousClass889.A00(r3);
    }

    public C40338AaX(AnonymousClass889 r1) {
        this.A00 = r1;
    }
}
