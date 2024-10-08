package X;

import android.util.LruCache;
import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicReference;

public final class GYI implements C250603lj {
    public boolean A00;
    public final UserSession A01;
    public final AnonymousClass4DU A02;
    public final AnonymousClass93U A03;
    public final AtomicReference A04 = new AtomicReference((Object) null);
    public final LruCache A05 = new LruCache(10);

    public GYI(UserSession userSession, AnonymousClass4DU r4, AnonymousClass93U r5) {
        0qQ.A0B(r5, 3);
        this.A02 = r4;
        this.A01 = userSession;
        this.A03 = r5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ATF(X.AnonymousClass30Y r14, X.C252093oY r15) {
        /*
            r13 = this;
            r3 = 0
            boolean r6 = X.AnonymousClass7TF.A1U(r3, r14, r15)
            java.lang.Object r5 = r14.A04
            X.GDe r5 = (X.C52058GDe) r5
            X.GDa r4 = r5.A0F
            if (r4 == 0) goto L_0x003b
            X.0eM r0 = r4.A08
            java.lang.Object r8 = r0.getValue()
            X.GYK r8 = (X.GYK) r8
            java.lang.Object r9 = r14.A03
            r11 = r9
            X.4bN r11 = (X.C267324bN) r11
            java.lang.String r10 = r11.getId()
            float r7 = r15.CFe(r14)
            int r0 = X.C51968G9o.A0A(r14, r15)
            if (r0 == r3) goto L_0x003c
            if (r0 == r6) goto L_0x004c
            X.3W1 r2 = r5.A0E
            android.util.LruCache r1 = r13.A05
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r1.put(r10, r0)
            if (r2 == 0) goto L_0x0137
            boolean r0 = r2.A1m
            if (r0 != r6) goto L_0x0137
        L_0x003b:
            return
        L_0x003c:
            com.instagram.common.session.UserSession r3 = r13.A01
            X.0Tu r2 = X.0Tu.A05
            r0 = 36330071794926005(0x811202000041b5, double:3.0386219203437594E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x003b
            goto L_0x007b
        L_0x004c:
            com.instagram.common.session.UserSession r3 = r13.A01
            X.0Tu r2 = X.0Tu.A05
            r0 = 36330071794926005(0x811202000041b5, double:3.0386219203437594E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x003b
            r0 = 37174496725107308(0x8412020001026c, double:3.5726396464166874E-306)
            float r0 = X.C51965G9l.A00(r2, r3, r0)
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x003b
            android.util.LruCache r12 = r13.A05
            java.lang.Object r0 = r12.get(r10)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 != 0) goto L_0x003b
            r12.put(r10, r1)
        L_0x007b:
            X.0qQ.A0B(r8, r6)
            java.lang.String r1 = r11.getId()
            java.util.concurrent.atomic.AtomicReference r0 = r13.A04
            java.lang.Object r0 = r0.getAndSet(r1)
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 != 0) goto L_0x003b
            java.util.concurrent.atomic.AtomicBoolean r1 = r8.A01
            boolean r0 = r1.get()
            if (r0 != 0) goto L_0x00a9
            X.GDa r0 = r8.A00
            X.GDc r0 = r0.A02
            X.GL1 r0 = r0.A01
            X.JMF r0 = r0.A04
            X.GIx r10 = X.GYK.A00(r0, r8)
            boolean r0 = r10.A01
            if (r0 == 0) goto L_0x00ab
            r1.set(r6)
        L_0x00a9:
            X.GIx r10 = X.C52206GIx.A02
        L_0x00ab:
            long r0 = android.os.SystemClock.elapsedRealtime()
            r4.A00 = r0
            X.0qQ.A06(r9)
            double r0 = (double) r7
            java.lang.String r9 = r11.getId()
            long r7 = android.os.SystemClock.elapsedRealtime()
            X.0eP r7 = X.AnonymousClass7TF.A0y(r9, r7)
            X.GFX.A02 = r7
            X.02m r9 = X.02m.A0p
            r8 = 630199745(0x259015c1, float:2.499476E-16)
            java.lang.String r7 = "delayed_cta_timeline"
            com.facebook.quicklog.EventBuilder r9 = r9.markEventBuilder(r8, r7)
            r7 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r0 = r0 * r7
            java.lang.String r7 = "visible_percentage"
            com.facebook.quicklog.EventBuilder r0 = r9.annotate(r7, r0)
            r0.report()
            X.GFX.A00(r10, r4)
            X.3W1 r0 = r5.A0E
            if (r0 == 0) goto L_0x003b
            boolean r0 = r0.A2Q
            if (r0 != r6) goto L_0x003b
            X.1Xj r4 = r11.A02
            if (r4 == 0) goto L_0x0135
            boolean r0 = r4.A4Q()
            if (r0 != 0) goto L_0x010d
            X.3gp r0 = r4.A1W()
            if (r0 == 0) goto L_0x010d
            X.GJU r5 = X.GJU.SHOW_AND_HIDE_PREVIEW_COMMENT
        L_0x00f7:
            android.os.Handler r4 = X.AnonymousClass7TF.A0D()
            r0 = 36601711297564981(0x82091000101135, double:3.21040783561713E-306)
            long r1 = X.182.A01(r2, r3, r0)
            X.Iij r0 = new X.Iij
            r0.<init>(r14, r5, r13)
            r4.postDelayed(r0, r1)
            return
        L_0x010d:
            boolean r0 = r4.A4Q()
            if (r0 != 0) goto L_0x0121
            r0 = 36320236320137338(0x8109100005207a, double:3.032401926483128E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0121
            X.GJU r5 = X.GJU.HIGHLIGHT_CTA
            goto L_0x00f7
        L_0x0121:
            boolean r0 = r4.A4Q()
            if (r0 != 0) goto L_0x0135
            r0 = 36320236320399486(0x8109100009207e, double:3.032401926648912E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0135
            X.GJU r5 = X.GJU.MID_SCENE
            goto L_0x00f7
        L_0x0135:
            r5 = 0
            goto L_0x00f7
        L_0x0137:
            boolean r0 = r13.A00
            if (r0 == 0) goto L_0x0151
            r8.A01()
            java.util.concurrent.atomic.AtomicReference r1 = r13.A04
            r0 = 0
            r1.set(r0)
            if (r2 == 0) goto L_0x014c
            boolean r0 = r2.A2Q
            if (r0 == r6) goto L_0x014c
            r2.A2Q = r6
        L_0x014c:
            r0 = -1
            r4.A00 = r0
            return
        L_0x0151:
            X.GDa r2 = r8.A00
            X.GDc r1 = r2.A02
        L_0x0155:
            X.GDc r0 = r2.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x016d
            if (r1 == 0) goto L_0x016b
            X.GL1 r0 = r1.A01
            X.JQN r0 = r0.A00
            if (r0 == 0) goto L_0x0168
            r0.Clh()
        L_0x0168:
            X.GDc r1 = r1.A00
            goto L_0x0155
        L_0x016b:
            r1 = 0
            goto L_0x0155
        L_0x016d:
            X.GDc r0 = r2.A01
            X.GL1 r0 = r0.A01
            X.JQN r0 = r0.A00
            r0.Clh()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GYI.ATF(X.30Y, X.3oY):void");
    }
}
