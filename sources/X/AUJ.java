package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class AUJ implements C41827B2i {
    public final /* synthetic */ C41827B2i A00;
    public final /* synthetic */ C341647nI A01;
    public final /* synthetic */ String A02;

    public AUJ(C41827B2i b2i, C341647nI r2, String str) {
        this.A01 = r2;
        this.A02 = str;
        this.A00 = b2i;
    }

    public final void D0z(C382309dU r12) {
        C341647nI r1 = this.A01;
        C344037rD B46 = r1.A03.B46();
        long A0Q = AnonymousClass7TE.A0Q(this);
        String str = this.A02;
        C382309dU r3 = r12;
        AnonymousClass7TF.A1D(str, 3, r12);
        String str2 = r12.A00;
        if (str2 == null) {
            str2 = "medium";
        }
        B46.Cjw(r3, "recording_failed", "RecordingControllerImpl", str, str2, "RecordingControllerImpl", A0Q);
        B46.DD3(19);
        r1.A01();
        r1.A05.set(false);
        this.A00.D0z(r12);
    }

    public final void D11() {
        C341647nI r2 = this.A01;
        C344037rD B46 = r2.A03.B46();
        long A0Q = AnonymousClass7TE.A0Q(this);
        String str = this.A02;
        C341627nG r0 = r2.A04;
        HashMap A1E = AnonymousClass7TE.A1E();
        Iterator A0v = AnonymousClass7TF.A0v(r0.A05);
        while (A0v.hasNext()) {
            Map BiV = ((C341717nP) A0v.next()).BiV();
            if (BiV != null) {
                A1E.putAll(BiV);
            }
        }
        0qQ.A0B(str, 3);
        B46.Cjx("recording_finished", "RecordingControllerImpl", str, A1E, A0Q);
        B46.DD4(19);
        r2.A05.set(false);
        this.A00.D11();
    }

    public final void D17(long j) {
        C341647nI r1 = this.A01;
        C344037rD B46 = r1.A03.B46();
        long A0Q = AnonymousClass7TE.A0Q(this);
        String str = this.A02;
        C341627nG r0 = r1.A04;
        HashMap A1E = AnonymousClass7TE.A1E();
        Iterator A0v = AnonymousClass7TF.A0v(r0.A05);
        while (A0v.hasNext()) {
            Map Apr = ((C341717nP) A0v.next()).Apr();
            if (Apr != null) {
                A1E.putAll(Apr);
            }
        }
        0qQ.A0B(str, 3);
        B46.Cjx("recording_started", "RecordingControllerImpl", str, A1E, A0Q);
        this.A00.D17(j);
    }

    public final long now() {
        return this.A00.now();
    }
}
