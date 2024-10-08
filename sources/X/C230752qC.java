package X;

import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2qC  reason: invalid class name and case insensitive filesystem */
public final class C230752qC implements C250603lj {
    public final Integer A00;
    public final Map A01 = new LinkedHashMap();
    public final UserSession A02;
    public final AnonymousClass2qB A03;
    public final boolean A04;

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0078, code lost:
        if (r3.A0C == false) goto L_0x007a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ATF(X.AnonymousClass30Y r9, X.C252093oY r10) {
        /*
            r8 = this;
            r7 = 0
            X.0qQ.A0B(r9, r7)
            r5 = 1
            X.0qQ.A0B(r10, r5)
            java.lang.Integer r0 = r10.CEk(r9)
            int r0 = r0.intValue()
            if (r0 == r7) goto L_0x00af
            if (r0 == r5) goto L_0x003a
            r3 = 2
            X.2qB r1 = r8.A03
            X.2lJ r0 = r1.A02
            if (r0 == 0) goto L_0x0020
            r0.A07 = r7
            X.C228312lJ.A00(r0, r5)
        L_0x0020:
            X.2qA r2 = r1.A01
            if (r2 == 0) goto L_0x0039
            boolean r0 = r2.A00
            if (r0 == 0) goto L_0x0039
            r2.A00 = r7
            X.02m r1 = r2.A01
            r0 = 499003080(0x1dbe2ec8, float:5.034095E-21)
            r1.markerEnd(r0, r3)
            X.2q8 r0 = r2.A02
            if (r0 == 0) goto L_0x0039
            r0.DqZ()
        L_0x0039:
            return
        L_0x003a:
            float r0 = r10.CFe(r9)
            X.2qB r6 = r8.A03
            double r3 = (double) r0
            r1 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00a5
            X.2lJ r3 = r6.A02
            if (r3 == 0) goto L_0x0039
            r3.A07 = r5
            int r1 = r3.A02
            int r0 = r3.A01
            int r1 = r1 - r0
            if (r1 <= 0) goto L_0x0039
            boolean r0 = r3.A06
            if (r0 != 0) goto L_0x0039
            int r0 = r3.A03
            if (r0 <= 0) goto L_0x0039
            X.02m r6 = r3.A09
            int r4 = r3.A08
            r6.markerStart(r4)
            java.lang.String r0 = "tail_load_interruption_start"
            r6.markerPoint(r4, r0)
            java.lang.String r1 = "module"
            java.lang.String r0 = r3.A0A
            r6.markerAnnotate(r4, r1, r0)
            java.lang.String r2 = "is_user_sampled"
            boolean r0 = r3.A0D
            if (r0 == 0) goto L_0x007a
            boolean r1 = r3.A0C
            r0 = 1
            if (r1 != 0) goto L_0x007b
        L_0x007a:
            r0 = 0
        L_0x007b:
            r6.markerAnnotate(r4, r2, r0)
            java.lang.String r2 = "num_requests_in_flight"
            X.01W r1 = r3.A0B
            int r0 = r1.size()
            r6.markerAnnotate(r4, r2, r0)
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0099
            java.lang.Object r0 = r1.A0O()
            X.2mA r0 = (X.AnonymousClass2mA) r0
            r3.A05 = r0
        L_0x0099:
            int r0 = r3.A03
            r3.A00 = r0
            r3.A06 = r5
            X.15Y r0 = X.15Y.A03
            X.14i.A03(r0, r3)
            return
        L_0x00a5:
            X.2lJ r0 = r6.A02
            if (r0 == 0) goto L_0x0039
            r0.A07 = r7
            X.C228312lJ.A00(r0, r5)
            return
        L_0x00af:
            boolean r0 = r8.A04
            if (r0 == 0) goto L_0x00e9
            com.instagram.common.session.UserSession r1 = r8.A02
            X.585 r0 = X.AnonymousClass584.A00(r1)
            boolean r0 = r0.A05
            if (r0 == 0) goto L_0x00e9
            X.585 r6 = X.AnonymousClass584.A00(r1)
            java.lang.Integer r0 = r8.A00
            int r0 = r0.intValue()
            switch(r0) {
                case 0: goto L_0x011c;
                case 1: goto L_0x011f;
                case 2: goto L_0x0122;
                case 3: goto L_0x0125;
                case 4: goto L_0x0128;
                case 5: goto L_0x012b;
                case 6: goto L_0x012e;
                case 7: goto L_0x0131;
                default: goto L_0x00ca;
            }
        L_0x00ca:
            X.589 r4 = X.AnonymousClass589.CONTEXTUAL_FEED
        L_0x00cc:
            java.util.Map r3 = r8.A01
            java.lang.Object r2 = r3.get(r4)
            X.58F r2 = (X.AnonymousClass58F) r2
            if (r2 != 0) goto L_0x00e6
            X.58B r0 = X.AnonymousClass58B.USER_SEE_TAIL_LOAD_SPINNER
            X.0eP r1 = new X.0eP
            r1.<init>(r4, r0)
            r0 = 0
            X.58F r2 = new X.58F
            r2.<init>(r0, r1)
            r3.put(r4, r2)
        L_0x00e6:
            r6.A01(r2)
        L_0x00e9:
            X.2qB r1 = r8.A03
            X.2lJ r0 = r1.A02
            if (r0 == 0) goto L_0x00f6
            X.JPT r0 = r0.A04
            if (r0 == 0) goto L_0x00f6
            r0.onStart()
        L_0x00f6:
            X.2qA r4 = r1.A01
            if (r4 == 0) goto L_0x0039
            boolean r0 = r4.A00
            if (r0 != 0) goto L_0x0039
            r4.A00 = r5
            X.02m r3 = r4.A01
            r2 = 499003080(0x1dbe2ec8, float:5.034095E-21)
            r3.markerStart(r2)
            java.lang.String r0 = "logger_version"
            r3.markerAnnotate(r2, r0, r5)
            java.lang.String r1 = r4.A03
            java.lang.String r0 = "module"
            r3.markerAnnotate(r2, r0, r1)
            X.2q8 r0 = r4.A02
            if (r0 == 0) goto L_0x0039
            r0.Dqa()
            return
        L_0x011c:
            X.589 r4 = X.AnonymousClass589.EXPLORE
            goto L_0x00cc
        L_0x011f:
            X.589 r4 = X.AnonymousClass589.DISCOVERY_CHAIN
            goto L_0x00cc
        L_0x0122:
            X.589 r4 = X.AnonymousClass589.SHOPPING
            goto L_0x00cc
        L_0x0125:
            X.589 r4 = X.AnonymousClass589.ACTIVITY_FEED
            goto L_0x00cc
        L_0x0128:
            X.589 r4 = X.AnonymousClass589.CLIPS
            goto L_0x00cc
        L_0x012b:
            X.589 r4 = X.AnonymousClass589.IG_FEED_TIMELINE
            goto L_0x00cc
        L_0x012e:
            X.589 r4 = X.AnonymousClass589.PROFILE
            goto L_0x00cc
        L_0x0131:
            X.589 r4 = X.AnonymousClass589.DIRECT_INBOX
            goto L_0x00cc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C230752qC.ATF(X.30Y, X.3oY):void");
    }

    public C230752qC(UserSession userSession, AnonymousClass2qB r3, Integer num, boolean z) {
        this.A02 = userSession;
        this.A00 = num;
        this.A03 = r3;
        this.A04 = z;
    }
}
