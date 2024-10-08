package X;

import java.util.List;

/* renamed from: X.M7b  reason: case insensitive filesystem */
public final class C65990M7b implements Runnable {
    public final /* synthetic */ LQT A00;
    public final /* synthetic */ AnonymousClass3M8 A01;

    public C65990M7b(LQT lqt, AnonymousClass3M8 r2) {
        this.A01 = r2;
        this.A00 = lqt;
    }

    public final void run() {
        AnonymousClass3M8 r3 = this.A01;
        if (!r3.A0C) {
            ((2cs) r3.A0N.getValue()).A03();
            return;
        }
        if (r3.A06 != null) {
            LQT lqt = this.A00;
            lqt.A02.FJ6(r3);
            List list = r3.A0L;
            0qQ.A07(list);
            list.add(0, lqt);
            r3.A06 = null;
        }
        r3.A0B = AnonymousClass05K.A00;
    }
}
