package X;

import com.instagram.android.R;

public final class E82 extends C361158fl {
    public final /* synthetic */ C2357230y A00;
    public final /* synthetic */ JOC A01;
    public final /* synthetic */ C2360232c A02;

    public final void A04(C268654dm r6) {
        0qQ.A0B(r6, 0);
        AnonymousClass0iw r3 = this.A02.A00;
        if (r3.getContext() != null) {
            C59689JTv.A03(r3.getContext(), DbV.A05(r3).getString(2131968258), "bloks_action_network_error", 0);
        }
        Dba.A1T(002.A0R(r3.getModuleName(), "runBloksAction"), "Unable to fetch bloks action", r6.A01());
    }

    public E82(C2357230y r1, JOC joc, C2360232c r3) {
        this.A02 = r3;
        this.A01 = joc;
        this.A00 = r1;
    }

    public final void A03() {
        this.A00.A00 = false;
    }

    public final /* bridge */ /* synthetic */ void A05(Object obj) {
        C46620Di0 A0Q = DbV.A0Q(obj);
        C2360232c r4 = this.A02;
        C229382nI A0M = DbT.A0M(r4.A00, r4.A02);
        JOC joc = this.A01;
        if (joc != null) {
            A0M.A01.put(R.id.open_share_sheet_handler, joc);
        }
        0hq r1 = r4.A01;
        if (!AnonymousClass06S.A00(r1) && AnonymousClass06S.A01(r1)) {
            C48382Edd.A00(A0M, A0Q);
        }
    }
}
