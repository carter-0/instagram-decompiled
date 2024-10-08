package X;

/* renamed from: X.DGa  reason: case insensitive filesystem */
public final class C45946DGa implements 2IR {
    public final /* synthetic */ 2MN A00;

    public final void onFailure(Throwable th) {
        0qQ.A0B(th, 0);
    }

    public C45946DGa(2MN r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        C45261CtP ctP = (C45261CtP) obj;
        if (ctP != null) {
            C45260CtO ctO = ctP.A00;
            if (ctO != null) {
                2MN r2 = this.A00;
                C45323CuR cuR = ctO.A00;
                if (cuR != null) {
                    2MN.A00(r2, cuR.A00, cuR.A01);
                    return;
                }
                str = "quietTimeSettings";
            } else {
                str = "data";
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }
}
