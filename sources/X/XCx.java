package X;

public final class XCx extends Y5l implements Runnable, 1aL {
    public int A00;
    public C65051aA A01;
    public C3029566q A02;
    public Throwable A03;
    public boolean A04;
    public final int A05;
    public final 1aL A06;
    public final C318286oh A07;
    public volatile boolean A08;
    public volatile boolean A09;

    public final int EHR(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        this.A04 = true;
        return 2;
    }

    public final boolean A00(1aL r4, boolean z, boolean z2) {
        if (this.A08) {
            this.A02.clear();
            return true;
        } else if (!z) {
            return false;
        } else {
            Throwable th = this.A03;
            if (th != null) {
                this.A08 = true;
                this.A02.clear();
                r4.onError(th);
            } else if (!z2) {
                return false;
            } else {
                this.A08 = true;
                r4.onComplete();
            }
            this.A07.dispose();
            return true;
        }
    }

    public final void DUK(Object obj) {
        if (!this.A09) {
            if (this.A00 != 2) {
                this.A02.offer(obj);
            }
            if (getAndIncrement() == 0) {
                this.A07.A00(this);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: X.XCy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: X.66p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: X.XCy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: X.XCy} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Do4(X.C65051aA r3) {
        /*
            r2 = this;
            X.1aA r0 = r2.A01
            boolean r0 = X.1af.A02(r0, r3)
            if (r0 == 0) goto L_0x002e
            r2.A01 = r3
            boolean r0 = r3 instanceof X.AnonymousClass66o
            if (r0 == 0) goto L_0x002f
            X.66p r3 = (X.C3029466p) r3
            r0 = 7
            int r1 = r3.EHR(r0)
            r0 = 1
            if (r1 != r0) goto L_0x0037
            r2.A00 = r1
            r2.A02 = r3
            r2.A09 = r0
            X.1aL r0 = r2.A06
            r0.Do4(r2)
            int r0 = r2.getAndIncrement()
            if (r0 != 0) goto L_0x002e
            X.6oh r0 = r2.A07
            r0.A00(r2)
        L_0x002e:
            return
        L_0x002f:
            int r0 = r2.A05
            X.XCy r3 = new X.XCy
            r3.<init>(r0)
            goto L_0x003c
        L_0x0037:
            r0 = 2
            if (r1 != r0) goto L_0x002f
            r2.A00 = r1
        L_0x003c:
            r2.A02 = r3
            X.1aL r0 = r2.A06
            r0.Do4(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XCx.Do4(X.1aA):void");
    }

    public final void clear() {
        this.A02.clear();
    }

    public final void dispose() {
        if (!this.A08) {
            this.A08 = true;
            this.A01.dispose();
            this.A07.dispose();
            if (getAndIncrement() == 0) {
                this.A02.clear();
            }
        }
    }

    public final boolean isEmpty() {
        return this.A02.isEmpty();
    }

    public final void onComplete() {
        if (!this.A09) {
            this.A09 = true;
            if (getAndIncrement() == 0) {
                this.A07.A00(this);
            }
        }
    }

    public final void onError(Throwable th) {
        if (this.A09) {
            C318176oW.A01(th);
            return;
        }
        this.A03 = th;
        this.A09 = true;
        if (getAndIncrement() == 0) {
            this.A07.A00(this);
        }
    }

    public final Object poll() {
        return this.A02.poll();
    }

    public final void run() {
        1aL r1;
        Throwable th;
        if (this.A04) {
            int i = 1;
            while (!this.A08) {
                boolean z = this.A09;
                Throwable th2 = this.A03;
                if (!z || th2 == null) {
                    r1 = this.A06;
                    r1.DUK((Object) null);
                    if (z) {
                        this.A08 = true;
                        th = this.A03;
                        if (th == null) {
                            r1.onComplete();
                            this.A07.dispose();
                            return;
                        }
                    } else {
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    }
                } else {
                    this.A08 = true;
                    r1 = this.A06;
                    th = this.A03;
                }
                r1.onError(th);
                this.A07.dispose();
                return;
            }
            return;
        }
        C3029566q r6 = this.A02;
        1aL r5 = this.A06;
        int i2 = 1;
        while (!A00(r5, this.A09, r6.isEmpty())) {
            while (true) {
                boolean z2 = this.A09;
                try {
                    Object poll = r6.poll();
                    boolean z3 = false;
                    if (poll == null) {
                        z3 = true;
                    }
                    if (A00(r5, z2, z3)) {
                        return;
                    }
                    if (z3) {
                        i2 = addAndGet(-i2);
                        if (i2 == 0) {
                            return;
                        }
                    } else {
                        r5.DUK(poll);
                    }
                } catch (Throwable th3) {
                    C9877Riq.A00(th3);
                    this.A08 = true;
                    this.A01.dispose();
                    r6.clear();
                    r5.onError(th3);
                    this.A07.dispose();
                    return;
                }
            }
        }
    }

    public XCx(1aL r1, C318286oh r2, int i) {
        this.A06 = r1;
        this.A07 = r2;
        this.A05 = i;
    }
}
