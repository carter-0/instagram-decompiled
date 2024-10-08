package X;

public final class PSF implements 1aV {
    public final /* synthetic */ AnonymousClass77B A00;
    public final /* synthetic */ C71872OsF A01;

    public PSF(AnonymousClass77B r1, C71872OsF osF) {
        this.A01 = osF;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C257443xP r6 = (C257443xP) obj;
        if (r6.A06()) {
            Object A03 = r6.A03();
            0qQ.A07(A03);
            if (!C66580MXl.A1a(C273654mx.A00(75), 1, C41847B3o.A1E(A03))) {
                1iA r4 = this.A00.A0I;
                if (r4 != null) {
                    this.A01.A05((XSV) null, new PAQ(DbT.A09((String) r6.A03()), r4), "aggregated_media_viewer");
                    return;
                }
                throw AnonymousClass7TE.A0y();
            }
        }
        this.A01.A04();
    }
}
