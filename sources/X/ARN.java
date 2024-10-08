package X;

import java.util.Iterator;

public final class ARN implements C41790B0t {
    public final /* synthetic */ C345567tj A00;

    public ARN(C345567tj r1) {
        this.A00 = r1;
    }

    public final void DVZ(int i, int i2) {
        C345567tj r3 = this.A00;
        if (r3.A00 != i) {
            r3.A00 = i;
            Iterator A0t = AnonymousClass7TF.A0t(r3.A04);
            while (A0t.hasNext()) {
                ((C346027uT) AnonymousClass7TF.A0a(A0t)).A06 = r3.A00;
            }
        }
    }
}
