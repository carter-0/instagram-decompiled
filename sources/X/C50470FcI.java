package X;

/* renamed from: X.FcI  reason: case insensitive filesystem */
public final class C50470FcI implements G76 {
    public final /* synthetic */ 0wc A00;
    public final /* synthetic */ 0xa A01;
    public final /* synthetic */ String A02;

    public final void onActionClicked() {
    }

    public C50470FcI(0wc r1, 0xa r2, String str) {
        this.A01 = r2;
        this.A02 = str;
        this.A00 = r1;
    }

    public final void onBannerDismissed() {
        0xY AR4 = this.A01.AR4();
        AR4.E5T("education_banner_dismiss_key", true);
        AR4.apply();
        String str = this.A02;
        0wc r1 = this.A00;
        0qQ.A0B(r1, 1);
        0Aj A0e = AnonymousClass7TE.A0e(r1, "ig_bio_education");
        DbS.A1I(A0e, "dismiss");
        DbS.A1L(A0e, "edit_bio");
        A0e.AAJ("biography", str);
        A0e.Cgf();
    }
}
