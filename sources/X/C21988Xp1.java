package X;

import java.io.IOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Xp1  reason: case insensitive filesystem */
public final class C21988Xp1 {
    public Object A00;
    public C21464Xbw A01;
    public C21485Xcc A02;
    public C21492Xcj A03;
    public Y7U A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final C21946Xmb A0A;
    public final Y1U A0B;
    public final Y1T A0C;
    public final Xnx A0D;
    public final TZ6 A0E;

    public final Socket A03() {
        int i = 0;
        int size = this.A04.A0D.size();
        while (true) {
            if (i >= size) {
                break;
            } else if (((Reference) this.A04.A0D.get(i)).get() != this) {
                i++;
            } else if (i != -1) {
                Y7U y7u = this.A04;
                y7u.A0D.remove(i);
                this.A04 = null;
                if (y7u.A0D.isEmpty()) {
                    y7u.A04 = System.nanoTime();
                    Xnx xnx = this.A0D;
                    if (y7u.A0C || xnx.A01 == 0) {
                        xnx.A04.remove(y7u);
                        return y7u.A06;
                    }
                    xnx.notifyAll();
                }
                return null;
            }
        }
        throw Pxe.A0i();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002a, code lost:
        if (r5.A02 != null) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.IOException A00(java.io.IOException r4, X.C21988Xp1 r5, boolean r6) {
        /*
            X.Xnx r3 = r5.A0D
            monitor-enter(r3)
            if (r6 == 0) goto L_0x0010
            X.Xcc r0 = r5.A02     // Catch:{ all -> 0x004d }
            if (r0 == 0) goto L_0x0010
            java.lang.String r0 = "cannot release connection while it is in use"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ all -> 0x004d }
            throw r0     // Catch:{ all -> 0x004d }
        L_0x0010:
            X.Y7U r0 = r5.A04     // Catch:{ all -> 0x004d }
            r2 = 0
            if (r0 == 0) goto L_0x0023
            X.Xcc r0 = r5.A02     // Catch:{ all -> 0x004d }
            if (r0 != 0) goto L_0x0023
            if (r6 != 0) goto L_0x001f
            boolean r0 = r5.A07     // Catch:{ all -> 0x004d }
            if (r0 == 0) goto L_0x0023
        L_0x001f:
            java.net.Socket r2 = r5.A03()     // Catch:{ all -> 0x004d }
        L_0x0023:
            boolean r0 = r5.A07     // Catch:{ all -> 0x004d }
            if (r0 == 0) goto L_0x002c
            X.Xcc r1 = r5.A02     // Catch:{ all -> 0x004d }
            r0 = 1
            if (r1 == 0) goto L_0x002d
        L_0x002c:
            r0 = 0
        L_0x002d:
            monitor-exit(r3)     // Catch:{ all -> 0x004d }
            X.SUS.A0A(r2)
            if (r0 == 0) goto L_0x004c
            boolean r0 = r5.A08
            if (r0 != 0) goto L_0x004c
            X.TZ6 r0 = r5.A0E
            boolean r0 = r0.A0C()
            if (r0 == 0) goto L_0x004c
            java.lang.String r1 = "timeout"
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException
            r0.<init>(r1)
            if (r4 == 0) goto L_0x004b
            r0.initCause(r4)
        L_0x004b:
            return r0
        L_0x004c:
            return r4
        L_0x004d:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x004d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21988Xp1.A00(java.io.IOException, X.Xp1, boolean):java.io.IOException");
    }

    public final IOException A01(IOException iOException) {
        synchronized (this.A0D) {
            this.A07 = true;
        }
        return A00(iOException, this, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003b, code lost:
        if (r3 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return A00(r7, r6, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        return r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.IOException A02(java.io.IOException r7, X.C21485Xcc r8, boolean r9, boolean r10) {
        /*
            r6 = this;
            X.Xnx r2 = r6.A0D
            monitor-enter(r2)
            X.Xcc r5 = r6.A02     // Catch:{ all -> 0x0042 }
            if (r8 == r5) goto L_0x0009
            monitor-exit(r2)     // Catch:{ all -> 0x0042 }
            return r7
        L_0x0009:
            r4 = 0
            r3 = 1
            if (r9 == 0) goto L_0x0014
            boolean r0 = r6.A05     // Catch:{ all -> 0x0042 }
            r1 = r0 ^ 1
            r6.A05 = r3     // Catch:{ all -> 0x0042 }
            goto L_0x0015
        L_0x0014:
            r1 = 0
        L_0x0015:
            if (r10 == 0) goto L_0x001e
            boolean r0 = r6.A06     // Catch:{ all -> 0x0042 }
            if (r0 != 0) goto L_0x001c
            r1 = 1
        L_0x001c:
            r6.A06 = r3     // Catch:{ all -> 0x0042 }
        L_0x001e:
            boolean r0 = r6.A05     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x0029
            boolean r0 = r6.A06     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x0029
            if (r1 == 0) goto L_0x0029
            goto L_0x002b
        L_0x0029:
            r3 = 0
            goto L_0x003a
        L_0x002b:
            X.YAz r0 = r5.A04     // Catch:{ all -> 0x0042 }
            X.Y7U r1 = r0.AJK()     // Catch:{ all -> 0x0042 }
            int r0 = r1.A03     // Catch:{ all -> 0x0042 }
            int r0 = r0 + 1
            r1.A03 = r0     // Catch:{ all -> 0x0042 }
            r0 = 0
            r6.A02 = r0     // Catch:{ all -> 0x0042 }
        L_0x003a:
            monitor-exit(r2)     // Catch:{ all -> 0x0042 }
            if (r3 == 0) goto L_0x0041
            java.io.IOException r7 = A00(r7, r6, r4)
        L_0x0041:
            return r7
        L_0x0042:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0042 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21988Xp1.A02(java.io.IOException, X.Xcc, boolean, boolean):java.io.IOException");
    }

    public final void A04() {
        C21485Xcc xcc;
        Y7U y7u;
        synchronized (this.A0D) {
            this.A09 = true;
            xcc = this.A02;
            C21492Xcj xcj = this.A03;
            if (xcj == null || (y7u = xcj.A01) == null) {
                y7u = this.A04;
            }
        }
        if (xcc != null) {
            xcc.A04.cancel();
        } else if (y7u != null) {
            SUS.A0A(y7u.A05);
        }
    }

    public final void A05() {
        synchronized (this.A0D) {
            if (!this.A07) {
                this.A02 = null;
            } else {
                throw Pxe.A0i();
            }
        }
    }

    public final boolean A06() {
        boolean z;
        synchronized (this.A0D) {
            z = this.A09;
        }
        return z;
    }

    public C21988Xp1(Y1U y1u, Y1T y1t) {
        Y7V y7v = new Y7V(this);
        this.A0E = y7v;
        this.A0B = y1u;
        this.A0D = y1u.A0H.A00;
        this.A0C = y1t;
        this.A0A = y1u.A0L.A00;
        y7v.A05(TimeUnit.MILLISECONDS, (long) y1u.A00);
    }
}
