package X;

import java.util.List;

/* renamed from: X.M7a  reason: case insensitive filesystem */
public final class C65989M7a implements Runnable {
    public final /* synthetic */ C55866Hon A00;
    public final /* synthetic */ AnonymousClass3M8 A01;

    public C65989M7a(C55866Hon hon, AnonymousClass3M8 r2) {
        this.A01 = r2;
        this.A00 = hon;
    }

    public final void run() {
        AnonymousClass3M8 r3 = this.A01;
        if (!r3.A0C) {
            ((2cs) r3.A0N.getValue()).A03();
            return;
        }
        List list = r3.A0J;
        0qQ.A07(list);
        list.add(0, this.A00);
        r3.A05 = null;
        r3.A0B = AnonymousClass05K.A00;
    }
}
