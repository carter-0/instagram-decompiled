package X;

import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.3p6  reason: invalid class name and case insensitive filesystem */
public final class C252433p6 implements AnonymousClass1GR {
    public long A00 = System.currentTimeMillis();
    public AtomicInteger A01;
    public final Set A02;
    public final boolean A03;
    public final /* synthetic */ AnonymousClass2l3 A04;
    public final /* synthetic */ 1OE A05;
    public final /* synthetic */ C228102kn A06;
    public final /* synthetic */ Integer A07;
    public final /* synthetic */ boolean A08;

    public final void A00(AnonymousClass3HO r23) {
        int i;
        AnonymousClass3HO r9 = r23;
        0qQ.A0B(r9, 2);
        boolean z = this.A08;
        C228102kn r10 = this.A06;
        1OE r8 = this.A05;
        AnonymousClass2l3 r3 = this.A04;
        if (Systrace.A0E(1)) {
            0fS.A01("ReelTrayManager.getStreamingColdStartCallback.onNewData", 1215945562);
        }
        try {
            if (!this.A02.contains(r9)) {
                if (!z) {
                    long j = this.A00;
                    AtomicInteger atomicInteger = this.A01;
                    C228102kn.A08(r8, r9, r10, atomicInteger.get(), j, false);
                    boolean z2 = false;
                    if (atomicInteger.get() == 1) {
                        z2 = true;
                    }
                    r10.A0E = z2;
                    r10.A0J = true;
                } else if (!r10.A0J) {
                    C228102kn.A08(r8, r9, r10, this.A01.get(), this.A00, z);
                }
                if (this.A01.getAndIncrement() == 1 && r3 != null) {
                    C228102kn.A07(r3, z);
                }
                if (Systrace.A0E(1)) {
                    i = -1338420699;
                } else {
                    return;
                }
            } else if (Systrace.A0E(1)) {
                i = -32242294;
            } else {
                return;
            }
            0fS.A00(i);
        } catch (Throwable th) {
            if (Systrace.A0E(1)) {
                0fS.A00(-747149377);
            }
            throw th;
        }
    }

    public final /* synthetic */ void D58(AnonymousClass1QW r1, AnonymousClass2ZK r2) {
    }

    public final void DEO(C268654dm r10, AnonymousClass1QW r11) {
        C268654dm r3 = r10;
        0qQ.A0B(r10, 1);
        boolean z = this.A08;
        if (!z) {
            String valueOf = String.valueOf(r10.A01());
            AnonymousClass2l3 r1 = this.A04;
            if (r1 != null) {
                r1.A05(false, valueOf);
            }
        }
        C228102kn.A03(r3, this.A05, this.A06, this.A00, z);
    }

    public final /* synthetic */ void DEQ(C268654dm r1, AnonymousClass1QW r2) {
    }

    public final /* synthetic */ void DTx() {
    }

    public final /* synthetic */ void DfH(AnonymousClass1QW r1, AnonymousClass2ZK r2) {
    }

    public C252433p6(AnonymousClass2l3 r6, 1OE r7, C228102kn r8, Integer num, boolean z) {
        this.A06 = r8;
        this.A05 = r7;
        this.A04 = r6;
        this.A08 = z;
        this.A07 = num;
        boolean z2 = true;
        this.A01 = new AtomicInteger(1);
        this.A02 = new LinkedHashSet();
        UserSession userSession = r8.A07;
        0Tu r2 = 0Tu.A05;
        if (!182.A06(r2, userSession, 36328151946312687L) && !182.A06(r2, userSession, 36328151947426813L)) {
            z2 = false;
        }
        this.A03 = z2;
    }

    public final /* bridge */ /* synthetic */ void DTw(1XR r1, AnonymousClass1QW r2, AnonymousClass2ZK r3) {
        A00((AnonymousClass3HO) r1);
    }

