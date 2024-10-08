package X;

import java.util.concurrent.ExecutionException;

public final class AV9 implements B2T {
    public final /* synthetic */ C379879Vr A00;
    public final /* synthetic */ A6Z A01;
    public final /* synthetic */ boolean[] A02;

    public AV9(C379879Vr r1, A6Z a6z, boolean[] zArr) {
        this.A00 = r1;
        this.A02 = zArr;
        this.A01 = a6z;
    }

    public final void DxB(Exception exc) {
        AnonymousClass8GD r0;
        if ((exc instanceof ExecutionException) && (exc.getCause() instanceof Exception)) {
            exc = (Exception) exc.getCause();
        }
        if (this.A02[0]) {
            C379879Vr r3 = this.A00;
            if (r3.A02 != AnonymousClass05K.A0C) {
                A6Z a6z = this.A01;
                if (r3.A02 != AnonymousClass05K.A01 || (r0 = a6z.A00) == null) {
                    r0 = a6z.A02;
                }
                r0.A01(exc);
            }
        }
        r0 = this.A01.A01;
        r0.A01(exc);
    }

    public final void DxC(C21986Xoh xoh) {
        this.A02[0] = true;
        this.A01.A01.A02(xoh);
    }

    public final void DxD(C21986Xoh xoh) {
        AnonymousClass8GD r0;
        A6Z a6z = this.A01;
        if (this.A00.A02 != AnonymousClass05K.A01 || (r0 = a6z.A00) == null) {
            r0 = a6z.A02;
        }
        r0.A02(xoh);
    }
}
