package X;

/* renamed from: X.7su  reason: invalid class name and case insensitive filesystem */
public final class C345087su implements C344747sM, C345097sv, C345107sw {
    public C368998tf A00;
    public C345057sr A01;
    public boolean A02;
    public boolean A03;
    public int A04;
    public int A05;
    public int A06;
    public C345897uG A07;
    public A93 A08;
    public final C344407ro A09;
    public final C345127sy A0A = new Object();
    public final C345057sr A0B;
    public final boolean A0C;
    public volatile int A0D;
    public volatile C346267ut A0E;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.7sy] */
    public C345087su(C344407ro r3, C345057sr r4, C345057sr r5, boolean z) {
        this.A09 = r3;
        this.A0B = r4;
        this.A01 = r5;
        this.A0C = z;
        this.A0D = 5;
    }

    public final synchronized void A02(int i) {
        this.A0D = i;
    }

    public final Object BNo() {
        return this;
    }

    public final synchronized int BZY() {
        return this.A0D;
    }

    public final void CMa(C344567s4 r1) {
    }

    public final boolean CSb(C345137sz r2) {
        return true;
    }

    public final boolean contains(Object obj) {
        return obj == this;
    }

    public final void release() {
    }

    private void A00() {
        if (this.A00 == null) {
            C345897uG r3 = this.A07;
            if (r3 == null) {
                this.A09.A00(C368978td.GL_FRAME_BUFFER_SKIP_CREATE_FRAMEBUFFER_GL_CONTEXT_NULL);
                return;
            }
            int i = this.A06;
            boolean z = true;
            boolean z2 = false;
            if (i > 0) {
                z2 = true;
            }
            int i2 = this.A05;
            if (i2 <= 0) {
                z = false;
            }
            if (!z2) {
                this.A09.A00(C368978td.GL_FRAME_BUFFER_SKIP_CREATE_FRAMEBUFFER_ZERO_WIDTH);
                if (z) {
                    return;
                }
            } else if (z) {
                C368998tf AM7 = r3.C5m().AM7((C346337v0) null, r3, i, i2, this.A0C);
                this.A00 = AM7;
                C345127sy r2 = this.A0A;
                r2.A04 = AM7.getTexture();
                int i3 = 3;
                if (AM7.is10Bit()) {
                    i3 = 7;
                }
                r2.A00 = i3;
                return;
            }
            this.A09.A00(C368978td.GL_FRAME_BUFFER_SKIP_CREATE_FRAMEBUFFER_ZERO_HEIGHT);
        }
    }

    private void A01() {
        C368998tf r0 = this.A00;
        if (r0 != null) {
            try {
                r0.release();
            } finally {
                this.A00 = null;
                this.A0A.A04 = null;
            }
        }
    }

    public final void A03(int i, int i2, int i3) {
        int i4 = i;
        int i5 = i;
        int i6 = i2;
        int i7 = i2;
        if (i3 % 180 != 0) {
            i5 = i2;
            i7 = i;
        }
        if (this.A06 != i5 || this.A05 != i7 || this.A04 != i3 || this.A00 == null) {
            this.A04 = i3;
            this.A06 = i5;
            this.A05 = i7;
            if (this.A07 != null) {
                A01();
                A00();
            }
            C345057sr r0 = this.A0B;
            r0.A09(this.A06, this.A05, i4, i6, this.A04, false, false);
            this.A0A.A05 = r0.A08();
        }
    }

    public final void ACn(C345897uG r1) {
        this.A07 = r1;
        A00();
    }

    public final C345137sz B82() {
        return this.A0A;
    }

    public final int BHN() {
        return this.A0A.A00;
    }

    public final int BZU() {
        return this.A0A.A00;
    }

    public final /* synthetic */ boolean CYX() {
        return false;
    }

    public final boolean CdZ() {
        return this.A03;
    }

    public final Exception ClT() {
        C368998tf r1 = this.A00;
        if (r1 == null || this.A07 == null) {
            if (r1 == null) {
                this.A09.A00(C368978td.GL_FRAME_BUFFER_SKIP_MAKE_CURRENT_NULL_BUFFER);
                return new IllegalStateException("Frame buffer is null");
            } else if (this.A07 == null) {
                this.A09.A00(C368978td.GL_FRAME_BUFFER_SKIP_MAKE_CURRENT_NULL_GL_CONTEXT);
                return new IllegalStateException("Gl context is null");
            }
        }
        try {
            r1.bind();
            C345907uH.A02("Failure to bind frame buffer", new Object[0]);
            return null;
        } catch (C345117sx e) {
            this.A09.A00(C368978td.GL_FRAME_BUFFER_SKIP_MAKE_CURRENT_BIND_FRAME_BUFFER_ERROR);
            return e;
        }
    }

    public final C345067ss FL0(C345137sz r2) {
        return FL1(r2, this.A01);
    }

    public final void swapBuffers() {
        C368998tf r0 = this.A00;
        if (r0 == null) {
            this.A09.A00(C368978td.GL_FRAME_BUFFER_SKIP_SWAP_BUFFERS_NULL_BUFFER);
            return;
        }
        A93 a93 = this.A08;
        if (a93 != null) {
            a93.A00(r0.getWidth(), r0.getHeight());
        }
        this.A00.unbind();
        C346267ut r02 = this.A0E;
        if (r02 != null) {
            r02.DGm();
        }
    }

    public final C345067ss FL1(C345137sz r12, C345057sr r13) {
        C344407ro r1;
        C368978td r0;
        C345067ss CFP = r12.CFP();
        if (CFP == null) {
            r1 = this.A09;
            r0 = C368978td.GL_FRAME_BUFFER_SKIP_UPDATE_OUTPUT_NULL_VIEWPORT;
        } else if (!CFP.A00()) {
            r1 = this.A09;
            r0 = C368978td.GL_FRAME_BUFFER_SKIP_UPDATE_OUTPUT_NOT_VALID_VIEWPORT;
        } else {
            r13.A09(CFP.A01, CFP.A00, this.A06, this.A05, -this.A04, false, this.A02);
            C345127sy r2 = this.A0A;
            r2.A02 = r12.BZX();
            r2.A01 = r12.Awt();
            r2.A03 = r12.C7X();
            r2.A06 = r12.CU4();
            return r13.A08();
        }
        r1.A00(r0);
        return null;
    }

    public final void detach() {
        A01();
        this.A07 = null;
    }

    public final void EeQ(C346267ut r1) {
        this.A0E = r1;
    }

    public final void EeR(A93 a93) {
        this.A08 = a93;
    }
}