    public final /* bridge */ /* synthetic */ void DTy(1XR r6, AnonymousClass1QW r7, AnonymousClass2ZK r8) {
        AnonymousClass3HO r62 = (AnonymousClass3HO) r6;
        0qQ.A0B(r7, 0);
        0qQ.A0B(r8, 1);
        0qQ.A0B(r62, 2);
        if (!this.A08) {
            C638918c.A01(C61170le.A00).A0H();
            C239753Ia A002 = r62.FH3();
            C228102kn r2 = this.A06;
            UserSession userSession = r2.A07;
            1E4.A00(userSession);
            String str = A002.A0D;
            if (str != null) {
                1Av A003 = 1Au.A00(userSession);
                0qQ.A0B(A003, 1);
                A003.A0t(str);
            }
            C228102kn.A0A(A002, r2);
        }
        if (this.A03 && 11Z.A07()) {
            A00(r62);
            this.A02.add(r62);
        }
    }

    public final void DeX() {
        boolean z = this.A08;
        C228102kn r5 = this.A06;
        1OE r4 = this.A05;
        if (Systrace.A0E(1)) {
            0fS.A01("ReelTrayManager.getStreamingColdStartCallback.onRequestFinished", 235905024);
        }
        try {
            1OH.A00(r5.A07).A07(r4);
            if (!z) {
                r5.A0G = false;
                r5.A0E = false;
            }
            r5.A0C = true;
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(1385121164);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0058, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005d, code lost:
        if (com.facebook.systrace.Systrace.A0E(1) != false) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005f, code lost:
        X.0fS.A00(563925890);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0065, code lost:
        throw r1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Den() {
        /*
            r8 = this;
            X.1OE r7 = r8.A05
            X.2kn r2 = r8.A06
            X.2l3 r4 = r8.A04
            r5 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r5)
            if (r0 == 0) goto L_0x0016
            r1 = 1770277617(0x69844af1, float:1.9991514E25)
            java.lang.String r0 = "ReelTrayManager.getStreamingColdStartCallback.onRequestStarted"
            X.0fS.A01(r0, r1)
        L_0x0016:
            java.lang.Integer r1 = r7.A03     // Catch:{ all -> 0x0058 }
            java.lang.Integer r0 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x0058 }
            if (r1 == r0) goto L_0x0021
            java.util.ArrayList r0 = r2.A0Q     // Catch:{ all -> 0x0058 }
            r0.clear()     // Catch:{ all -> 0x0058 }
        L_0x0021:
            com.instagram.common.session.UserSession r3 = r2.A07     // Catch:{ all -> 0x0058 }
            X.1OI r1 = X.1OH.A00(r3)     // Catch:{ all -> 0x0058 }
            r0 = 0
            r1.A0C(r7, r0)     // Catch:{ all -> 0x0058 }
            X.36v r0 = X.C2372236u.A00(r3)     // Catch:{ all -> 0x0058 }
            r0.A05(r7)     // Catch:{ all -> 0x0058 }
            X.0Tu r2 = X.0Tu.A05     // Catch:{ all -> 0x0058 }
            r0 = 36327370260494721(0x810f8d00003981, double:3.0369134590912094E-306)
            boolean r0 = X.182.A06(r2, r3, r0)     // Catch:{ all -> 0x0058 }
            if (r0 == 0) goto L_0x004b
            X.36v r1 = X.C2372236u.A00(r3)     // Catch:{ all -> 0x0058 }
            monitor-enter(r1)     // Catch:{ all -> 0x0058 }
            r1.A00 = r4     // Catch:{ all -> 0x0048 }
            monitor-exit(r1)     // Catch:{ all -> 0x0058 }
            goto L_0x004b
        L_0x0048:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0058 }
            throw r0     // Catch:{ all -> 0x0058 }
        L_0x004b:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r5)
            if (r0 == 0) goto L_0x0057
            r0 = 2053952353(0x7a6cd361, float:3.0741733E35)
            X.0fS.A00(r0)
        L_0x0057:
            return
        L_0x0058:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r5)
            if (r0 == 0) goto L_0x0065
            r0 = 563925890(0x219cd382, float:1.0626957E-18)
            X.0fS.A00(r0)
        L_0x0065:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C252433p6.Den():void");
    }
}
