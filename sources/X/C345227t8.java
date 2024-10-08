package X;

import java.util.HashMap;

/* renamed from: X.7t8  reason: invalid class name and case insensitive filesystem */
public final class C345227t8 extends C344317rf implements AnonymousClass7t9 {
    public C341897nh A00;
    public HashMap A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final C340247kw A06 = new C341217mW(this);
    public final C345237tA A07 = new C341207mV(this);
    public final C344887sa A08 = new C341197mU(this);
    public final boolean A09;
    public final C341227mX A0A;
    public final C341167mR A0B;
    public volatile C345167t2 A0C;
    public volatile C340607lX A0D;

    /* JADX WARNING: Removed duplicated region for block: B:35:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00aa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void A01(X.C345227t8 r6, java.lang.Boolean r7, java.lang.Boolean r8) {
        /*
            monitor-enter(r6)
            X.7lX r3 = r6.A0D     // Catch:{ all -> 0x00b7 }
            if (r3 == 0) goto L_0x00b5
            boolean r0 = r6.A05     // Catch:{ all -> 0x00b7 }
            if (r0 == 0) goto L_0x00b5
            boolean r4 = r6.A04     // Catch:{ all -> 0x00b7 }
            boolean r2 = r6.A03     // Catch:{ all -> 0x00b7 }
            if (r7 == 0) goto L_0x0016
            boolean r1 = r7.booleanValue()     // Catch:{ all -> 0x00b7 }
        L_0x0013:
            r6.A04 = r1     // Catch:{ all -> 0x00b7 }
            goto L_0x0018
        L_0x0016:
            r1 = r4
            goto L_0x0013
        L_0x0018:
            if (r8 == 0) goto L_0x001b
            goto L_0x001d
        L_0x001b:
            r0 = r2
            goto L_0x0021
        L_0x001d:
            boolean r0 = r8.booleanValue()     // Catch:{ all -> 0x00b7 }
        L_0x0021:
            r6.A03 = r0     // Catch:{ all -> 0x00b7 }
            if (r1 != r4) goto L_0x0027
            if (r0 == r2) goto L_0x00b5
        L_0x0027:
            java.util.HashMap r0 = r6.A01     // Catch:{ all -> 0x00b7 }
            if (r0 == 0) goto L_0x0073
            java.lang.Object r5 = r0.clone()     // Catch:{ all -> 0x00b7 }
            java.util.HashMap r5 = (java.util.HashMap) r5     // Catch:{ all -> 0x00b7 }
        L_0x0031:
            boolean r0 = r6.A03     // Catch:{ all -> 0x00b7 }
            if (r0 == 0) goto L_0x0062
            r0 = 0
            X.0qQ.A0B(r5, r0)     // Catch:{ all -> 0x00b7 }
            r0 = 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x00b7 }
            r0 = 1303(0x517, float:1.826E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x00b7 }
            r5.put(r0, r1)     // Catch:{ all -> 0x00b7 }
            r0 = 1301(0x515, float:1.823E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x00b7 }
            r5.put(r0, r1)     // Catch:{ all -> 0x00b7 }
            r0 = 1302(0x516, float:1.824E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x00b7 }
            r5.put(r0, r1)     // Catch:{ all -> 0x00b7 }
            r0 = 1304(0x518, float:1.827E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x00b7 }
            r5.put(r0, r1)     // Catch:{ all -> 0x00b7 }
        L_0x0062:
            X.7p7 r4 = new X.7p7     // Catch:{ all -> 0x00b7 }
            r4.<init>()     // Catch:{ all -> 0x00b7 }
            X.7p4 r2 = X.C342717p3.A0M     // Catch:{ all -> 0x00b7 }
            boolean r0 = r6.A04     // Catch:{ all -> 0x00b7 }
            if (r0 != 0) goto L_0x0079
            boolean r1 = r6.A03     // Catch:{ all -> 0x00b7 }
            r0 = 0
            if (r1 == 0) goto L_0x007a
            goto L_0x0079
        L_0x0073:
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ all -> 0x00b7 }
            r5.<init>()     // Catch:{ all -> 0x00b7 }
            goto L_0x0031
        L_0x0079:
            r0 = 1
        L_0x007a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x00b7 }
            r4.A01(r2, r0)     // Catch:{ all -> 0x00b7 }
            X.7p4 r0 = X.C342717p3.A02     // Catch:{ all -> 0x00b7 }
            r5.getClass()     // Catch:{ all -> 0x00b7 }
            r4.A01(r0, r5)     // Catch:{ all -> 0x00b7 }
            X.7pk r1 = r4.A00()     // Catch:{ all -> 0x00b7 }
            X.8lm r0 = new X.8lm     // Catch:{ all -> 0x00b7 }
            r0.<init>(r6)     // Catch:{ all -> 0x00b7 }
            r3.CoY(r0, r1)     // Catch:{ all -> 0x00b7 }
            boolean r0 = r6.A04     // Catch:{ all -> 0x00b7 }
            if (r0 != 0) goto L_0x00aa
            boolean r0 = r6.A03     // Catch:{ all -> 0x00b7 }
            if (r0 != 0) goto L_0x00aa
            X.7mX r0 = r6.A0A     // Catch:{ all -> 0x00b7 }
            X.7mc r1 = r0.A00     // Catch:{ all -> 0x00b7 }
            java.lang.ref.WeakReference r0 = r1.A00     // Catch:{ all -> 0x00b7 }
            if (r0 == 0) goto L_0x00b5
            r0.clear()     // Catch:{ all -> 0x00b7 }
            r0 = 0
            goto L_0x00b3
        L_0x00aa:
            X.7mX r2 = r6.A0A     // Catch:{ all -> 0x00b7 }
            X.7mc r1 = r2.A00     // Catch:{ all -> 0x00b7 }
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x00b7 }
            r0.<init>(r2)     // Catch:{ all -> 0x00b7 }
        L_0x00b3:
            r1.A00 = r0     // Catch:{ all -> 0x00b7 }
        L_0x00b5:
            monitor-exit(r6)
            return
        L_0x00b7:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C345227t8.A01(X.7t8, java.lang.Boolean, java.lang.Boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0022, code lost:
        if (X.AnonymousClass4x3.A00(r1) < 223040000) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C345227t8 r2) {
        /*
            boolean r0 = r2.A05
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.C340267kz.A00 = r0
            X.7nh r0 = r2.A00
            boolean r0 = r0.isARCoreSupported()
            if (r0 == 0) goto L_0x0024
            X.7qt r0 = r2.A00
            android.content.Context r1 = r0.getContext()
            r0 = 0
            X.0qQ.A0B(r1, r0)
            int r2 = X.AnonymousClass4x3.A00(r1)
            r1 = 223040000(0xd4b5200, float:6.265291E-31)
            r0 = 1
            if (r2 >= r1) goto L_0x0025
        L_0x0024:
            r0 = 0
        L_0x0025:
            X.C340267kz.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C345227t8.A00(X.7t8):void");
    }

    public final C343717qg BJt() {
        return AnonymousClass7t9.A00;
    }

    public C345227t8(C343837qt r3) {
        super(r3);
        boolean z;
        C341167mR r1 = new C341167mR(this);
        this.A0B = r1;
        this.A0A = new C341227mX(r1);
        Boolean bool = (Boolean) this.A00.Apu(C341287md.A00);
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        this.A09 = z;
    }
}
