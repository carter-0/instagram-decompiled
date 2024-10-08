package X;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.concurrent.atomic.AtomicBoolean;

public final class T8W implements C74493Pvn {
    public final int A00;
    public final HandlerThread A01;
    public final C11169SDk A02;
    public final AnonymousClass7JJ A03 = new T8V(this);
    public final AnonymousClass7JJ A04;
    public final AtomicBoolean A05;
    public final AtomicBoolean A06;
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08;
    public final boolean A09;
    public final 0ng A0A;

    public T8W(C11169SDk sDk, AnonymousClass7JJ r14, MTE mte, int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A04 = r14;
        this.A02 = sDk;
        this.A00 = i;
        this.A09 = z;
        this.A08 = AnonymousClass0eN.A01(new C13281TTa(this, mte, i2, i3, i4, i5, i6, z2, z4, z3));
        this.A01 = Pxf.A0I("VoiceRecordControllerAsync");
        this.A07 = AnonymousClass0eN.A01(new MMF(this, 41));
        this.A05 = new AtomicBoolean(false);
        this.A06 = new AtomicBoolean(false);
        this.A0A = new RA7(this);
    }

    public final void release() {
        EyI(true);
        this.A01.quit();
        ((Q2G) this.A08.getValue()).release();
    }

    public final void AHp() {
        ((Q2G) this.A08.getValue()).A09 = null;
    }

    public final C63822L8d AuR() {
        return ((Q2G) this.A08.getValue()).A09;
    }

    public final void Cng() {
        AtomicBoolean atomicBoolean = this.A06;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            ((Handler) this.A07.getValue()).post(this.A0A);
        }
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.RAQ, java.lang.Runnable] */
    public final void EyI(boolean z) {
        if (this.A06.get()) {
            this.A05.set(z);
            ((Handler) this.A07.getValue()).post(new RAQ(this, AnonymousClass05K.A00, C13343TVq.A00));
        }
    }

    public final boolean isRecording() {
        return this.A06.get();
    }
}
