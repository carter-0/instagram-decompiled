package X;

import java.util.List;

/* renamed from: X.IiQ  reason: case insensitive filesystem */
public final class C57909IiQ implements Runnable {
    public final /* synthetic */ AnonymousClass1GU A00;
    public final /* synthetic */ C228552lr A01;
    public final /* synthetic */ 0rm A02;

    public C57909IiQ(AnonymousClass1GU r1, C228552lr r2, 0rm r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }

    public final void run() {
        C228472lj r3 = this.A01.A0A;
        if (r3 != null) {
            AnonymousClass1GU r7 = this.A00;
            Object obj = this.A02.A00;
            if (obj != null) {
                List list = (List) obj;
                0qQ.A0B(list, 1);
                if (AnonymousClass7TE.A1b(list)) {
                    r3.A0b.A05(r7, (Long) null, "LOCAL", "delivery_controller", (String) null, (String) null);
                    C233902wf r4 = r3.A0F;
                    if (r4 != null) {
                        r4.A00((C45417Cvx) null, (AnonymousClass3UH) null, (C67251sV) null, r7.A00, AnonymousClass3PG.LOCAL, (C270374gd) null, (Boolean) null, (Boolean) null, (Integer) null, (Integer) null, (String) null, (String) null, (String) null, list, -1, true, false);
                        return;
                    }
                    0wb.A03(AnonymousClass000.A00(445), "onLocalFeedRequestSuccess()");
                    r3.A0i.A01 = true;
                    return;
                }
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }
}
