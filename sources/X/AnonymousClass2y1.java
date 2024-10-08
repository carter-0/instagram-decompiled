package X;

/* renamed from: X.2y1  reason: invalid class name */
public final class AnonymousClass2y1 implements Runnable {
    public final /* synthetic */ C234492xx A00;

    public AnonymousClass2y1(C234492xx r1) {
        this.A00 = r1;
    }

    public final void run() {
        C234492xx r3 = this.A00;
        if (r3.A06 && r3.A04 != null) {
            r3.A0B.postDelayed(this, 16);
            AnonymousClass4M3 r2 = r3.A05;
            if (r2 == null) {
                throw new IllegalStateException("Required value was null.");
            } else if (r3.A04 != null) {
                Integer valueOf = Integer.valueOf(r2.getCurrentPositionMs());
                if (valueOf != null) {
                    int i = r3.A01;
                    if (i == -1 || valueOf.intValue() > i) {
                        C315536k3 r1 = r3.A04;
                        if (r1 != null) {
                            r1.onCurrentTrackPlayTimeUpdated(valueOf.intValue());
                        }
                        r3.A01 = valueOf.intValue();
                    }
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
    }
}
