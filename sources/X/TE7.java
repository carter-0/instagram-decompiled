package X;

import java.util.Iterator;
import java.util.Map;

public final class TE7 implements Runnable {
    public final /* synthetic */ SOF A00;

    public TE7(SOF sof) {
        this.A00 = sof;
    }

    public final void run() {
        SOF sof = this.A00;
        Iterator A0u = AnonymousClass7TF.A0u(sof.A03);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            long A0R = AnonymousClass7TE.A0R(A1J.getKey());
            A1J.getValue();
            if (sof.A01.now() > 300000 + A0R) {
                SOF.A00(sof, A0R);
                SOF.A01(sof, A0R);
            }
        }
    }
}
