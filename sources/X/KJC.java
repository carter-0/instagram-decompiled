package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class KJC extends 0ng {
    public final /* synthetic */ C53401GnY A00;
    public final /* synthetic */ AnonymousClass7IG A01;
    public final /* synthetic */ Long A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KJC(C53401GnY gnY, AnonymousClass7IG r5, Long l, List list, boolean z, boolean z2) {
        super(1194426243, 2, false, false);
        this.A01 = r5;
        this.A03 = list;
        this.A04 = z;
        this.A00 = gnY;
        this.A02 = l;
        this.A05 = z2;
    }

    public final void run() {
        AnonymousClass7IG r6 = this.A01;
        List list = this.A03;
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : list) {
            if (((C60926Jtk) next).A03) {
                A1C.add(next);
            }
        }
        if (!(A1C instanceof Collection) || !A1C.isEmpty()) {
            Iterator it = A1C.iterator();
            while (it.hasNext()) {
                if (!ABQ.A01(C59796JYp.A01(((C60926Jtk) it.next()).A00.A0X, 0), r6.A06, false, true)) {
                    return;
                }
            }
        }
        11Z.A02(new MA6(this.A00, r6, this.A02, list, this.A04, this.A05));
    }
}
