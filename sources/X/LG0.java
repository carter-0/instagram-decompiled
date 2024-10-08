package X;

import com.instagram.common.session.UserSession;

public final class LG0 {
    public final UserSession A00;
    public final Integer A01;
    public final AnonymousClass0eM A02 = AnonymousClass0eN.A01(new C73662Phb(this, 35));
    public final AnonymousClass0eM A03 = AnonymousClass0eN.A01(C66263MKy.A00);
    public final AnonymousClass0eM A04 = AnonymousClass0eN.A01(new C73662Phb(this, 36));

    public LG0(UserSession userSession, Integer num) {
        0qQ.A0B(num, 2);
        this.A00 = userSession;
        this.A01 = num;
    }

    public final void A01(C55509Hir hir) {
        0qQ.A0B(hir, 0);
        AnonymousClass0eM r7 = this.A02;
        AnonymousClass0eM r5 = this.A04;
        int A07 = DbX.A07(r5);
        AnonymousClass0eM r4 = this.A03;
        ((02m) AnonymousClass7TE.A14(r7)).markerAnnotate(A07, DbX.A07(r4), "error", hir.A00);
        ((02m) AnonymousClass7TE.A14(r7)).markerEnd(DbX.A07(r5), DbX.A07(r4), 3);
    }

    public final void A02(String str) {
        0qQ.A0B(str, 0);
        AnonymousClass0eM r6 = this.A02;
        AnonymousClass0eM r5 = this.A04;
        int A07 = DbX.A07(r5);
        AnonymousClass0eM r4 = this.A03;
        ((02m) AnonymousClass7TE.A14(r6)).markerPoint(A07, DbX.A07(r4), "image_request_failure");
        ((02m) AnonymousClass7TE.A14(r6)).markerAnnotate(DbX.A07(r5), DbX.A07(r4), "image_request_error", str);
    }

    public final void A00(int i, String str) {
        String str2;
        AnonymousClass0eM r6 = this.A02;
        AnonymousClass0eM r5 = this.A04;
        int A07 = DbX.A07(r5);
        AnonymousClass0eM r2 = this.A03;
        ((02m) AnonymousClass7TE.A14(r6)).markerPoint(A07, DbX.A07(r2), 002.A0O("image_download_failure_", i));
        02m r4 = (02m) AnonymousClass7TE.A14(r6);
        int A072 = DbX.A07(r5);
        int A073 = DbX.A07(r2);
        String A0O = 002.A0O("image_download_error_", i);
        if (str != null) {
            str2 = 00R.A03(str, 200);
        } else {
            str2 = "";
        }
        r4.markerAnnotate(A072, A073, A0O, str2);
    }
}
