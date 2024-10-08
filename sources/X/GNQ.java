package X;

public final class GNQ implements Runnable {
    public final /* synthetic */ GNL A00;

    public GNQ(GNL gnl) {
        this.A00 = gnl;
    }

    public final void run() {
        GNL gnl = this.A00;
        C267324bN r2 = gnl.A01;
        if (r2 != null) {
            gnl.A0D.EaD(r2, false);
            0Aj A0d = C51969G9p.A0d(gnl.A0N.A00, "ig_sundial_gesture_system_events");
            if (A0d.isSampled()) {
                C51973G9u.A14(A0d, "action", "fanout_menu_exit");
                C51974G9v.A0r(A0d, "TIMER");
            }
        }
    }
}
