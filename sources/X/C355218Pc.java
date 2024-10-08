package X;

/* renamed from: X.8Pc  reason: invalid class name and case insensitive filesystem */
public final class C355218Pc implements Runnable {
    public final /* synthetic */ AnonymousClass8PZ A00;

    public C355218Pc(AnonymousClass8PZ r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass8PZ r3 = this.A00;
        if (r3.A09) {
            AnonymousClass4MM r0 = r3.A08;
            if (r0 != null) {
                int currentPosition = r0.getCurrentPosition();
                if (currentPosition <= 0) {
                    currentPosition = -1;
                }
                if (currentPosition >= r3.A00) {
                    AnonymousClass4MM r1 = r3.A08;
                    if (r1 != null) {
                        r1.seekTo(r3.A01);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    r3.A0K.Dxd(currentPosition, 0, 0);
                }
                r3.A0C.postOnAnimation(r3.A0N);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }
}
