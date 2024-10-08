package X;

import java.util.List;

/* renamed from: X.4p7  reason: invalid class name and case insensitive filesystem */
public final class C274804p7 implements AnonymousClass0L7 {
    public final /* synthetic */ C274784p5 A00;

    public C274804p7(C274784p5 r1) {
        this.A00 = r1;
    }

    public final void Cvd() {
        C274784p5 r1 = this.A00;
        if (!r1.A01.getAndSet(true)) {
            List<C275104pb> list = r1.A00;
            synchronized (list) {
                for (C275104pb ASk : list) {
                    ASk.ASk(true);
                }
            }
        }
    }

    public final void Cvh() {
        C274784p5 r1 = this.A00;
        if (r1.A01.getAndSet(false)) {
            List<C275104pb> list = r1.A00;
            synchronized (list) {
                for (C275104pb ASk : list) {
                    ASk.ASk(false);
                }
            }
        }
    }
}
