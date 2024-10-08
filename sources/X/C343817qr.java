package X;

import android.content.Context;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.7qr  reason: invalid class name and case insensitive filesystem */
public final class C343817qr implements C343827qs {
    public C342937pP A00;
    public final C343847qu A01;
    public final C343877qx A02;
    public final C343887qy A03;
    public final boolean A04;
    public final Context A05;
    public final C343657qa A06;
    public volatile int A07 = 0;

    private synchronized void A00() {
        A02();
        if (this.A07 == 1) {
            C343847qu r0 = this.A01;
            r0.CMP();
            r0.CMk();
            this.A07 = 2;
        }
    }

    public static synchronized void A01(C343817qr r1) {
        synchronized (r1) {
            if (r1.A07 == 0) {
                if (r1.A04) {
                    r1.A00();
                } else {
                    r1.A02();
                }
            }
        }
    }

    public final synchronized void A02() {
        if (this.A07 == 0) {
            C343877qx r7 = this.A02;
            C343847qu r6 = this.A01;
            if (!r7.A00) {
                r7.A00 = true;
                C343787qn[] r5 = r7.A02;
                for (C343787qn Cg3 : r5) {
                    Cg3.Cg3(this, new C344297rd(r6, r7));
                }
                for (C343787qn Cg4 : r5) {
                    Cg4.Cg4(this, new C345347tL(r6, r7));
                }
                for (C343787qn Cg5 : r5) {
                    Cg5.Cg5(this, new C345427tT(r6, r7));
                }
                for (C343787qn Cg6 : r5) {
                    Cg6.Cg6(this, new C345457tW(r6, r7));
                }
            }
            this.A07 = 1;
        }
    }

    public final synchronized void AJF(C342937pP r8) {
        C343887qy r6 = this.A03;
        C343937r3 r5 = C344037rD.A00;
        ((C344037rD) r6.A00(r5)).DD9(28);
        ((C344037rD) r6.A00(r5)).CvU(28, "action", "connect");
        A00();
        if (this.A07 == 2) {
            this.A00 = r8;
            if (r8 != null) {
                C342927pO r0 = C342937pP.A03;
                Map map = r8.A00;
                r6.A01((String) map.remove(r0), (String) map.remove(C342937pP.A04), (String) map.remove(C342937pP.A01));
            }
            C343847qu r02 = this.A01;
            r02.E3N();
            r02.connect();
            this.A07 = 3;
        }
        ((C344037rD) r6.A00(r5)).DD4(28);
    }

    public final synchronized void disconnect() {
        if (this.A07 == 3 || this.A07 == 4) {
            this.A07 = 2;
            this.A01.disconnect();
        }
        if (!this.A04) {
            release();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000a, code lost:
        if (r3.A07 == 4) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void release() {
        /*
            r3 = this;
            monitor-enter(r3)
            int r1 = r3.A07     // Catch:{ all -> 0x0045 }
            r0 = 3
            if (r1 == r0) goto L_0x000c
            int r2 = r3.A07     // Catch:{ all -> 0x0045 }
            r1 = 4
            r0 = 0
            if (r2 != r1) goto L_0x000d
        L_0x000c:
            r0 = 1
        L_0x000d:
            r1 = 2
            if (r0 == 0) goto L_0x0017
            r3.A07 = r1     // Catch:{ all -> 0x0045 }
            X.7qu r0 = r3.A01     // Catch:{ all -> 0x0045 }
            r0.disconnect()     // Catch:{ all -> 0x0045 }
        L_0x0017:
            int r0 = r3.A07     // Catch:{ all -> 0x0045 }
            if (r0 != r1) goto L_0x0023
            r0 = 1
            r3.A07 = r0     // Catch:{ all -> 0x0045 }
            X.7qu r0 = r3.A01     // Catch:{ all -> 0x0045 }
            r0.release()     // Catch:{ all -> 0x0045 }
        L_0x0023:
            boolean r0 = r3.A04     // Catch:{ all -> 0x0045 }
            if (r0 != 0) goto L_0x0043
            int r1 = r3.A07     // Catch:{ all -> 0x0045 }
            r0 = 1
            if (r1 != r0) goto L_0x0043
            r2 = 0
            r3.A07 = r2     // Catch:{ all -> 0x0045 }
            X.7qx r1 = r3.A02     // Catch:{ all -> 0x0045 }
            boolean r0 = r1.A00     // Catch:{ all -> 0x0045 }
            if (r0 == 0) goto L_0x003c
            r1.A00 = r2     // Catch:{ all -> 0x0045 }
            java.util.Map r0 = r1.A01     // Catch:{ all -> 0x0045 }
            r0.clear()     // Catch:{ all -> 0x0045 }
        L_0x003c:
            X.7qu r0 = r3.A01     // Catch:{ all -> 0x0045 }
            java.util.List r0 = r0.A00     // Catch:{ all -> 0x0045 }
            r0.clear()     // Catch:{ all -> 0x0045 }
        L_0x0043:
            monitor-exit(r3)
            return
        L_0x0045:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C343817qr.release():void");
    }

    public final C343917r1 Apf(C343937r3 r2) {
        return this.A03.A00(r2);
    }

    public final Object Apt(C342927pO r2) {
        C342937pP r0 = this.A00;
        if (r0 == null) {
            return null;
        }
        return r0.A00.get(r2);
    }

    public final Object Apu(C343667qb r2) {
        return this.A06.A00.get(r2);
    }

    public final boolean CQN(C343717qg r2) {
        return this.A02.A01.containsKey(r2);
    }

    public final boolean CQO(C343937r3 r2) {
        return this.A03.A02.containsKey(r2);
    }

    public final Context getContext() {
        return this.A05;
    }

    public C343817qr(Context context, C343657qa r8, C343787qn[] r9) {
        boolean z = false;
        this.A05 = context.getApplicationContext();
        this.A01 = new C343847qu();
        this.A06 = r8;
        Boolean bool = (Boolean) r8.A00.get(C343827qs.A00);
        this.A04 = bool != null ? bool.booleanValue() : z;
        this.A02 = new C343877qx(r9);
        C343887qy r5 = new C343887qy(r9);
        this.A03 = r5;
        if (!r5.A00) {
            r5.A00 = true;
            for (C343787qn Cg7 : r5.A04) {
                Cg7.Cg7(this, r5);
            }
            Iterator it = r5.A01.iterator();
            while (it.hasNext()) {
                C343907r0 r1 = (C343907r0) ((C343917r1) it.next());
                if (!r1.A01) {
                    r1.A01 = true;
                }
            }
            ((C344037rD) r5.A00(C344037rD.A00)).EQW(4);
        }
    }

    public final C343697qe Ape(C343717qg r2) {
        A01(this);
        return (C343697qe) this.A02.A00(r2);
    }
}
