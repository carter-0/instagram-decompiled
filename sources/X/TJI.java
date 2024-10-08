package X;

import android.graphics.Matrix;
import android.graphics.Path;

public final class TJI implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ S0s A01;
    public final /* synthetic */ C13499TbQ A02;

    public TJI(S0s s0s, C13499TbQ tbQ, float f) {
        this.A01 = s0s;
        this.A00 = f;
        this.A02 = tbQ;
    }

    public final void run() {
        S0s s0s = this.A01;
        float f = this.A00;
        C13499TbQ tbQ = this.A02;
        Matrix A0U = AnonymousClass7TE.A0U();
        float f2 = 1.0f / f;
        A0U.setScale(f2, f2);
        Path A002 = s0s.A00();
        A002.transform(A0U);
        ((C378669Qs) tbQ).A0A = A002;
    }
}
