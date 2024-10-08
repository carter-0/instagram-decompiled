package X;

import java.util.concurrent.Callable;

/* renamed from: X.AsQ  reason: case insensitive filesystem */
public final /* synthetic */ class C41343AsQ implements Callable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ C340597lW A02;

    public /* synthetic */ C41343AsQ(C340597lW r1, float f, float f2) {
        this.A02 = r1;
        this.A00 = f;
        this.A01 = f2;
    }

    public final Object call() {
        int i;
        C342627ou r6;
        C340597lW r5 = this.A02;
        float f = this.A00;
        float f2 = this.A01;
        if (r5.isConnected()) {
            C340837lu r4 = r5.A0R;
            C340807lr r1 = r4.A0J;
            r1.A01("Can only check if the prepared on the Optic thread");
            if (r1.A00 && (r6 = r5.A07) != null) {
                int i2 = 0;
                if (r6.A08 != null) {
                    if (r6.A0B) {
                        i2 = r6.A03;
                    }
                    int i3 = r6.A02;
                    if (r6.A09(C342627ou.A01(f + (f2 * (((float) (i3 - i2)) - f)), (float) i2, (float) i3, -1.0f, 1.0f), false)) {
                        C342627ou.A03(r5, r4);
                    }
                }
                i = r5.A07.A07();
                return Integer.valueOf(i);
            }
        }
        i = 0;
        return Integer.valueOf(i);
    }
}
