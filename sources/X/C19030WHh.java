package X;

/* renamed from: X.WHh  reason: case insensitive filesystem */
public final class C19030WHh implements 2Kw {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C52673Gal A01;
    public final /* synthetic */ String A02;

    public C19030WHh(C52673Gal gal, String str, long j) {
        this.A01 = gal;
        this.A02 = str;
        this.A00 = j;
    }

    public final void invoke(Throwable th) {
        String localizedMessage = th.getLocalizedMessage();
        if (localizedMessage == null) {
            localizedMessage = "";
        }
        C52673Gal gal = this.A01;
        String str = this.A02;
        long j = this.A00;
        0Aj A0e = AnonymousClass7TE.A0e(gal.A01, "ctd_automated_responses_gql_mutation_error");
        if (A0e.isSampled()) {
            C13990Tnq.A11(A0e, gal, str, j);
            A0e.AAJ(Pxd.A00(84), localizedMessage);
            A0e.Cgf();
        }
    }
}
