package X;

import android.content.Context;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.google.common.collect.EvictingQueue;
import com.instagram.common.session.UserSession;

/* renamed from: X.3Su  reason: invalid class name and case insensitive filesystem */
public final class C242143Su implements C61110lV, AnonymousClass0lh {
    public static final Integer A0A = AnonymousClass05K.A01;
    public long A00;
    public AnonymousClass6UF A01;
    public UserSession A02;
    public boolean A03;
    public final Context A04;
    public final AnonymousClass0JR A05;
    public final EvictingQueue A06;
    public final C242073Sn A07;
    public final String A08;
    public final String A09;

    public static synchronized void A01(C242143Su r3) {
        synchronized (r3) {
            try {
                AnonymousClass6UF r1 = r3.A01;
                if (r1 != null && !r1.isDone()) {
                    r1.cancel(true);
                    r3.A01 = null;
                }
            } catch (Exception e) {
                0wb.A06("ForegroundLocation", "location-stop", e);
            }
        }
        return;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00bd, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00be, code lost:
        X.0wb.A06("ForegroundLocation", "location-start", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c7, code lost:
        if (r3.A03 != false) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c9, code lost:
        A01(r3);
        r3.A03 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C242143Su r24) {
        /*
            r3 = r24
            boolean r0 = r3.A03
            if (r0 != 0) goto L_0x00cf
            com.instagram.common.session.UserSession r0 = r3.A02
            if (r0 == 0) goto L_0x00cf
            X.0JR r9 = r3.A05     // Catch:{ Exception -> 0x00bd }
            long r4 = r9.now()     // Catch:{ Exception -> 0x00bd }
            long r0 = r3.A00     // Catch:{ Exception -> 0x00bd }
            long r4 = r4 - r0
            r1 = 21600000(0x1499700, double:1.0671818E-316)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00cf
            boolean r0 = X.14i.A08()     // Catch:{ Exception -> 0x00bd }
            if (r0 != 0) goto L_0x00cf
            android.content.Context r2 = r3.A04     // Catch:{ Exception -> 0x00bd }
            boolean r0 = X.1Wr.isLocationEnabled(r2)     // Catch:{ Exception -> 0x00bd }
            if (r0 == 0) goto L_0x00cf
            com.instagram.common.session.UserSession r1 = r3.A02     // Catch:{ Exception -> 0x00bd }
            java.lang.String r0 = "FOREGROUND_LOCATION_TRACKER"
            boolean r0 = X.1Wr.isLocationPermitted(r2, r1, r0)     // Catch:{ Exception -> 0x00bd }
            if (r0 == 0) goto L_0x00cf
            monitor-enter(r3)     // Catch:{ Exception -> 0x00bd }
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00ba }
            r1 = 29
            if (r2 < r1) goto L_0x003f
            boolean r0 = X.14i.A09()     // Catch:{ all -> 0x00ba }
            if (r0 != 0) goto L_0x00b2
        L_0x003f:
            boolean r0 = X.14i.A08()     // Catch:{ all -> 0x00ba }
            if (r0 != 0) goto L_0x00b2
            X.3Sn r8 = r3.A07     // Catch:{ all -> 0x00ba }
            X.4hc r5 = r8.A02()     // Catch:{ all -> 0x00ba }
            java.lang.Integer r4 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x00ba }
            r12 = 0
            r0 = 0
            java.lang.Integer r4 = X.C270924hc.A00(r5, r4, r12, r12, r0)     // Catch:{ all -> 0x00ba }
            java.lang.Integer r0 = X.AnonymousClass05K.A0N     // Catch:{ all -> 0x00ba }
            if (r4 != r0) goto L_0x00b5
            A01(r3)     // Catch:{ all -> 0x00ba }
            X.6UF r0 = r8.A06()     // Catch:{ all -> 0x00ba }
            r3.A01 = r0     // Catch:{ all -> 0x00ba }
            java.lang.Integer r13 = A0A     // Catch:{ all -> 0x00ba }
            r6 = 7000(0x1b58, double:3.4585E-320)
            r4 = 1800000(0x1b7740, double:8.89318E-318)
            java.lang.Long r14 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x00ba }
            r15 = 1176256512(0x461c4000, float:10000.0)
            r17 = 120000(0x1d4c0, double:5.9288E-319)
            r16 = 1059760811(0x3f2aaaab, float:0.6666667)
            r21 = 500(0x1f4, double:2.47E-321)
            X.Ryb r11 = new X.Ryb     // Catch:{ all -> 0x00ba }
            r19 = r17
            r23 = r6
            r11.<init>(r12, r13, r14, r15, r16, r17, r19, r21, r23)     // Catch:{ all -> 0x00ba }
            X.S1x r10 = new X.S1x     // Catch:{ all -> 0x00ba }
            r10.<init>(r6, r4)     // Catch:{ all -> 0x00ba }
            r19 = 1
            if (r2 < r1) goto L_0x008a
            r19 = 0
        L_0x008a:
            r20 = 1
            X.SFc r2 = new X.SFc     // Catch:{ all -> 0x00ba }
            r13 = r2
            r14 = r12
            r15 = r11
            r16 = r12
            r17 = r10
            r18 = r12
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x00ba }
            java.lang.String r1 = "LocationIntegrity"
            r0.A04(r2, r1)     // Catch:{ all -> 0x00ba }
            long r1 = r9.now()     // Catch:{ all -> 0x00ba }
            r3.A00 = r1     // Catch:{ all -> 0x00ba }
            X.T0H r2 = new X.T0H     // Catch:{ all -> 0x00ba }
            r2.<init>(r3)     // Catch:{ all -> 0x00ba }
            java.util.concurrent.ScheduledExecutorService r1 = r8.A09()     // Catch:{ all -> 0x00ba }
            X.C255183ti.A04(r2, r0, r1)     // Catch:{ all -> 0x00ba }
            goto L_0x00b5
        L_0x00b2:
            X.14i.A08()     // Catch:{ all -> 0x00ba }
        L_0x00b5:
            monitor-exit(r3)     // Catch:{ Exception -> 0x00bd }
            r0 = 1
            r3.A03 = r0     // Catch:{ Exception -> 0x00bd }
            return
        L_0x00ba:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ Exception -> 0x00bd }
            throw r0     // Catch:{ Exception -> 0x00bd }
        L_0x00bd:
            r2 = move-exception
            java.lang.String r1 = "ForegroundLocation"
            java.lang.String r0 = "location-start"
            X.0wb.A06(r1, r0, r2)
            boolean r0 = r3.A03
            if (r0 == 0) goto L_0x00cf
            A01(r3)
            r0 = 0
            r3.A03 = r0
        L_0x00cf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C242143Su.A00(X.3Su):void");
    }

    public final void onSessionWillEnd() {
        this.A06.clear();
        AnonymousClass1HI.A02.Eym(new C8799RAa(this));
        14i.A06(this);
        this.A02 = null;
    }

    public C242143Su(Context context, UserSession userSession) {
        String str;
        this.A04 = context;
        this.A02 = userSession;
        this.A07 = C242073Sn.A00(context, userSession);
        this.A08 = 0qv.A02.A05(context);
        19i A012 = 0jh.A04.A01(userSession).A01(19f.A1g);
        if (A012 == null) {
            str = "Not initiated";
        } else {
            str = A012.A01;
        }
        this.A09 = str;
        this.A06 = new EvictingQueue(10);
        this.A05 = RealtimeSinceBootClock.A00;
    }

    public final void onAppBackgrounded() {
        int A032 = AnonymousClass0fD.A03(1244204663);
        AnonymousClass1HI.A02.Eym(new C8799RAa(this));
        AnonymousClass0fD.A0A(-1938926280, A032);
    }

    public final void onAppForegrounded() {
        int A032 = AnonymousClass0fD.A03(983655291);
        AnonymousClass1HI.A02.Eym(new C242153Sv(this));
        AnonymousClass0fD.A0A(772878599, A032);
    }
}
