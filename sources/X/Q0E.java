package X;

public final class Q0E implements Runnable {
    public final /* synthetic */ C7218Pzn A00;

    public Q0E(C7218Pzn pzn) {
        this.A00 = pzn;
    }

    public final void run() {
        2cs r3;
        double A02;
        C7218Pzn pzn = this.A00;
        double d = C7218Pzn.A0e;
        int i = pzn.A09;
        if (i == 3) {
            r3 = pzn.A0V;
            A02 = (double) ((int) Math.min(C7218Pzn.A00(pzn) + ((float) pzn.A07), C7218Pzn.A02(pzn)));
            r3.A08(A02, true);
        } else if (i == 2) {
            r3 = pzn.A0V;
            JTP.A1K(r3, C7218Pzn.A02(pzn));
            A02 = (double) C7218Pzn.A02(pzn);
        } else {
            return;
        }
        r3.A06(A02);
    }
}
