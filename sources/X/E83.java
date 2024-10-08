package X;

import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class E83 extends C361158fl {
    public final /* synthetic */ AnonymousClass4DH A00;
    public final /* synthetic */ JOC A01;
    public final /* synthetic */ AnonymousClass32W A02;
    public final /* synthetic */ C55539HjL A03;

    public E83(AnonymousClass4DH r1, JOC joc, AnonymousClass32W r3, C55539HjL hjL) {
        this.A03 = hjL;
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = joc;
    }

    public final void A03() {
        this.A02.A00 = false;
    }

    public final void A04(C268654dm r4) {
        if (this.A03 != null) {
            02m.A0p.markerPoint(387850546, "bloks_request_failed");
            02m.A0p.markerEnd(387850546, 3);
        }
    }

    public final /* bridge */ /* synthetic */ void A05(Object obj) {
        C46620Di0 A0Q = DbV.A0Q(obj);
        if (this.A03 != null) {
            02m.A0p.markerPoint(387850546, "bloks_request_succeeded");
        }
        UserSession userSession = this.A02.A01;
        AnonymousClass4DH r4 = this.A00;
        C229382nI A0M = DbT.A0M(r4, userSession);
        JOC joc = this.A01;
        if (joc != null) {
            A0M.A01.put(R.id.open_share_sheet_handler, joc);
        }
        0hq r1 = r4.mFragmentManager;
        if (!AnonymousClass06S.A00(r1) && AnonymousClass06S.A01(r1)) {
            C48382Edd.A00(A0M, A0Q);
        }
    }
}
