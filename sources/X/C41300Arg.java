package X;

import java.util.concurrent.Callable;

/* renamed from: X.Arg  reason: case insensitive filesystem */
public final class C41300Arg implements Callable {
    public final /* synthetic */ C340597lW A00;

    public C41300Arg(C340597lW r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        Throwable th;
        String str;
        C340597lW r3 = this.A00;
        C340577lU.A00(15, r3.A00, (Object) null);
        try {
            if (r3.A0j != null) {
                boolean A1Q = AnonymousClass7TF.A1Q(r3.A00);
                C340777lo r1 = r3.A0O;
                int i = 1;
                if (A1Q) {
                    i = 0;
                }
                if (!r1.A09(i)) {
                    if (A1Q) {
                        str = "FRONT";
                    } else {
                        str = "BACK";
                    }
                    th = new UnsupportedOperationException(002.A0g("Cannot switch to ", str, ", camera is not present"));
                } else {
                    r3.A0s = true;
                    String A07 = r1.A07(A1Q ? 1 : 0);
                    C340597lW.A03(r3, A07);
                    r3.A0B(A07);
                    C340597lW.A01(r3);
                    C340597lW.A02(r3, (Float) null, A07);
                    C343367q6 r5 = new C343367q6(r3.AlD(), (C343367q6) null, r3.Bt2(), r3.A00, false);
                    C340577lU.A00(17, A1Q, (Object) null);
                    r3.A0s = false;
                    return r5;
                }
            } else {
                th = new RuntimeException("Cannot switch camera, no cameras open.");
            }
            throw th;
        } catch (Exception e) {
            C340577lU.A00(16, r3.A00, e);
            throw e;
        } catch (Throwable th2) {
            r3.A0s = false;
            throw th2;
        }
    }
}
