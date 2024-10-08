package X;

import java.util.concurrent.Callable;

/* renamed from: X.7q5  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C343357q5 implements Callable {
    public final /* synthetic */ C340877ly A00;

    public /* synthetic */ C343357q5(C340877ly r1) {
        this.A00 = r1;
    }

    public final Object call() {
        C340837lu r3 = this.A00.A00;
        r3.A0J.A01("Method onCameraSessionActive must be called on Optic Thread.");
        r3.A0P.A04("camera_session_active_on_camera_handler_thread", new C343387q8(r3, new C343377q7()));
        return null;
    }
}
