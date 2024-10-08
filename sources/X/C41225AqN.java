package X;

import com.facebook.cameracore.mediapipeline.services.instruction.InstructionServiceListenerWrapper;
import java.util.List;

/* renamed from: X.AqN  reason: case insensitive filesystem */
public final class C41225AqN implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ InstructionServiceListenerWrapper A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ List A04;

    public C41225AqN(InstructionServiceListenerWrapper instructionServiceListenerWrapper, List list, List list2, List list3, int i) {
        this.A01 = instructionServiceListenerWrapper;
        this.A00 = i;
        this.A03 = list;
        this.A04 = list2;
        this.A02 = list3;
    }

    public final void run() {
        AnonymousClass82O r3;
        AnonymousClass82N r4 = this.A01.mListener;
        if (r4 != null) {
            int i = this.A00;
            if (i < 0 || i >= AnonymousClass82O.values().length) {
                r3 = AnonymousClass82O.None;
            } else {
                r3 = AnonymousClass82O.values()[i];
            }
            r4.Eqm(r3, this.A03, this.A04, this.A02);
        }
    }
}
