package X;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

/* renamed from: X.Xp3  reason: case insensitive filesystem */
public final class C21989Xp3 {
    public long A00;
    public long A01 = 0;
    public IOException A02;
    public Integer A03;
    public boolean A04;
    public final int A05;
    public final Deque A06;
    public final Y1K A07;
    public final C22460Y4r A08;
    public final C22464Y4v A09;
    public final Y7W A0A;
    public final Y7W A0B;

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A00(java.io.IOException r3, java.lang.Integer r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.Integer r0 = r2.A03     // Catch:{ all -> 0x0025 }
            r1 = 0
            if (r0 != 0) goto L_0x0012
            X.Y4v r0 = r2.A09     // Catch:{ all -> 0x0025 }
            boolean r0 = r0.A02     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0014
            X.Y4r r0 = r2.A08     // Catch:{ all -> 0x0025 }
            boolean r0 = r0.A01     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0014
        L_0x0012:
            monitor-exit(r2)     // Catch:{ all -> 0x0025 }
            return r1
        L_0x0014:
            r2.A03 = r4     // Catch:{ all -> 0x0025 }
            r2.A02 = r3     // Catch:{ all -> 0x0025 }
            r2.notifyAll()     // Catch:{ all -> 0x0025 }
            monitor-exit(r2)     // Catch:{ all -> 0x0025 }
            X.Y1K r1 = r2.A07
            int r0 = r2.A05
            r1.A02(r0)
            r0 = 1
            return r0
        L_0x0025:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0025 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21989Xp3.A00(java.io.IOException, java.lang.Integer):boolean");
    }

    public final C22460Y4r A01() {
        synchronized (this) {
            if (!this.A04 && (this.A05 & 1) != 1) {
                throw AnonymousClass7TE.A0z("reply before requesting the sink");
            }
        }
        return this.A08;
    }

    public final void A02() {
        boolean z;
        boolean A072;
        synchronized (this) {
            C22464Y4v y4v = this.A09;
            if (!y4v.A02 && y4v.A01) {
                C22460Y4r y4r = this.A08;
                if (y4r.A01 || y4r.A00) {
                    z = true;
                    A072 = A07();
                }
            }
            z = false;
            A072 = A07();
        }
        if (z) {
            A04((IOException) null, AnonymousClass05K.A0j);
        } else if (!A072) {
            this.A07.A02(this.A05);
        }
    }

    public final void A05(Integer num) {
        if (A00((IOException) null, num)) {
            this.A07.A03(this.A05, num);
        }
    }

    public final void A06(C22023Xt4 xt4, boolean z) {
        boolean A072;
        synchronized (this) {
            if (!this.A04 || !z) {
                this.A04 = true;
                this.A06.add(xt4);
                if (z) {
                }
                A072 = A07();
                notifyAll();
            } else {
                this.A09.A00 = xt4;
            }
            this.A09.A02 = true;
            A072 = A07();
            notifyAll();
        }
        if (!A072) {
            this.A07.A02(this.A05);
        }
    }

    public final synchronized boolean A07() {
        boolean z;
        z = false;
        if (this.A03 == null) {
            C22464Y4v y4v = this.A09;
            if (y4v.A02 || y4v.A01) {
                C22460Y4r y4r = this.A08;
                if ((y4r.A01 || y4r.A00) && this.A04) {
                }
            }
            z = true;
        }
        return z;
    }

    public final void A03() {
        C22460Y4r y4r = this.A08;
        if (y4r.A00) {
            throw JTO.A0u("stream closed");
        } else if (!y4r.A01) {
            Integer num = this.A03;
            if (num != null) {
                Throwable th = this.A02;
                if (th == null) {
                    th = new RCb(num);
                }
                throw th;
            }
        } else {
            throw JTO.A0u("stream finished");
        }
    }

    public C21989Xp3(C22023Xt4 xt4, Y1K y1k, int i, boolean z, boolean z2) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.A06 = arrayDeque;
        this.A0A = new Y7W(this);
        this.A0B = new Y7W(this);
        this.A05 = i;
        this.A07 = y1k;
        this.A00 = (long) y1k.A0L.A00();
        C22464Y4v y4v = new C22464Y4v(this, (long) y1k.A0A.A00());
        this.A09 = y4v;
        C22460Y4r y4r = new C22460Y4r(this);
        this.A08 = y4r;
        y4v.A02 = z2;
        y4r.A01 = z;
        if (xt4 != null) {
            arrayDeque.add(xt4);
        }
        if ((this.A05 & 1) == 1) {
            if (xt4 != null) {
                throw AnonymousClass7TE.A0z("locally-initiated streams shouldn't have headers yet");
            }
        } else if (xt4 == null) {
            throw AnonymousClass7TE.A0z("remotely-initiated streams should have headers");
        }
    }

    public final void A04(IOException iOException, Integer num) {
        if (A00(iOException, num)) {
            Y1K y1k = this.A07;
            y1k.A0J.A03(this.A05, num);
        }
    }
}
