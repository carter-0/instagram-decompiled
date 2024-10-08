package X;

import java.util.List;

/* renamed from: X.JTt  reason: case insensitive filesystem */
public final class C59687JTt implements Runnable {
    public final /* synthetic */ Dc2 A00;
    public final /* synthetic */ AnonymousClass3M8 A01;

    public C59687JTt(Dc2 dc2, AnonymousClass3M8 r2) {
        this.A01 = r2;
        this.A00 = dc2;
    }

    public final void run() {
        AnonymousClass3M8 r3 = this.A01;
        if (!r3.A0C) {
            ((2cs) r3.A0N.getValue()).A03();
            return;
        }
        List list = r3.A0K;
        0qQ.A07(list);
        list.add(0, this.A00);
        r3.A09 = null;
        r3.A0B = AnonymousClass05K.A00;
    }
}
