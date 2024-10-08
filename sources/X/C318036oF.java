package X;

/* renamed from: X.6oF  reason: invalid class name and case insensitive filesystem */
public final class C318036oF implements Runnable {
    public final /* synthetic */ C318006oC A00;

    public C318036oF(C318006oC r1) {
        this.A00 = r1;
    }

    public final void run() {
        C318006oC r3 = this.A00;
        if (r3.A06 && r3.A04 != null) {
            r3.A0C.postDelayed(this, (long) r3.A0B);
            AnonymousClass4MM r1 = r3.A05;
            if (r1 == null) {
                throw new IllegalStateException("Required value was null.");
            } else if (r3.A04 != null) {
                Integer valueOf = Integer.valueOf(r1.getCurrentPosition());
                if (valueOf != null) {
                    int i = r3.A01;
                    if (i == -1 || valueOf.intValue() > i) {
                        C315536k3 r12 = r3.A04;
                        if (r12 != null) {
                            r12.onCurrentTrackPlayTimeUpdated(valueOf.intValue());
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
