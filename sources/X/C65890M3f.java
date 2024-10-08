package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Queue;

/* renamed from: X.M3f  reason: case insensitive filesystem */
public final class C65890M3f implements Runnable {
    public final /* synthetic */ KO3 A00;

    public C65890M3f(KO3 ko3) {
        this.A00 = ko3;
    }

    public final void run() {
        KO3 ko3 = this.A00;
        if (ko3.A05()) {
            C3499682q r1 = ko3.A02;
            if (r1.COf()) {
                ArrayList A1C = AnonymousClass7TE.A1C();
                Iterator A0w = JTP.A0w(r1);
                while (A0w.hasNext()) {
                    AnonymousClass3Q2 BbQ = ko3.A03.BbQ(JTO.A0Z(A0w).BbR());
                    if (BbQ != null) {
                        A1C.add(BbQ);
                    }
                }
                ko3.A04().A0k(A1C);
            }
            ko3.A05.Epw(new AnonymousClass8Y4(C64187LSu.A00(ko3.A04())));
            while (true) {
                Queue queue = ko3.A04;
                if (!queue.isEmpty()) {
                    ((Runnable) queue.remove()).run();
                } else {
                    return;
                }
            }
        }
    }
}
