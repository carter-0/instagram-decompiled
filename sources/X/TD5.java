package X;

import java.util.ArrayList;

public final class TD5 implements Runnable {
    public final /* synthetic */ Q5z A00;

    public TD5(Q5z q5z) {
        this.A00 = q5z;
    }

    public final void run() {
        QLS qls = this.A00.A00;
        synchronized (qls) {
            if (qls.A04) {
                ArrayList A01 = qls.A01.A01(false);
                qls.A09.A00(A01);
                long j = qls.A02.A01;
                AnonymousClass0JR r2 = qls.A07;
                ArrayList A002 = C9617Rdv.A00(A01, j, r2.now());
                if (A002 == null) {
                    A002 = AnonymousClass7TE.A1C();
                }
                ArrayList A012 = C11379SQr.A01(qls.A06, r2, A002);
                QLS.A00(qls);
                qls.A01(A012);
            }
        }
    }
}
