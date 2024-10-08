package X;

import android.os.Looper;
import androidx.media3.common.Timeline;

/* renamed from: X.Xci  reason: case insensitive filesystem */
public final class C21491Xci {
    public int A00;
    public Looper A01;
    public Object A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final Timeline A06;
    public final C22548Y8y A07;
    public final YB5 A08;
    public final Y80 A09;

    public final synchronized void A01(boolean z) {
        this.A03 = z | this.A03;
        this.A04 = true;
        notifyAll();
    }

    public final void A00() {
        C11366SPh.A02(!this.A05);
        this.A05 = true;
        C22041XuP xuP = (C22041XuP) this.A09;
        synchronized (xuP) {
            if (xuP.A09 || !xuP.A0C.getThread().isAlive()) {
                STH.A03("ExoPlayerImplInternal", C273654mx.A00(486));
                A01(false);
            } else {
                C22061Xun xun = (C22061Xun) xuP.A0G;
                C21997Xq5.A00(xun.A00.obtainMessage(14, this), C22061Xun.A00(), xun);
            }
        }
    }

    public C21491Xci(Looper looper, Timeline timeline, YB5 yb5, Y80 y80, C22548Y8y y8y) {
        this.A09 = y80;
        this.A07 = y8y;
        this.A06 = timeline;
        this.A01 = looper;
        this.A08 = yb5;
    }
}
