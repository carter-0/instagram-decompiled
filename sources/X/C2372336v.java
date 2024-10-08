package X;

import android.os.Handler;
import android.os.Looper;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.util.List;
import java.util.Locale;

/* renamed from: X.36v  reason: invalid class name and case insensitive filesystem */
public final class C2372336v implements AnonymousClass0lh {
    public AnonymousClass2l3 A00;
    public C2372436w A01;
    public final UserSession A02;
    public final Handler A03 = new Handler(Looper.getMainLooper());

    public C2372336v(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
    }

    public static final synchronized C2372436w A00(1QP r4, C2372336v r5) {
        synchronized (r5) {
            C2372436w r3 = r5.A01;
            if (r3 == null) {
                return null;
            }
            if (r4.isOngoingFlow(r3.A05)) {
                return r3;
            }
            r5.A01 = null;
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0082, code lost:
        return r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final synchronized X.C2372436w A01(X.C2372336v r12, java.lang.Integer r13) {
        /*
            monitor-enter(r12)
            com.instagram.common.session.UserSession r8 = r12.A02     // Catch:{ all -> 0x0083 }
            X.0Tu r7 = X.0Tu.A05     // Catch:{ all -> 0x0083 }
            r0 = 2342156274802493285(0x208102b9000e0765, double:4.059875670803287E-152)
            boolean r0 = X.182.A06(r7, r8, r0)     // Catch:{ all -> 0x0083 }
            r11 = 0
            if (r0 != 0) goto L_0x0013
            monitor-exit(r12)
            return r11
        L_0x0013:
            X.1QP r4 = X.AnonymousClass1QO.A00(r8)     // Catch:{ all -> 0x0083 }
            X.36w r6 = A00(r4, r12)     // Catch:{ all -> 0x0083 }
            if (r6 != 0) goto L_0x0081
            r1 = 974466465(0x3a152da1, float:5.690698E-4)
            int r0 = r13.intValue()     // Catch:{ all -> 0x0083 }
            switch(r0) {
                case 0: goto L_0x0074;
                case 1: goto L_0x007e;
                case 2: goto L_0x0077;
                default: goto L_0x0027;
            }     // Catch:{ all -> 0x0083 }
        L_0x0027:
            java.lang.String r5 = "HOT"
        L_0x0029:
            r10 = 0
            long r2 = r4.flowStartForMarker(r1, r5, r10)     // Catch:{ all -> 0x0083 }
            com.instagram.reels.store.ReelStore r9 = X.1OP.A05(r8)     // Catch:{ all -> 0x0083 }
            java.util.concurrent.ConcurrentMap r1 = r9.A0D     // Catch:{ all -> 0x0083 }
            com.instagram.common.session.UserSession r0 = r9.A09     // Catch:{ all -> 0x0083 }
            java.lang.String r0 = r0.A06     // Catch:{ all -> 0x0083 }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x0083 }
            com.instagram.model.reels.Reel r0 = (com.instagram.model.reels.Reel) r0     // Catch:{ all -> 0x0083 }
            if (r0 == 0) goto L_0x0044
            java.lang.String r11 = r0.getId()     // Catch:{ all -> 0x0083 }
        L_0x0044:
            X.36w r6 = new X.36w     // Catch:{ all -> 0x0083 }
            r6.<init>(r11, r2)     // Catch:{ all -> 0x0083 }
            java.util.List r0 = r9.A0U(r10)     // Catch:{ all -> 0x0083 }
            int r1 = r0.size()     // Catch:{ all -> 0x0083 }
            java.lang.String r0 = "EXISTING_TRAY_SIZE"
            r4.flowAnnotate(r2, r0, r1)     // Catch:{ all -> 0x0083 }
            java.lang.String r0 = "START_TYPE"
            r4.flowAnnotate(r2, r0, r5)     // Catch:{ all -> 0x0083 }
            android.os.Handler r5 = r12.A03     // Catch:{ all -> 0x0083 }
            X.36x r4 = new X.36x     // Catch:{ all -> 0x0083 }
            r4.<init>(r6, r12)     // Catch:{ all -> 0x0083 }
            r2 = 1000(0x3e8, double:4.94E-321)
            r0 = 36594740565444425(0x8202b9000d0749, double:3.205999516555205E-306)
            long r0 = X.182.A01(r7, r8, r0)     // Catch:{ all -> 0x0083 }
            long r0 = r0 * r2
            r5.postDelayed(r4, r0)     // Catch:{ all -> 0x0083 }
            r12.A01 = r6     // Catch:{ all -> 0x0083 }
            goto L_0x0081
        L_0x0074:
            java.lang.String r5 = "COLD"
            goto L_0x0029
        L_0x0077:
            r0 = 165(0xa5, float:2.31E-43)
            java.lang.String r5 = X.Pxd.A00(r0)     // Catch:{ all -> 0x0083 }
            goto L_0x0029
        L_0x007e:
            java.lang.String r5 = "WARM"
            goto L_0x0029
        L_0x0081:
            monitor-exit(r12)
            return r6
        L_0x0083:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2372336v.A01(X.36v, java.lang.Integer):X.36w");
    }

    public static final synchronized void A03(C2372436w r6, C2372336v r7) {
        synchronized (r7) {
            1QP A002 = AnonymousClass1QO.A00(r7.A02);
            C2372436w A003 = A00(A002, r7);
            if (A003 != null && A003.equals(r6)) {
                long j = A003.A05;
                A002.flowAnnotate(j, "DEBUG_REMAINING_COMPONENTS", A003.A07.toString());
                if (A003.A04 == 2) {
                    A002.flowEndSuccess(j);
                } else {
                    A002.flowEndTimeout(j);
                }
                r7.A01 = null;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0055  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A05(X.1OE r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            r0 = 0
            X.0qQ.A0B(r7, r0)     // Catch:{ all -> 0x0078 }
            com.instagram.common.session.UserSession r0 = r6.A02     // Catch:{ all -> 0x0078 }
            X.1QP r3 = X.AnonymousClass1QO.A00(r0)     // Catch:{ all -> 0x0078 }
            java.lang.Integer r2 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x0078 }
            java.lang.Integer r1 = r7.A04     // Catch:{ all -> 0x0078 }
            if (r2 == r1) goto L_0x001b
            boolean r0 = r7.A00()     // Catch:{ all -> 0x0078 }
            if (r0 != 0) goto L_0x001b
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x0078 }
            if (r0 != r1) goto L_0x0076
        L_0x001b:
            boolean r0 = r7.A00()     // Catch:{ all -> 0x0078 }
            if (r0 == 0) goto L_0x006f
            java.lang.Integer r2 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x0078 }
        L_0x0023:
            X.36w r4 = A01(r6, r2)     // Catch:{ all -> 0x0078 }
            if (r4 == 0) goto L_0x0076
            java.lang.Integer r1 = r7.A03     // Catch:{ all -> 0x0078 }
            java.lang.Integer r0 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x0078 }
            if (r1 != r0) goto L_0x005d
            java.util.HashSet r5 = r4.A07     // Catch:{ all -> 0x0078 }
            X.36y r0 = X.C2372636y.CACHE     // Catch:{ all -> 0x0078 }
            boolean r0 = r5.add(r0)     // Catch:{ all -> 0x0078 }
            if (r0 == 0) goto L_0x005d
            long r0 = r4.A05     // Catch:{ all -> 0x0078 }
            java.lang.String r2 = "CACHED_TRAY_DELIVERY_START"
            r3.flowMarkPoint(r0, r2)     // Catch:{ all -> 0x0078 }
        L_0x0040:
            boolean r0 = r7.A00()     // Catch:{ all -> 0x0078 }
            if (r0 == 0) goto L_0x004d
            long r1 = r4.A05     // Catch:{ all -> 0x0078 }
            java.lang.String r0 = "USER_REFRESHED"
            r3.flowMarkPoint(r1, r0)     // Catch:{ all -> 0x0078 }
        L_0x004d:
            X.36y r0 = X.C2372636y.TRAY_RENDER     // Catch:{ all -> 0x0078 }
            boolean r0 = r5.add(r0)     // Catch:{ all -> 0x0078 }
            if (r0 == 0) goto L_0x0076
            long r1 = r4.A05     // Catch:{ all -> 0x0078 }
            java.lang.String r0 = "TRAY_LOAD_START"
            r3.flowMarkPoint(r1, r0)     // Catch:{ all -> 0x0078 }
            goto L_0x0076
        L_0x005d:
            java.util.HashSet r5 = r4.A07     // Catch:{ all -> 0x0078 }
            X.36y r0 = X.C2372636y.NETWORK     // Catch:{ all -> 0x0078 }
            boolean r0 = r5.add(r0)     // Catch:{ all -> 0x0078 }
            if (r0 == 0) goto L_0x0040
            long r1 = r4.A05     // Catch:{ all -> 0x0078 }
            java.lang.String r0 = "NETWORK_TRAY_DELIVERY_START"
            r3.flowMarkPoint(r1, r0)     // Catch:{ all -> 0x0078 }
            goto L_0x0040
        L_0x006f:
            if (r2 == r1) goto L_0x0023
            java.lang.Integer r2 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x0078 }
            if (r2 != r1) goto L_0x0076
            goto L_0x0023
        L_0x0076:
            monitor-exit(r6)
            return
        L_0x0078:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2372336v.A05(X.1OE):void");
    }

    public final synchronized void A06(Integer num) {
        String str;
        1QP A002 = AnonymousClass1QO.A00(this.A02);
        C2372436w A003 = A00(A002, this);
        if (A003 != null) {
            long j = A003.A05;
            switch (num.intValue()) {
                case 1:
                    str = "APP_BACKGROUNDED";
                    break;
                case 2:
                    str = "EXIT_SURFACE";
                    break;
                case 3:
                    str = "FRAGMENT_NOT_VISIBLE";
                    break;
                default:
                    str = "ENTER_VIEWER";
                    break;
            }
            A002.flowAnnotate(j, "CANCEL_REASON", str);
            A002.flowEndCancel(j, str);
            this.A01 = null;
        }
    }

    public final synchronized void onSessionWillEnd() {
        1QP A002 = AnonymousClass1QO.A00(this.A02);
        C2372436w A003 = A00(A002, this);
        if (A003 != null) {
            long j = A003.A05;
            A002.flowAnnotate(j, "CANCEL_REASON", "SESSION_ENDING");
            A002.flowEndCancel(j, "SESSION_ENDING");
            this.A01 = null;
        }
    }

    public static final String A02(Throwable th) {
        StringBuilder sb;
        int i;
        if (th instanceof C69248NiA) {
            sb = new StringBuilder();
            sb.append("parse_http_status_code: ");
            i = ((C69248NiA) th).A00;
        } else if (th instanceof Q00) {
            sb = new StringBuilder();
            sb.append("empty_http_status_code: ");
            i = ((Q00) th).A00;
        } else {
            boolean z = th instanceof IOException;
            String obj = th.toString();
            String str = null;
            if (00l.A0d(obj, "Unexpcted", false)) {
                str = "Parsing";
            } else if (00l.A0d(obj, "no content", false)) {
                str = "EmptyCacheResponse";
            } else {
                String lowerCase = obj.toLowerCase(Locale.ROOT);
                0qQ.A07(lowerCase);
                if (new 11S("asyncsocketexception | network | connect").A07(lowerCase)) {
                    str = "NetworkConnection";
                }
            }
            if (z) {
                if (str == null) {
                    return AnonymousClass000.A00(111);
                }
                return str;
            } else if (str == null) {
                return "Other";
            } else {
                return str;
            }
        }
        sb.append(i);
        return sb.toString();
    }

    public static final void A04(C2372436w r6, C2372336v r7, 1OE r8) {
        1CS r4;
        AnonymousClass3PH r2 = AnonymousClass3PH.A00;
        UserSession userSession = r7.A02;
        if (C638918c.A01(C61170le.A00).A0V()) {
            r4 = 1CS.A05;
        } else if (AnonymousClass05K.A00 == r8.A04) {
            r4 = 1CS.A03;
        } else {
            r4 = 1CS.A06;
        }
        Integer num = AnonymousClass05K.A01;
        List A0a = 00k.A0a(r6.A03);
        r2.A01(userSession, r4, num, r6.A01, r6.A02, A0a);
    }
}
