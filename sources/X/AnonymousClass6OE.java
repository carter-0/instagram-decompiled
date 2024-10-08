package X;

import android.util.LruCache;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.google.common.util.concurrent.ListenableFuture;
import com.instagram.common.session.UserSession;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: X.6OE  reason: invalid class name */
public final class AnonymousClass6OE implements AnonymousClass6OF {
    public final QuickPerformanceLogger A00;
    public final SG9 A01;
    public final XFB A02;
    public final XFC A03;
    public final C13872Tit A04;
    public final Executor A05;
    public final Executor A06;
    public final ExecutorService A07;

    /* JADX WARNING: type inference failed for: r1v2, types: [X.SG9, java.lang.Object] */
    public AnonymousClass6OE(QuickPerformanceLogger quickPerformanceLogger, XFB xfb, AnonymousClass624 r20, UserSession userSession, String str) {
        LruCache lruCache;
        C7274Q1y q1y;
        C61480nO A002 = 0nY.A00();
        0qQ.A07(A002);
        C7273Q1x q1x = new C7273Q1x(userSession, A002);
        C7272Q1w q1w = new C7272Q1w();
        1NK A003 = 1NK.A00();
        0qQ.A07(A003);
        AnonymousClass624 r2 = r20;
        C7264Q1o q1o = new C7264Q1o(r2, A003, str);
        0nQ r11 = new 0nQ(0nY.A00(), 498, 3, false, false);
        int i = r2.A00;
        if (i > 0) {
            lruCache = new LruCache(i);
        } else {
            lruCache = null;
        }
        if (182.A06(0Tu.A05, AnonymousClass624.A00(r2), 36310778803781908L)) {
            q1y = new C7274Q1y();
        } else {
            q1y = null;
        }
        C7271Q1v q1v = new C7271Q1v(lruCache, q1y, q1w, q1x, q1o, r11);
        0nQ r112 = new 0nQ(0nY.A00(), 499, 3, false, false);
        Executor executor = AnonymousClass6OG.A01;
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        0qQ.A07(newSingleThreadExecutor);
        0qQ.A0B(executor, 3);
        ? obj = new Object();
        XFC xfc = new XFC();
        this.A04 = q1v;
        this.A05 = r112;
        this.A06 = executor;
        this.A00 = quickPerformanceLogger;
        this.A07 = newSingleThreadExecutor;
        this.A02 = xfb;
        this.A01 = obj;
        this.A03 = xfc;
    }

    public final ListenableFuture A03(Q2X q2x, Q1l q1l, String str, String str2, String str3, C62320sa r20) {
        C52600GYz gYz;
        String str4 = str;
        0qQ.A0B(str4, 0);
        String str5 = str2;
        0qQ.A0B(str5, 1);
        Q1l q1l2 = q1l;
        0qQ.A0B(q1l2, 2);
        Q2X q2x2 = q2x;
        try {
            LruCache lruCache = ((C7271Q1v) this.A04).A00;
            if (!(lruCache == null || (gYz = (C52600GYz) lruCache.get(Integer.valueOf(q1l2.hashCode()))) == null)) {
                return new 1Ks(A00(q2x, gYz));
            }
        } catch (RJZ e) {
            0KC.A0H("ShowreelNativeKeyframesDrawableProviderBase", "Create Keyframes drawable from cache failed", e);
        }
        return C303646Ae.A01(new Q2W(q2x, q1l2, this, str5, r20), C7271Q1v.A01(q2x2, q1l2, (C7271Q1v) this.A04, str4, str5, str3, false), this.A05);
    }

