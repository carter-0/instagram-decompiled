package X;

/* renamed from: X.ILt  reason: case insensitive filesystem */
public final class C57027ILt implements C66428MRi {
    public final /* synthetic */ C369968vc A00;
    public final /* synthetic */ K57 A01;

    public C57027ILt(C369968vc r1, K57 k57) {
        this.A01 = k57;
        this.A00 = r1;
    }

    public final void DAQ(String str) {
        K57 k57 = this.A01;
        C369968vc r1 = this.A00;
        ((AnonymousClass72N) k57.A0E.getValue()).A0H(r1, str);
        27r A012 = 27p.A01(k57.A05());
        String str2 = r1.A09;
        29O r2 = A012.A06;
        1Ln A07 = 1Ln.A07(r2.A01);
        if (DbT.A1Y(A07)) {
            1Ln A0T = C51975G9x.A0T(A07, r2, "RENAME_APPLIED", str2);
            A0T.A0t("IG_CAMERA_DRAFT_RENAME_SUCCESS");
            A0T.Cgf();
        }
    }
}
