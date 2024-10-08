package X;

/* renamed from: X.Kvz  reason: case insensitive filesystem */
public abstract class C63378Kvz {
    public static final void A00(AnonymousClass1XT r4, LP8 lp8) {
        0qQ.A0B(lp8, 1);
        if (!r4.isOk() && r4.isLoginRequired()) {
            AnonymousClass3Q2 r2 = lp8.A0D;
            boolean A1V = AnonymousClass7TF.A1V(r2.A3O);
            boolean A0u = r2.A0u();
            boolean A12 = r2.A12();
            if (A1V || A0u) {
                0wb.A03("MediaUploader_sidecarUpload", 0mp.A06("Sidecar upload causing forced logout. is parent upload: %s, is child upload: %s ,is video: %s", new Object[]{Boolean.valueOf(A0u), Boolean.valueOf(A1V), Boolean.valueOf(A12)}));
            }
        }
        C239813Ij.A00(r4, lp8.A0C, (String) null);
    }
}
