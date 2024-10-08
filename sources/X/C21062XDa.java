package X;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.XDa  reason: case insensitive filesystem */
public final class C21062XDa extends Y5m implements Runnable, YCU {
    public int A00;
    public long A01;
    public C3029566q A02;
    public Throwable A03;
    public YAH A04;
    public boolean A05;
    public final int A06;
    public final int A07;
    public final C318286oh A08;
    public final AtomicLong A09 = new AtomicLong();
    public final YAl A0A;
    public volatile boolean A0B;
    public volatile boolean A0C;

    public final int EHR(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        this.A05 = true;
        return 2;
    }

    public final boolean A00(YAl yAl, boolean z, boolean z2) {
        if (this.A0B) {
            clear();
            return true;
        } else if (!z) {
            return false;
        } else {
            Throwable th = this.A03;
            if (th != null) {
                this.A0B = true;
                clear();
                yAl.onError(th);
            } else if (!z2) {
                return false;
            } else {
                this.A0B = true;
                yAl.onComplete();
            }
            this.A08.dispose();
            return true;
        }
    }

    public final void DUK(Object obj) {
        if (!this.A0C) {
            if (this.A00 != 2 && !this.A02.offer(obj)) {
                this.A04.cancel();
                this.A03 = new RuntimeException("Queue is full?!");
                this.A0C = true;
            }
            if (getAndIncrement() == 0) {
                this.A08.A00(this);
            }
        }
    }

    public final void Do5(YAH yah) {
        int i;
        if (this.A04 != null) {
            yah.cancel();
            C318176oW.A01(new IllegalStateException("Subscription already set!"));
            return;
        }
        this.A04 = yah;
        if (yah instanceof YCV) {
            C3029466p r2 = (C3029466p) yah;
            int EHR = r2.EHR(7);
            if (EHR == 1) {
                this.A00 = 1;
                this.A02 = r2;
                this.A0C = true;
                this.A0A.Do5(this);
                return;
            } else if (EHR == 2) {
                this.A00 = 2;
                this.A02 = r2;
                this.A0A.Do5(this);
                i = this.A07;
                yah.EHJ((long) i);
            }
        }
        i = this.A07;
        this.A02 = new XDL(i);
        this.A0A.Do5(this);
        yah.EHJ((long) i);
    }

    public final void EHJ(long j) {
        if (j <= 0) {
            C318176oW.A01(Pxg.A0b("n > 0 required but it was ", j));
            return;
        }
        C21065XDd.A00(this.A09, j);
        if (getAndIncrement() == 0) {
            this.A08.A00(this);
        }
    }

    public final void cancel() {
        if (!this.A0B) {
            this.A0B = true;
            this.A04.cancel();
            this.A08.dispose();
            if (getAndIncrement() == 0) {
                this.A02.clear();
            }
        }
    }

    public final void clear() {
        this.A02.clear();
    }

    public final boolean isEmpty() {
        return this.A02.isEmpty();
    }

    public final void onComplete() {
        if (!this.A0C) {
            this.A0C = true;
            if (getAndIncrement() == 0) {
                this.A08.A00(this);
            }
        }
    }

    public final void onError(Throwable th) {
        if (this.A0C) {
            C318176oW.A01(th);
            return;
        }
        this.A03 = th;
        this.A0C = true;
        if (getAndIncrement() == 0) {
            this.A08.A00(this);
        }
    }

