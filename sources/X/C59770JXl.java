package X;

/* renamed from: X.JXl  reason: case insensitive filesystem */
public final class C59770JXl implements C66507MUl {
    public final /* synthetic */ C59767JXi A00;

    public C59770JXl(C59767JXi jXi) {
        this.A00 = jXi;
    }

    public static void A00(C59767JXi jXi) {
        if (jXi.A0D.A01.isEmpty()) {
            0kD.A07(C59767JXi.__redex_internal_original_name, "segment store cannot be empty", (Throwable) null);
        }
    }

    public final int BrN() {
        C59767JXi jXi = this.A00;
        A00(jXi);
        return JTO.A08(jXi.A0D);
    }

    public final int BrR(int i) {
        C59767JXi jXi = this.A00;
        A00(jXi);
        return jXi.A0D.A01(i) + jXi.A0D.A00(i);
    }

    public final int BrU(int i) {
        C59767JXi jXi = this.A00;
        A00(jXi);
        return jXi.A0D.A01(i);
    }
}
