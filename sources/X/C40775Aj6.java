package X;

import java.io.File;

/* renamed from: X.Aj6  reason: case insensitive filesystem */
public final /* synthetic */ class C40775Aj6 implements Runnable {
    public final /* synthetic */ AnonymousClass8BA A00;

    public /* synthetic */ C40775Aj6(AnonymousClass8BA r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass8BA r4 = this.A00;
        C3498882g r3 = r4.A14.A01.A0c;
        if (r3 != null) {
            A77 a77 = new A77(r4.A1B, r3, r4.A1s, new C51593Fwh(r4, 0));
            C3498882g r0 = a77.A01;
            File file = r0.A00;
            String str = r0.A01;
            if (str != null && str.length() != 0) {
                1OO A0J = 1NK.A00().A0J(C253833rU.A01(file), (String) null);
                A0J.A0I = false;
                A0J.A02((C40250AXo) a77.A03.getValue());
                A0J.A01();
            }
        }
    }
}