    public final ListenableFuture AUj(AnonymousClass9JH r2, Q2X q2x, AnonymousClass6L8 r4) {
        0qQ.A0B(r2, 0);
        0qQ.A0B(r4, 1);
        return Q2T.A00(new XFX(r2, q2x, r4, this));
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [java.lang.Object, X.6Ar] */
    /* JADX WARNING: type inference failed for: r0v38, types: [java.lang.Object, X.6BC] */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r1 = new java.lang.IllegalArgumentException("Not a bitmap layer");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.GZ1 A00(X.Q2X r13, X.C52600GYz r14) {
        /*
            com.google.common.collect.ImmutableList$Builder r3 = new com.google.common.collect.ImmutableList$Builder
            r3.<init>()
            java.util.List r0 = r14.A00
            java.util.Iterator r12 = r0.iterator()
            r2 = 0
            r4 = r2
        L_0x000d:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0143
            java.lang.Object r5 = r12.next()
            X.Mqd r5 = (X.C67605Mqd) r5
            X.0qQ.A0A(r5)
            r0 = 2
            X.0qQ.A0B(r5, r0)
            r13.DYu()
            X.6Ar r1 = new X.6Ar     // Catch:{ 2dj -> 0x0127 }
            r1.<init>()     // Catch:{ 2dj -> 0x0127 }
            byte[] r0 = r5.A04     // Catch:{ 2dj -> 0x0127 }
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)     // Catch:{ 2dj -> 0x0127 }
            X.0qQ.A07(r0)     // Catch:{ 2dj -> 0x0127 }
            X.2dv r8 = r1.A00(r0)     // Catch:{ 2dj -> 0x0127 }
            java.util.Map r0 = r5.A03
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r11 = r0.iterator()
        L_0x003f:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x00a2
            java.lang.Object r0 = r11.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r6 = r0.getKey()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r9 = r0.getValue()
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            java.util.Map r0 = r8.A02     // Catch:{ IllegalArgumentException -> 0x00e1 }
            if (r0 == 0) goto L_0x00cd
            java.lang.Object r1 = r0.get(r6)     // Catch:{ IllegalArgumentException -> 0x00e1 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ IllegalArgumentException -> 0x00e1 }
            if (r1 == 0) goto L_0x00cd
            boolean r0 = r1.isEmpty()     // Catch:{ IllegalArgumentException -> 0x00e1 }
            if (r0 != 0) goto L_0x00cd
            java.util.Iterator r10 = r1.iterator()     // Catch:{ IllegalArgumentException -> 0x00e1 }
        L_0x006d:
            boolean r0 = r10.hasNext()     // Catch:{ IllegalArgumentException -> 0x00e1 }
            if (r0 == 0) goto L_0x003f
            java.lang.Object r7 = r10.next()     // Catch:{ IllegalArgumentException -> 0x00e1 }
            X.2dy r7 = (X.2dy) r7     // Catch:{ IllegalArgumentException -> 0x00e1 }
            int r1 = r7.A0L     // Catch:{ IllegalArgumentException -> 0x00e1 }
            if (r1 < 0) goto L_0x00c5
            X.6WP r0 = r8.A01     // Catch:{ IllegalArgumentException -> 0x00e1 }
            if (r0 == 0) goto L_0x00d9
            java.util.List r6 = r0.A00     // Catch:{ IllegalArgumentException -> 0x00e1 }
            if (r6 == 0) goto L_0x00d9
            java.lang.Object r0 = r6.get(r1)     // Catch:{ IllegalArgumentException -> 0x00e1 }
            X.6BC r0 = (X.AnonymousClass6BC) r0     // Catch:{ IllegalArgumentException -> 0x00e1 }
            X.2dx r1 = r0.A01     // Catch:{ IllegalArgumentException -> 0x00e1 }
            X.6BC r0 = new X.6BC     // Catch:{ IllegalArgumentException -> 0x00e1 }
            r0.<init>()     // Catch:{ IllegalArgumentException -> 0x00e1 }
            r0.A01 = r1     // Catch:{ IllegalArgumentException -> 0x00e1 }
            r0.A00 = r9     // Catch:{ IllegalArgumentException -> 0x00e1 }
            r6.add(r0)     // Catch:{ IllegalArgumentException -> 0x00e1 }
            int r0 = r6.size()     // Catch:{ IllegalArgumentException -> 0x00e1 }
            int r0 = r0 + -1
            r7.A0L = r0     // Catch:{ IllegalArgumentException -> 0x00e1 }
            goto L_0x006d
        L_0x00a2:
            r13.DYv()
            X.61R r7 = new X.61R     // Catch:{ 2dj -> 0x0112, NullPointerException -> 0x00fd }
            r7.<init>(r8)     // Catch:{ 2dj -> 0x0112, NullPointerException -> 0x00fd }
            r0 = 1
            r7.AB9(r0)
            X.GZ0 r6 = new X.GZ0
            java.lang.String r9 = r5.A01
            java.util.List r10 = r5.A02
            java.util.List r11 = r14.A03
            X.JwI r8 = r5.A00
            r6.<init>(r7, r8, r9, r10, r11)
            if (r4 != 0) goto L_0x00c0
            r4 = r6
            goto L_0x000d
        L_0x00c0:
            r3.add(r6)
            goto L_0x000d
        L_0x00c5:
            java.lang.String r0 = "Not a bitmap layer"
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x00e1 }
            r1.<init>(r0)     // Catch:{ IllegalArgumentException -> 0x00e1 }
            goto L_0x00e0
        L_0x00cd:
            java.lang.String r0 = "no layers found for tag:"
            java.lang.String r0 = X.002.A0R(r0, r6)     // Catch:{ IllegalArgumentException -> 0x00e1 }
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x00e1 }
            r1.<init>(r0)     // Catch:{ IllegalArgumentException -> 0x00e1 }
            goto L_0x00e0
        L_0x00d9:
            java.lang.String r0 = "No bitmaps in asset"
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x00e1 }
            r1.<init>(r0)     // Catch:{ IllegalArgumentException -> 0x00e1 }
        L_0x00e0:
            throw r1     // Catch:{ IllegalArgumentException -> 0x00e1 }
        L_0x00e1:
            r3 = move-exception
            java.lang.Integer r2 = X.AnonymousClass05K.A0u
            com.google.common.collect.ImmutableMap r1 = com.google.common.collect.RegularImmutableMap.A02
            X.0qQ.A07(r1)
            java.lang.String r0 = "Animation initialisation error"
            r13.Dlm(r1, r2, r0)
            r13.DYt(r3)
            java.lang.String r1 = "Mutate bitmap failed"
            r0 = 1
            X.0qQ.A0B(r1, r0)
            X.RJZ r0 = new X.RJZ
            r0.<init>(r1, r3)
            throw r0
        L_0x00fd:
            r0 = move-exception
            java.lang.String r1 = "SN_NPE: "
            java.lang.String r0 = r0.getMessage()
            java.lang.String r1 = X.002.A0R(r1, r0)
            r0 = 1
            X.0qQ.A0B(r1, r0)
            X.RJZ r0 = new X.RJZ
            r0.<init>(r1, r2)
            throw r0
        L_0x0112:
            r0 = move-exception
            java.lang.String r1 = "KeyframesException: "
            java.lang.String r0 = r0.getMessage()
            java.lang.String r1 = X.002.A0R(r1, r0)
            r0 = 1
            X.0qQ.A0B(r1, r0)
            X.RJZ r0 = new X.RJZ
            r0.<init>(r1, r2)
            throw r0
        L_0x0127:
            r3 = move-exception
            java.lang.Integer r2 = X.AnonymousClass05K.A15
            com.google.common.collect.ImmutableMap r1 = com.google.common.collect.RegularImmutableMap.A02
            X.0qQ.A07(r1)
            java.lang.String r0 = "Document decode error"
            r13.Dlm(r1, r2, r0)
            r13.DYt(r3)
            java.lang.String r1 = "Create Keyframes document failed"
            r0 = 1
            X.0qQ.A0B(r1, r0)
            X.RJZ r0 = new X.RJZ
            r0.<init>(r1, r3)
            throw r0
        L_0x0143:
            if (r4 == 0) goto L_0x0156
            com.google.common.collect.ImmutableList r3 = r3.build()
            X.0qQ.A07(r3)
            java.util.List r2 = r14.A01
            java.util.List r1 = r14.A02
            X.GZ1 r0 = new X.GZ1
            r0.<init>(r4, r3, r2, r1)
            return r0
        L_0x0156:
            java.lang.String r1 = "There should be at least one Keyframes document"
            r0 = 1
            X.0qQ.A0B(r1, r0)
            X.RJZ r0 = new X.RJZ
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6OE.A00(X.Q2X, X.GYz):X.GZ1");
    }

    public static final void A01(AnonymousClass9JH r24, XFW xfw, Q2X q2x, XFY xfy, AnonymousClass6L8 r28, AnonymousClass6OE r29, Throwable th, int i) {
        boolean z;
        C58698Iw7 iw7;
        Q2X q2x2 = q2x;
        AnonymousClass6OE r8 = r29;
        Throwable th2 = th;
        int i2 = i;
        if (i > 0) {
            z = true;
            q2x2.Cjz(SG9.A00(th2), r8.A01.A01(th2), i2);
            iw7 = new C58698Iw7(i2, 0, (Object) q2x2, (Object) r8, (Object) th2);
        } else {
            z = false;
            q2x2.Dei();
            iw7 = null;
        }
        AnonymousClass9JH r3 = r24;
        AnonymousClass6OE r12 = r8;
        Q2X q2x3 = q2x2;
        ListenableFuture A032 = r12.A03(q2x3, (Q1l) r3.A00, r3.A03, r3.A02, r3.A01, iw7);
        XFW xfw2 = xfw;
        xfw2.A01.add(A032);
        C255183ti.A04(new C22309XzK(r3, xfw2, q2x2, xfy, r28, r8, th2, i2, z), A032, r8.A06);
    }

    public final void A04(JPC jpc, C52510GVn gVn, AnonymousClass6L8 r13) {
        ListenableFuture A022;
        C379599Un r0 = r13.A00;
        C379629Uq r3 = new C379629Uq(r13);
        r3.Dei();
        String str = r0.A05;
        String str2 = gVn.A08;
        Q1l q1l = gVn.A00;
        String str3 = gVn.A05;
        0qQ.A0B(str, 0);
        C7271Q1v q1v = (C7271Q1v) this.A04;
        LruCache lruCache = q1v.A00;
        if (lruCache == null || lruCache.get(Integer.valueOf(q1l.hashCode())) == null) {
            A022 = C303646Ae.A02(new B7D(C46035DJs.A00), C7271Q1v.A01(r3, q1l, q1v, str, str2, str3, true), q1v.A04);
        } else {
            A022 = 1Ks.A01;
        }
        C255183ti.A04(new C52512GVp(r3, jpc), C303646Ae.A01(new C7265Q1p(TWz.A00), A022, this.A05), 1Lf.A01);
    }

    public final AnonymousClass6L8 A02(C52510GVn gVn, boolean z) {
        String obj = UUID.randomUUID().toString();
        0qQ.A07(obj);
        String str = gVn.A08;
        String str2 = gVn.A07;
        Q1l q1l = gVn.A00;
        String str3 = q1l.A02;
        0qQ.A06(str3);
        String str4 = gVn.A05;
        if (str4 == null) {
            str4 = "";
        }
        C379599Un r3 = new C379599Un(obj, str, str2, str3, str4, q1l.A01.length());
        Integer num = null;
        Integer num2 = null;
        String str5 = null;
        Integer num3 = null;
        Integer num4 = null;
        Boolean valueOf = Boolean.valueOf(z);
        Integer num5 = gVn.A02;
        if (num5 != null) {
            num = num5;
        }
        Integer num6 = gVn.A01;
        if (num6 != null) {
            num2 = num6;
        }
        Integer num7 = gVn.A03;
        if (num7 != null) {
            num3 = num7;
        }
        Integer num8 = gVn.A04;
        if (num8 != null) {
            num4 = num8;
        }
        String str6 = gVn.A06;
        if (str6 != null) {
            str5 = str6;
        }
        return new AnonymousClass6L8(r3, this.A00, new C379619Up(valueOf, num, num2, num3, num4, str5), this.A07);
    }
}
