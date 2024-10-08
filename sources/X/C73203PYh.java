package X;

import java.util.List;

/* renamed from: X.PYh  reason: case insensitive filesystem */
public final class C73203PYh implements Runnable {
    public final /* synthetic */ P30 A00;
    public final /* synthetic */ List A01;

    public C73203PYh(P30 p30, List list) {
        this.A01 = list;
        this.A00 = p30;
    }

    public final void run() {
        List<AnonymousClass7LQ> list = this.A01;
        P30 p30 = this.A00;
        for (AnonymousClass7LQ r1 : list) {
            p30.A01.BSN().EdR(AnonymousClass05K.A0C, r1.A0e.A0h(), false);
        }
    }
}
