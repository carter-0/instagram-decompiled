package X;

import com.facebook.systrace.Systrace;
import java.util.concurrent.atomic.AtomicBoolean;

public final class FZ6 implements AnonymousClass4D6 {
    public final C61480nO A00;
    public final AtomicBoolean A01 = new AtomicBoolean(true);

    public final void schedule(AnonymousClass11X r8) {
        AnonymousClass11X r1 = r8;
        if (r8 != null) {
            A00(r1, this.A00, r8.getRunnableId(), 3, false, false);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void A00(AnonymousClass11X r11, C61480nO r12, int i, int i2, boolean z, boolean z2) {
        boolean A0E;
        AnonymousClass11X r5 = r11;
        if (Systrace.A0E(1)) {
            0fS.A01(002.A0R(r11.getName(), " LifecycleAwareExecutorScheduler::scheduleOnExecutor()"), 1446429803);
        }
        try {
            if (!this.A01.get()) {
                r11.getName();
                if (!A0E) {
                    return;
                }
                return;
            }
            r11.onStart();
            if (Systrace.A0E(1)) {
                0fS.A00(-1234207021);
            }
            r12.ATE(new EIN(this, r5, i, i2, z, z2));
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(-1681558255);
            }
        }
    }

    public FZ6(AnonymousClass07Z r7) {
        C61480nO A002 = 0nY.A00();
        0qQ.A07(A002);
        this.A00 = A002;
        AnonymousClass4CZ r0 = AnonymousClass12W.A00;
        AnonymousClass19S A02 = 19E.A02(AnonymousClass12y.A00.A0P());
        AnonymousClass7TE.A1Z(new MH4(r7, this, A02, (AnonymousClass4D7) null, 29), A02);
    }

    public final void schedule(AnonymousClass11X r8, int i, int i2, boolean z, boolean z2) {
        AnonymousClass11X r1 = r8;
        if (r8 != null) {
            A00(r1, this.A00, i, i2, z, z2);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
