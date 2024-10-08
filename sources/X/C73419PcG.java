package X;

/* renamed from: X.PcG  reason: case insensitive filesystem */
public final class C73419PcG implements Runnable {
    public static final C73419PcG A00 = new C73419PcG();

    public final void run() {
        C21478XcN xcN = C65819M0l.A0K;
        if (xcN != null) {
            xcN.A02(new Exception("live swap time out"));
        }
        C65819M0l.A0K = null;
    }
}
