package X;

import android.os.Handler;

public final class Wj3 implements Runnable {
    public final /* synthetic */ C17199VMd A00;

    public Wj3(C17199VMd vMd) {
        this.A00 = vMd;
    }

    public final void run() {
        C19202WPi wPi = this.A00.A00;
        C19202WPi.A00(wPi);
        if (!C340267kz.A00(wPi.A0A) && wPi.A0N != null) {
            wPi.A0N.A06((C341687nM) null, (Handler) null);
        }
    }
}
