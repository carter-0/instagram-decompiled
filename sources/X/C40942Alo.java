package X;

import com.facebook.cameracore.mediapipeline.services.instruction.InstructionServiceListenerWrapper;

/* renamed from: X.Alo  reason: case insensitive filesystem */
public final class C40942Alo implements Runnable {
    public final /* synthetic */ InstructionServiceListenerWrapper A00;
    public final /* synthetic */ String A01;

    public C40942Alo(InstructionServiceListenerWrapper instructionServiceListenerWrapper, String str) {
        this.A00 = instructionServiceListenerWrapper;
        this.A01 = str;
    }

    public final void run() {
        AnonymousClass82N r1 = this.A00.mListener;
        if (r1 != null) {
            r1.Eud(this.A01);
        }
    }
}
