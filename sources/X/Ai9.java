package X;

import android.os.Handler;
import android.os.Looper;

public final class Ai9 implements Runnable {
    public final /* synthetic */ C39878ACz A00;

    public Ai9(C39878ACz aCz) {
        this.A00 = aCz;
    }

    public final void run() {
        C39878ACz aCz = this.A00;
        C343927r2 r1 = aCz.A00;
        Runnable runnable = aCz.A01;
        Handler handler = ((C343897qz) r1).A00;
        handler.removeCallbacks(runnable);
        AiA aiA = new AiA(aCz);
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            handler.post(aiA);
        }
    }
}
