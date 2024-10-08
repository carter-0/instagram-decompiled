package X;

/* renamed from: X.Sii  reason: case insensitive filesystem */
public final class C11909Sii implements C13796ThF {
    public int A00;
    public boolean A01;
    public final C13796ThF A02;
    public final boolean A03;
    public final C13892TjF A04;
    public final SOI A05;

    public final void A00() {
        boolean z;
        synchronized (this) {
            int i = this.A00;
            if (i > 0) {
                z = true;
                int i2 = i - 1;
                this.A00 = i2;
                if (i2 != 0) {
                    z = false;
                }
            } else {
                throw AnonymousClass7TE.A0z("Cannot release a recycled or not yet acquired resource");
            }
        }
        if (z) {
            SOI soi = this.A05;
            C13892TjF tjF = this.A04;
            S2H s2h = soi.A00;
            synchronized (s2h) {
                TRV trv = (TRV) s2h.A02.remove(tjF);
                if (trv != null) {
                    trv.clear();
                }
            }
            if (this.A03) {
                soi.A06.A03(tjF, this);
                return;
            }
            C10364Rr1 rr1 = soi.A05;
            synchronized (rr1) {
                if (!rr1.A00) {
                    rr1.A00 = true;
                    recycle();
                    rr1.A00 = false;
                } else {
                    Pxe.A1N(rr1.A01, this, 1);
                }
            }
        }
    }

    public final synchronized void A01() {
        if (!this.A01) {
            this.A00++;
        } else {
            throw AnonymousClass7TE.A0z("Cannot acquire a recycled resource");
        }
    }

    public final synchronized void recycle() {
        IllegalStateException illegalStateException;
        if (this.A00 > 0) {
            illegalStateException = AnonymousClass7TE.A0z("Cannot recycle a resource while it is still acquired");
        } else if (!this.A01) {
            this.A01 = true;
            this.A02.recycle();
        } else {
            illegalStateException = AnonymousClass7TE.A0z("Cannot recycle a resource that has already been recycled");
        }
        throw illegalStateException;
    }

    public final synchronized String toString() {
        StringBuilder A1A;
        A1A = AnonymousClass7TE.A1A();
        A1A.append("EngineResource{isMemoryCacheable=");
        A1A.append(this.A03);
        A1A.append(", listener=");
        A1A.append(this.A05);
        A1A.append(", key=");
        A1A.append(this.A04);
        A1A.append(", acquired=");
        A1A.append(this.A00);
        A1A.append(", isRecycled=");
        A1A.append(this.A01);
        A1A.append(", resource=");
        return Pxg.A0p(this.A02, A1A);
    }

    public final Class Bne() {
        return this.A02.Bne();
    }

    public final Object get() {
        return this.A02.get();
    }

    public final int getSize() {
        return this.A02.getSize();
    }

    public C11909Sii(C13892TjF tjF, SOI soi, C13796ThF thF, boolean z) {
        C9217RTu.A00(thF);
        this.A02 = thF;
        this.A03 = z;
        this.A04 = tjF;
        C9217RTu.A00(soi);
        this.A05 = soi;
    }
}
