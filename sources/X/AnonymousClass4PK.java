package X;

import android.os.SystemClock;
import com.google.android.exoplayer2.audio.DefaultAudioSink;

/* renamed from: X.4PK  reason: invalid class name */
public abstract class AnonymousClass4PK implements AnonymousClass4PL, AnonymousClass4PN {
    public int A00;
    public int A01;
    public long A02;
    public AnonymousClass4RW A03;
    public C264894Rs A04;
    public AnonymousClass4TD A05;
    public Integer A06 = AnonymousClass05K.A00;
    public boolean A07;
    public C256683wB[] A08;
    public long A09;
    public boolean A0A;
    public final int A0B;
    public final AnonymousClass4PO A0C;

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C2612348u A0F(X.C256683wB r11, java.lang.Throwable r12, int r13, boolean r14) {
        /*
            r10 = this;
            r2 = r11
            if (r11 == 0) goto L_0x001a
            boolean r0 = r10.A0A
            if (r0 != 0) goto L_0x001a
            r0 = 1
            r10.A0A = r0
            r1 = 0
            int r0 = r10.Ez5(r11)     // Catch:{ 48u -> 0x0018, all -> 0x0014 }
            r8 = r0 & 7
            r10.A0A = r1
            goto L_0x001b
        L_0x0014:
            r0 = move-exception
            r10.A0A = r1
            throw r0
        L_0x0018:
            r10.A0A = r1
        L_0x001a:
            r8 = 4
        L_0x001b:
            java.lang.String r3 = r10.getName()
            int r7 = r10.A00
            if (r11 != 0) goto L_0x0024
            r8 = 4
        L_0x0024:
            r5 = 1
            X.48u r1 = new X.48u
            r4 = r12
            r6 = r13
            r9 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4PK.A0F(X.3wB, java.lang.Throwable, int, boolean):X.48u");
    }

    public void A0I() {
    }

    public void A0J() {
    }

    public abstract void A0K();

    public abstract void A0L(long j, boolean z);

    public void A0M(boolean z, boolean z2) {
    }

    public abstract void A0N(C256683wB[] r1, long j, long j2);

    public void CIs(int i, Object obj) {
    }

    public final void EFN(AnonymousClass4TD r12, C256683wB[] r13, long j, long j2) {
        C256703wD.A04(!this.A07);
        this.A05 = r12;
        long j3 = j;
        if (this.A02 == Long.MIN_VALUE) {
            this.A02 = j;
        }
        this.A08 = r13;
        long j4 = j2;
        this.A09 = j4;
        A0N(r13, j3, j4);
    }

    public final void EIA(long j) {
        this.A07 = false;
        this.A02 = j;
        A0L(j, false);
    }

    public /* synthetic */ void Eg2(float f, float f2) {
    }

    public final int A0D(long j) {
        AnonymousClass4TD r2 = this.A05;
        r2.getClass();
        return r2.Evj(j - this.A09);
    }

    public final int A0E(AnonymousClass4PO r8, AnonymousClass4PQ r9, int i) {
        AnonymousClass4TD r0 = this.A05;
        r0.getClass();
        int E6J = r0.E6J(r8, r9, i);
        if (E6J != -4) {
            if (E6J == -5) {
                C256683wB r3 = r8.A00;
                r3.getClass();
                long j = r3.A0M;
                if (j != Long.MAX_VALUE) {
                    C256653w8 r2 = new C256653w8(r3);
                    r2.A0K = j + this.A09;
                    r8.A00 = new C256683wB(r2);
                }
            }
            return E6J;
        } else if ((r9.A00 & 4) == 4) {
            this.A02 = Long.MIN_VALUE;
            if (!this.A07) {
                return -3;
            }
            return -4;
        } else {
            long j2 = r9.A01;
            r9.A00 = j2;
            long j3 = j2 + this.A09;
            r9.A01 = j3;
            this.A02 = Math.max(this.A02, j3);
            return E6J;
        }
    }

    public void A0H() {
        AnonymousClass4Q2 r1;
        if (this instanceof AnonymousClass4PI) {
            AnonymousClass4PI r4 = (AnonymousClass4PI) this;
            r4.A07 = 0;
            r4.A08 = 0;
            r4.A09 = 0;
            r4.A0F = SystemClock.elapsedRealtime();
            r4.A0J = SystemClock.elapsedRealtime() * 1000;
            if (r4.A0j) {
                r4.A0g.A03();
                return;
            }
            return;
        }
        if (this instanceof C266114Xp) {
            r1 = ((C266114Xp) this).A0A;
        } else if (this instanceof C264364Pp) {
            r1 = ((C264364Pp) this).A0A;
        } else {
            return;
        }
        DefaultAudioSink defaultAudioSink = (DefaultAudioSink) r1;
        defaultAudioSink.A0Q = true;
        if (defaultAudioSink.A0B != null) {
            C299845vw r0 = defaultAudioSink.A0c.A0L;
            r0.getClass();
            r0.A00();
            defaultAudioSink.A0B.play();
        }
    }

    public final void APC() {
        boolean z = true;
        if (this.A01 != 1) {
            z = false;
        }
        C256703wD.A04(z);
        AnonymousClass4PO r1 = this.A0C;
        r1.A01 = null;
        r1.A00 = null;
        this.A01 = 0;
        this.A05 = null;
        this.A08 = null;
        this.A07 = false;
        A0K();
    }

    public final boolean CKV() {
        if (this.A02 == Long.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public final void Cnm() {
        AnonymousClass4TD r0 = this.A05;
        r0.getClass();
        r0.Cnj();
    }

    public final void reset() {
        boolean z = false;
        if (this.A01 == 0) {
            z = true;
        }
        C256703wD.A04(z);
        AnonymousClass4PO r1 = this.A0C;
        r1.A01 = null;
        r1.A00 = null;
        A0J();
    }

    public final void start() {
        boolean z = true;
        if (this.A01 != 1) {
            z = false;
        }
        C256703wD.A04(z);
        this.A01 = 2;
        A0H();
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.4PO, java.lang.Object] */
    public AnonymousClass4PK(int i) {
        this.A0B = i;
        this.A0C = new Object();
        this.A02 = Long.MIN_VALUE;
    }

    public final boolean A0G() {
        if (CKV()) {
            return this.A07;
        }
        AnonymousClass4TD r0 = this.A05;
        r0.getClass();
        return r0.CaO();
    }
}
