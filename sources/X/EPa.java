package X;

import com.instagram.common.session.UserSession;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public final class EPa extends C319156q8 {
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0032, code lost:
        if ((java.util.concurrent.TimeUnit.SECONDS.convert(java.lang.System.currentTimeMillis(), java.util.concurrent.TimeUnit.MILLISECONDS) - r7) > java.util.concurrent.TimeUnit.HOURS.toSeconds((long) r0)) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.G5B A01() {
        /*
            r9 = this;
            X.6xC r0 = r9.A01
            X.6pf r6 = r0.A0B
            if (r6 == 0) goto L_0x0041
            com.instagram.common.session.UserSession r0 = r6.A05
            X.0xa r3 = X.AnonymousClass7TE.A0q(r0)
            java.lang.String r0 = "facebook_entrypoint_badge_last_clear_timestamp"
            r1 = 0
            long r7 = r3.getLong(r0, r1)
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0034
            int r0 = r6.A01
            if (r0 <= 0) goto L_0x0034
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.HOURS
            long r0 = (long) r0
            long r4 = r2.toSeconds(r0)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            long r1 = java.lang.System.currentTimeMillis()
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r1 = r3.convert(r1, r0)
            long r1 = r1 - r7
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0041
        L_0x0034:
            int r0 = r6.A00
            if (r0 <= 0) goto L_0x0041
            r1 = 0
            X.Fgr r0 = new X.Fgr
            r0.<init>(r1)
        L_0x003e:
            X.G5B r0 = (X.G5B) r0
            return r0
        L_0x0041:
            X.Fgq r0 = X.C50691Fgq.A00
            goto L_0x003e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EPa.A01():X.G5B");
    }

    public final void A02() {
        C318866pf r4 = this.A01.A0B;
        if (r4 != null) {
            UserSession userSession = r4.A05;
            2aT A0c = DbU.A0c(userSession);
            2aX r1 = new 2aX(2aD.A0M, r4.A00);
            AnonymousClass2g1 r0 = AnonymousClass2g1.PROFILE_MENU;
            C226252fx r8 = C226252fx.DOT;
            A0c.A01(r8, r0, r1);
            2aV A0a = DbV.A0a(userSession);
            2aX r2 = new 2aX(2aD.A0b, r4.A00);
            AnonymousClass2g1 r12 = AnonymousClass2g1.TOP_NAVIGATION_BAR;
            0qQ.A0B(r12, 0);
            A0a.A03(new C239993Jd(r8, r12, (C71062aE) null, (Set) null), r2, false);
            if (r4.A00 > 0) {
                1Av A00 = 1Au.A00(userSession);
                long convert = TimeUnit.SECONDS.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
                0xY A0p = AnonymousClass7TE.A0p(A00);
                A0p.E5c("facebook_entrypoint_badge_last_clear_timestamp", convert);
                A0p.apply();
            }
            r4.A00 = 0;
            C318866pf.A02(r4);
            if (r4.A08) {
                AnonymousClass4DH r3 = r4.A02;
                if (!0oI.A0B(r3.getContext())) {
                    0qQ.A0B(userSession, 0);
                    1NY A0a2 = AnonymousClass7TG.A0a(userSession);
                    A0a2.A0A("family_navigation/msite_forward_url/");
                    A0a2.A0O((15p) null, DvC.class, F76.class, false);
                    1OC A0K = DbW.A0K(A0a2);
                    C47696EDf.A01(A0K, r4, 2);
                    r3.schedule(A0K);
                    return;
                }
            }
            C318866pf.A01(r4);
        }
    }
}
