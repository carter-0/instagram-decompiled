package X;

import com.instagram.ui.widget.shutterbutton.ShutterButton;

/* renamed from: X.5zm  reason: invalid class name and case insensitive filesystem */
public final class C301675zm implements Runnable {
    public final /* synthetic */ C301665zl A00;

    public C301675zm(C301665zl r1) {
        this.A00 = r1;
    }

    public final void run() {
        C301665zl r2 = this.A00;
        if (((ShutterButton) r2.A0D).A0C == C301685zn.READY_TO_SHOOT && r2.A0C && r2.A0B) {
            C353058Gc r0 = r2.A03;
            if (r0 != null) {
                if (!r0.CNh()) {
                    r2.A03.Dke();
                } else {
                    return;
                }
            }
            r2.A07 = AnonymousClass05K.A01;
            r2.A01("start_long_press_recording");
        }
    }
}
