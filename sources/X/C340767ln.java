package X;

import android.os.Handler;
import android.util.Log;
import android.util.Pair;
import java.util.UUID;

/* renamed from: X.7ln  reason: invalid class name and case insensitive filesystem */
public final class C340767ln {
    public C340947m5 A00;
    public String A01 = "";
    public final C340757lm A02;
    public volatile UUID A03;
    public volatile boolean A04;

    private void A00(String str, String str2) {
        Log.e("SessionManager", 002.A0u(str, " has been evicted. ", str2, " now owns the camera device"));
        int i = C340577lU.A00;
        C340577lU.A00(27, 0, new Pair(str, str2));
        C340947m5 r0 = this.A00;
        if (r0 != null) {
            C340757lm r2 = this.A02;
            C41118Aoe aoe = new C41118Aoe(r0, str, str2);
            synchronized (r2) {
                Handler handler = r2.A00;
                if (handler != null) {
                    handler.post(aoe);
                } else {
                    C342057ny.A00(aoe);
                }
            }
            this.A00 = null;
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    private boolean A01() {
        /*
            r7 = this;
            java.util.UUID r0 = r7.A03
            if (r0 == 0) goto L_0x0042
            X.7lm r6 = r7.A02
            java.util.UUID r5 = r7.A03
            monitor-enter(r6)
            java.util.UUID r0 = r6.A01     // Catch:{ all -> 0x003e }
            boolean r0 = r5.equals(r0)     // Catch:{ all -> 0x003e }
            r4 = 0
            if (r0 != 0) goto L_0x0013
            goto L_0x0041
        L_0x0013:
            android.os.Handler r0 = r6.A03     // Catch:{ all -> 0x003e }
            boolean r3 = r0.hasMessages(r4, r5)     // Catch:{ all -> 0x003e }
            r0.removeCallbacksAndMessages(r5)     // Catch:{ all -> 0x003e }
            android.os.Handler r0 = r6.A00     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x002b
            boolean r0 = r0.hasMessages(r4, r5)     // Catch:{ all -> 0x003e }
            r3 = r3 | r0
            android.os.Handler r0 = r6.A00     // Catch:{ all -> 0x003e }
            r0.removeCallbacksAndMessages(r5)     // Catch:{ all -> 0x003e }
            goto L_0x0039
        L_0x002b:
            java.lang.Class<X.7ny> r2 = X.C342057ny.class
            monitor-enter(r2)     // Catch:{ all -> 0x003e }
            android.os.Handler r1 = X.C342057ny.A00     // Catch:{ all -> 0x003b }
            boolean r0 = r1.hasMessages(r4, r5)     // Catch:{ all -> 0x003b }
            r1.removeCallbacksAndMessages(r5)     // Catch:{ all -> 0x003b }
            monitor-exit(r2)     // Catch:{ all -> 0x003e }
            r3 = r3 | r0
        L_0x0039:
            monitor-exit(r6)
            goto L_0x0043
        L_0x003b:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x003e }
            throw r0     // Catch:{ all -> 0x003e }
        L_0x003e:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x0041:
            monitor-exit(r6)
        L_0x0042:
            r3 = 0
        L_0x0043:
            java.util.UUID r0 = java.util.UUID.randomUUID()
            r7.A03 = r0
            X.7lm r1 = r7.A02
            java.util.UUID r0 = r7.A03
            monitor-enter(r1)
            r1.A01 = r0     // Catch:{ all -> 0x0052 }
            monitor-exit(r1)
            return r3
        L_0x0052:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C340767ln.A01():boolean");
    }

    public final String A02() {
        String str;
        synchronized (this.A02) {
            str = this.A01;
        }
        return str;
    }

    public final UUID A03(Handler handler, String str) {
        UUID uuid;
        C340757lm r1 = this.A02;
        synchronized (r1) {
            if (this.A04) {
                A00(this.A01, str);
            }
            if (A01()) {
                A00(this.A01, str);
            }
            r1.A00 = handler;
            this.A01 = str;
            this.A04 = true;
            uuid = this.A03;
        }
        return uuid;
    }

    public final void A04(C340947m5 r3) {
        synchronized (this.A02) {
            this.A00 = r3;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0024, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A05(java.util.UUID r4) {
        /*
            r3 = this;
            X.7lm r2 = r3.A02
            monitor-enter(r2)
            r1 = 0
            if (r4 == 0) goto L_0x001f
            java.util.UUID r0 = r3.A03     // Catch:{ all -> 0x0021 }
            if (r0 == 0) goto L_0x001f
            java.util.UUID r0 = r3.A03     // Catch:{ all -> 0x0021 }
            boolean r0 = r4.equals(r0)     // Catch:{ all -> 0x0021 }
            if (r0 == 0) goto L_0x001f
            r3.A01()     // Catch:{ all -> 0x0021 }
            r0 = 0
            r2.A00 = r0     // Catch:{ all -> 0x0021 }
            r3.A00 = r0     // Catch:{ all -> 0x0021 }
            r3.A04 = r1     // Catch:{ all -> 0x0021 }
            monitor-exit(r2)     // Catch:{ all -> 0x0021 }
            r0 = 1
            return r0
        L_0x001f:
            monitor-exit(r2)     // Catch:{ all -> 0x0021 }
            goto L_0x0024
        L_0x0021:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0021 }
            throw r0
        L_0x0024:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C340767ln.A05(java.util.UUID):boolean");
    }

    public C340767ln(C340757lm r2) {
        this.A02 = r2;
    }
}
