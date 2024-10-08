package X;

import android.animation.ValueAnimator;

/* renamed from: X.Iiv  reason: case insensitive filesystem */
public final class C57940Iiv implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C56626I5e A03;

    public C57940Iiv(C56626I5e i5e, int i, int i2, int i3) {
        this.A01 = i;
        this.A00 = i2;
        this.A03 = i5e;
        this.A02 = i3;
    }

    public final void run() {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{this.A01, this.A00});
        0qQ.A07(ofInt);
        ofInt.addUpdateListener(new C56686I7r(this.A03, this.A02, 1));
        ofInt.setDuration(400);
        ofInt.start();
    }
}
