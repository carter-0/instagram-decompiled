package X;

public final class GNR implements Runnable {
    public final /* synthetic */ GNL A00;

    public GNR(GNL gnl) {
        this.A00 = gnl;
    }

    public final void run() {
        GNL gnl = this.A00;
        C267324bN r2 = gnl.A01;
        if (r2 != null) {
            gnl.A0D.EaH(r2, true);
        }
        gnl.A07.postDelayed(gnl.A0S, 2500);
    }
}
