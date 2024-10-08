package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Vha  reason: case insensitive filesystem */
public final class C17883Vha {
    public AnonymousClass3BN A00;
    public final UserSession A01;
    public final List A02 = new ArrayList();
    public final List A03 = new ArrayList();
    public final AnonymousClass0iw A04;

    public C17883Vha(AnonymousClass0iw r2, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A04 = r2;
    }

    public final void A00(List list) {
        0qQ.A0B(list, 0);
        if (AnonymousClass7TE.A1b(list)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Reel reel = (Reel) it.next();
                if (!reel.A15(this.A01) || !AnonymousClass7TE.A1b(reel.A0y)) {
                    this.A02.add(JTP.A0r(reel));
                    this.A03.add(reel);
                }
            }
            this.A00 = new AnonymousClass3BN(this.A01, list);
        }
    }
}
