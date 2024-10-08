package X;

public final class Wi3 implements Runnable {
    public final /* synthetic */ WHN A00;

    public Wi3(WHN whn) {
        this.A00 = whn;
    }

    public final void run() {
        WHN whn = this.A00;
        synchronized (whn) {
            whn.A03 = false;
            if (whn.A06.now() - whn.A00 > 2000) {
                WHO who = whn.A02;
                if (who != null) {
                    if (who.A0B) {
                        X8H x8h = who.A09;
                        if (x8h != null) {
                            x8h.onStop();
                        }
                    } else {
                        who.A08.clear();
                    }
                }
            } else {
                WHN.A00(whn);
            }
        }
    }
}
