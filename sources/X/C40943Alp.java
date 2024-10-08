package X;

import com.facebook.cameracore.mediapipeline.services.instruction.InstructionServiceListenerWrapper;

/* renamed from: X.Alp  reason: case insensitive filesystem */
public final class C40943Alp implements Runnable {
    public final /* synthetic */ InstructionServiceListenerWrapper A00;
    public final /* synthetic */ String A01;

    public C40943Alp(InstructionServiceListenerWrapper instructionServiceListenerWrapper, String str) {
        this.A00 = instructionServiceListenerWrapper;
        this.A01 = str;
    }

    public final void run() {
        AnonymousClass82N r1 = this.A00.mListener;
        if (r1 != null) {
            r1.Eue(this.A01);
        }
    }
}
