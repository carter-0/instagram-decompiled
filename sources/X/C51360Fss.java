package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.Fss  reason: case insensitive filesystem */
public final class C51360Fss implements Runnable {
    public final /* synthetic */ EEQ A00;
    public final /* synthetic */ Reel A01;

    public C51360Fss(EEQ eeq, Reel reel) {
        this.A00 = eeq;
        this.A01 = reel;
    }

    public final void run() {
        EEQ eeq = this.A00;
        Reel reel = this.A01;
        AnonymousClass3N2 r4 = (AnonymousClass3N2) eeq.A09.A00(reel);
        if (r4 != null) {
            eeq.A08.A0E();
            Context context = r4.BkN().getContext();
            UserSession userSession = eeq.A06;
            1OP r0 = 1OP.$redex_init_class;
            0qQ.A0B(userSession, 0);
            AnonymousClass6VJ A04 = 1OP.A04(context, userSession, reel, new AnonymousClass6VH(new FkL(1, eeq, r4, reel), r4.Bkt(), reel.A1P), AnonymousClass3PO.A00(userSession), eeq.A05.getModuleName(), -1);
            A04.A04();
            eeq.A02 = A04;
            r4.Ei5(A04);
            eeq.A07.EBt(A04);
        }
    }
}
