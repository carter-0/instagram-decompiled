package X;

import java.util.concurrent.Callable;

/* renamed from: X.7q9  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C343397q9 implements Callable {
    public final /* synthetic */ C340597lW A00;

    public /* synthetic */ C343397q9(C340597lW r1) {
        this.A00 = r1;
    }

    public final Object call() {
        int i;
        C340597lW r4 = this.A00;
        if (r4.isConnected()) {
            r4.A09();
            if (r4.A0m != null) {
                C341047mF r3 = r4.A0m;
                int i2 = r4.A01;
                if (i2 == 1) {
                    i = 90;
                } else if (i2 != 2) {
                    i = 270;
                    if (i2 != 3) {
                        i = 0;
                    }
                } else {
                    i = 180;
                }
                r3.D0F(i);
            }
            return new C343367q6(r4.AlD(), (C343367q6) null, r4.Bt2(), r4.A00, false);
        }
        throw new C352928Fp("Can not update preview display rotation");
    }
}
