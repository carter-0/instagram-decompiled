package X;

import com.facebook.systrace.Systrace;

/* renamed from: X.5v7  reason: invalid class name and case insensitive filesystem */
public final class C299415v7 extends 0vM {
    public final /* synthetic */ C291025gO A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C299415v7(C291025gO r3) {
        super("onTaskFinish", -9);
        this.A00 = r3;
    }

    public final void loggedRun() {
        if (Systrace.A0E(1)) {
            0fS.A01(002.A0R(this.A00.A00.getName(), " onFinish"), -993616731);
        }
        AnonymousClass11X r0 = this.A00.A00;
        r0.getName();
        try {
            r0.onFinish();
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(-1293483285);
            }
        }
    }
}
