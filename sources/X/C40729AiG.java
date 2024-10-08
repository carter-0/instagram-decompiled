package X;

import com.facebook.cameracore.mediapipeline.services.instruction.InstructionServiceListenerWrapper;

/* renamed from: X.AiG  reason: case insensitive filesystem */
public final class C40729AiG implements Runnable {
    public final /* synthetic */ InstructionServiceListenerWrapper A00;

    public C40729AiG(InstructionServiceListenerWrapper instructionServiceListenerWrapper) {
        this.A00 = instructionServiceListenerWrapper;
    }

    public final void run() {
        AnonymousClass82N r0 = this.A00.mListener;
        if (r0 != null) {
            r0.CLT();
        }
    }
}
