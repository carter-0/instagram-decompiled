package X;

public final class TBZ implements Runnable {
    public final /* synthetic */ C12135Snf A00;

    public TBZ(C12135Snf snf) {
        this.A00 = snf;
    }

    public final void run() {
        C12135Snf snf = this.A00;
        snf.A00.onReleased();
        C10961S2t s2t = snf.A01;
        if (s2t != null) {
            try {
                s2t.A02.unregisterReceiver(s2t.A01);
            } catch (IllegalArgumentException e) {
                0KC.A0F("NetworkReachabilityListener", "unregisterReceiver failed", e);
            }
        }
    }
}
