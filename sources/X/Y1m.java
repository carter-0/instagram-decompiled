package X;

public final class Y1m implements Runnable {
    public final /* synthetic */ Xb7 A00;

    public Y1m(Xb7 xb7) {
        this.A00 = xb7;
    }

    public final void run() {
        Xb7 xb7 = this.A00;
        int i = xb7.A00;
        if (i < 3) {
            xb7.A00 = i + 1;
            xb7.A02.postDelayed(xb7.A04, 450);
            return;
        }
        xb7.A03.A00("Ringtone failed to play after %d tries", AnonymousClass7TF.A1b(3));
    }
}
