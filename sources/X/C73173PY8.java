package X;

import java.io.IOException;
import java.util.List;

/* renamed from: X.PY8  reason: case insensitive filesystem */
public final class C73173PY8 implements Runnable {
    public final /* synthetic */ C71087ObS A00;
    public final /* synthetic */ AnonymousClass9GD A01;

    public C73173PY8(C71087ObS obS, AnonymousClass9GD r2) {
        this.A01 = r2;
        this.A00 = obS;
    }

    public final void run() {
        Exception A05;
        C71087ObS obS;
        String message;
        List A18;
        String str;
        Integer A0l;
        Object obj;
        AnonymousClass9GD r3 = this.A01;
        if (r3.A0E()) {
            int A0M = AnonymousClass7TE.A0M(r3.A06());
            obS = this.A00;
            if (A0M <= 0) {
                A05 = new Exception("Blockstore API reported complete, but no bytes written");
            } else {
                obj = NEF.A00;
                obS.A05(obj);
            }
        } else {
            Exception A052 = r3.A05();
            String str2 = null;
            if (!(A052 == null || (message = A052.getMessage()) == null || (A18 = DbV.A18(message, ":")) == null || (str = (String) 00k.A0J(A18)) == null || (A0l = 00y.A0l(str)) == null)) {
                int intValue = A0l.intValue();
                if (intValue == 40002 || intValue == 17) {
                    Exception A053 = r3.A05();
                    if (A053 != null) {
                        str2 = A053.getMessage();
                    }
                    A05 = new IOException(str2);
                    obS = this.A00;
                } else {
                    if (intValue == 40000) {
                        Exception A054 = r3.A05();
                        if (A054 != null) {
                            str2 = A054.getMessage();
                        }
                        A05 = new IOException(str2);
                    } else if (intValue == 40001) {
                        Exception A055 = r3.A05();
                        if (A055 != null) {
                            str2 = A055.getMessage();
                        }
                        A05 = new IOException(str2);
                    }
                    obS = this.A00;
                }
            }
            if (r3.A05() instanceof TRT) {
                Exception A056 = r3.A05();
                if (A056 != null) {
                    str2 = A056.getMessage();
                }
                A05 = new IOException(str2);
            } else {
                A05 = r3.A05();
            }
            obS = this.A00;
        }
        obj = new NEG(A05);
        obS.A05(obj);
    }
}
