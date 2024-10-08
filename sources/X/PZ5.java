package X;

import com.instagram.model.direct.threadkey.impl.MsysThreadId;

public final class PZ5 implements Runnable {
    public final /* synthetic */ C70727OHw A00;
    public final /* synthetic */ MsysThreadId A01;

    public PZ5(C70727OHw oHw, MsysThreadId msysThreadId) {
        this.A00 = oHw;
        this.A01 = msysThreadId;
    }

    public final void run() {
        AnonymousClass7YX r0 = this.A00.A04;
        MsysThreadId msysThreadId = this.A01;
        JTQ.A1K(msysThreadId);
        AnonymousClass7TI.A0B(r0.A00, msysThreadId);
    }
}
