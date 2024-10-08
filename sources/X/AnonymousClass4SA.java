package X;

import android.os.Looper;
import com.google.android.exoplayer2.Timeline;

/* renamed from: X.4SA  reason: invalid class name */
public final class AnonymousClass4SA {
    public int A00;
    public int A01;
    public long A02 = -9223372036854775807L;
    public Looper A03;
    public Object A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final AnonymousClass4PM A08;
    public final Timeline A09;
    public final AnonymousClass4S0 A0A;
    public final C697227w A0B;

    public final synchronized void A03(boolean z) {
        this.A05 = z | this.A05;
        this.A06 = true;
        notifyAll();
    }

    public final void A00() {
        C256703wD.A04(!this.A07);
        this.A07 = true;
        this.A0A.EM3(this);
    }

    public final void A01(int i) {
        C256703wD.A04(!this.A07);
        this.A01 = i;
    }

    public final void A02(Object obj) {
        C256703wD.A04(!this.A07);
        this.A04 = obj;
    }

    public AnonymousClass4SA(Looper looper, AnonymousClass4S0 r4, AnonymousClass4PM r5, Timeline timeline, C697227w r7, int i) {
        this.A0A = r4;
        this.A08 = r5;
        this.A09 = timeline;
        this.A03 = looper;
        this.A0B = r7;
        this.A00 = i;
    }
}
