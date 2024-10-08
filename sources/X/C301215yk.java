package X;

import com.facebook.mantle.ig.IGMantle;
import com.facebook.models.IgModelLoader;
import com.facebook.msys.mca.Mailbox;
import com.instagram.common.session.UserSession;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: X.5yk  reason: invalid class name and case insensitive filesystem */
public final class C301215yk implements AnonymousClass68Z {
    public final /* synthetic */ UserSession A00;

    public C301215yk(UserSession userSession) {
        this.A00 = userSession;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        Mailbox mailbox = (Mailbox) obj;
        0qQ.A0B(mailbox, 0);
        C3728792z r0 = IGMantle.Companion;
        0na r5 = new 0na(939516106, 2, false, true);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = C61560nl.A00().A00;
        0qQ.A07(scheduledThreadPoolExecutor);
        IgModelLoader A002 = C363048j0.A00(this.A00);
        if (A002 != null) {
            return new IGMantle(mailbox, r5, scheduledThreadPoolExecutor, "", A002);
        }
        throw new IllegalStateException("Required value was null.");
    }
}
