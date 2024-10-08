package X;

import android.content.Context;
import android.os.SystemClock;
import com.instagram.common.session.UserSession;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.4xQ  reason: invalid class name and case insensitive filesystem */
public final class C278724xQ {
    public C2807553x A00;
    public C278734xR A01;
    public final UserSession A02;
    public final C278784xW A03;
    public final C278794xX A04;
    public final C278754xT A05;
    public final C278744xS A06;
    public final C278714xP A07;
    public final List A08 = new LinkedList();
    public final Context A09;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0045, code lost:
        if (X.1Au.A00(r3).A01.getBoolean("reel_tray_personalization_is_high_me_user", false) == false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0048, code lost:
        if (r4 != false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004a, code lost:
        r6 = r11.A02;
        r5 = X.0Tu.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0057, code lost:
        if (X.182.A06(r5, r6, 36316224821989499L) == false) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0072, code lost:
        if (((long) X.1Au.A00(r6).A01.getInt("reel_tray_personalization_lness28_score", 0)) < X.182.A01(r5, r6, 36597699798764409L)) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0074, code lost:
        r2 = r11.A02;
        r0 = X.AnonymousClass1B0.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0082, code lost:
        if (X.AnonymousClass1B1.A00(r2).A00(X.1B2.A08) == false) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0088, code lost:
        if (r8.booleanValue() != false) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008a, code lost:
        if (r7 != false) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008c, code lost:
        if (r9 != false) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008e, code lost:
        X.0nY.A00().ATE(new X.C278834xb(r10, r11, X.AnonymousClass05K.A0N));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009d, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009f, code lost:
        r11.A01(r10, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001f, code lost:
        if (X.182.A06(X.0Tu.A05, r11.A02, 36316224821858425L) == false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C278704xO r10, X.C278724xQ r11, java.lang.String r12) {
        /*
            android.content.Context r0 = r11.A09
            boolean r0 = X.0oI.A09(r0)
            if (r0 != 0) goto L_0x009c
            java.lang.String r0 = "STORY"
            boolean r4 = r12.equals(r0)
            r9 = 1
            if (r4 == 0) goto L_0x0021
            com.instagram.common.session.UserSession r3 = r11.A02
            X.0Tu r2 = X.0Tu.A05
            r0 = 36316224821858425(0x81056a00171079, double:3.029865038818537E-306)
            boolean r1 = X.182.A06(r2, r3, r0)
            r0 = 1
            if (r1 != 0) goto L_0x0022
        L_0x0021:
            r0 = 0
        L_0x0022:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r0)
            if (r4 == 0) goto L_0x0047
            com.instagram.common.session.UserSession r3 = r11.A02
            X.0Tu r2 = X.0Tu.A05
            r0 = 36316224821923962(0x81056a0018107a, double:3.0298650388599826E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0047
            X.1Av r0 = X.1Au.A00(r3)
            X.0xa r2 = r0.A01
            java.lang.String r1 = "reel_tray_personalization_is_high_me_user"
            r0 = 0
            boolean r0 = r2.getBoolean(r1, r0)
            r7 = 1
            if (r0 != 0) goto L_0x004a
        L_0x0047:
            r7 = 0
            if (r4 == 0) goto L_0x009d
        L_0x004a:
            com.instagram.common.session.UserSession r6 = r11.A02
            X.0Tu r5 = X.0Tu.A05
            r0 = 36316224821989499(0x81056a0019107b, double:3.0298650389014284E-306)
            boolean r0 = X.182.A06(r5, r6, r0)
            if (r0 == 0) goto L_0x009d
            X.1Av r0 = X.1Au.A00(r6)
            X.0xa r2 = r0.A01
            java.lang.String r1 = "reel_tray_personalization_lness28_score"
            r0 = 0
            int r0 = r2.getInt(r1, r0)
            long r3 = (long) r0
            r0 = 36597699798764409(0x82056a001a0b79, double:3.207870947622639E-306)
            long r1 = X.182.A01(r5, r6, r0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x009d
        L_0x0074:
            com.instagram.common.session.UserSession r2 = r11.A02
            long r0 = X.AnonymousClass1B0.A02
            X.1B0 r1 = X.AnonymousClass1B1.A00(r2)
            X.1B2 r0 = X.1B2.A08
            boolean r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x009f
            boolean r0 = r8.booleanValue()
            if (r0 != 0) goto L_0x009f
            if (r7 != 0) goto L_0x009f
            if (r9 != 0) goto L_0x009f
            java.lang.Integer r2 = X.AnonymousClass05K.A0N
            X.0nO r1 = X.0nY.A00()
            X.4xb r0 = new X.4xb
            r0.<init>(r10, r11, r2)
            r1.ATE(r0)
        L_0x009c:
            return
        L_0x009d:
            r9 = 0
            goto L_0x0074
        L_0x009f:
            r11.A01(r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C278724xQ.A00(X.4xO, X.4xQ, java.lang.String):void");
    }

    public final void A02(C278704xO r7, String str) {
        UserSession userSession = this.A02;
        if (182.A06(0Tu.A05, userSession, 36319463225826724L)) {
            r7.DFq(AnonymousClass05K.A0j, false);
            return;
        }
        long j = AnonymousClass1B0.A02;
        AnonymousClass1B1.A00(userSession);
        if ((SystemClock.elapsedRealtime() - AnonymousClass1B0.A02) / 1000 < 300) {
            A00(r7, this, str);
        } else {
            AnonymousClass53V.A00(userSession, new AnonymousClass53T(r7, this, str));
        }
    }

    public C278724xQ(Context context, UserSession userSession, C278714xP r6) {
        this.A09 = context;
        this.A02 = userSession;
        this.A07 = r6;
        0Tu r2 = 0Tu.A05;
        if (!182.A06(r2, userSession, 36317801073546803L) && !182.A06(r2, userSession, 36315309994282117L)) {
            0qQ.A0B(context, 1);
            this.A01 = new C278734xR(context, userSession);
        }
        this.A06 = new C278744xS(context, userSession);
        this.A05 = new C278754xT(context, userSession, (String) null);
        this.A03 = new C278784xW(context, userSession, new C278774xV(userSession));
        this.A04 = new C278794xX(context, userSession);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00aa, code lost:
        if (r0 == false) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00b5, code lost:
        if (X.182.A06(r2, r3, 36316224820940908L) == false) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00b7, code lost:
        r9.A07.A04(X.AnonymousClass542.A08);
        r9.A08.add(new X.AnonymousClass544(r4, r9.A06));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00d3, code lost:
        if (X.182.A06(r2, r3, 36320936399479769L) != false) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00d7, code lost:
        if (X.1pN.A04 == null) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00d9, code lost:
        r9.A07.A04(X.AnonymousClass542.A04);
        r9.A08.add(X.C243443Yu.A00().A00(r4, r3, false));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00f7, code lost:
        if (X.182.A06(r2, r3, 36315743784078841L) == false) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00f9, code lost:
        r9.A07.A04(X.AnonymousClass542.A07);
        r9.A08.add(new X.C386759l7(r4, r9.A05));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0115, code lost:
        if (X.182.A06(r2, r3, 36319364441578674L) == false) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0117, code lost:
        r9.A07.A04(X.AnonymousClass542.A03);
        r9.A08.add(new X.AnonymousClass546(r4, r9.A03));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0133, code lost:
        if (X.182.A06(r2, r3, 36314098811996563L) == false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0135, code lost:
        r9.A07.A04(X.AnonymousClass542.A05);
        r2 = r9.A08;
        r1 = new X.H8B(r4, r9.A04);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0147, code lost:
        if (r0 != false) goto L_0x00ac;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.C278704xO r10, java.lang.String r11) {
        /*
            r9 = this;
            android.os.SystemClock.uptimeMillis()
            android.os.SystemClock.currentThreadTimeMillis()
            X.53x r1 = new X.53x
            r1.<init>()
            java.lang.ThreadLocal r0 = X.C2807553x.A01
            java.lang.Object r0 = r0.get()
            r0.getClass()
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            r0.add(r1)
            r9.A00 = r1
            X.0nx r1 = X.C61610nw.A00()
            java.lang.String r0 = "BackgroundPrefetch"
            r1.A01 = r0
            X.0vF r5 = new X.0vF
            r5.<init>(r1)
            X.53z r4 = new X.53z
            r4.<init>(r10, r9)
            java.lang.String r0 = "FEED"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0055
            X.4xR r3 = r9.A01
            if (r3 == 0) goto L_0x0055
            X.4xP r1 = r9.A07
            X.542 r0 = X.AnonymousClass542.MAIN_FEED
            r1.A04(r0)
            java.util.List r2 = r9.A08
            X.543 r1 = new X.543
            r1.<init>(r4, r3)
        L_0x0047:
            r2.add(r1)
        L_0x004a:
            X.4xP r8 = r9.A07
            boolean r0 = X.C278714xP.A01(r8)
            if (r0 == 0) goto L_0x0176
            monitor-enter(r8)
            goto L_0x014b
        L_0x0055:
            java.lang.String r0 = "STORY"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x006e
            X.4xP r1 = r9.A07
            X.542 r0 = X.AnonymousClass542.STORY
            r1.A04(r0)
            java.util.List r2 = r9.A08
            X.4xS r0 = r9.A06
            X.544 r1 = new X.544
            r1.<init>(r4, r0)
            goto L_0x0047
        L_0x006e:
            X.4xR r6 = r9.A01
            if (r6 == 0) goto L_0x0092
            com.instagram.common.session.UserSession r3 = r9.A02
            X.0Tu r2 = X.0Tu.A05
            r0 = 36315309993561217(0x81049500130c81, double:3.0292864977196645E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x0092
            X.4xP r1 = r9.A07
            X.542 r0 = X.AnonymousClass542.MAIN_FEED
            r1.A04(r0)
            java.util.List r1 = r9.A08
            X.543 r0 = new X.543
            r0.<init>(r4, r6)
            r1.add(r0)
        L_0x0092:
            com.instagram.common.session.UserSession r3 = r9.A02
            X.0Tu r2 = X.0Tu.A05
            r0 = 36316224821399667(0x81056a00101073, double:3.029865038528416E-306)
            boolean r6 = X.182.A06(r2, r3, r0)
            r0 = 36316224820482152(0x81056a00021068, double:3.029865037948176E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r6 == 0) goto L_0x0147
            if (r0 != 0) goto L_0x00ca
        L_0x00ac:
            r0 = 36316224820940908(0x81056a0009106c, double:3.029865038238295E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x00ca
        L_0x00b7:
            X.4xP r1 = r9.A07
            X.542 r0 = X.AnonymousClass542.STORY
            r1.A04(r0)
            java.util.List r6 = r9.A08
            X.4xS r1 = r9.A06
            X.544 r0 = new X.544
            r0.<init>(r4, r1)
            r6.add(r0)
        L_0x00ca:
            r0 = 36320936399479769(0x8109b3000023d9, double:3.032844659478275E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x00ee
            X.1pN r0 = X.1pN.A04
            if (r0 == 0) goto L_0x00ee
            X.4xP r1 = r9.A07
            X.542 r0 = X.AnonymousClass542.EXPLORE
            r1.A04(r0)
            java.util.List r6 = r9.A08
            X.1pN r1 = X.C243443Yu.A00()
            r0 = 0
            X.545 r0 = r1.A00(r4, r3, r0)
            r6.add(r0)
        L_0x00ee:
            r0 = 36315743784078841(0x8104fa00010df9, double:3.029560828589744E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x010c
            X.4xP r1 = r9.A07
            X.542 r0 = X.AnonymousClass542.PROFILE
            r1.A04(r0)
            java.util.List r6 = r9.A08
            X.4xT r1 = r9.A05
            X.9l7 r0 = new X.9l7
            r0.<init>(r4, r1)
            r6.add(r0)
        L_0x010c:
            r0 = 36319364441578674(0x81084500021cb2, double:3.031850546971856E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x012a
            X.4xP r1 = r9.A07
            X.542 r0 = X.AnonymousClass542.DIRECT_XMA_CLIPS
            r1.A04(r0)
            java.util.List r6 = r9.A08
            X.4xW r1 = r9.A03
            X.546 r0 = new X.546
            r0.<init>(r4, r1)
            r6.add(r0)
        L_0x012a:
            r0 = 36314098811996563(0x81037b00070993, double:3.0285205416211406E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x004a
            X.4xP r1 = r9.A07
            X.542 r0 = X.AnonymousClass542.FEED_PARSING_TEST
            r1.A04(r0)
            java.util.List r2 = r9.A08
            X.4xX r0 = r9.A04
            X.H8B r1 = new X.H8B
            r1.<init>(r4, r0)
            goto L_0x0047
        L_0x0147:
            if (r0 == 0) goto L_0x00b7
            goto L_0x00ac
        L_0x014b:
            X.1QP r7 = r8.A02     // Catch:{ all -> 0x0172 }
            java.util.List r6 = r8.A04     // Catch:{ all -> 0x0172 }
            java.util.Iterator r4 = r6.iterator()     // Catch:{ all -> 0x0172 }
        L_0x0153:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x0172 }
            if (r0 == 0) goto L_0x016e
            java.lang.Object r0 = r4.next()     // Catch:{ all -> 0x0172 }
            X.542 r0 = (X.AnonymousClass542) r0     // Catch:{ all -> 0x0172 }
            long r1 = r8.A01     // Catch:{ all -> 0x0172 }
            java.lang.String r3 = r0.A00     // Catch:{ all -> 0x0172 }
            java.lang.String r0 = "_registered"
            java.lang.String r3 = X.002.A0R(r3, r0)     // Catch:{ all -> 0x0172 }
            r0 = 1
            r7.flowAnnotate(r1, r3, r0)     // Catch:{ all -> 0x0172 }
            goto L_0x0153
        L_0x016e:
            r6.clear()     // Catch:{ all -> 0x0172 }
            goto L_0x0175
        L_0x0172:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x0175:
            monitor-exit(r8)
        L_0x0176:
            java.util.List r4 = r9.A08
            java.util.Iterator r3 = r4.iterator()
        L_0x017c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x01af
            java.lang.Object r0 = r3.next()
            X.0ng r0 = (X.0ng) r0
            if (r0 == 0) goto L_0x018e
            r5.ATE(r0)
            goto L_0x017c
        L_0x018e:
            X.0kg r2 = X.0kg.A03
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "list of runnables= "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ", jobType="
            r1.append(r0)
            r1.append(r11)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "IG_ANDROID_BG_PREFETCH_RUNNABLE_NULL"
            X.0wb.A01(r2, r0, r1)
            goto L_0x017c
        L_0x01af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C278724xQ.A01(X.4xO, java.lang.String):void");
    }
}
