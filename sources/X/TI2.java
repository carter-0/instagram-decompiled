package X;

import android.graphics.Typeface;

public final class TI2 implements Runnable {
    public final /* synthetic */ Typeface A00;
    public final /* synthetic */ C10918S0v A01;
    public final /* synthetic */ C375519Dx A02;

    public TI2(Typeface typeface, C10918S0v s0v, C375519Dx r3) {
        this.A01 = s0v;
        this.A02 = r3;
        this.A00 = typeface;
    }

    public final void run() {
        this.A02.A01(this.A00);
    }
}
