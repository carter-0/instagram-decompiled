package X;

import android.content.Context;
import com.facebook.advancedcryptotransport.PlatformStorageProvider;
import com.instagram.common.session.UserSession;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.5wc  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C300155wc implements C62320sa {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ C300155wc(UserSession userSession, String str) {
        this.A01 = str;
        this.A00 = userSession;
    }

    public final Object invoke() {
        C10805RyR ryR;
        String str = this.A01;
        UserSession userSession = this.A00;
        AnonymousClass1aS r1 = 1aD.A06;
        PlatformStorageProvider.initialize(C60960kU.A00);
        AnonymousClass1y9 A002 = 1xy.A00(userSession);
        1aE r2 = 1aE.A03;
        A002.A00.accept(r2);
        1aD.A06.accept(r2);
        0qQ.A0B(userSession, 0);
        AnonymousClass68G A003 = C300305wt.A00((C300185wg) userSession.A01(C300185wg.class, new C73920Pm0(userSession, 36)), userSession, str, 0, 1);
        AnonymousClass68H r10 = new AnonymousClass68H(A003.A01);
        0Tu r3 = 0Tu.A05;
        if (182.A06(r3, userSession, 36328160535067682L)) {
            Context context = C60960kU.A00;
            Executor r12 = new 0na(1498268459, 3, true, true);
            String A04 = 182.A04(r3, userSession, 36891110488212360L);
            long A012 = 182.A01(r3, userSession, 36609635511703439L);
            boolean A06 = 182.A06(r3, userSession, 36328160534871072L);
            boolean A062 = 182.A06(r3, userSession, 36328160534936609L);
            boolean A063 = 182.A06(r3, userSession, 36328160534477854L);
            boolean A064 = 182.A06(r3, userSession, 36328160534543391L);
            long A013 = 182.A01(r3, userSession, 36609635511310220L);
            long A014 = 182.A01(r3, userSession, 36609635511375757L);
            long A015 = 182.A01(r3, userSession, 36609635511441294L);
            synchronized (C9937Rjq.class) {
                0qQ.A0B(context, 0);
                ryR = C9937Rjq.A00;
                if (ryR == null) {
                    C15226UWl uWl = new C15226UWl();
                    C10209RoQ roQ = new C10209RoQ(context);
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    ryR = new C10805RyR(new C10964S2w(timeUnit.toMillis(A013), A014, A015, A063, A064), roQ, uWl, A04, r12, timeUnit.toNanos(A012), A06, A062);
                    C9937Rjq.A00 = ryR;
                }
            }
            C301085yR.A00 = new C10296Rpu(ryR);
        }
        return new 1aD(r10, userSession, A003);
    }
}
