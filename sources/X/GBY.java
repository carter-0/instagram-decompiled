package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;

public final class GBY {
    public 2We A00;
    public final Activity A01;
    public final AnonymousClass4AI A02;
    public final C52009GBg A03;
    public final GBZ A04;
    public final C52003GBa A05;
    public final GBQ A06;
    public final C62320sa A07;
    public final boolean A08;
    public final AnonymousClass07Z A09;
    public final 2V1 A0A;
    public final UserSession A0B;
    public final C52007GBe A0C;
    public final GBC A0D;

    public GBY(Activity activity, Context context, AnonymousClass07Z r23, ClipsViewerConfig clipsViewerConfig, GBX gbx, AnonymousClass2tB r26, UserSession userSession, C52009GBg gBg, GBW gbw, C14049Tot tot, GBU gbu, GBV gbv, GBQ gbq, C52007GBe gBe, GBT gbt, GDE gde, GBC gbc, C62320sa r38, 0sP r39) {
        2We r8;
        this.A01 = activity;
        this.A09 = r23;
        UserSession userSession2 = userSession;
        this.A0B = userSession2;
        C52007GBe gBe2 = gBe;
        this.A0C = gBe2;
        C52009GBg gBg2 = gBg;
        this.A03 = gBg2;
        this.A07 = r38;
        this.A0D = gbc;
        GBQ gbq2 = gbq;
        this.A06 = gbq2;
        Context context2 = context;
        this.A0A = new 2V1(context2);
        boolean A062 = 182.A06(0Tu.A05, userSession2, 36312874749658444L);
        this.A08 = A062;
        GBZ gbz = new GBZ(context2, this);
        this.A04 = gbz;
        if (A062) {
            r8 = A00(gbz, this);
        } else {
            r8 = null;
        }
        this.A00 = r8;
        AnonymousClass2tB r11 = r26;
        GBX gbx2 = gbx;
        ClipsViewerConfig clipsViewerConfig2 = clipsViewerConfig;
        GDE gde2 = gde;
        this.A05 = new C52003GBa(context2, r8, clipsViewerConfig2, gbx2, r11, userSession2, gBg2, gbq2, gBe2, gde2, 0Yt.A06(new 0eP[]{AnonymousClass7TE.A1L(C295365o2.SURVEY, gbt), AnonymousClass7TE.A1L(C295365o2.NETEGO_SUGGESTED_CREATORS, gbu), AnonymousClass7TE.A1L(C295365o2.NETEGO_SUGGESTED_USERS, gbv), AnonymousClass7TE.A1L(C295365o2.CATCH_UP_SUMMARY, tot), AnonymousClass7TE.A1L(C295365o2.CATCH_UP_COMPLETED, gbw)}), r39, !A062);
        this.A02 = new C52006GBd(this);
    }

    public static final 2We A00(C338117hR r19, GBY gby) {
        C243983aS r11;
        C338587iC r7;
        2Sa r9 = 2Sa.defaultInstance;
        C338097hP r3 = new C338097hP();
        AnonymousClass3X7 r10 = AnonymousClass3X7.A00;
        GBY gby2 = gby;
        UserSession userSession = gby2.A0B;
        0Tu r5 = 0Tu.A05;
        if (182.A06(r5, userSession, 36312874750969175L)) {
            r11 = C243983aS.A00;
        } else {
            r11 = r9.A03;
        }
        2Sa A022 = 2Sa.A02(r9, r10, r11, -289, false, false, false);
        int A042 = DbS.A04(r5, userSession, 36608828058769160L);
        if (!gby2.A08) {
            r7 = gby2.A05.A03;
        } else {
            r7 = null;
        }
        r3.A07 = new C338087hO(A022, r7, (Boolean) null, 1, 1.0f, 2, A042, false, false, true, true, false, false);
        r3.A03 = new AnonymousClass3X8(gby2.A09);
        r3.A04 = r19;
        r3.A00 = 10;
        C52009GBg gBg = gby2.A03;
        C52007GBe gBe = gby2.A0C;
        r3.A06 = new GD5(userSession, gBg, new GD4(gby2), gBe, gby2.A0D);
        return r3.A00(gby2.A0A);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003a, code lost:
        if (r0 == false) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.GBY r8) {
        /*
            X.2We r4 = r8.A00
            if (r4 == 0) goto L_0x0052
            X.GBQ r0 = r8.A06
            int r7 = r0.A01
            int r6 = r0.A00
            monitor-enter(r4)
            int r0 = r4.A06     // Catch:{ all -> 0x004e }
            int r8 = X.C245963dl.A00     // Catch:{ all -> 0x004e }
            if (r0 == r8) goto L_0x003c
            r0 = 1073741824(0x40000000, float:2.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r0)     // Catch:{ all -> 0x004e }
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r0)     // Catch:{ all -> 0x004e }
            X.2T3 r2 = r4.A0A     // Catch:{ all -> 0x004e }
            if (r2 == 0) goto L_0x003c
            X.7hR r0 = r4.A0T     // Catch:{ all -> 0x004e }
            int r0 = r0.Bq5()     // Catch:{ all -> 0x004e }
            int r1 = r4.A06     // Catch:{ all -> 0x004e }
            if (r1 == r8) goto L_0x003c
            if (r0 == 0) goto L_0x0032
            int r0 = r2.A01     // Catch:{ all -> 0x004e }
            boolean r0 = X.AnonymousClass2VV.A00(r1, r5, r0)     // Catch:{ all -> 0x004e }
            goto L_0x003a
        L_0x0032:
            int r1 = r4.A05     // Catch:{ all -> 0x004e }
            int r0 = r2.A00     // Catch:{ all -> 0x004e }
            boolean r0 = X.AnonymousClass2VV.A00(r1, r3, r0)     // Catch:{ all -> 0x004e }
        L_0x003a:
            if (r0 != 0) goto L_0x0051
        L_0x003c:
            X.2T3 r3 = X.2We.A1A     // Catch:{ all -> 0x004e }
            r0 = 1073741824(0x40000000, float:2.0)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r0)     // Catch:{ all -> 0x004e }
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r0)     // Catch:{ all -> 0x004e }
            X.2Sg r0 = r4.A09     // Catch:{ all -> 0x004e }
            r4.Cnv(r0, r3, r2, r1)     // Catch:{ all -> 0x004e }
            goto L_0x0051
        L_0x004e:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0051:
            monitor-exit(r4)
        L_0x0052:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GBY.A01(X.GBY):void");
    }
}
