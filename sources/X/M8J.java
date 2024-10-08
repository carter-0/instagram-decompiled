package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelType;
import com.instagram.reels.store.ReelStore;

public final class M8J implements Runnable {
    public final /* synthetic */ K14 A00;
    public final /* synthetic */ KAT A01;

    public M8J(K14 k14, KAT kat) {
        this.A01 = kat;
        this.A00 = k14;
    }

    public final void run() {
        K14 k14 = this.A00;
        AnonymousClass3HX r0 = k14.A00;
        KAT kat = this.A01;
        if (r0 == null) {
            Context context = kat.A00;
            C59689JTv.A03(context, context.getString(2131975944), "onPublishHighlightTapped_unknown_error_occured", 0);
            return;
        }
        C314696ih r5 = kat.A03;
        UserSession userSession = r5.A03;
        ReelStore A03 = ReelStore.A03(userSession);
        Reel A0I = A03.A0I(k14.A00, true);
        Reel reel = kat.A01;
        A03.A0c(reel.getId());
        if (reel.A0P == ReelType.A0d) {
            AnonymousClass0iw r1 = r5.A02;
            0qQ.A0B(userSession, 1);
            int size = reel.A0O(userSession).size();
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r1, userSession), AnonymousClass000.A00(3382));
            if (A0e.isSampled()) {
                A0e.A8k(C66579MXk.A00(158), Integer.valueOf(size));
                A0e.Cgf();
            }
        }
        AnonymousClass1Nd.A00(userSession).A05(new AnonymousClass376(A0I));
        r5.A04.CpD();
    }
}
