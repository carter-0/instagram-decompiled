package X;

import android.os.Handler;
import android.os.SystemClock;

/* renamed from: X.8me  reason: invalid class name and case insensitive filesystem */
public final class C365168me implements C344747sM, C345097sv, C344487rw {
    public int A00;
    public int A01;
    public int A02;
    public C344567s4 A03;
    public A93 A04;
    public final AnonymousClass8KU A05;
    public final int A06;
    public final C365188mg A07;
    public final C365228mk A08;
    public final C365248mm A09;
    public final C365178mf A0A;
    public final C365208mi A0B;
    public final C344407ro A0C;
    public final C345057sr A0D;
    public volatile C345897uG A0E;
    public volatile boolean A0F;

    public C365168me(AnonymousClass8KU r6, C344407ro r7) {
        C345057sr r1;
        C365178mf r0;
        C365208mi r02;
        0qQ.A0B(r7, 2);
        this.A05 = r6;
        this.A0C = r7;
        C365468nA BHU = r6.BHU();
        if ((BHU == null ? C365468nA.A04 : BHU).ordinal() != 1) {
            r1 = new C345077st();
        } else {
            r1 = new AnonymousClass800(false);
        }
        this.A0D = r1;
        AnonymousClass8KV CED = r6.CED();
        0qQ.A07(CED);
        int ordinal = CED.ordinal();
        int i = 4;
        if (ordinal == 2) {
            i = 1;
        } else if (ordinal == 3) {
            i = 2;
        } else if (ordinal == 4) {
            i = 3;
        } else if (ordinal != 5) {
            i = 0;
        }
        this.A06 = i;
        C365188mg r12 = null;
        if (r6 instanceof C365178mf) {
            r0 = (C365178mf) r6;
        } else {
            r0 = null;
        }
        this.A0A = r0;
        if (r6 instanceof C365208mi) {
            r02 = (C365208mi) r6;
        } else {
            r02 = null;
        }
        this.A0B = r02;
        this.A07 = r6 instanceof C365188mg ? (C365188mg) r6 : r12;
        this.A08 = new C365218mj(this);
        this.A09 = new C365238ml(this);
    }

    public final void ACn(C345897uG r4) {
        0qQ.A0B(r4, 0);
        AnonymousClass8KU r2 = this.A05;
        synchronized (r2) {
            this.A0E = r4;
            r2.CMW(this.A08, this.A09);
        }
    }

    public final String B0U() {
        return "GlSurfaceOutput";
    }

    public final void CMa(C344567s4 r2) {
        0qQ.A0B(r2, 0);
        this.A03 = r2;
    }

    public final C345067ss FL1(C345137sz r13, C345057sr r14) {
        C345067ss r0;
        boolean z;
        boolean z2;
        long elapsedRealtimeNanos;
        int i;
        AnonymousClass8KU r3 = this.A05;
        synchronized (r3) {
            C345067ss CFP = r13.CFP();
            if (CFP == null || !CFP.A00()) {
                r0 = null;
            } else {
                this.A02 = r3.getWidth();
                this.A01 = r3.getHeight();
                int i2 = this.A00;
                C365188mg r02 = this.A07;
                if (r02 != null) {
                    int Bpb = r02.Bpb();
                    z2 = false;
                    if ((Bpb & 2) == 2) {
                        z2 = true;
                    }
                    z = false;
                    if ((Bpb & 1) == 1) {
                        z = true;
                    }
                    if ((Bpb & 4) == 4) {
                        i = 90;
                    } else if ((Bpb & 8) == 8) {
                        i = 180;
                    } else {
                        int i3 = Bpb & 16;
                        i = 0;
                        if (i3 == 16) {
                            i = 270;
                        }
                    }
                    i2 += i;
                } else {
                    z2 = false;
                    z = false;
                }
                if (r13.Cc4()) {
                    elapsedRealtimeNanos = r13.C7X();
                } else {
                    elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                }
                C365178mf r2 = this.A0A;
                if (r2 != null) {
                    r2.A02 = elapsedRealtimeNanos;
                }
                C365208mi r22 = this.A0B;
                if (r22 != null) {
                    r22.A00(elapsedRealtimeNanos);
                }
                r14.A09(CFP.A01, CFP.A00, this.A02, this.A01, i2, z2, z);
                r0 = r14.A08();
            }
        }
        return r0;
    }

    public final boolean contains(Object obj) {
        0qQ.A0B(obj, 0);
        return this.A05 == obj;
    }

    public final Object BNo() {
        return this.A05;
    }

    public final /* synthetic */ int BZU() {
        return 0;
    }

    public final int BZY() {
        return this.A06;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000c, code lost:
        if (r2.AFP() == false) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean CSb(X.C345137sz r4) {
        /*
            r3 = this;
            X.8KU r2 = r3.A05
            monitor-enter(r2)
            boolean r0 = r3.A0F     // Catch:{ all -> 0x0011 }
            if (r0 == 0) goto L_0x000e
            boolean r1 = r2.AFP()     // Catch:{ all -> 0x0011 }
            r0 = 1
            if (r1 != 0) goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            monitor-exit(r2)
            return r0
        L_0x0011:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C365168me.CSb(X.7sz):boolean");
    }

    public final /* synthetic */ boolean CYX() {
        return false;
    }

    public final boolean CdZ() {
        return this.A05.CdZ();
    }

    public final Exception ClT() {
        AnonymousClass8KU r3 = this.A05;
        synchronized (r3) {
            try {
                r3.ClU();
                e = null;
            } catch (C345117sx e) {
                e = e;
                this.A0C.A00(C368978td.GL_FRAME_BUFFER_SKIP_MAKE_CURRENT_VIDEO_OUTPUT_ERROR);
            }
        }
        return e;
    }

    public final C345067ss FL0(C345137sz r2) {
        return FL1(r2, this.A0D);
    }

    public final void detach() {
        Handler handler;
        AnonymousClass8KU r1 = this.A05;
        synchronized (r1) {
            r1.destroy();
            this.A0E = null;
        }
        C344567s4 r0 = this.A03;
        if (r0 != null && (handler = r0.A06.A01) != null) {
            handler.removeMessages(1, this);
        }
    }

    public final void release() {
        Handler handler;
        AnonymousClass8KU r1 = this.A05;
        synchronized (r1) {
            r1.release();
        }
        C344567s4 r0 = this.A03;
        if (r0 != null && (handler = r0.A06.A01) != null) {
            handler.removeMessages(1, this);
        }
    }

    public final void swapBuffers() {
        AnonymousClass8KU r3 = this.A05;
        synchronized (r3) {
            A93 a93 = this.A04;
            if (a93 != null) {
                a93.A00(r3.getWidth(), r3.getHeight());
            }
            r3.Dpd();
            r3.swapBuffers();
        }
        C344567s4 r0 = this.A03;
        if (r0 != null) {
            r0.A06.A00(this);
        }
    }

    public final void EeR(A93 a93) {
        this.A04 = a93;
    }
}