    public final Object poll() {
        Object poll = this.A02.poll();
        if (!(poll == null || this.A00 == 1)) {
            long j = this.A01 + 1;
            if (j == ((long) this.A06)) {
                this.A01 = 0;
                this.A04.EHJ(j);
            } else {
                this.A01 = j;
                return poll;
            }
        }
        return poll;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0058, code lost:
        if (r13.A0B != false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005e, code lost:
        if (r8.isEmpty() != false) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0060, code lost:
        r0 = get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0064, code lost:
        if (r5 != r0) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0066, code lost:
        r13.A01 = r1;
        r5 = addAndGet(-r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006d, code lost:
        if (r5 != 0) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0070, code lost:
        r5 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            boolean r0 = r13.A05
            if (r0 == 0) goto L_0x002f
            r4 = 1
            r3 = 1
        L_0x0006:
            boolean r0 = r13.A0B
            if (r0 != 0) goto L_0x0022
            boolean r2 = r13.A0C
            X.YAl r1 = r13.A0A
            r0 = 0
            r1.DUK(r0)
            if (r2 == 0) goto L_0x0027
            r13.A0B = r4
            java.lang.Throwable r0 = r13.A03
            if (r0 == 0) goto L_0x0023
            r1.onError(r0)
        L_0x001d:
            X.6oh r0 = r13.A08
            r0.dispose()
        L_0x0022:
            return
        L_0x0023:
            r1.onComplete()
            goto L_0x001d
        L_0x0027:
            int r0 = -r3
            int r3 = r13.addAndGet(r0)
            if (r3 != 0) goto L_0x0006
            return
        L_0x002f:
            int r0 = r13.A00
            r7 = 1
            X.YAl r6 = r13.A0A
            if (r0 != r7) goto L_0x0084
            X.66q r8 = r13.A02
            long r1 = r13.A01
            r5 = 1
        L_0x003b:
            java.util.concurrent.atomic.AtomicLong r0 = r13.A09
            long r9 = r0.get()
        L_0x0041:
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x0056
            java.lang.Object r3 = r8.poll()     // Catch:{ all -> 0x0072 }
            boolean r0 = r13.A0B
            if (r0 != 0) goto L_0x0022
            if (r3 == 0) goto L_0x007e
            r6.DUK(r3)
            r3 = 1
            long r1 = r1 + r3
            goto L_0x0041
        L_0x0056:
            boolean r0 = r13.A0B
            if (r0 != 0) goto L_0x0022
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x007e
            int r0 = r13.get()
            if (r5 != r0) goto L_0x0070
            r13.A01 = r1
            int r0 = -r5
            int r5 = r13.addAndGet(r0)
            if (r5 != 0) goto L_0x003b
            return
        L_0x0070:
            r5 = r0
            goto L_0x003b
        L_0x0072:
            r1 = move-exception
            X.C9877Riq.A00(r1)
            r13.A0B = r7
            X.YAH r0 = r13.A04
            r0.cancel()
            goto L_0x00f9
        L_0x007e:
            r13.A0B = r7
            r6.onComplete()
            goto L_0x001d
        L_0x0084:
            X.66q r9 = r13.A02
            long r2 = r13.A01
            r10 = 1
        L_0x0089:
            java.util.concurrent.atomic.AtomicLong r8 = r13.A09
            long r11 = r8.get()
        L_0x008f:
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 == 0) goto L_0x00c8
            boolean r0 = r13.A0C
            java.lang.Object r4 = r9.poll()     // Catch:{ all -> 0x00eb }
            r1 = 0
            if (r4 != 0) goto L_0x009d
            r1 = 1
        L_0x009d:
            boolean r0 = r13.A00(r6, r0, r1)
            if (r0 != 0) goto L_0x0022
            if (r1 != 0) goto L_0x00c8
            r6.DUK(r4)
            r0 = 1
            long r2 = r2 + r0
            int r0 = r13.A06
            long r0 = (long) r0
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto L_0x008f
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x00c0
            long r0 = -r2
            long r11 = r8.addAndGet(r0)
        L_0x00c0:
            X.YAH r0 = r13.A04
            r0.EHJ(r2)
            r2 = 0
            goto L_0x008f
        L_0x00c8:
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x00d9
            boolean r1 = r13.A0C
            boolean r0 = r9.isEmpty()
            boolean r0 = r13.A00(r6, r1, r0)
            if (r0 == 0) goto L_0x00d9
            return
        L_0x00d9:
            int r0 = r13.get()
            if (r10 != r0) goto L_0x00e9
            r13.A01 = r2
            int r0 = -r10
            int r10 = r13.addAndGet(r0)
            if (r10 != 0) goto L_0x0089
            return
        L_0x00e9:
            r10 = r0
            goto L_0x0089
        L_0x00eb:
            r1 = move-exception
            X.C9877Riq.A00(r1)
            r13.A0B = r7
            X.YAH r0 = r13.A04
            r0.cancel()
            r9.clear()
        L_0x00f9:
            r6.onError(r1)
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21062XDa.run():void");
    }

    public C21062XDa(C318286oh r2, YAl yAl, int i) {
        this.A08 = r2;
        this.A07 = i;
        this.A06 = i - (i >> 2);
        this.A0A = yAl;
    }
}
