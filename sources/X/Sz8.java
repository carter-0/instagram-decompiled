package X;

import java.util.List;

public final class Sz8 implements C3736596k {
    public final /* synthetic */ C11329SNi A00;
    public final /* synthetic */ C10321RqJ A01;
    public final /* synthetic */ List A02;

    public Sz8(C11329SNi sNi, C10321RqJ rqJ, List list) {
        this.A00 = sNi;
        this.A01 = rqJ;
        this.A02 = list;
    }

    public final void onFailure(Exception exc) {
        0qQ.A0B(exc, 0);
        S7S s7s = this.A00.A04;
        s7s.A02();
        s7s.A00();
        C10321RqJ rqJ = this.A01;
        RHJ rhj = RHJ.A09;
        List list = this.A02;
        RuntimeException runtimeException = new RuntimeException("Unable to send token for validation", exc);
        00k.A0S(AnonymousClass7TE.A1I(rhj), list);
        rqJ.A00.setException(runtimeException);
    }
}
