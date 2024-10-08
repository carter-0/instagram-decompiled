package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.perf.constants.ThreadFetchReason;

/* renamed from: X.9lH  reason: invalid class name and case insensitive filesystem */
public final class C386859lH extends 0ng {
    public final /* synthetic */ AnonymousClass7S6 A00;
    public final /* synthetic */ ThreadFetchReason A01;
    public final /* synthetic */ String A02;

    public final void run() {
        11Z.A05("This operation can't be run on UI thread.");
        UserSession userSession = this.A00.A0G;
        String str = this.A02;
        C71129OdS.A00(userSession, this.A01, 0, str, true);
        1Av A002 = 1Au.A00(userSession);
        long currentTimeMillis = System.currentTimeMillis();
        0xY A0p = AnonymousClass7TE.A0p(A002);
        A0p.E5c(002.A0R("stale_thread_last_refetch_attempt_time/", str), currentTimeMillis);
        A0p.apply();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C386859lH(AnonymousClass7S6 r5, ThreadFetchReason threadFetchReason, String str) {
        super(1111126718, 4, true, false);
        this.A00 = r5;
        this.A02 = str;
        this.A01 = threadFetchReason;
    }
}
