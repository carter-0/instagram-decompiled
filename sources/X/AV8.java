package X;

import java.util.concurrent.ExecutionException;

public final class AV8 implements B2T {
    public final /* synthetic */ C345407tR A00;
    public final /* synthetic */ A6Z A01;
    public final /* synthetic */ boolean[] A02;

    public AV8(C345407tR r1, A6Z a6z, boolean[] zArr) {
        this.A00 = r1;
        this.A02 = zArr;
        this.A01 = a6z;
    }

    public final void DxB(Exception exc) {
        Exception exc2;
        AnonymousClass8GD r0;
        C345407tR r4 = this.A00;
        r4.A0B.append("oCF,");
        if (!(exc instanceof ExecutionException) || !(exc.getCause() instanceof Exception)) {
            exc2 = exc;
        } else {
            exc2 = (Exception) exc.getCause();
        }
        r4.A0C.set(false);
        Integer num = AnonymousClass05K.A01;
        r4.A04 = num;
        exc.getMessage();
        r4.A09.Cjw(new C382309dU(exc2), "recording_controller_error", "ArVideoCaptureCoordinator", "", "medium", "onVideoCaptureException", AnonymousClass7TE.A0Q(r4));
        if (!this.A02[0] || r4.A0E == AnonymousClass05K.A0C) {
            r0 = this.A01.A01;
        } else {
            A6Z a6z = this.A01;
            if (r4.A0E != num || (r0 = a6z.A00) == null) {
                r0 = a6z.A02;
            }
        }
        r0.A01(exc2);
    }

    public final void DxC(C21986Xoh xoh) {
        C345407tR r3 = this.A00;
        r3.A0B.append("oCS,");
        this.A02[0] = true;
        r3.A04 = AnonymousClass05K.A0Y;
        this.A01.A01.A02(xoh);
    }

    public final void DxD(C21986Xoh xoh) {
        AnonymousClass8GD r0;
        C345407tR r3 = this.A00;
        r3.A0B.append("oCE,");
        Integer num = AnonymousClass05K.A01;
        r3.A04 = num;
        A6Z a6z = this.A01;
        if (r3.A0E != num || (r0 = a6z.A00) == null) {
            r0 = a6z.A02;
        }
        r0.A02(xoh);
    }
}
