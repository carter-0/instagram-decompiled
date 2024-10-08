package X;

import com.google.common.util.concurrent.MoreExecutors;
import com.instagram.common.session.UserSession;
import java.util.concurrent.ExecutorService;

/* renamed from: X.9oT  reason: invalid class name and case insensitive filesystem */
public final class C388839oT extends AnonymousClass7LN {
    public final UserSession A00;

    public final int A09(C331837So r6) {
        0qQ.A0B(r6, 0);
        if (r6 instanceof AnonymousClass7LQ) {
            if (182.A06(0Tu.A05, this.A00, 36325854137038114L)) {
                C254703su r3 = ((AnonymousClass7LQ) r6).A0e;
                0qQ.A07(r3);
                MoreExecutors.listeningDecorator((ExecutorService) new 0na(1429850625, 3, false, false)).Eyk(new C41318Ary(r3, 7));
            }
        }
        return super.A03(r6);
    }

    public C388839oT(UserSession userSession, C61370mm r2, AnonymousClass7LL r3) {
        super(r2, r3);
        this.A00 = userSession;
    }
}
