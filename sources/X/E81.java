package X;

import com.instagram.android.R;

public final class E81 extends C361158fl {
    public final /* synthetic */ C255773uh A00;
    public final /* synthetic */ C310226ad A01;

    public final void A04(C268654dm r4) {
        0qQ.A0B(r4, 0);
        this.A01.A03.EHd();
        Dba.A1T("ReelViewerFragment#openBloks", "Unable to fetch bloks action", r4.A01());
    }

    public E81(C255773uh r1, C310226ad r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void A03() {
        this.A01.A00 = false;
    }

    public final /* bridge */ /* synthetic */ void A05(Object obj) {
        C46620Di0 A0Q = DbV.A0Q(obj);
        C310226ad r4 = this.A01;
        AnonymousClass4DH r2 = r4.A01;
        0hq r1 = r2.mFragmentManager;
        if (!AnonymousClass06S.A00(r1) && AnonymousClass06S.A01(r1)) {
            C255773uh r12 = this.A00;
            C229382nI A0M = DbT.A0M(r2, r4.A02);
            if (r12 != null) {
                A0M.A01.put(R.id.open_share_sheet_handler, new C50440Fbn(r12, r4));
            }
            C48382Edd.A00(A0M, A0Q);
        }
    }
}
